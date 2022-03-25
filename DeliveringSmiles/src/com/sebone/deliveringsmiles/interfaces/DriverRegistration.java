package com.sebone.deliveringsmiles.interfaces;

import com.sebone.deliveringsmiles.classes.DriverData;
import com.sebone.deliveringsmiles.classes.DriverStatus;
/**class name:-DriverAddress
 * Objective:-This interface conatin 3 methods Registered Driver can login into our application where persona will be able to see the login page in which he would provide usall the information.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public interface DriverRegistration {
	DriverData  submitDriverData(DriverData driverData);
	DriverData getDriverDetails(int driverId);
	DriverStatus updateDriverData(DriverData driverData);
}
