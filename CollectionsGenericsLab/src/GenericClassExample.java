//Linda LaMee
//CIS 208
//Professor Nelson

class Box<T>{
	private T item;
	
	public void setItem(T item) {
		this.item = item; 
	}
	
	public T getItem() {
		return item;
	}
}


public class GenericClassExample {

	public static void main(String[] args) {
			Box<String> messageBox = new Box<>();
			messageBox.setItem("Hello, Java!");
				
			Box<Integer> numberBox = new Box<>();
			numberBox.setItem(25);
			
			Box<Double> priceBox = new Box<>();
			priceBox.setItem(19.99);
			
			System.out.println(messageBox. getItem()) ;
			System.out.println(numberBox. getItem()) ;
			System.out.println(priceBox. getItem()) ;
	}

}

