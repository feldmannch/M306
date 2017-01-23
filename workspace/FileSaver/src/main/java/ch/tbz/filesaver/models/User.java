package ch.tbz.filesaver.models;

public class User {
	private int userID;
	private String surname;
	private String firstname;
	private String username;
	private int usertype;
	
	public User(int userID, String surname, String firstname, String username, int usertype) {
		super();
		this.userID = userID;
		this.surname = surname;
		this.firstname = firstname;
		this.username = username;
		this.usertype = usertype;
	}
	
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUsertype() {
		return usertype;
	}
	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
}
