public class Stack<E> {
    private NodeStack<E> top;


    private class NodeStack<E> {
        E content;
        NodeStack<E> next;

        public NodeStack(E content) {
            this.content = content;
            this.next = null;
        }
    }


    public Stack() {
        top = null;
    }


    public E getContent() {
        if (top == null) {
            System.out.println("Stack ist leer!");
            return null;
        }
        return top.content;
    }

    /**
     *
     * @param content
     */
    public void push(E content) {
        NodeStack<E> newNode = new NodeStack<>(content);
        newNode.next = top;
        top = newNode;
    }


    public E pop() {
        if (top == null) {
            System.out.println("Stack ist leer!");
            return null;
        }
        E content = top.content;
        top = top.next;
        return content;
    }

    public boolean isEmpty() {
        return top == null;
    }
}