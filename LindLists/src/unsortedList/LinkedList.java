package unsortedList;

public class LinkedList {
	Node head;
	
	public void addCalcDifferenc (int data) {
		Node newNode = new Node(data);
		if (head ==null){
			head =newNode;
		}
		else {
			Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next=newNode;
		}
	}
	public int calcDifferenc() {
		if (head ==null||head.next==null){
			throw new IllegalArgumentException ("not enough data");
		}
		int max = head.data;
		int min = head.data;
		Node current = head.next;
		while (current !=null) {
			if (current.data>max) {
			max = current.data;
			}
			if (current.data>min) {
				min = current.data;
				}
		System.out.println(Math.abs(max)- Math.abs(min));
	}
}
