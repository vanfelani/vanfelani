package linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    private class Node<T> {

        T data;
        Node<T> next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

    }

    /**
     * get the last node
     *
     * @return last node
     */
    public Node<T> getLastNode() {
        Node<T> n = head;
        if (head != null) {

            while (n.next != null) {
                n = n.next;
            }

        }
        return n;
    }

    public void add(T data) {
        Node node = new Node(data, null);
        if (head != null) {

            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        } else {
            head = node;
        }
    }

    public int count() {
        int count = 0;
        Node n = head;
        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }

    public void edit(int index, T data) {
        Node<T> n = head;
        if (index >= count() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            n = n.next;

        }
        n.data = data;

    }

    public void insert(int index, T data) {

        Node<T> n = head;
        Node<T> temp = null;
        if (index >= count() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        
        if (index == 0){
            temp = head;
            head = n.next;
            
        }
        for (int i = 0; i < index; i++) {

        }
    }

    public T remove(int index) {
        Node<T> n = head;
        Node<T> temp = null;
        if (index >= count() || index < 0) {
            throw new IndexOutOfBoundsException("tidak ada index");
        }
        if (index == 0) {
            head = n.next;
            return n.data;
        }
        for (int i = 0; i < index; i++) {
            temp = n;
            n = n.next;

        }
        temp.next = n.next;

        return n.data;
    }

    public T get(int index) {
        Node<T> n = head;
        if (index >= count() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index; i++) {
            n = n.next;

        }

        return n.data;
    }
    
}
