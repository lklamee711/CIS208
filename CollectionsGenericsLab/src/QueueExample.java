//Linda LaMee
//CIS 208
//Professor Nelson


import java. util. ArrayDeque;
import java. util.Queue;

public class QueueExample {

	public static void main(String[] args) {
	Queue<String> printJobs = new ArrayDeque<>();
		
		printJobs.offer("Essay");
		printJobs.offer("Report");
		printJobs.offer("Resume");
		printJobs.offer("Lab Notes");
		
		System.out.println("Waiting: " + printJobs);
		System.out.println("Next job : " + printJobs.peek());		
		System.out.println("Printing: " + printJobs.poll());
		System.out.println("Printing: " + printJobs.poll());
		System.out.println("Still waiting: " + printJobs);
	}

}
