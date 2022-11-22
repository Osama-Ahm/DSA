public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return(first==null);
    }
    public void insertFirst(int data){
        Node nn = new Node();
        nn.data = data;
        if(isEmpty()){
            last = nn;
        }else{
            first.prev = nn;
            nn.next = first;
        }
        first = nn;
    }

    public void deleteFirst(){
        first = first.next;
        first.prev = null;
    }

    public void insertLast(int data){
        Node nn = new Node();
        nn.data = data;
        if(isEmpty()){
            last = nn;
        }else{
            last.next = nn;
            nn.prev = last;
        }
        last = nn;
    }

    public void deleteLast(){
        last = last.prev;
        last.next = null;
    }

    public void displayForward(){
        Node temp = first;
        while(temp.next != null){
            temp.displayNode();
            temp = temp.next;
        }
        temp.displayNode();


    }

    public void displayBackward(){
        Node temp = last;
        while(temp.prev != null){
            temp.displayNode();
            temp = temp.prev;
        }
        temp.displayNode();
    }

    public void lengthOf(){
        Node current = first;
        int length = 0;
        while(current!=null){
            length++;
            current = current.next;
        }
        System.out.print("Length: "+length);
    }

    public int product(){
        Node current = first;
        int product = 1;
        while(current!=null){
            product *= current.data;
            current = current.next;
        }
        return product;
    }

}
