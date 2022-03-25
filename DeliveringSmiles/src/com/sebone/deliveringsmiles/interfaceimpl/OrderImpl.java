package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.classes.OrderData;
import com.sebone.deliveringsmiles.classes.OrderStatus;
import com.sebone.deliveringsmiles.interfaces.Order;
/**class name:-OrderImpl
 * Objective:-This class immplements all the method of Order interface.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public class OrderImpl implements Order{
	/**method name:-assignOrder
	 * Objective:-In this method we get all the details of the order from the company and we will assign it to a driver whoever is available for the delivery.
	 * @param OrderData orderData,int driverId
	 * @param OrderData
	 */
	@Override
	public OrderData assignOrder(OrderData orderData,int driverId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**method name:-getOrderDetails
	 * Objective:- In this method we will fetch all the details of order Data.
	 * @param int orderId
	 * @param List<OrderData>
	 */
	@Override
	public List<OrderData> getOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**method name:-orderAcceptOrNot
	 * Objective:-With the help of this method we will fetch that the order is accepted or rejected by the driver.
	 * @param int driverId, String deliveryStatus
	 * @param OrderStatus
	 */
	@Override
	public OrderStatus orderAcceptOrNot(OrderStatus orderStatus, int OrderId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**method name:-sendOrderNotification
	 * Objective:- Inb this method we will notify the user /Driver about the order.
	 * @param int driverId, String deliveryStatus
	 * @param List<OrderData>
	 */
	@Override
	public List<OrderData> sendOrderNotification(int driverId, String deliveryStatus) {
		// TODO Auto-generated method stub
		return null;
	}
}
