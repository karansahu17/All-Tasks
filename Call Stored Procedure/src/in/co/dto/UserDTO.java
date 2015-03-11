package in.co.dto;

import java.util.Date;

public class UserDTO {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String loginId;
	private String password;
	private Date lastLoginDate;
	private int unsuccessfullLogin;
	private int status;
	private boolean lockk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public int getUnsuccessfullLogin() {
		return unsuccessfullLogin;
	}

	public void setUnsuccessfullLogin(int unsuccessfullLogin) {
		this.unsuccessfullLogin = unsuccessfullLogin;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean isLockk() {
		return lockk;
	}

	public void setLockk(boolean lockk) {
		this.lockk = lockk;
	}

}
