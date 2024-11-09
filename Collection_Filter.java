package java8Futures;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

public class Collection_Filter {
	
	public static void main(String[] args) {
		
		Collection_example instance = new Collection_example();
		ArrayList<Collection_example.Player> arrayList = instance.player();
		
		
		// with if statement
		
		
		System.out.println("with if statement");
		
		arrayList.forEach(player -> {
			if (player.proPlayer()) {
				System.out.println(player.getPlayer());
			}
			
			
		});
		
		// with predicate
		
		System.out.println("with predicator");
		
		Predicate<Collection_example.Player> proCondition = (rule) -> rule.proPlayer() ;
		
		arrayList.forEach(player -> {
			if (proCondition.test(player)) { 
				
				System.out.println(player.getPlayer());
				
			}
		});
		
		
	}

}
