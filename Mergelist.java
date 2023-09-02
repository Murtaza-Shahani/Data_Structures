       class node{
		   
               node next;
			   
                    int data;

    node(){
	
	  this.next = null;
	  }
    }

        public class Mergelist{

                   node head=null;
				   node head2,tail=null;
				   
        int count = 0;

                  void insert(int ndata){
					  
	      node newnode = new node();
		  
	newnode.data=ndata;
	System.out.print(ndata+"->");
	if(head == null){
		
		head = newnode;
		tail=newnode;
		
		head.next = null;
	}
	else{
		tail.next=newnode;
		tail=newnode;
	}
				  }
		
		
	



public node Mergelist(node head1,node head2){
	
	 node p1=head1;
	 
	   node p2=head2;
	   node Headm=null;
		 node Tailm=null;
	       
		   
	  //  node p3=dumyNode;
		
	 while(p1!=null){
		 node dumyNode=new node();
		 
		 dumyNode=p1;
		 p1=p1.next;
		 if(Headm==null){
			 Headm=dumyNode;
			 Tailm=dumyNode;
			 dumyNode.next=null;
		 }
		 else{
			 Tailm.next=dumyNode;
			 Tailm=dumyNode;
		 }
		 
	 }
	 while(p2!=null){
		 
		 node dumyNode=new node();
		 //node Headm=null;
		 //node Tailm=null;
		 dumyNode=p2;
		 p2=p2.next;
		 if(Headm==null){
			 Headm=dumyNode;
			 Tailm=dumyNode;
			 dumyNode.next=null;
		 }
		 else{
			 Tailm.next=dumyNode;
			 Tailm=dumyNode;
		 }
	 }
	 return Headm;
}
		 
		 
		 
		 
		 
		 
		 
		  

	
	
	



	/*public void triverse(){
		
		node mover = head;
		
		     System.out.print("First List: ");
		
		while(mover != null){
			
			System.out.print(mover.data+"->");
			
			mover = mover.next;
		}
		System.out.println("NULL");
		
		mover = head2;
		
		System.out.print("\n\nSecond List: ");
		
		while(mover != null){
			
			System.out.print(mover.data+"->");
			
			mover = mover.next;
		}
		System.out.println("Null");
	}*/
	public static void main(String args[]){
		Mergelist obj = new Mergelist();
		Mergelist obj1 = new Mergelist();
		
          System.out.print("firts list"+":");
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		System.out.print("NULL");
		System.out.println();
		System.out.println();
		System.out.print("2nd list"+":");
		obj1.insert(6);
		obj1.insert(7);
		obj1.insert(8);
		obj1.insert(9);
		obj1.insert(10);
		System.out.print("NULL");
		
		   //  obj.triverse();
		
		           node head3 = obj1.Mergelist(obj.head,obj1.head);
		
		//System.out.println();
		System.out.println();
		//System.out.print("Merged list"+":");
		//System.out.println();
		System.out.print("Merged list"+":");
		while(head3!=null){
			
			System.out.print(head3.data+"->");
			
			head3=head3.next;
		}
		System.out.println("NULL");
		
		
	
		
		
		
	}
}
