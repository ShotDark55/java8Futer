package java8Futures;

import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerExample2 {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> email = new ArrayList<String>();
		email.add("shotindark55@gmail.com");
		email.add("okiyadark@gmail.com");
		email.add("oussamasalmi11@gmail.com");
		email.add("fouzipsp@gmail.com");
		
		StringJoiner emailList = new StringJoiner(" @ " , "{ " , " }");
		emailList.setEmptyValue("empty (0.0)");
		
		for (String string : email) {
			emailList.add(string);
		}
		
		System.out.println(emailList);
		
		
	}

}
