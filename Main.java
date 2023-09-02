import java.util.Scanner;

  public class Main
 {
	 Scanner Sc = new Scanner(System.in);
	 int AvSeat;
	 int RSeat;
	 int size;
	 String[] Booking;
	 String[] Waiting;
	 
	 int x;
	 int y;
	
	 public Main(int seats)
	 { 
	 this.size = seats;
	 this.AvSeat = seats;
	 Booking = new String[size];
	 Waiting = new String[size];
	 RSeat = 0;
	 x=0;
	 y=0;
	 
	 	 
	 }
	 
	 boolean IsEmpty()
	 {
		return RSeat==0;
		
		 }
    boolean IsFull()
		 {
			 return RSeat==size;
			 }
			 
	    public void BookSeat()    // Method to Book a Ticket
	    {
			
			
			
		if(!IsFull())
		{
			
			System.out.print("	Please Enter Your full Name:: ");
			
			Booking[x++] = Sc.nextLine();
			System.out.println("	Ur  ticket has been Booked");	
			
			AvSeat--;
			RSeat++;
			WaitingToAdd();

	}
	
	 
		else if(y<size)    // if Seats are researved then keep passengers in waiting
		 {
			 System.out.println("	Sorry All seats are researved: You will be in Waiting List \n"	);
			 System.out.print("	enter Your Name::" );
			 Waiting[y++] = Sc.nextLine();
			 
			 System.out.println(	" U have been inserted in Waiting list");
		 }

     else      // if waiting list is also full then no availabilityof any seats
		 {
			 System.out.println("	sorry we have no availability of seats"	 );
		 }
	}
	
    public void Update() {
    if (RSeat == 0) {
        System.out.println("No passenger information available to update.");
    } else {
        System.out.print("Enter the passenger's full name to update: ");
        String targetName = Sc.nextLine();

        boolean found = false;
        for (int i = 0; i < RSeat; i++) {
            if (Booking[i].equalsIgnoreCase(targetName)) {
                System.out.print("Enter the new name: ");
                Booking[i] = Sc.nextLine();
                System.out.println("Passenger information updated successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Passenger not found in the booking list.");
        }
    }
}

public void Cancel() {
    if (RSeat == 0) {
        System.out.println("No passenger information available to cancel.");
    } else {
        System.out.print("Enter the passenger's full name to cancel: ");
        String targetName = Sc.nextLine();

        boolean found = false;
        for (int i = 0; i < RSeat; i++) {
            if (Booking[i].equalsIgnoreCase(targetName)) {
                for (int j = i; j < RSeat - 1; j++) {
                    Booking[j] = Booking[j + 1];
                }
				x--;
                RSeat--;
                AvSeat++;
                found = true;
                System.out.println("Passenger booking canceled.");
                break;
            }
        }

        if (!found) {
            System.out.println("Passenger not found in the booking list.");
        }
    }
}

	/*public String Dequeu() // Method to Dequeu from Wating list it will help us to place it to Booking method
	{
		String Pop = Waiting[0];
    
        for(int i=0;i<y-1;i++)
		{
			Waiting[i] = Waiting[i+1];
			
			
		}
		y--;
		return Pop;
		*/
		

	
	   
	                          // if There is Ticket available and Passenger is in list then first waited passenger will be assigned a ticket

	public void WaitingToAdd() {
  if (AvSeat != 0 && y != 0) {
    
    String passenger = Waiting[0];       // Dequeue fro  the Waiting list 

    
    for (int i = 0; i < y - 1; i++) {
      Waiting[i] = Waiting[i + 1];
    }
    y--;

    
    Booking[x++] = passenger;

   
    AvSeat--;
	RSeat++;
  }
}
	
	
	public int AvailSeats()
	{
		System.out.println("	the number of Available seats are::"+AvSeat);
		return AvSeat;
		
	}

     public int ResearvedSeats()
	{
		System.out.println("	the number of Researved seats are::"+ RSeat);
		
		
		return RSeat ;
		
	}
	void Detail()
	{
		if(RSeat==0)
		{
			System.out.println("	We have no any Passenger Information stored");
		}
		else{
			
			System.out.println("	Booked Passenger Information is");
			for(int i=0;i<RSeat;i++)
			{
				System.out.println(	Booking[i]+" \n");
			}
			
			if(y==0)
			{
				System.out.println("there is no passenger in waiting list");
			}
			else
			{
				
			System.out.println("	Waiting list Passenger Information is");
			for(int j=0;j<y;j++){
				
				System.out.print(	Waiting[j]+" \n");
			}
			}
			
		}
}
	
 public static void main(String[] args)
 {
  Main T = new Main(2);
  
  int Choice;
  System.out.println("*	welcome to online Airline Ticket Booking		*");
  System.out.println("*	please Enter Your choice 	*\n 1: Book a Ticket \n 2: Update Information \n 3: Cancel Ticket \n 4: Display Passengers List \n 5: No of researved Seats \n 6: No of Available Seats  \n 0: Exit   ");
    System.out.print("	Your choice: ");   
   Choice = T.Sc.nextInt();
	         T.Sc.nextLine();
	
	switch(Choice)
	{
		case 0:
		System.out.println("	thanks for Using our System");
         break;
		 
		case 1:
		T.BookSeat();
		
		break;
		
		case 2:
		T.Update();
		break;

        case 3:
		T.Cancel();
		break;
		
		case 4:
		T.Detail();
		break;
		
		case 5:
        T.ResearvedSeats();
	    break;
		
		case 6:
		T.AvailSeats();
		break;
		
		default:
		System.out.println("invalid choice please Enter valid choice");
	}
	while (Choice != 0 ) {
    T.WaitingToAdd();
		
		System.out.println("*	please Enter Your choice 	*\n 1: Book a Ticket \n 2: Update Information \n 3: Cancel Ticket \n 4: Display Passengers List  \n 5: No of researved Seats \n 6: No of Available Seats \n 0: Exit  ");
         System.out.print("	Your choice: ");
   Choice = T.Sc.nextInt();
	T.Sc.nextLine();
	switch(Choice)
	{
      case 0:
		System.out.println("	thanks for Using our System");
         break;
		 
		case 1:
		T.BookSeat();
		break;
		
		case 2:      
		T.Update();
	     break;
		
		case 3:
		T.Cancel();
		break;
		
		
		case 4:
		T.Detail();
		break;
		
		case 5:
        T.ResearvedSeats();
	    break;
		
		case 6:
		T.AvailSeats();
		break;
		
		default:
        System.out.println("invalid choice please Enter valid choice");
	}
		
		
		}
		
		


}

}