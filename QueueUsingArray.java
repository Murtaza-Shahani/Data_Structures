  
 public  class QueueUsingArray
  {
	  int[] Array;
	  int size;
	  int rear;
	  int front;
	  
	  public QueueUsingArray(int size)
	  {
		  this.size=size;
		  rear=-1;
		  front=0;
		  Array = new int[size];
		  
	  }
	  
	  public boolean IsEmpty()
	  {
		 return front == rear;
		  
	           }
      public boolean IsFull()
			   {
				   return rear == size-1;
					  
			   }
	  
	  
	  
	  
	  public void Enqueue(int data)
	  {
		  if(IsFull())
		  {
			  System.out.println("Queue is full");
		  }
		  else
		  {
			  System.out.println("Enqueueing the:"+data);
			  rear++;
			  Array[rear]=data;
			  
		  }
		  
		  
	  }
	  public void Dequeue()
	  {
		  if(IsEmpty())
		  {
			  System.out.println("queue is empty");
		  }
		  else
		  {
			  int remove= Array[front];
		  System.out.println("Dequeueing ::"+remove);
		  for(int i=0;i<rear-1;i++)
		  {
			  Array[i]= Array[i+1];
			  
		  }
		  --rear;
		  }
	  }
	public void Peak()
	{
      if(rear==0)
	  {
        System.out.println("no peak element bcoz queue is empty");
	   }
          else{
			  int peak=Array[0];
		  
		  System.out.println("peak element is ::"+peak);
	}
	}
	
	
	
	
	
	  public void Size()
	  {
		System.out.println("the size of the element is::"+rear);  
		  
	  }
        			  
		  
		  public static void main(String[] args)
		  {
			  QueueUsingArray Q = new QueueUsingArray(5);
			  
			  Q.Enqueue(88);
			  Q.Enqueue(70);
			  Q.Enqueue(62);
			  Q.Enqueue(50);
			  Q.Enqueue(48);
			  Q.Enqueue(38);
			  Q.Dequeue();
			  Q.Enqueue(38);
			  while(!Q.IsEmpty())
			  {  
			  Q.Dequeue();
			  //Q.Peak();
			  //Q.Size();
			  }
			  
			  
			  
		  }
  }
		  
		  