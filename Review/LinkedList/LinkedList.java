import java.util.*;
class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}

}
class LinkedList{
	
	public static void insertNode(Node head,int val,int from,int to){
		Node node=new Node(val);
		Node temp1=head;
		Node temp2=head.next;
		if(temp2==null){
			temp1.next=node;
			return;
		}
		while(temp2!=null){
			if(temp1.data==from && temp2.data==to){
				break;
			}
			temp1=temp2;
			temp2=temp2.next;
			
		}
		if(temp2==null){
			temp1.next=node;
		}
		node.next=temp2;
		temp1.next=node;
	}
	
	public static void main(String[]args){
		
		Node head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(4);
		head.next.next.next=new Node(5);
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"	");
			temp=temp.next;
			
		}
		insertNode(head,3,2,4);
		temp=head;
		System.out.println();
		while(temp!=null){
			System.out.print(temp.data+"	");
			temp=temp.next;
			
		}
		
		
	}
}