package practice3.datastructures;

import practice3.interfaces.IDeque;
import practice3.interfaces.IQueue;
import practice3.interfaces.IStack;

import java.util.Iterator;

public class ArrayDeque<E> implements IDeque<E>, IQueue<E>, IStack<E> {
    private final static int INITIAL_CAPACITY = 10;
    private final static int GROW_FACTOR = 2;
    private E[] data;
    private int size;

    public ArrayDeque() {
        this(INITIAL_CAPACITY);
    }

    public ArrayDeque(int initialCapacity) {
        data = (E[])new Object[initialCapacity];
        this.size = 0;
    }
    @Override
    public void addFront(E e) {
        if(size == data.length) {
            E[] copy = (E[]) new Object[size*GROW_FACTOR];
            for(int i =0 ;i < data.length; i++) {
                copy[i] = data[i];
            }
            data = copy;
        }
        for(int i = size; i > 0; i--) {
            data[i] = data[i-1];
        }
        data[0] = e;
        size++;
    }

    @Override
    public void addBack(E e) {
        if(e == null) {
            return;
        }
        if(size == data.length) {
            E[] copy = (E[]) new Object[size*GROW_FACTOR];
            for(int i =0 ;i < data.length; i++) {
                copy[i] = data[i];
            }
            data = copy;
            //   resize();
        }
        data[size] = e;
        size++;
    }

    @Override
    public E removeFront() {
        if(size == 0) {
            return null;
        }
        E removed = data[0];

        for(int i = 1; i < size; i++) {
            data[i-1] = data[i];
        }
        data[size-1] = null;
        size--;
        return removed;
    }

    @Override
    public E removeBack() {
        if(size == 0) {
            return null;
        }

        E removed = data[size-1];
        data[size-1] = null;

        size--;
        return removed;
    }

    @Override
    public boolean enqueue(E e) {
        if(e == null) {
            return false;
        }
        if(size == data.length) {
            E[] copy = (E[]) new Object[size*GROW_FACTOR];
            for(int i =0; i < data.length; i++) {
                copy[i] = data[i];
            }
            data = copy;
        }
        for(int i =size; i > 0; i--) {
            data[i] = data[i-1];
        }
        data[0] = e;
        size++;
        return true;
    }

    @Override
    public E dequeue() {
        if(size == 0) {
            return null;
        }
        E removed = data[size-1];
        data[size-1] = null;
        size--;
        return removed;
    }

    @Override
    public boolean push(E e) {
        if(e == null) {
            return false;
        }
        if(size == data.length) {
            E[] copy = (E[]) new Object[size*GROW_FACTOR];
            for(int i =0 ;i < data.length; i++) {
                copy[i] = data[i];
            }
            data = copy;
        }
        data[size] = e;
        size++;
        return true;
    }

    @Override
    public E pop() {
        if(size == 0) {
            return null;
        }
        E popped = data[size-1];
        data[size-1] = null;
        size--;
        return popped;
    }

    @Override
    public E peekFront() {
        if(size == 0) {
            return null;
        }
        return data[0];
    }

    @Override
    public E peekBack() {
        if(size == 0) {
            return null;
        }
        return data[size-1];
    }

    @Override
    public E peek() {
        if(size == 0) {
            return null;
        }
        return data[size-1];
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i < size && data[i] != null;
            }
            @Override
            public E next() {
                return data[i++];
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        String result = "[";
        for(int i = 0; i< data.length; i++) {
            if(data[i] == null) {
                break;
            }
            result += data[i].toString();
            if(i != size - 1) {
                result += ", ";
            }
        }
        return result + "]";
    }
}

