package co.edu.uptc.models;

public class Node<T> {
    protected T data;
    protected Node prev;
    protected Node next;

    public Node(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
