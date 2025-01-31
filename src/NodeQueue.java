public class NodeQueue<E> {

    private E content;  // Der Inhalt des Knotens
    private NodeQueue<E> nextNode;  // Verweis auf den nächsten Knoten

    // Konstruktor, um den Inhalt des Knotens zu setzen
    public NodeQueue(E pContent) {
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
    public NodeQueue<E> getNextNode() {
        return nextNode;
    }

    // Setter für den nächsten Knoten
    public void setNextNode(NodeQueue<E> nextNode) {
        this.nextNode = nextNode;
    }
}
