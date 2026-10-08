//Linda LaMee
// CIS 108
//Professor Nelson

import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		double average;
		double sum=0;
		int max=0, goodStudent=0, min=100;
		int[] grades = new int [5];		
//		int[] grades = {85, 92, 78, 96, 88};
		Scanner input=new Scanner(System.in);
		
		for (int i=0;i<grades.length;i++)
		{
			while(true) {
				try {
					System.out.print("Input grades for Student "+ (i+1) + ": ");
					int grade=input.nextInt();
			
					if (grade < 0 ||grade > 100) {
						System.out.print("Input grade between 0 and 100.");	
						continue;
					}		
					grades[i]=grade;
					break;
				} catch(InputMismatchException e) {
					System.out.println("Invalid Input. Please enter a whole number.");
					input.nextLine();
				}
			}
		}
		try (PrintWriter output = new PrintWriter(new FileWriter("scores.txt"))) {
		    output.println("Student Grades");

		    for (int i = 0; i < grades.length; i++) {
		        output.println("Student " + (i + 1) + ": " + grades[i]);
		    }
			System.out.println();
		    System.out.println("Scores saved to scores.txt.");
		} catch (IOException e) {
		    System.out.println("Could not write the scores: " + e.getMessage());
		}
		
		System.out.println();				
		System.out.println("Student Grades");			
		System.out.println("______________");
		System.out.println();	
		
		for (int i=0;i<5;i++)
		{
			System.out.println("Student "+ (i+1) + ": "+ grades[i]);
			sum = sum + grades[i];
			if (grades[i]>max)
				max=grades[i];
			if (grades[i]<min)
				min=grades[i];
			if (grades[i]>= 80)
				goodStudent=goodStudent+1;			
		}
		System.out.println();
		System.out.printf("Total Points: %.0f", sum);	
		System.out.println();		
		average=sum/grades.length;
		System.out.println("Average Grade: "+ average);			
		System.out.println("Highest Grade: "+ max);
		System.out.println("Lowest Grade: "+ min);		
		System.out.println("Students that had a 80 or Higher: " +goodStudent);	

	}

}
