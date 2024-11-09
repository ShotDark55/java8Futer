package java8Futures;

public class CollectionForEachConcept__Login {
	
	private String email;
	private String password;
	
	public CollectionForEachConcept__Login(String email , String password) {
		this.email = email;
		this.password = password;
	}
	
	
	public String getLogin() {
		String data = "" ;
		
		data += "email : " + email + "\n";
		data += "password : " + password + "\n";
		
		return data;
	}

}
