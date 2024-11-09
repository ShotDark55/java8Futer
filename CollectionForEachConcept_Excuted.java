package java8Futures;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionForEachConcept_Excuted {
	
	
	public static void main(String[] args) {
		
		ArrayList<CollectionForEachConcept__Login> login = new ArrayList<>();
		
		login.add(new CollectionForEachConcept__Login("example1@gmail.com", "123456"));
		login.add(new CollectionForEachConcept__Login("example2@outlook.com", "abcedefg"));
		login.add(new CollectionForEachConcept__Login("example3@yahoo.com", "azertyqwerty"));
		
		// foreach way        use with for loop 
		
			System.out.println("foreach insted");
		for (CollectionForEachConcept__Login collection_1 : login) {
			System.out.println(collection_1.getLogin());
		}
		
		
		
		// iterator way        use with while loop 
		
		Iterator<CollectionForEachConcept__Login> collection_2 = login.iterator();
		
			System.out.println("Iterator insted");
			
		while (collection_2.hasNext()) {
			
			System.out.println(collection_2.next().getLogin());
		}
		
		
		
		// Lambda way  
		
		System.out.println("Lamda insted");
		
		
		login.forEach(collection_3->{
			
			System.out.println(collection_3.getLogin());
			
		});
		
		
		
		
		
		
	}

}
