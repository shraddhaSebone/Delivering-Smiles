package com.sebone.deliveringsmiles.interfaces;

import com.sebone.deliveringsmiles.classes.DriverData;
import com.sebone.deliveringsmiles.classes.DriverStatus;

public interface DriverRegistration {
	DriverData  submitDriverData(DriverData driverData);
	DriverData getDriverDetails(int driverId);
	DriverStatus updateDriverData(DriverData driverData);
}
