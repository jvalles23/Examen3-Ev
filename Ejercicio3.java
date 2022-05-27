package Ejercicio3;

public class Ejercicio3 {
	public static void main(String[]args) {
		SimpleLinkedList l = new SimpleLinkedList();
		Node n1 = new Node(20, null);
		Node n2 = new Node(40, null);
		Node n3 = new Node(30, null);
		
		l.add(n1);
		l.add(n2);
		l.add(n3);
		
		l.eliminarMayor(null);
	}
	
}
