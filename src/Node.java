public class Node<E> {

    private E content;  // Der Inhalt des Knotens
    private Node<E> nextNode;  // Verweis auf den nächsten Knoten

    // Konstruktor, um den Inhalt des Knotens zu setzen
    public Node(E pContent) {
        this.content = pContent;
        this.nextNode = null;  // Der nächste Knoten ist zu Beginn null
    }

    // Getter für den Inhalt des Knotens
    public E getContent() {
        return content;
    }

    // Setter für den Inhalt des Knotens
    public void setContent(E pContent) {
        this.content = pContent;
    }

    // Getter für den nächsten Knoten
    public Node<E> getNextNode() {
        return nextNode;
    }

    // Setter für den nächsten Knoten
    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }
}
