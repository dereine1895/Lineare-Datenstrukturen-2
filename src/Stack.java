public class Stack <E> {
    private NodeStack<E> top;

public Stack(){
    top =null;
}

public E getContent(){
    if(top == null) {
        System.out.println("Stack ist leer!");
        return null;
    }
    return top.content;
}

public void add(E content){
    NodeStack<E> newNode = new NodeStack<> (content);
    newNode.next = top;
    top = newNode;


}
public void remove(){
   if (top == null) {
    System.out.println("Stack ist leer");
   } else {
    top = top.next;
   }
}
public boolean isEmpty() {
    return top == null;
    }

}
