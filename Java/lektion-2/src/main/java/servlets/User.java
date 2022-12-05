package servlets;

class User {
	private String name;
	private String role;

	public User(String name) {
		super();
		this.name = name;
		this.role = "User";
	}

@Override
public String toString() {
	return "This name is: " + this.name + " and the role " + this.role;
}
}
