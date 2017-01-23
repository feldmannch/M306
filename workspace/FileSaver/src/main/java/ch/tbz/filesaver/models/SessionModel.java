package ch.tbz.filesaver.models;

public class SessionModel {
	private String username;
	
	private String password;
	
	/**
	 * 0 = Admin
	 * 1 = Geschäftsleiter
	 * 2 = Abteilungsleiter
	 * 3 = Mitarbeiter
	 */
	private int userType;

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

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
	
	
}
