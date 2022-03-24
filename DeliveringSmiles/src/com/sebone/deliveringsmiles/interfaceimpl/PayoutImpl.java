package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.classes.OrderStatus;
import com.sebone.deliveringsmiles.classes.PayoutData;
import com.sebone.deliveringsmiles.interfaces.Payout;

public class PayoutImpl implements Payout{

	@Override
	public PayoutData payoutByOrder(int orderId, int driverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PayoutData> payoutOfTheDays(OrderStatus orderStatus, int driverId, String startDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PayoutData> totalPayout(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}

}
