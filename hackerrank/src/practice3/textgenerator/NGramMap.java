package practice3.textgenerator;

import practice3.datastructures.IterableString;
import practice3.interfaces.IDictionary;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class NGramMap {
    public static final Random RANDOM = new Random();
    private int N;
    private IDictionary<NGram, IDictionary<IterableString, Integer>> map;
    private Supplier<IDictionary<IterableString, Integer>> inner;

    public NGramMap(Scanner reader, int N,
                    Supplier<IDictionary<NGram, IDictionary<IterableString, Integer>>> outer,
                    Supplier<IDictionary<IterableString, Integer>> inner) {
        this.N = N;
        this.map = outer.get();
        this.inner = inner;

        // Read in the first N words
        String[] words = new String[this.N];
        int i = 0;

        while (reader.hasNext() && i < this.N) {
            String next = NGram.normalize(reader.next());
            if (next.isEmpty()) {
                continue;
            }
            words[i] = next;
            i += 1;
        }

        // Stores the next NGram string
        NGram ngram = new NGram(words);

        // Parse the rest of the text
        while (reader.hasNext()) {
            String next = NGram.normalize(reader.next());
            if (next.isEmpty()) {
                continue;
            }

            // Increment count of how many times "next" follows ngram
            updateCount(ngram, next);

            // Update the strings held in ngram
            ngram = ngram.next(next);
        }
    }


    private void updateCount(NGram ngram, String nexts) {
        IterableString next = new IterableString(nexts);
        // Check if the key already exists in map
        if (!this.map.containsKey(ngram)) {
            this.map.put(ngram, this.inner.get());
        }
        IDictionary<IterableString, Integer> follows = this.map.get(ngram);

        // Check if the inner map already has next as a key
        if (!follows.containsKey(next)) {
            follows.put(next, 0);
        }
        follows.put(next, follows.get(next) + 1);
    }


    public String getRandomNext(NGram ngram) {
        IDictionary<IterableString, Integer> suffixes = this.map.get(ngram);

        int i = 0;
        int idx = RANDOM.nextInt(suffixes.size());

        for (IterableString suffix : suffixes) {
            if (i == idx) {
                return suffix.toString();
            }

            i++;
        }

        // Execution should never get here...
        return null;
    }

    public String toString() {
        return this.map.toString();
    }

}