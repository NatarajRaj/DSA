package DSA;

import DSA.Linkedlist.Node;

public class CircularLinkedList {
			  Node last;				//note this syntax last,,,because last.next(head) in circular type
		class Node{
			String data;			//data means value, node (next) reference on end null pointer
			Node next;
			
			Node(String val){					//to input new value on the node 
				data=val;
				next=null;					
			}
		}
			
		CircularLinkedList()					//constructor  (to add new data by using main method reference linked list object(list1) 
		{
			 last = null;   				// to circular type
		}

		public void insertAtBeginning(String val) {
			Node newNode=new Node(val);						//to create object for node to add data on linked list
			
			if(last==null) {				//when list is empty,,, to insert first data
				newNode.next=newNode;
				last=newNode;
			}
			else							//if list is not empty,already on data ,,,insert new data set on beginner part of node
			{
				newNode.next=last.next;
				last.next=newNode;
			}	
		}

public void insertAtEnd(String val)
{
	Node newNode=new Node(val);
	if(last==null)
	{
		newNode.next=last.next;
		last=newNode;	
	}
	else 
	{
		newNode.next=last.next;
		last.next=newNode;
		last=newNode;
	}
}


public String deleteAtBeginning()
{
	if(last==null)			//empty circular linkedlist 
	{
		throw new IndexOutOfBoundsException("Deletion list is empty");
	}
	
	String temp=last.next.data;
	if(last.next==last)				//single data node present on the list
	{
		last=null;				
	}
	else
	{
		last.next=last.next.next;	
	}
	return temp;
}

public void deleteAtEnd() {
	if(last==null)
	{
		throw new IndexOutOfBoundsException("Deletion list is empty");
	}
	
	if(last.next==null)
	{
		last=null;						//single data node present on the list
	}
	else
	{
		Node temp=last.next;   	//In circular last.next(head (or) first node)
		while(temp.next!=last)   //temp stopped at end position before last data
		{
			temp=temp.next;			//now linked last before data(temp) to connect temp.next(last.next) now 
		}
		
		temp.next=last.next;     //temp.next is connected with last.next(first node),,,to automatically link cut off the last node
		last=temp;			  //now, temp is a last node
	}

}




		public void display()
		{
			Node temp=last.next;
			do {
				System.out.println(temp.data+" ");
				temp=temp.next;
			}while(temp!=last.next);
		}

		
}
