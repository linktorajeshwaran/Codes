package practice3.textgenerator;

import java.util.Iterator;
import java.util.function.Function;

import practice3.datastructures.IterableString;
import practice3.interfaces.ICollection;
import practice3.interfaces.IDictionary;

public class TrieMap<T> implements IDictionary<NGram, IDictionary<IterableString, Integer>>{

	
	public TrieMap() {
		
	}

	@Override
	public Iterator<NGram> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDictionary<IterableString, Integer> get(NGram key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDictionary<IterableString, Integer> remove(NGram key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IDictionary<IterableString, Integer> put(NGram key, IDictionary<IterableString, Integer> value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(NGram key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(IDictionary<IterableString, Integer> value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ICollection<NGram> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ICollection<IDictionary<IterableString, Integer>> values() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
