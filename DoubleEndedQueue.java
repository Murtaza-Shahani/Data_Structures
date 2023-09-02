class DoubleEndedQueue{

int size;
	int total;
    int arr[];
	 int front; 
     int rear;
	 int count;
	 DoubleEndedQueue(int size){
		 this.size=size;
		 arr=new int[size];
		 rear=-1;
		 front=-1;
		 count=-1;
		 total=-1;
	 }
	 public boolean Full(){
		 return total==size-1;
			 
		 
	}
	 
	 public boolean Empty(){
		 return count==-1;
	 }
	 
		 
	 public void EnQueue(int data){
		 
		 if(!Full()){
			
          if(Empty()){			
		  System.out.println(" EnQueueing the "+":"+data);
			 arr[++rear]=data;
			 arr[++front]=data;
			 count++;
			 total++;
			 return;
		  }
		  
		  
		  System.out.println(" EnQueueing the "+":"+data);
		  arr[++rear]=data;
			 total++;
			 count++;
		 }
		 
		 else if(total>count){
			 System.out.println(" EnQueueing the "+":"+data);
			 rear=(rear+1)%size;
			 arr[rear]=data;
			// total++;
			 count++;
		 }
		 
		 else{
			 System.out.println("Queue is  full");
		 }
	 }
	 public int DeQueue(){
		 int temp=0;
		 if(Empty()){
			 System.out.println("Sorry Queue is Already empty");
		 }
		 else{
		  if(front>4)
			  front=0;
		  
		  temp=arr[front];
		  front++;
		  count--;
		  
		 }
		 return temp;
	 }
	 public void Display(){
		 System.out.print(" the remaining elements are ");
		 
		 for(int i=0;i<size;i++){
			 
			 System.out.print(":"+arr[i]+" ");
		 }
	 }


    public static void main(String[] args)
	{
		DoubleEndedQueue D=new DoubleEndedQueue(5);
		
		
		D.EnQueue(99);
		D.EnQueue(45);
		D.EnQueue(12);
		D.EnQueue(56);
		D.EnQueue(9);
	//	System.out.println(D.DeQueue()+"");
		D.EnQueue(87);
		System.out.println(D.DeQueue()+"");
		D.EnQueue(120);
		D.EnQueue(320);
		D.EnQueue(450);
		System.out.println(D.DeQueue()+"");
		System.out.println(D.DeQueue()+"");
		D.EnQueue(110);
		D.EnQueue(670);
		D.EnQueue(0);
		D.Display();
		/*System.out.println(D.DeQueue()+"");
		System.out.println(D.DeQueue()+"");
		System.out.println(D.DeQueue()+"");
		System.out.println(D.DeQueue()+"");
		System.out.println(D.DeQueue()+"");
		*/
		
	}
	}
			 
			 
		 
		 
		 
		 
		 
		 

