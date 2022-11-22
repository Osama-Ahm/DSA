public class Main {

    public static void main(String[] args) {
	    DoublyLinkedList list1 = new DoublyLinkedList();
	    list1.insertFirst(4);
        list1.insertFirst(5);
        list1.insertFirst(6);
        list1.insertFirst(7);

        //list1.deleteFirst();
        list1.deleteLast();
        list1.displayForward();
        System.out.println("Product: "+list1.product());



        //list1.lengthOf();
        //list1.displayForward();
        //System.out.println("\n");
        //list1.displayBackward();

    }
}
