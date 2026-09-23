//Linda LaMee
//Professor Rodney Nelson
//In class Exercise Student Profile  new
public class Main {

	public static void main(String[] args) {
		final String COLLEGE_NAME = "Lawrence Technological University";
        // Create variables below
        String studentName;
        int age;
        double gpa;
        char grade;
        boolean enrolled;
 
        // Assign values
        studentName="Alex Johnson";
        age=21;
        gpa=3.6d;
        grade='A';
        enrolled=true;
        
        // Display student profile
        System.out.println("=====STUDENT PROFILE=====");
        System.out.println("College:"+ COLLEGE_NAME);
        System.out.println("Student:"+ studentName);      
        System.out.println("Age:"+ age);
        System.out.println("GPA:"+ gpa);
        System.out.println("Current grade:"+ grade);
        System.out.println("Currently Enrolled:"+ enrolled);  
        System.out.println("==========================");
    }
}


