package java8Futures;

public class StrongPassword {
	
	private String user;
	private String password;
	
	
	public StrongPassword(String user , String password ) { 
		this.user = user;
		this.password = password;
		
	}
	
	
	public String Login() {
		
		String r = "";
		r += "user : " + user + "\n";
		r += "password : " + password + "\n";
		return r;
	}
	
	public boolean WeakPassword() {
		
		boolean weak = password.length() < 8;
		return weak;
	}

}
