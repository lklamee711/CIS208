//Linda LaMee
//CIS 208
//Professor Nelson


import java.util.ArrayList;

public class ListExample {
	public static void main (String[] args) {
		
		ArrayList<String> students = new ArrayList <>();
		
		students. add( "Maya" ) ;
		students. add( "Jordan" ) ;
		students. add( "Maya" ) ;
		students. add( "Linda" ) ;
		students. remove( "Jordan" ) ;		
		
		System. out.println("Students: "  + students);
		System. out.println("First student: " + students.get(0));
		System. out.println("Total students: " + students.size());
	}
}
				
