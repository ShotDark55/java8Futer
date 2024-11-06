package java8Futures;

public interface Default_Static_keyword_in_Interface {
	
	
	
	// work with another class  not executed class
	// just implement this interface in class 
	// and create instance of this class 
	// and you can access now !
	
	public default void input() {
		System.out.println("input something");
	}
	
	// same talk
	public default void output() {
		System.out.println("output something");
	}
	
	// here deference 
	// just type Intefacename.yourfunction
	
	// example Generator.begin();
	public static void getInfo() {
		System.out.println("your info was 323523");
	}
	

}
