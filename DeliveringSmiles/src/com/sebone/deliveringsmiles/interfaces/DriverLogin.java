package com.sebone.deliveringsmiles.interfaces;

import java.util.List;

import com.sebone.deliveringsmiles.classes.LoginDetails;
import com.sebone.deliveringsmiles.classes.LoginStatus;

public interface DriverLogin {
	 LoginStatus userAuthentication(String driverEmail , String driverPassword);
	 List<LoginDetails> getLoginDetails(int driverId);
}
