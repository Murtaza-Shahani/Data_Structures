 
  class StackUsingArray
  {
	  double[] Array;
	  int size;
	  int top;
	  
	 public  StackUsingArray(int size)
	  {
		  this.size=size;
		  top = -1;
		  Array = new double[size];
	  }
	  public boolean IsEmpty()
	  {
		 return top == -1;
		  
	           }
      public boolean IsFull()
			   {
				   return top == size-1;
					  
			   }
	  public void Push(double value)
	  {
		  if(IsFull())
		  {
			  System.out.println("Stack is Full");
		  
		  }
		  else
		  { 
	  System.out.println("pushing :"+value);
	        top++;
			  Array[top] = value;
			  
			  
		  }
	  }
		  public void Pop()
		  {
			  double remove;
			  if(IsEmpty()){
				  System.out.println("Stack is Empty");
			  }
			  else{
				  remove =Array[top];
				  System.out.println(remove+" : is removed");
				  top--;
				  
			  }
		  }
		  
		  public void Peak()
		  {
			  if(IsEmpty())
			  {
				  System.out.println("there is no peak element bxoz stack is empty");
			  }
			  else{
			  double Last= Array[top];
			  System.out.println("Peak Element is::"+Last);
			  }
		  }
		  public void Display()
		  {
			   System.out.println("the total element of the array are\n");
              for(int i=0;i<top;i++)
                 System.out.print(Array[i]+" ");
		  }
 
				  
	public static void main(String[] args)
	{
      StackUsingArray S = new StackUsingArray(7);
	    
		S.Push(2.3);
		S.Push(3.4);
		S.Push(3.5);
		S.Push(3.98);
		S.Push(2.68);
		S.Push(3.48);
		while(!S.IsEmpty())
		{
		S.Pop();
		}

	}

	  }	
			  
		  
		  
		  
  