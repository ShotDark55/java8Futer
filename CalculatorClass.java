package java8Futures;

public class CalculatorClass {
	
	public static void main(String[] args) {

		
		
		CalculatorInterface cal = (int x , int y)-> {
			int r = x + y;
			return r;
		};
		
		
		int r = cal.calculator(10, 20);
		
		System.out.println(r);
		
	}

}
