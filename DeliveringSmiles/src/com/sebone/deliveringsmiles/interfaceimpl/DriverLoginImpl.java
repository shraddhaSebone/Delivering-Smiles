package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.classes.LoginDetails;
import com.sebone.deliveringsmiles.classes.LoginStatus;
import com.sebone.deliveringsmiles.interfaces.DriverLogin;
/**class name:-DriverAddress
 * Objective:-This class immplements all the method of DriverLogin interface.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public class DriverLoginImpl implements DriverLogin{
	/**method name:-userAuthentication
	 * Objective:-This method will Authentication the user/Driver that persona is already registered or not,if persona registered then he will be able to login otherwise persona will be redirected to the registration page.
	 * @param String driverEmail,String driverPassword
	 * @return LoginStatus
	 */
	@Override
	public LoginStatus userAuthentication(String driverEmail, String driverPassword) {
		// TODO Auto-generated method stub
		return null;
	}
	/**method name:-getLoginDetails
	 * Objective:-In this method will fetch all the login details of the user/DriverAuthentication the user/Driver like login time and date and logout date and time,Driver Status.
	 * @param int driverId
	 * @return List<LoginDetails>
	 */
	@Override
	public List<LoginDetails> getLoginDetails(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}

}
