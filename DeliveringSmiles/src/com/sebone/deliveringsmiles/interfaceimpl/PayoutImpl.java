package com.sebone.deliveringsmiles.interfaceimpl;

import java.util.List;

import com.sebone.deliveringsmiles.classes.OrderStatus;
import com.sebone.deliveringsmiles.classes.PayoutData;
import com.sebone.deliveringsmiles.interfaces.Payout;
/**class name:-OrderImpl
 * Objective:-This class immplements all the method of Payout interface.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public class PayoutImpl implements Payout{
	/**method name:-payoutByOrder
	 * Objective:- With the help of this method the user will get the total payout of a particular order .
	 * @param int orderId, int driverId
	 * @param PayoutData
	 */
	@Override
	public PayoutData payoutByOrder(int orderId, int driverId) {
		// TODO Auto-generated method stub
		return null;
	}
	/**method name:-payoutOfTheDays
	 * Objective:- With the help of this method the user will get the payout data according to the user input date or time.
	 * @param OrderStatus orderStatus, int driverId, String startDate, String endDate
	 * @param List<PayoutData>
	 */
	@Override
	public List<PayoutData> payoutOfTheDays(OrderStatus orderStatus, int driverId, String startDate, String endDate) {
		// TODO Auto-generated method stub
		return null;
	}
	/**method name:-totalPayout
	 * Objective:-With the help of this method the user will be able to generate total payout of his total successful deliverys
	 * @param int driverId
	 * @param List<PayoutData>
	 */
	@Override
	public List<PayoutData> totalPayout(int driverId) {
		// TODO Auto-generated method stub
		return null;
	}

}
