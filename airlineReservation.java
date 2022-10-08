package airline;
import java.util.*;

public class airlineReservation {
	
	final int maxCapacity = 10 ; // max capacity of seats
	
	private int firstClass; 
	private int Economy; 
	private int fseat;
	private int eseat ; 
	private boolean fClassArr[] = {false, false, false, false, false};// array para sillas de first class
	private boolean eClassArr[] = {false, false, false, false , false};// array para sillas se economy class
	
	int num;
	
	


	public airlineReservation() {
		
		/////////////////////////
		//
		//		INPUT
		//
		//
		/////////////////////////// 
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----AIRLINE RESERVATION SYSTEM-----");
		
		System.out.println("Welcome to our reservation system!!");
		
		System.out.print("Choose Your Class: ");
		int num = input.nextInt();
	
		if(num == 1) {
			this.firstClass = num ; 
			
			System.out.println("You chose to fly in First Class!");
			System.out.println();
			
		
			  
		}else if(num ==2) {
			this.Economy = num ; 
			
			System.out.println("You chose to fly in Economy Class!");
			
			System.out.println();
				
		}else {
			System.err.println("INPUT ERROR!! TRY AGAIN");
		System.exit(0);
			
				
			}// if 
		
	
		
	}// constructor
	
	public void asignSeats() {
		
		int Fmin = 1;
		int Fmax = 5;
		int Emin = 6 ; 
		int Emax = 10;
		
		this.fseat = (int)Math.floor(Math.random()*(Fmax-Fmin+1)+Fmin);
		this.eseat = (int)Math.floor(Math.random()*(Emax-Emin+1)+Emin);
		
	
	
		System.out.println("Now we will asign you a seat!!");
		
	boolean bool = this.fClassArr[0] ; 


		/*
		 * as each seat is assigned, set the corresponding element of the array to true 
		 * to indicate that the seat is not available
		 */
	
		if(this.firstClass ==1) {
			
			
			System.out.println("Your First Class seat number is: "+this.fseat);
			
			for (int i = 0; i <= fClassArr.length; i++) {
				
				fClassArr[this.fseat-1] = true ; 
				
				//System.out.println(this.fClassArr[i]);
				
				
				
			}// for loop
			
			
			if(this.Economy ==2) {
				
				System.out.println("Your Economy Class seat number is: "+this.eseat);
				

				for (int j = 0; j < eClassArr.length; j++) {
					
					eClassArr[this.eseat-1] = true ; 
					
				}// for loop
				
				
				
			}// inner-if
			
		}// if 
		
		/*
		 * Now we display the boarding pass
		 */
		
		
	}//asignSeats
	
	public void displayBoardingPass() {
		
		
		
	}// displayBoardingPass() 


}//class
