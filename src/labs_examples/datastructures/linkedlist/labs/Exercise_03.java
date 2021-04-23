package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_03
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {
    public static void main(String[] args) {

    }

    class Node<T>{
        T data;
        Node next;
        Node prev;

        public Node(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(T data, Node node, Node prev){
            this.data = data;
            this.next = node;
            this.next = node;
        }
    }

    class CustomLinkedList<T> {

        private Node head;

        public CustomLinkedList(T...data){
            if(data.length < 1) {
                head = null;
            }
            else {
                for(int i=0; i < data.length; i++){
                    add(data[i]);
                }
            }
        }

        private void add(T datum) {
            T data = null;
            insert(data, size());
        }

        public void insert(T data, int index) {
            if (head == null) {
                head = new Node(data);
            } else {


                Node iterator = head;

                Node previous = null;

                if (index == 0) {
                    head = new Node(data, head, previous);

                } else if (index < size()) {

                    int count = 0;

                    while (count != index) {
                        previous = iterator;
                        iterator = iterator.next;
                        count++;
                    }
                    previous.next = new Node(data, iterator, previous);


                } else {
                    while (iterator.next != null) {
                        iterator = iterator.next;
                    }
                    iterator.next = new Node(data);
                }
            }
        }

        public void remove(int index) {
            if (index == 0) {
                head = head.next;
            } else if (index < size()){
                try {
                    int count = 0;

                    Node previous = null;


                    Node iterator = head;

                    while (count != index) {
                        previous = iterator;
                        iterator = iterator.next;
                        count++;
                    }

                    previous.next = iterator.next;
                } catch (NullPointerException ex) {
                    System.out.println("invalid index");
                }
            } else {
                Node iterator = head;

                while (iterator.next != null) {
                    iterator = iterator.next;
                }


                iterator.next = null;


            }
        }

        public T get(int index) {
            try {
                int count = 0;
                Node iterator = head;


                while (count != index) {
                    iterator = iterator.next;
                    count++;
                }
                return (T) iterator.data;


            } catch (NullPointerException ex) {
                return null;
            }
        }

        public boolean isEmpty() {
            return head == null;
        }


        public void set(int index, T data) {
            try {
                int count = 0;
                Node iterator = head;
                while (count != index) {
                    iterator = iterator.next;
                    count++;
                }


                iterator.data = data;


            } catch (NullPointerException ex) {
                System.out.println("invalid index");
            }
        }

        public int size() {
            int count = 0;
            Node iterator = head;

            while (iterator != null) {
                count++;
                iterator = iterator.next;
            }


            return count;
        }



    }
}