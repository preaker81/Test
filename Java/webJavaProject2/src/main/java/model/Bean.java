package model;

public class Bean {
	private String username = "";
	private String password = "";
	
	private String[] Account1 = {"jimmy", "12345"};
	private String[] Account2 = {"ida", "54321"};
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccount() {
		return "";
	}
	
	public boolean validate() {
		if((username.equals(Account1[0]) && password.equals(Account1[1])) || (username.equals(Account2[0]) && password.equals(Account2[1]))) {
			return true;
		}else {
			return false;
		}
	}
}
