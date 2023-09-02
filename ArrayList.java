
  class ArrayList
  {
	  int[] Array;
	  int point=0;
	  
	  
  public ArrayList(int size)
	  {
           Array = new int[size];
	  }
     public void  Add(int data)
	 
	 {
		 if(point<Array.length)
		 {
			 Array[point]=data;
		 point++;
		 }
	 
	 
	 else
	 {
		 int[] temp = new int[(Array.length*2)];
		 for(int i=0;i<Array.length;i++)
		 {
			 temp[i]=Array[i];
		 }
		 Array=temp;
		 Array[point]=data;
		 point++;
	 }
  }
     public void print()
	   
   {
	 System.out.println("printing the values of array\n");

      for(int i=0;i<point;i++)
      System.out.print(Array[i]+" ");	
  
	   }
	   
	   
	   public int remove()   // it will remove last index value from array;
	   {
		   if(point>0
		   {
			   
			   int x= Array[point];
			   point--;
			   return x;
		   }
	   }
	   
	   
		 public static void main(String[] args)
		 {
			 ArrayList A = new ArrayList(3);
			 A.Add(99);
			 A.Add(88);
			 A.Add(77);
			 A.Add(66);
			 A.print();
			 
			 
			 
		 }
		 
  }
  