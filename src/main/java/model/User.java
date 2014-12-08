package model;

public class User {

	private String firstName;
	private String lastName;
	
	public User(String string) {
		firstName = string.split(" ")[0];
		lastName = string.split(" ")[1];
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
