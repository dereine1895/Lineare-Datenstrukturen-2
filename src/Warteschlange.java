public class Warteschlange <E>{
    private NodeQueue<E> erster;
    private NodeQueue<E> letzter;

    public Warteschlange() {

    }

    public E gibErsten() {
        if(erster != null) {
            return erster.getContent();
            // Wenn die Warteschlange leer ist, wird null zurückgegeben
        }
        return null;
    }

    public void remove() {
        if (erster != null) {
            erster = erster.getNextNode();
        }
    }

    public void add(E content) {
        if (content == null) {
            throw new IllegalArgumentException("Kunde darf nicht null sein");
        }

        if (letzter == null) {
            letzter = new NodeQueue<>(content);
            erster = new NodeQueue<>(content);
        } else {
           letzter.setNextNode(new NodeQueue<>(content));
           letzter = new NodeQueue<>(content);
        }
    }
}