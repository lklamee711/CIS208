//Linda LaMee
//CIS 208
//Professor Rodney Nelson
//Use AI to calculate grades

import java.util.Scanner;

public class GradeCalculator {
 
    public static void main(String[] args) {

    	Scanner input = new Scanner (System.in);
		System.out.print("What is the students name?");	
		String studentName = input.nextLine();
		int score1, score2, score3, score4;
		
		while (true) {
			System.out.print("What is the first score?");			
		try {	
		score1 = Integer.parseInt(input.nextLine().trim());
		break;
		} catch (NumberFormatException e) {
		System.out.println("Invalid input. Please enter whole numbers for the scores.");
		}
		} 
		while (true) {
			System.out.print("What is the second score?");			
		try {	
		score2 = Integer.parseInt(input.nextLine().trim());
		break;
		} catch (NumberFormatException e) {
		System.out.println("Invalid input. Please enter whole numbers for the scores.");
		}
		}
		while (true) {
			System.out.print("What is the third score?");			
		try {	
		score3 = Integer.parseInt(input.nextLine().trim());
		break;
		} catch (NumberFormatException e) {
		System.out.println("Invalid input. Please enter whole numbers for the scores.");
		}
		}
		while (true) {
			System.out.print("What is the fourth score?");			
		try {	
		score4 = Integer.parseInt(input.nextLine().trim());
		break;
		} catch (NumberFormatException e) {
		System.out.println("Invalid input. Please enter whole numbers for the scores.");
		}
		}	
        double average = (score1 + score2 + score3 + score4) / 4.0;
        char letterGrade;
        
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Letter Grade: " + letterGrade); 

	input.close();	
    }
}
