package java8Futures;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_example {
	
	
	
	public static void main(String[] args) {
		
		Collection_example c = new Collection_example();
		c.collection_foreach(c.player());
		c.collection_itertor(c.player());
		c.collection_lambda(c.player());
		
		
	}
	
	
	
	public void collection_lambda(ArrayList<Player> list) {
		
		System.out.println("collection with lambda");
		
		list.forEach(Consumer -> {
			System.out.println(Consumer.getPlayer());
		});
		
	}
	
	
	public void collection_foreach(ArrayList<Player> list) {
		
		System.out.println("collection with foreach");
		
		for (Player player : list) {
			System.out.println(player.getPlayer());
		}
		
		
	}
	
	
	public void collection_itertor(ArrayList<Player> list) { 
		
		System.out.println("collection with itertor");
		
		Iterator<Player> Consumer = list.iterator(); // now consumer is data set
		
		while(Consumer.hasNext()) {
			System.out.println(Consumer.next().getPlayer());
		}
	}
	
	
	
	public ArrayList<Player> player() {
		
		ArrayList<Player> r = new ArrayList<>();
		
		Player player1 = new Player();
		player1.setPlayer(".:M@Ssaka:.", "alger", 50, true);
		r.add(player1);
		
		
		Player player2 = new Player();
		player2.setPlayer("F@ouzi", "alger", 47, true);
		r.add(player2);
		
		
		Player player3 = new Player();
		player3.setPlayer("batacho@pro", "alger", 20, false);
		r.add(player3);
		
		Player player4 = new Player();
		player4.setPlayer("dabana", "unkown", 30, false);
		r.add(player4);
		
		return r;
	}
	
	
	
	public class Player {
		
		private String nickname;
		private String region;
		private int level;
		private boolean isPro;
		
		
		
		public void setPlayer(String nickname , String region , int level , boolean isPro) {
			this.nickname = nickname;
			this.region = region;
			this.level = level;
			this.isPro = isPro;
		}
		
		
		public String getPlayer() {
			
			String r = "player : { \n\n";
			r += "nickname : " + nickname + "\n";
			r += "region : " + region + "\n";
			r += "level : " + level + "\n";
			
				if (isPro) {
					r += nickname + " is pro player" + "\n";
				}
					
			r += "\n\n}";	
					
					return r;
		}
		
	}

}
