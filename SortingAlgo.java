  public class SortingAlgo
 {
 
    void BubleSort(int[] Array)       //BubleSort method complexity O(n^2)
   {
	   for(int i=0;i<Array.length;i++)
	   {  
		   for(int j=0;j<Array.length-i-1;j++)
		   {
			   if(Array[j]>Array[j+1])  // cheack for first index to its next index and swap them
			   {
				   int temp=Array[j];
				   Array[j]=Array[j+1];
				   Array[j+1]=temp;
			   }
		   }
	   }
	   
   }
   
    void SelectionSort(int[] Array)   //SelectionSort method Complexity O(n^2)
	{
	int smallest=0;
	for(int i=0;i<Array.length;i++)
	{
		smallest=i;        // suppose the smallest element is in 0th index
		for(int j=i+1;j<Array.length;j++)
		{
			if(Array[smallest]>Array[j])  // cheack for smallest element and assign its index to smallest
			smallest=j;
		}
	
		int temp = Array[i];       // swap fisrt index element and put smallest element into first index
		Array[i] = Array[smallest];
		Array[smallest] = temp;
	}
		
	
	}
	
	  //Merge Sort is the  based on  Divide and conquer method it consist of two methods divide and conquer 
	  // Merge sort strats from here
	  
	 void Conquer(int Arr[], int si,int mid,int ei)    //si Starting index, ei Ending index this method will merge the subarrays into sorted form
     {
      int merge[] = new int[ei-si+1];   // declare new array to store elements in sorted form
	  int ind1=si;
	  int ind2 = mid+1;
	  int x=0;
	  
	  
	  while(ind1 <=mid && ind2 <=ei) 
	  {
		  if(Arr[ind1] <= Arr[ind2])  // cheack two subArrays and sort it into new array
		  { 
			  merge[x++] = Arr[ind1++];
			  
		  }
		  else
		  {
			  merge[x++] = Arr[ind2++];
			  
		  }
	  }
	  while(ind1 <= mid)  // if one of the above becomes fails then it cheack this coz one should be true 
	  {
		  merge[x++] = Arr[ind1++];
		  
		  
	  }
	  while(ind2 <= ei)       // if one of the above becomes fails then it cheack this coz one should be true
	  {
		  merge[x++] = Arr[ind2++];
		  
		  
	  }
	   
	    for (int i = 0, j = si; i < merge.length; i++, j++) 
        Arr[j] = merge[i];   //copy the  sorted array int originalarray int 

	 }		 
	
	void Divide(int Arr[],int si,int ei)
	{
		if(si>=ei){    // base condition starting index sholud be greater than or equal to end  index
			return;
		}
		
		
		int mid = (si+ei)/2;      // calculate the mid
		Divide(Arr,si,mid);      
		Divide(Arr,mid+1,ei);
		Conquer(Arr,si,mid,ei);
		
	}
	// End of the method 
	
	
	
	void  InsertionSort(int[] Array)
	{
		//breaking down Array into 2 parts Suppose sorted and unsorted sorted part is 0th index 
		
		for(int i=1;i<Array.length;i++)    
		{
			int curr=Array[i];
			int j=i-1;
			
			while(j>=0 && curr < Array[j])
			{
				Array[j+1] = Array[j];
				j--;
			}
			//and then place it at the right position
			Array[j+1] = curr;
			
		}
	}
			
		//End og the 	IndertionSort algorithmmethod
		
		
	
    //QUICK SORT ALGORITHM is also based on Divide and conquer method it is Consist of two methods 
    //Quick sort methods || algorithm starts from here 
  
    
	void Swap(int[] Array,int i, int j)
	{
		
		int temp = Array[i];
		Array[i] = Array[j];
		Array[j] = temp;
	}
	
   void QuickSort(int[] Array, int start,int end)  //the method that divides the array into partitions
   {
    
    if(start<end)
    {
    int part = Partition(Array,start,end);
    QuickSort(Array, start, part-1) ;
    QuickSort(Array, part+1, end);
     }
   }
   
     
	 public int Partition(int[] Array,int start,int end)
	 {
		int pivot = Array[end];
        int i= (start-1);
		for(int k=start;k<end ;k++)
		{
       // int j=k;
        if(Array[k] < pivot)
		{
        i++;
         Swap(Array, i, k);
		}
		}
		i++;
	 	
    int temp=Array[i];
	Array[i]= pivot;
	Array[end]=temp;
	
		
		return i;
	 }
	
		// end of quick Sort Sort
  
		 
		 
    void Dispaly(int[] Arr)   //Method to display the Array
   {
	   for(int i=0;i<Arr.length;i++)
		   System.out.print(Arr[i]+" ");
		   
   }
   
   
   public static void main(String[] args)
   {
	   SortingAlgo S = new SortingAlgo();
		
		
	   
	   
	   
	   int[] array = {3,5,1,4,2};
	   
	   //SortingAlgo S = new SortingAlgo();
	   
	   int size=array.length;
	   int mid = (size-1)/2;
	  // S.BubleSort(array);
	   //S.Dispaly(array);
	  // S.SelectionSort(array);
	  // S.Dispaly(array);
	  //  S.Divide(array, 0, size-1);
	  //  S.Dispaly(array);
	  
	  
	    int[] array2 = {3,5,1,4,2};
		int size2=array2.length;
		
		//S.QuickSort(array2, 0,size2-1);
	//	S.Dispaly(array2);
	  S.InsertionSort(array2);
	  S.Dispaly(array2);
	  
	  
	  
	   
	   
	   
	   
	   
   }
 }
			   
	   