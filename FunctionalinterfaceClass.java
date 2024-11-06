package java8Futures;

public class FunctionalinterfaceClass {
	
	
	public static void main(String[] args) {
		
		FunctionalinterfaceExample example = (int x)-> {
			System.out.println("your age was : " + (2024 - x ) );
		};
		
		
		example.start(2000);
	}
}
