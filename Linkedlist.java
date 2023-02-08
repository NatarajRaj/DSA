
									//Linked List insert at data on beginning

package DSA;

public class Linkedlist {
	Node head;				//to initialized the node(head starting point on node)
		  
	class Node{
		int data;			//data means value, node (next) reference on end null pointer
		Node next;
		
		Node(int val){					//to input new value on the node 
			data=val;
			next=null;					
		}
	}
		
	Linkedlist()					//constructor  (to add new data by using main method reference linked list object(list1) 
	{
		head=null;   				// to initial head is null
	}
public void insertAtBeginning(int val) {
	Node newNode=new Node(val);						//to create object for node to add data on linked list
	
	if(head==null) {				//when list is empty,,, to insert first data
		head=newNode;
	}
	else							//if list is not empty,already on data ,,,insert new data set on beginner part of node
	{
		newNode.next=head;
		head=newNode;
	}	
}

public void insertAtPos(int pos, int val) {
	
	if(pos==0) {							//suppose insert position is 0 apply this condition 
		insertAtBeginning(val);
		return ;
	}
	
	Node newNode= new Node(val);
	Node temp=head;			//its mean first node
	for(int i=1;i<pos;i++) {			
		temp=temp.next; 		//temp jump on next node continously when entered pos less than & stopped (ex:pos=2,,,temp jump stop on index number 1)
		
		if(temp==null) {
	    	 throw new IndexOutOfBoundsException("Invalid position: "+pos);		//suppose insert position excess data lists throws exception message
	     }
	}
     
	temp.next=newNode;			//now,index number 0 position linked new inserted node(new node index number is 1)  
	newNode=temp.next;			//now, newnode linked next index number linked with already exist with next node
}	

public void deleteAtPos(int pos) {
	
	if(head==null) {
		throw new IndexOutOfBoundsException("Deletion attempt on empty list");   //no data on empty list this message shown
	}
	
	if(pos==0) {
		head=head.next;			//starting position 0 wiil be deleted automatically next position as a starting position
		return ;
	}
	
	Node temp=head;
	Node prev=null;
	for(int i=1;i<pos;i++) {
		prev=temp;
		temp=temp.next;
	}
	prev.next=temp.next;
}

public void Reverse() {
	Node prev=null;
	Node current=head;
	Node next=head.next;
	while(current!=null) {
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
	}
	head=prev;
}


public void display() {					//to display on entered list values
	Node temp = head;
	while(temp!=null) {					//to display on end of the null pointer on list
		System.out.print(temp.data+ " ");
		temp=temp.next;					//to arrange temp.next to continously view list at end of null pointer
	}
}
	

}



	

