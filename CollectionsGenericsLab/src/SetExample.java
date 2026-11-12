//Linda LaMee
//CIS 208
//Professor Nelson

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> languages = new HashSet<>();
		
				languages. add("Java") ;
				languages. add("Python") ;
				languages. add("Java");
				languages. add("Javascript") ;			
				languages. add("Python") ;				

				System.out.println("Languages :" + languages );
				System.out.println("Total Languages :" + languages.size());
				System.out.println("Contains Java? " + languages.contains("Java"));
	}

}
