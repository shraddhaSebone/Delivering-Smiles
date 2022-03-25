package com.sebone.deliveringsmiles.classes;
/**class name:-DriverAddress
 * Objective:-This class contain all details of payoutstatus.
 * @author Shraddha Choudhary
 * Date-24/03/2022
 */
public class PayoutStatus {
	private int payoutId;
	private boolean payoutStatus;
	private String payoutStatusDescription;
	
	public int getPayoutId() {
		return payoutId;
	}
	public void setPayoutId(int payoutId) {
		this.payoutId = payoutId;
	}
	public boolean isPayoutStatus() {
		return payoutStatus;
	}
	public void setPayoutStatus(boolean payoutStatus) {
		this.payoutStatus = payoutStatus;
	}
	public String getPayoutStatusDescription() {
		return payoutStatusDescription;
	}
	public void setPayoutStatusDescription(String payoutStatusDescription) {
		this.payoutStatusDescription = payoutStatusDescription;
	}
}
