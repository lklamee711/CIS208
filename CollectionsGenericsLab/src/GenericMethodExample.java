//Linda LaMee
//CIS 208
//Professor Nelson

public class GenericMethodExample {
	public static <T> void displayItems(T[] items) {
		for (T item : items) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		String[] names = {"Maya", "Jordan"};
		Integer[] numbers = {10, 20, 30};
		Double[] prices = {10.99, 20.45, 30.66};
		
		System.out.println("Names: ");
		displayItems(names) ;

		System.out.println("Numbers: ");
		displayItems(numbers) ;
		
		System.out.println("Prices: ");
		displayItems(prices) ;		

	}

}
