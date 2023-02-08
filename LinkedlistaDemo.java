package DSA;

public class LinkedlistaDemo {
	public static void main(String [] args)
	{
		Linkedlist list1=new Linkedlist();
		list1.insertAtBeginning(9);   //insert data on list
		list1.insertAtBeginning(5);		//insert data on list
		list1.insertAtBeginning(7);	
		list1.insertAtBeginning(9);	
		list1.insertAtBeginning(4);	
		list1.display();				//display on list
		
		
	System.out.println("");	
	list1.insertAtPos(2,15);				//insert at postion
	list1.display();
	
	System.out.println("");
	list1.deleteAtPos(1);
	list1.display();
	
	System.out.println("");
	list1.Reverse();
	list1.display();
	}

}
