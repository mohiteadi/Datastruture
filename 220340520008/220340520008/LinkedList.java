 
   // Q.2..liked list
   
   class Linkedlist
   {
   
  static  Node head;
	
	 static class Node
	 {
	  int data;
	  Node next;
	 
	  
	  Node(int data)
	  {
	   this.data=data;
	   this.next=null;
	   
	  }
	 }
   
   Node reverse(Node node){
	   Node prev=null;
	   Node curr=node;
	   Node next=null;
	   
	   while(curr !=null)
	   {
		   
		   next =curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=next;
	   }
	   node=prev;
	   return node;
   }
   void printlist(Node n)
   {
	   while(n !=null){
		   System.out.println(n.data);
		   n=n.next;
		   
	   }
	   
   }
  
	 
	 public static void main(String[] args)
	 {
	 
	  Linkedlist l1=new Linkedlist();
	
	  l1.head=new Node(1);
	  l1.head.next=new Node(2);
	  l1.head.next.next=new Node(3);
	  l1.head.next.next=new Node(4);
	   l1.head.next.next.next=new Node(5);
	   
	   System.out.println("linked list reversed");
	  l1.printlist(head);
	   head=l1.reverse(head);
	   
	   System.out.println("linked list after reversed");
	   l1.printlist(head);
	 }
   }