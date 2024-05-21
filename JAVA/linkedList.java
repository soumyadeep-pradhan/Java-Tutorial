import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();
        myLinkedList.add("Audi");
        myLinkedList.add("Mercedez");
        myLinkedList.add("BMW");
        myLinkedList.addLast("VW");
        myLinkedList.removeFirst();
        myLinkedList.addFirst("Ford");
        myLinkedList.removeLast();
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.getLast());
    
    }
}
