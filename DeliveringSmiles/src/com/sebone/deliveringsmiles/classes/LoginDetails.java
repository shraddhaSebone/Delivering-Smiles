package com.sebone.deliveringsmiles.classes;
/**class name:-DriverAddress
 * Objective:-This class contain all the Login Details of driver.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public class LoginDetails {
	private int loginId;
	private String loginTime;
	private String logout;
	private String loginPassword;
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getLogout() {
		return logout;
	}
	public void setLogout(String logout) {
		this.logout = logout;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
}
