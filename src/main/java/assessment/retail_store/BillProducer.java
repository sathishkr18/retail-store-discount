package assessment.retail_store;

import java.time.LocalDateTime;
import java.util.List;

import assessment.retail_store.beans.Bill;
import assessment.retail_store.beans.LineItem;
import assessment.retail_store.beans.UserInfo;
import assessment.retail_store.discount.Discounter;
import assessment.retail_store.utils.Utility;

/**
 * @author Sathish
 *
 */
public class BillProducer {
	
	/**
	 * @param lineItem
	 * @param discounter
	 * @return Item Net Price after discount
	 */
	private static double calculateItemNetPrice(LineItem lineItem, Discounter discounter) {

			//Calculate net price based on discounts by user type and item type
			if (!Utility.GROCERIES.equals(lineItem.getItem().getType().toString())) {
				return discounter.applyDiscount(lineItem.getTotalPrice());
			}
			return lineItem.getTotalPrice();
		}


	/**
	 * @param lineItems
	 * @param discounter
	 * @param user
	 * @return Net Payable amount
	 */
	public Double calculateNetPayableAmount(List<LineItem> lineItems, Discounter discounter, UserInfo user) {
		Bill bill = new Bill();
		lineItems.forEach(item->{
			item.setTotalPrice(item.getItem().getPrice() * item.getQuantity());
			item.setNetPrice(calculateItemNetPrice(item, discounter));
		});
		bill.setItems(lineItems);
		bill.setTime(LocalDateTime.now());
		bill.setSubTotal(lineItems.stream().mapToDouble(LineItem::getNetPrice).sum());
		bill.setAdditionalDiscount(Math.floor(bill.getSubTotal() / 100) * 5);
		bill.setNetPayableAmount(bill.getSubTotal() - bill.getAdditionalDiscount());
		bill.setUserInfo(user);
		// Display bill receipt to the console
		System.out.println(bill.toString());
		
		return bill.getNetPayableAmount();
	}

}
