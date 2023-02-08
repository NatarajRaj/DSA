package DSA;

public class CircularLinkedListdemo {
	
	public static void main(String [] args)
	{
		CircularLinkedList list1=new CircularLinkedList();
		
		list1.insertAtBeginning("Nataraj");   //insert data on list
		list1.insertAtBeginning("Gowzi");		//insert data on list
		list1.insertAtBeginning("Sheela");	
		list1.insertAtBeginning("SheelaNatarajan");	
		list1.insertAtBeginning("GowziNatarajan");	
		list1.display();				//display on list
		
		System.out.println(" ");
		list1.insertAtBeginning("Baby");	
		list1.insertAtBeginning("Mysweety");	
		list1.display();				//display on list
		
		System.out.println(" ");
		list1.insertAtEnd("Hello");	
		list1.insertAtEnd("Hi");	
		list1.display();				//display on list

		System.out.println(" ");
		list1.deleteAtBeginning();	
		list1.display();				//display on list
		
		System.out.println(" ");
		list1.deleteAtEnd();
		list1.display();				//display on list
	}

}
