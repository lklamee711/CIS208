//Linda LaMee
//CIS 208
//Assignment 1
//Professor Rodney Nelson
//This program prints out information about an employee fot github

public class Employee
{
	public static void main(String[] args)
	{
		String name, title, department;
		double hourlyRate, weeklyPay;
		int yearsExperience;
		final int HOURS = 40;		
		name = "Jordan Smith";
		title = "Help Desk Technician";
		department = "Information Technology";
		hourlyRate = 24.50;
		weeklyPay = HOURS * hourlyRate;
		yearsExperience = 3;
		System.out.println();	
		System.out.println("IT Employee Profile");
		System.out.println("____________________________");	
		System.out.println("Name: "+name);	
		System.out.println("Title: "+title);
		System.out.println("Department: "+ department);
		System.out.println("Experience: "+yearsExperience +" years");
		System.out.print("Hourly Rate: $");
		System.out.printf("%.2f",hourlyRate);
		System.out.println();
		System.out.print("Weekly Pay: $");
		System.out.printf("%.2f",weeklyPay);
		System.out.println();
	}
}
	


