package Ejercicio3;
//Un nodo contiene un contenido y un nodo next, que apunta al siguiente.
//Un conjunto de nodos forma el TAD de ListaEnlazadaSimple
public class Node {
	private int content;
	private Node next;
	
	public Node (int content, Node next) {
		this.content = content;
		this.next = next;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + ", next=" + next + "]";
	}
}
