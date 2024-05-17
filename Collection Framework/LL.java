class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // addFirst
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // printList
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty.!");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // deleteFirst
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty.!");
            return;
        }
        size--;

        head = head.next;
    }

    // deleteLast
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is Empty.!");
            return;
        }
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    // getSize
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("Hello");
        list.addFirst("Heyy!");
        list.printList();

        list.addLast("ronit");
        list.addLast("savaliya");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.print(list.getSize());

    }

}