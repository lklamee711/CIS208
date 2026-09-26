//Linda LaMee
//CIS 208
//Assignment 2
//Professor Rodney Nelson
//This program prints out information about an IT support ticket

import java.util.Scanner;
import java.util.InputMismatchException;
public class Ticket_Entry {

	public static void main(String[] args) {
		int priority;
		
		Scanner input = new Scanner (System.in);
		System.out.print("What is your name?");	
		String nameOrginator = input.nextLine();
		System.out.print("What is your computer's name?");	
		String nameComputer = input.nextLine();		
		System.out.print("What is a description of the problem.");
		String problemDesc = input.nextLine();	
		try {	
		System.out.print("What is the priority. 1 for the high, 2 for medium and 3 for low.");	
		priority = input.nextInt();
		System.out.println();	
		if (priority==1)
		{
			System.out.println("IT Ticket");
			System.out.println("____________________________");	
			System.out.println("Name of Orginator: "+nameOrginator);	
			System.out.println("Name of Computer: "+nameComputer);
			System.out.println("Problem Description: "+problemDesc);
			System.out.println("Priority: high");			
		}
		else if (priority==2) {
			System.out.println("IT Ticket");
			System.out.println("____________________________");	
			System.out.println("Name of Orginator: "+nameOrginator);	
			System.out.println("Name of Computer: "+nameComputer);
			System.out.println("Problem Description: "+problemDesc);	
			System.out.println("Priority: medium ");			
		}
		else if (priority==3) {
		System.out.println("IT Ticket");
		System.out.println("____________________________");	
		System.out.println("Name of Orginator: "+nameOrginator);	
		System.out.println("Name of Computer: "+nameComputer);
		System.out.println("Problem Description: "+problemDesc);
		System.out.println("Priority: low ");
		}
		else
					System.out.println("Error. Priority outside of bounds ");
		}
		catch(InputMismatchException e) {
		System.out.println("You entered a non-integer.");
		}

		input.close();	
	}

}

