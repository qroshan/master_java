package nirvana.solver;

public class CircularList<T> {
	private Node<T> head= null;
	private Node<T> tail= null;

	public void add(T item) {
		Node<T> node= new Node<T>();
		node.setNodeValue(item);
		if (head==null) {
			head= node;
			tail= node;
			head.setNext(node);
		} else {
			node.setNext(head);
			tail.setNext(node);
			tail= node;
		}
	}

	public T forward() {
		head= head.getNext();
		tail= tail.getNext();
		return head.getNodeValue();
	}

	public T peek() {
		return head.getNodeValue();
	}
	public void print() {
		if (head==null) {
			return;
		}
		Node<T> curr= head;
		System.out.print("[" + curr.getNodeValue());
		while(curr.getNext() != head) {
			System.out.print(", " + curr.getNext().getNodeValue());
			curr= curr.getNext();
		}
		System.out.println("]");
	}

	public static void main(String[] args) {
		CircularList<Integer> circ= new CircularList<Integer>();
		circ.add(1);
		circ.print();
		circ.add(2);
		circ.add(3);
		circ.print();
		circ.forward();
		circ.print();
		circ.forward();
		circ.print();
	}
}
