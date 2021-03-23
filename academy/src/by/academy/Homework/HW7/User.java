package by.academy.Homework.HW7;

public class User extends Person {
	
	private String login;
	private String password;
	private String email;
	public User() {
		super();
	}
	public User(String firstName, String lastName, int age, String dateOfBirth ,String login, String password,String email) {
		super(firstName,lastName, age, dateOfBirth);
		this.login = login;
		this.email = email;
		this.password = password;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String printUserInfo() {
		return "User [login=" + login + ", password=" + password + ", email=" + email + ", firstName="+firstName+", lastName="+
	lastName+", age="+age+", dateOfBirth="+dateOfBirth+"]";
		
		
		
	}

}
