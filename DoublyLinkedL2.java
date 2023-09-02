   class DoublyLinkedL2{
	   
	   Node head=null;
	   int size=0;
	   
	   
	   class Node {
		   
		   int data;
		    Node next;
		     Node pre;
		   
		   public Node(int data){
			   this.data=data;
			   next=null;
			   pre=null;
		      }
		   
	     }
		 
	public void AddF(int data)  // Method to add at the beggining of the list
	{
		Node neWnode = new Node(data);  // creating node
		 neWnode.data=data;
		 
	 if(head==null){      // if head is null assign it to newnode
			   
			 head=neWnode;
		         neWnode.next=null;
		              neWnode.pre=null;
					  size++;
		            }
	else{                  //if not then add it to the first
		neWnode.next=head;
		head.pre = neWnode;
		head = neWnode;
		size++;
	   }
	}
		
						
	
	public void AddSP(int data,int index){   //Method to Add a node at specific position
		Node neWnode = new Node(data);
		neWnode.data= data;
		
	    	if(index>size|| index<0){
				
			    System.out.println(" invalid index");
			return;
		   }
		   else{
			   int count =1;
			   Node curr=head;
			   while((count+1)!=index &&curr.next!=null){
				   
				   curr=curr.next;
				   count++;
				   
			   }
			   neWnode.next=curr.next;
			   neWnode.pre=curr;
			   curr.next=neWnode;
		   }
	}
	
	public void AddL(int data)       // method to Add a node at last
	{
		Node neWnode = new Node(data);
		neWnode.data=data;
		
		  if(head==null){
			  head=neWnode;
		       head.next=null;
		        head.pre=null;
	    }
		else{
			
			Node curr=head;
			while(curr.next!=null){
				
				curr=curr.next;
			}
			curr.next=neWnode;
			neWnode.pre=curr;
		}
   }
		
		
	public void	DeleteF(){     // method to delete a node from front;
		if(head==null){
			System.out.println("list is empty");
		}
		
		if(head.next==null){
			head=null;
		size--;
		}
		else{
			head=head.next;
		size--;
		}
	}
	
	
	
	public void	DeletePos(int index){     // method to delete a node from front;
		if(index==0|| index<0 || index>size){
			
			System.out.println("invalid index");
		}
		if(index==1){
			
			head=head.next;
		}
		
		
		
		else{
			Node curr=head.next;
			Node prec=head;
			int count=1;
			while((count+1)!=index && curr.next!=null){
				
				curr=curr.next;
				prec=prec.next;
			}
			prec.next=curr.next;
			curr=curr.next;
			curr.pre=prec;
		}
	}
	
	
	
	public void DeleteL()
	{
		if(head==null){
			System.out.println("list is empty");
		}
		
		if(head!=null && head.next==null){
			head=null;
		}
		
		else{
			Node temp = head.next;
			Node pretemp=head;
			
			while(temp.next!=null){
				temp=temp.next;
				pretemp=pretemp.next;
				
			}
			pretemp.next=null;
			
		}
	}
				
				
			

	public void Traverse(){    //Method to print the list
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println();
	}
			   
		
		
		
		
		
	   public static void main(String[] args)
	   {
		   DoublyLinkedL2 L=new DoublyLinkedL2();
		   L.AddF(99);
		   L.AddF(88);
		   L.AddF(77);
		   L.AddF(66);
		   L.AddF(55);
		   L.Traverse();
		   L.AddSP(1,3);
		   L.Traverse();
		   L.AddL(11);
		   L.AddL(12);
		   L.Traverse();
		   //L.DeletePos(3);
		  // L.Traverse();
		  L.DeleteL();
		  L.Traverse();
		  
	   }
   }