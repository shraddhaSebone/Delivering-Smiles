package com.sebone.deliveringsmiles.interfaces;

import java.util.List;
import com.sebone.deliveringsmiles.classes.OrderData;
import com.sebone.deliveringsmiles.classes.OrderStatus;
/**class name:-DriverAddress
 * Objective:-This interface conatin 4 methods.In this interface we declared all the methods related to order,this interface will conatin four methods which the help of the following methods we can send notification to the user,we can assign orders to Driver and so on.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public interface Order {
	OrderData assignOrder(OrderData orderData,int driverId);
	List<OrderData> getOrderDetails( int orderId );
	OrderStatus orderAcceptOrNot(OrderStatus orderStatus,int OrderId);	
	List<OrderData> sendOrderNotification(int driverId,String deliveryStatus);
	/**method name:-assignOrder
	 * Objective:-In this method we get all the details of the order from the company and we will assign it to a driver whoever is available for the delivery.
	 * @param DriverData driverData
	 * @param DriverData
	 */
	//OrderData assignOrder(OrderData orderData, int driverId);
}
