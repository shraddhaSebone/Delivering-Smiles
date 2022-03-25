package com.sebone.deliveringsmiles.interfaces;

import java.util.List;

import com.sebone.deliveringsmiles.classes.LoginDetails;
import com.sebone.deliveringsmiles.classes.LoginStatus;
/**class name:-DriverAddress
 * Objective:-This interface conatin 2 methods Registered Driver can login into our application where persona will be able to see the login page in which he would provide us email and password.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public interface DriverLogin {
	 LoginStatus userAuthentication(String driverEmail , String driverPassword);
	 List<LoginDetails> getLoginDetails(int driverId);
}
