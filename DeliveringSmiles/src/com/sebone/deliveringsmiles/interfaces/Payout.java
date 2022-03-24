package com.sebone.deliveringsmiles.interfaces;

import java.util.List;

import com.sebone.deliveringsmiles.classes.OrderStatus;
import com.sebone.deliveringsmiles.classes.PayoutData;

public interface Payout {
	 PayoutData payoutByOrder(int orderId,int driverId);
	 List<PayoutData> payoutOfTheDays(OrderStatus orderStatus,int driverId ,String startDate,String endDate);
	 List<PayoutData> totalPayout(int driverId);
}
