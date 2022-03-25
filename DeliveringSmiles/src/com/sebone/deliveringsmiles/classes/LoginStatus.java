package com.sebone.deliveringsmiles.classes;
/**class name:-DriverAddress
 * Objective:-This class store login status and description of login status.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public class LoginStatus {
	private int loginStatusId;
	private boolean loginStatus;
	private String loginStatusDescription;
	
	public int getLoginStatusId() {
		return loginStatusId;
	}
	public void setLoginStatusId(int loginStatusId) {
		this.loginStatusId = loginStatusId;
	}
	public boolean isLoginStatus() {
		return loginStatus;
	}
	public void setLoginStatus(boolean loginStatus) {
		this.loginStatus = loginStatus;
	}
	public String getLoginStatusDescription() {
		return loginStatusDescription;
	}
	public void setLoginStatusDescription(String loginStatusDescription) {
		this.loginStatusDescription = loginStatusDescription;
	}
}
