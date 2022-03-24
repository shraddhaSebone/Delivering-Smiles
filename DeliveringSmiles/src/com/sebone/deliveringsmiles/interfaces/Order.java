package com.sebone.deliveringsmiles.interfaces;

import java.util.List;


import com.sebone.deliveringsmiles.classes.OrderData;
import com.sebone.deliveringsmiles.classes.OrderStatus;

public interface Order {
	OrderData assignOrder(OrderData orderData);
	List<OrderData> getOrderDetails( int orderId );
	OrderStatus orderAcceptOrNot(OrderStatus orderStatus,int OrderId);	
	List<OrderData> sendOrderNotification(int driverId,String deliveryStatus);
}
