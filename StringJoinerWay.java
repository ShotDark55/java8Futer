package java8Futures;

import java.util.StringJoiner;

public class StringJoinerWay {
	
	
	public static void main(String[] args) {
		
		String names [] = {
				"tomas",
				"otto",
				"hanzo",
				"yohan"
		};
		
		
//		StringJoiner joiner = new StringJoiner(" between word "," prefix "," suffix");
		StringJoiner joiner = new StringJoiner(" - ", "( ", " )" );
		String result = "{ ";
		
		// this function if you don't have any data you see this msg
		
		
		joiner.setEmptyValue("not data dear sir");
		
		for (String name : names) {
			result += name + " - ";
			joiner.add(name);
		}
		
		result += " }";
		
		System.out.println("text joiner with old way : " + result );
		System.out.println("text joiner with StringJoiner : " + joiner );
		
		
		
		
		
	}

}
