package java8Futures;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StrongPasswordWithPredicate {

	public static void main(String[] args) {
		
		// i tell java us this is array list of user and password
		
		ArrayList<StrongPassword> array = new ArrayList<>();
		
		array.add(new StrongPassword("admin", "1235@"));
		array.add(new StrongPassword("root", "2532kjkljFadsfa"));
		array.add(new StrongPassword("byte", "123"));
		array.add(new StrongPassword("byte", "#5%8%3CKD;AJDG"));
		array.add(new StrongPassword("simple", "azerty"));
		
		// i tell java us this is condition (filter) for collection 
		// so if see any weak password 
		// mean less then 8 carchacter show me this list
		
		Predicate<StrongPassword> preRules = (p)-> p.WeakPassword()== true ;
		// if you try false mean strong password
		// weak password = false > mean strong password ! 
		
		// Predicate<YourObjectClass> nameOfRule = (instance of Object have rule ) 
		// -> instance.yourCondition == true or false
		
		
		
		// just normal forEach collection display 
		array.forEach(consumer -> {
			// consumer mean class item position(0-1-2.....)
			
			// here our condition
			// so you tell java us if any user 
			// have my rule show him to me
			if (preRules.test(consumer)) {
				System.out.println(consumer.Login());
			}
			
			
		});
		
	
	}
}
