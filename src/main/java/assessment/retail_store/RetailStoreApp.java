/**
 * 
 */
package assessment.retail_store;

import java.time.LocalDate;
import java.util.List;

import assessment.retail_store.beans.LineItem;
import assessment.retail_store.beans.User;
import assessment.retail_store.discount.AffiliateDiscounter;
import assessment.retail_store.discount.CustomerDiscounter;
import assessment.retail_store.discount.Discounter;
import assessment.retail_store.discount.EmployeeDiscounter;

/**
 * @author Sathish
 *
 */
public class RetailStoreApp {

	/**
	 * @param user
	 * @param items
	 * @return Net payable Amount
	 */
	public Double shop(User user, List<LineItem> items) {

		try {
			BillProducer app = new BillProducer();
			Discounter zeroPercentDiscounter = (amount) -> {
				return amount;
			};

			switch (user.getType()) {
			case Employee:
				return app.calculateNetPayableAmount(items, new EmployeeDiscounter(), user.getUserInfo());
			case Affiliate:
				return app.calculateNetPayableAmount(items, new AffiliateDiscounter(), user.getUserInfo());
			case Customer:
				if (user.getFromDate().isBefore(LocalDate.now().minusYears(2))) {
					return app.calculateNetPayableAmount(items, new CustomerDiscounter(), user.getUserInfo());
				}
			default:
				return app.calculateNetPayableAmount(items, zeroPercentDiscounter, user.getUserInfo());
			}

		} catch (Exception e) {
			System.out.println("Unexpected error occurred");
			return null;
		}

	}

}
