import org.w3c.dom.Node;

class ReverseLL {
    Node head;
    private int size;

    ReverseLL() {
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

    //reverseIterate
    public void reverseIterate(){

        if(head==null || head.next==null){
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;

        while (currNode!=null) {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    //reverseRecursive
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;
    }


    public static void main(String[] args) {
        ReverseLL list = new ReverseLL();

        list.addFirst("Hello");
        list.addFirst("Heyy!");
        list.printList();

        list.addLast("ronit");
        list.addLast("savaliya");
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.reverseIterate();
        list.printList();

        list.addFirst("How");
        list.addFirst("Are");
        list.addFirst("You?");
        list.printList();

        //using Reversive Recursive
        try{
            list.head=list.reverseRecursive(list.head);
            list.printList();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}