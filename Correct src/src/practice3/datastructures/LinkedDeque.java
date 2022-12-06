package practice3.datastructures;

import practice3.interfaces.IDeque;
import practice3.interfaces.IQueue;
import practice3.interfaces.IStack;

import java.util.Iterator;

public class LinkedDeque<E> implements IDeque<E>, IQueue<E>, IStack<E> {

    private final static class Node<E> {
        final E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {
            this.data = data;
            next = null;
            prev = null;
        }

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public String toString() {
            return data.toString();
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedDeque() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void addFront(E e) {
        Node<E> front = new Node<E>(e);
        front.next = head;
        if(head != null) {
            head.prev = front;
        }
        head = front;
        size++;

        if(size == 1 && head.next == null) {
            tail = head;
        }
    }

    @Override
    public void addBack(E e) {
        Node<E> back = new Node<E>(e);
        if(tail == null) {
            head = back;
            tail = back;
        } else {
            tail.next = back;
            back.prev = tail;
            tail = back;
        }
        size++;
    }

    @Override
    public E removeFront() {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            E removed = head.data;
            head = null;
            tail = null;
            size--;
            return removed;
        }

        E removed = head.data;
        head.next.prev = null;
        head = head.next;
        size--;

        if(size == 1) {
            tail = head;
        }
        else if(size ==0) {
            head = null;
            tail = null;
        }
        return removed;
    }

    @Override
    public E removeBack() {
        if(head == null) {
            return null;
        }
        if(size == 1 || tail.prev == null) {
            E removed = head.data;
            head = null;
            tail = null;
            size--;
            return removed;
        }
        E removed = tail.data;
        tail.prev.next = null;
        tail = tail.prev;
        size--;
        return removed;
    }

    @Override
    public boolean enqueue(E e) {
        if(e == null) {
            return false;
        }
        addBack(e);
        return true;
    }

    @Override
    public E dequeue() {
        return removeFront();
    }

    @Override
    public boolean push(E e) {
        if(e == null) {
            return false;
        }
        addFront(e);
        return true;
    }

    @Override
    public E pop() {
        return removeFront();
    }

    @Override
    public E peekFront() {
        if(head == null) {
            return null;
        } else {
            return head.data;
        }
    }

    @Override
    public E peekBack() {
        if(tail == null) {
            return null;
        } else {
            return tail.data;
        }
    }

    @Override
    public E peek() {
        return peekFront();
    }

    @Override
    public Iterator<E> iterator() {Iterator<E> it = new Iterator<E>() {
        private Node<E> current = head;
        @Override
        public boolean hasNext() {
            return current != null;
        }
        @Override
        public E next() {
            E old = current.data;
            current = current.next;
            return old;
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
        Node<E> current = head;

        while(current != null) {
            result += current.toString();
            if(current.next != null) {
                result += ", ";
            }
            current = current.next;
        }
        return result + "]";
    }
}
