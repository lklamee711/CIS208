//Linda LaMee
//CIS 208
//Professor Nelson

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();
	
		scores.put("Maya", 90);
		scores.put("Jordan", 85);
		scores.put("Linda", 200);
		scores.put("Maya", 95);
		
		System.out.println("Scores: " + scores);
		System.out.println("Maya's score: " + scores.get("Maya"));
		System.out.println("Linda's score: " + scores.get("Linda"));
		
		scores.put("Maya", 95);
		System.out.println("Updated Scores: " + scores);		
	}

}
