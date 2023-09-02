  public class LinkedL1{
	
   class Node{
	    int data;
		
		  Node next;
                  
	 
      public Node(int data){
		
	       this.data=data;
                       }
               }
 
	      Node head=null;
		  int size=0;
		  
	  public boolean IsEmpty()
	  {
		  if(head==null)
		  {
		  return true;
		  }
	  
		  else{
			  return false;
		  }
		  
	  }
	  
	  public int Size()
	  {
		  System.out.print("size of the linked list is::");
		  return size;
	  }
	  
	  
	  public int First()
	  {
		  System.out.print("fisrt element of the linked list is::");
		  int x=0;
		  if(head!=null)
		  {
			x= head.data;  
			  
		  }
			 return x; 
	  }
	  
	 
  public void AddFirst(int data){    // Method to Add at first
			 
		    Node newNode = new Node(data);  // Creating Node
			
		      newNode.data=data;
			  
		         if(head==null){
					 
			            head=newNode;     //if head==null then assign head to newnode
						size++;
		                      }
		 
		 else{
			 newNode.next=head;     // if head is not equal to null then add newnode at first
			 
			   head=newNode;
			   size++;
			 
			 
		 }
			 
		 
	 }
	 
	 public void AddLast(int data){    // Method to Add Last 
		 
		 Node newNode = new Node(data);
		 
		 newNode.data=data;
		 
		   if(head==null){     // if head is null
			   
			   head=newNode;
			   size++;
		   }
		   else{
			   Node curr=head;
			   
			   while(curr.next!=null){     // traverse upto last node
				   curr=curr.next;
			   }
			   curr.next=newNode;   // connect newnode to last
			   size++;
			   
			   
		      }
	                            }
   

    public void AddSpeP(int data,int index)
	{	
		Node newNode =new Node(data);
		
		   newNode.data=data;
		
		if(index<=0|| index>size){
			System.out.println("sorry u have given invalid index");
			return;
		                           }
	else{
		int count=1;
		Node curr=head;
		
		  while(count!=index-1){
			
			curr=curr.next;
			count++;
		                    }
	
	        newNode.next=curr.next;
			
			curr.next=newNode;
			size++;
			
	   }	

 }	   
		 
	 public void deleteF(){     //Method to delete a node at front 
	 
		 if(head== null){
			 return;
			 
		           }
		 if(head.next == null){
			 head=null;
			 
		    }
			
		 head= head.next;
		 size--;
		 
	 }
	 
	 
	 
	 public void DelSpePo(int index){
		 
		   if(head==null){
			   System.out.println("list is empty");
			 
			      return;
			 
		               }
		 
		       if(index==1&& head.next==null){
				   
			         head=null;
					 size--;
		                                  }
		 
		 
		 if(index==1&& head.next!=null)
		 {
			 head=head.next;
			 size--;
		 }
			 
			 
		 
		 if(index<=0||index>size){
			 System.out.println("Sorry u have given invalid index");
			 
		 }
		 else{
			 int count=1;
			 Node del=head.next;
		   	Node predel=head;
			 
			 while((count+1)!=index && del.next!=null){
				 del=del.next;
			 predel=predel.next;
			count++;
				 
				 }
				 predel.next=del.next;
				 del=null;
				 size--;
					System.out.println("the size of the list is ::="+size);
		 }
		 
		 
		 
		 
	 }
	 
	 public void deleteL()  //method to delete a node at last
	 {
		 if(head== null){
			 return;
			 
		                }
		   if(head.next == null){
			 head=null;
			 size--;
			 
		    }
			
	 else{

		 Node temp=head.next;
		 Node curr=head;
		 
			 
			 while(temp.next!=null){
				 
				  temp=temp.next;
				  curr=curr.next;
				 
			                       }
								   
			           curr.next=null;
					   size--;
		      }
		 
	}
		 
		 
	 public void Traverse() // traverse method
	 {	 
		 Node curr=head;
		 while(curr!=null){
			 System.out.print(curr.data+"->");
			 
			 curr=curr.next;
		                    }
	 }
 
 
	 
	 public static void main(String[] args){
		 LinkedL1 L =new LinkedL1();
		 System.out.println(L.IsEmpty()+"\n");
		 System.out.println(L.Size()+"\n");
		 System.out.println(L.First()+"\n");
		 System.out.println();
		 System.out.println("printing the data stored at first");
		 L.AddFirst(1);
		 L.AddFirst(2);
		 L.AddFirst(3);
		 L.AddFirst(4);
		 L.AddFirst(5);
		 System.out.println(L.IsEmpty()+"\n");
		 System.out.println(L.Size()+"\n");
		 System.out.println(L.First()+"\n");
		 L.Traverse();
		 System.out.println();
		 System.out.println("printing the data stored at last");
		 L.AddLast(1);
		 L.AddLast(2);
		 L.AddLast(3);
		 L.AddLast(4);
		 L.AddLast(5);
		 System.out.println();
		 System.out.println(L.IsEmpty()+"\n");
		 System.out.println(L.Size()+"\n");
		 System.out.println(L.First()+"\n");
		 L.Traverse();
		 System.out.println();
		 L.deleteF();
		 System.out.println("after deletion of a node from first");
		 System.out.println();
		 L.Traverse();
		 System.out.println();
		 System.out.println("after deletion of a node from last");
		 L.deleteL();
		 System.out.println();
		 L.Traverse();
		 System.out.println();
		 System.out.println("after adding a node at specific position(SAY POSITION Is INDEX 4)");
		 L.AddSpeP(999,4);
		 System.out.println();
		 L.Traverse();
		 System.out.println();
		 System.out.println("after deleting a node at specific position(SAY POSITION Is INDEX 4)");
		 
		 L.DelSpePo(4);
		 System.out.println();
		 System.out.println(L.IsEmpty()+"\n");
		 System.out.println(L.Size()+"\n");
		 System.out.println(L.First()+"\n");
		 L.Traverse();
		 
		 
		 	 }
  }
  
 
		 
 
 