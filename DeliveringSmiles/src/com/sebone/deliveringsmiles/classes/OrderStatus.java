package com.sebone.deliveringsmiles.classes;
/**class name:-DriverAddress
 * Objective:-This class store order status and description related to the order.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public class OrderStatus {
	private boolean orderStatus;
	private int orderId;
	private String orderStatusDescription;
	
	public boolean isOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatusDescription() {
		return orderStatusDescription;
	}
	public void setOrderStatusDescription(String orderStatusDescription) {
		this.orderStatusDescription = orderStatusDescription;
	}
}
