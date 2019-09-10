/**
 * 
 */
package assessment.retail_store.beans;

import java.time.LocalDateTime;
import java.util.List;

import assessment.retail_store.utils.Utility;

/**
 * @author Sathish
 *
 */
public class Bill {

	private static long number=100;
	private List<LineItem> items;
	private LocalDateTime time;
	private double subTotal;
	private double additionalDiscount;
	private double netPayableAmount;
	private UserInfo userInfo;

	public Bill(){
		number++;	
	}
	
	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime date) {
		this.time = date;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getAdditionalDiscount() {
		return additionalDiscount;
	}

	public void setAdditionalDiscount(double additionalDiscount) {
		this.additionalDiscount = additionalDiscount;
	}

	public double getNetPayableAmount() {
		return netPayableAmount;
	}

	public void setNetPayableAmount(double netPayableAmount) {
		this.netPayableAmount = netPayableAmount;
	}
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	@Override
	public String toString() {

		StringBuilder str = new StringBuilder("\n\n");

		str.append(Utility.DOTTED_LINE);
		str.append("\n                        Bill Receipt                       ");
		str.append(Utility.DOTTED_LINE);
		str.append("\nBill Number: " + number);
		str.append("\nBill Time: " + time);
		str.append("\nUser Id: " + userInfo.getId());
		str.append("\nUser Name: " + userInfo.getName());
		str.append("\nUser Mobile: " + userInfo.getMobile());
		str.append("\n\n");
		for (LineItem i : items) {
			str.append("\n" + i.getItem().getId() + " " + i.getItem().getName() + "    "
					+ i.getItem().getType().toString() + "    $" + i.getItem().getPrice() + "    " + i.getQuantity()
					+ "    $" + i.getNetPrice() + "   ");
		}
		str.append("\n");
		str.append("\nSubtotal after % discount: $" + subTotal);
		str.append("\nAdditional Discount: $" + additionalDiscount);
		str.append(Utility.DOTTED_LINE);
		str.append("\nNet Payable Amount: $" + netPayableAmount + "\n\n");
		return str.toString();
	}

}
