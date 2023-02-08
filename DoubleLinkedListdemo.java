package DSA;

public class DoubleLinkedListdemo {

	public static void main(String [] args)
	{
		DoubleLinkedList list1=new DoubleLinkedList();
		list1.insertAtBeginning(9);   //insert data on list
		list1.insertAtBeginning(5);		//insert data on list
		list1.insertAtBeginning(7);	
		list1.insertAtBeginning(9);	
		list1.insertAtBeginning(4);	
		list1.display();				//display on list
		
		System.out.println("");
		list1.displayReverse();
		
		System.out.println("");
		list1.insertAtPos(2,15);
		list1.display();
		System.out.println("");
		list1.displayReverse();
		
		
		System.out.println("");
		list1.deleteAtPos(3);
		list1.display();
		System.out.println("");
		list1.displayReverse();
	}	
}