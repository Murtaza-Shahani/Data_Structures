  
  
  import  java.util.Scanner;
   public class ArraysL1 
   {
	   Scanner sc = new Scanner(System.in);
    public void Task1()        // method to take input from user and save it to array then print it
	{
		int[] array = new int[10];
		
     System.out.println("enter 10 elements in the array");
	 
   for(int i=0;i<10;i++)
   { 

      System.out.print("enter element:"+i+":");
	  array[i]= sc.nextInt();
	  System.out.println();
	  
   }
   
      System.out.println("entered elements are");
	  
	   for(int i=0;i<10;i++)
	   {
		   System.out.print(array[i]+" ");
	   }
	   
	}
	
	
	
	public void Task2()          // method to print arrays elements in reverse order
	
	{
		int[] array = new int[10];
		
     System.out.println("enter 10 elements in the array");
	 
   for(int i=0;i<10;i++)
   { 

      System.out.print("enter element:"+i+":");
	  array[i]= sc.nextInt();
	  System.out.println();
	  
   }
   
      System.out.println("stored elements in the array are");
	  
	   for(int i=0;i<10;i++)
	   {
		   System.out.print(array[i]+" ");
	   }
	   
	   
	   System.out.println("reversed order  are");
	  
	   for(int i=9;i>0;i--)
	   {
		   System.out.print(array[i]+" ");
	   }
	   
	}
		
		
		public void Task3(){                // method to find the sum of the elements of array
			
			int sum = 0;
			   int[] Array=new int[5];
			     System.out.println("enter 5 numbers:");
			       System.out.println();
	for(int i=0;i<5;i++)
	{
		Array[i]= sc.nextInt();
        sum=sum+Array[i];
	}
	
   System.out.println("sum of the entered elements are:"+sum);
	
	
		}
	
	
	
	public void Task4()   // method to prompt array anf copy one array to other array
	{
		int[] array = new int[5];
		
         System.out.println("enter 5 elements in the array");
	 
   for(int i=0;i<5;i++)
   { 

      System.out.print("enter element:"+i+":");
	  array[i]= sc.nextInt();
	  System.out.println();
	  
   }
   
   int[] Array2 = new int[5];
   
        for(int j=0;j<5;j++)
        {
	   
	    Array2[j]= array[j];
	   
         }
      System.out.println("entered elements in the original are");
	  
	   for(int i=0;i<5;i++)
	   {
		   System.out.print(array[i]+" ");
	   }
	   System.out.println();
	   
	   
	    System.out.println("copied elements in 2nd array are");
	  
	   for(int i=0;i<5;i++)
	   {
		   System.out.print(Array2[i]+" ");
	   }
	 
		
		
		}
		
		
		public void Task5()     //Method to find largest Number in array
	{
		int largest=0;
		int smallest;
		int[] array = new int[5];
		
     System.out.println("enter 5 elements in the array");
	 
   for(int i=0;i<5;i++)
   { 

      System.out.print("enter element:"+i+":");
	  array[i]= sc.nextInt();
	  
	     if(largest<array[i]){
	        largest=array[i];
	                    }		
						
	  System.out.println();
	  
   }
   
      System.out.println("the largest element in the array is:"+largest);
	  
	}
	
	
	
	
		public void Task6()  // Method to find smallest Number in array
	{
	
		int smallest;
		int[] array = new int[5];
		
        System.out.println("enter 5 elements in the array");
	 
         for(int i=0;i<5;i++)
     { 

      System.out.print("enter element:"+i+":");
	    array[i]= sc.nextInt();
	  				
	    System.out.println();
	  
      }
     smallest=array[0];
       for(int i=0;i<4;i++){
	      if(array[i]>array[i+1])
	       smallest=array[i+1];
   }
   
    if(smallest>array[4])
	smallest=array[4];
	
   
      System.out.println("the smallest element in the array is:"+smallest);
	  
	}
	
	
		
	public void Task7()    //Method to count  the number of duplicates in the array
	{
		int count=0;
		int[] array = new int[10];
		
        System.out.println("enter 10 elements in the array");
	 
         for(int i=0;i<10;i++)
     { 

      System.out.print("enter element:"+i+":");
	    array[i]= sc.nextInt();
	  				
	    System.out.println();
	}
	
	for(int i=0;i<10;i++)
	{
		for(int j=0;j<10;j++)
		{
			if(i!=j){
				
			if(array[i]==array[j])
			{
				count++;
				break;
				
				
			}
		}
		
			
		
		}	
		
	}
	

	System.out.println("number of duplicates in the array are:"+count);
	}
	
	
	public void Task8()    //Method to print the unique elements in the array
	{
		boolean indicate=false;
		int[] array = new int[5];
		
        System.out.println("enter 5 elements in the array");
	 
         for(int i=0;i<5;i++)
     { 

      System.out.print("enter element:"+i+":");
	    array[i]= sc.nextInt();
	  				
	    System.out.println();
	}
	System.out.println("unique elements in the array are:\n");
	
	
	for(int i=0;i<5;i++)
	{
		for(int j=1;j<5;j++)
		{
			if(i!=j)
			if(array[i]==array[j]){
			indicate=true;
			continue;
			
			}	
		}
		
		if(indicate==false){
			System.out.println(array[i]+" ");
		}
		
		
		indicate=false;
		
	}
	

	// System.out.println("number of duplicates in the array are:"+count);
	}
	
	
	
	  public void Task9()    //Method to print the frequency of the each elementin the array
	{
		int count=1;
		int[] array = new int[5];
		
        System.out.println("enter 5 elements in the array");
	 
         for(int i=0;i<5;i++)
     { 

      System.out.print("enter element:"+i+":");
	    array[i]= sc.nextInt();
	  				
	    System.out.println();
	}
	
	for(int i=0;i<5;i++)
	{
		for(int j=1;j<5;j++)
		{
			if(i!=j)
			if(array[i]==array[j])
				count++;
			
		}
		System.out.println(array[i]+": frequency::"+count);
		count=1;
	}
	
	}
	
	public void Task10(int arr[],int value)   // Method to delete a specific element from array
	
	{ 
	System.out.print("original array is \n");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				for(int j=i;j<(arr.length-1);j++)
				{
					arr[j]=arr[j]+1;
					
				}
				arr[arr.length-1]=0;
				break;
				
			}
			
			
		}
		
		System.out.println();
		System.out.println("after deleting element :"+value+": array is as folows \n");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		
		
	}
	}
	
	
	public void Task11(int arr[],int index)   // Method to delete a specific element  by giving index from array
	
	{ 
	int size=arr.length;
	if(index<0||index>size)
	 System.out.println("invalid index");
 
	
	System.out.print("original array is \n");
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==index)
			{
				for(int j=i;j<(arr.length-1);j++)
				{
					arr[j]=arr[j]+1;
					
				}
				arr[arr.length-1]=0;
				break;
				
			}
			
		}
		System.out.println();
		System.out.println("after deleting index :"+index+": array is as folows \n");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		
		
	}
	}
	public void Task12()    // method to sum the non square 2d arrays  elements 
	{ 
		int sum=0;
		
		int[][] arr = {
			{4,4},
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
		   {13,14,15,16}
		                 };
						 			 
						 
	for (int[] row : arr) {
            for (int column : row) {
				
				System.out.print(column+" ");

                sum += column;
            }
			System.out.println();
        }					 
						 
	System.out.println("sum of array is::"+sum);
			
	}
	
	
	public void Task13()    // method to print only the even num from non square 2d arrays  elements 
	{ 
	
		
		int[][] arr = {
			{4,4},
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
		   {13,14,15,16}
		                 };
						 	
         System.out.println("printing the even number from the array elements\n");							
						 
	for (int[] row : arr) {
            for (int column : row) {
				if(column%2==0)
				{
				
				System.out.print(column+" ");

                }
            }
		
        }					
	}
	
	public void Task14()    // method to print only the odd number from non square 2d arrays  elements 
	{ 
	
		
		int[][] arr = {
			{4,4},
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
		   {13,14,15,16}
		                 };
						 			 
		System.out.println("printing the odd number from the array elements\n");				 
	for (int[] row : arr) {
            for (int column : row) {
				if(column%2!=0)
				{
				
				System.out.print(column+" ");

                }
            }
		
        }					
	}
	
	
	
	public void Task16()  //  Method to cheack the matrix is row magic or not 
	{
		int row1=0;
		int row2=0;
		int row3=0;
		int[][] arr ={
			         {1,2,3},
				     {3,2,1},
					 { 2,3,1}
                     		};
				
   System.out.println("the Array is");				
	  for(int i=0;i<3;i++)
	  {
		 for(int j=0;j<3;j++)
		 {
			 System.out.print(arr[i][j]+" ");
			
			if(i==0){
				row1+=arr[i][j];
			}
			else if(i==1){
				
				row2+=arr[i][j];
			}
				else{
					row3+=arr[i][j];
				}
				
				
		 }
		 System.out.println();
	  }
	  if(row1==row2&&row2==row3){
		  System.out.println("the matrix is row magic the all rows have same sum");
	  }
	  else{
		  System.out.println("the matrix is row not row magic the all rows have not same sum");
	  }
				
	}
	
	
	
	public void Task17()  //  Method to cheack the matrix is row magic or not 
	{
		int col1=0;
		int col2=0;
		int col3=0;
		int[][] arr ={
			         {1,3,2},
				     {2,2,3},
					 {3,1,1}
                     		};
				
   System.out.println("the Array is");				
	  for(int i=0;i<3;i++)
	  {
		 for(int j=0;j<3;j++)
		 {
			 System.out.print(arr[i][j]+" ");
			
			if(j==0){
				col1+=arr[i][j];
			}
			else if(j==1){
				
				col2+=arr[i][j];
			}
				else{
					col3+=arr[i][j];
				}
				
				
		 }
		 System.out.println();
	  }
	  if(col1==col2&&col2==col3){
		  System.out.println("the matrix is column magic the all columns have same sum");
	  }
	  else{
		  System.out.println("the matrix is not column magic the all columns have not same sum \n");
	  }

				
	}
	
	public void Task18()   // method to cheak two matrix are equal or not
	{
		
		int[][] Arr1 = {
	            	{1,2,3},
					{4,5,6},
					{7,8,9}	
		             };	
       int[][] Arr2 = {
	            	{0,2,3},
					{4,5,6},
					{7,8,9}	
		             };		
    boolean indicate=true;		
  System.out.println("the first Array  is\n");
		for(int i=0;i<Arr1.length;i++)
		{
			for(int j=0;j<Arr1.length;j++)
			{
				System.out.print(Arr1[i][j]+" ");
			}
			System.out.println();
		
		
		}
		System.out.println("the second Array  is\n");
		
		for(int i=0;i<Arr1.length;i++)
		{
			for(int j=0;j<Arr1.length;j++)
			{
				System.out.print(Arr2[i][j]+" ");
			}
			System.out.println();
		
		
		}
		

		
		for(int i=0;i<Arr1.length;i++)
		{
			for(int j=0;j<Arr1.length;j++)
			{
				if(Arr1[i][j]!=Arr2[i][j])
				indicate=false;
			break;
			
			}
		}
		
		
		if(indicate==true)
			System.out.println("both matrix are equal");
		else
			System.out.println("both matrix are not equal");
	}
	
	
	public void Task19()   // Method to print the some of the diagonal o the array
	{
		int sum=0;
		int[][] arr={
			{1,2,3},
			{4,5,6},
		    {7,8,9} 
		     };
	 System.out.println("the array is \n");
			 
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[i][j]+" ");
	
		if(i==j)
			sum+=arr[i][j];
		
		}
		System.out.println();
	}
	System.out.println("the sum of the diagonal of array is:"+sum);
	}
	
	
	public static void main(String[] args)
	{
		
		ArraysL1  A = new ArraysL1 ();
		
		//A.Task1();
		//A.Task2();
		//A.Task3();
		//A.Task4();
	    //A.Task5();
		// A.Task6();
		// A.Task7();
		//A.Task8();
	//	A.Task9();
		int[] Arr = {1,2,3,4,5};
		//A.Task10(Arr,3);
		//A.Task11(Arr,3);
		//A.Task12();
		//A.Task13();
		//A.Task14();
		//A.Task16();
		//A.Task17();
		//A.Task18();
		//A.Task19();
		 

		
	}
	
   }
   

  
		
		
 