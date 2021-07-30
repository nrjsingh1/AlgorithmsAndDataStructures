package LinkedList;

public class MergeTwoSingleLinkLists {
	
	
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list = list.insertAtEndSingleLinkedList(list, 1);
		list = list.insertAtEndSingleLinkedList(list, 3);
		list = list.insertAtEndSingleLinkedList(list, 5);
		list = list.insertAtEndSingleLinkedList(list, 7);
		
		SingleLinkedList list1 = new SingleLinkedList();
		list1 = list1.insertAtEndSingleLinkedList(list1, 1);
		list1 = list1.insertAtEndSingleLinkedList(list1, 3);
		list1 = list1.insertAtEndSingleLinkedList(list1, 5);
		
		
		System.out.println(list.printSingleLinkedList(list));

		System.out.println(list1.printSingleLinkedList(list1));
	}

}
