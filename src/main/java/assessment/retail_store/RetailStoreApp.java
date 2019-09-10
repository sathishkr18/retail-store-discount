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
import assessment.retail_store.exceptions.RetailStoreDiscountException;

/**
 * @author Sathish
 *
 */
public class RetailStoreApp {

	/**
	 * @param user
	 * @param items
	 * @return Net payable Amount
	 * @throws RetailStoreDiscountException
	 */
	public Double shop(User user, List<LineItem> items) throws RetailStoreDiscountException {

		try {
			BillProducer app = new BillProducer();
			Discounter zeroPercentDiscounter = amount -> amount;

			switch (user.getType()) {
			case EMPLOYEE:
				return app.calculateNetPayableAmount(items, new EmployeeDiscounter(), user.getUserInfo());
			case AFFILIATE:
				return app.calculateNetPayableAmount(items, new AffiliateDiscounter(), user.getUserInfo());
			case CUSTOMER:
				if (user.getFromDate().isBefore(LocalDate.now().minusYears(2))) {
					return app.calculateNetPayableAmount(items, new CustomerDiscounter(), user.getUserInfo());
				}
				return app.calculateNetPayableAmount(items, zeroPercentDiscounter, user.getUserInfo());
			}

		} catch (Exception e) {
			throw new RetailStoreDiscountException("Unexpected error occurred");
		}
		return null;
	}

}
