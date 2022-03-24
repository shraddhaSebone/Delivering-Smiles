package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.classes.OrderData;
import com.sebone.deliveringsmiles.classes.OrderStatus;
import com.sebone.deliveringsmiles.interfaces.Order;

public class OrderImpl implements Order{

	@Override
	public OrderData assignOrder(OrderData orderData) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderData> getOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int OrderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderData> sendOrderNotification(int driverId, String deliveryStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
