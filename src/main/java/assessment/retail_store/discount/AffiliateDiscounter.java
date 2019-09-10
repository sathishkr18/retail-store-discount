/**
 * 
 */
package assessment.retail_store.discount;

/**
 * @author Sathish
 *
 */
public class AffiliateDiscounter implements Discounter {

	/* (non-Javadoc)
	 * @see assessment.retail_store.discount.Discounter#applyDiscount(double)
	 */
	@Override
	public double applyDiscount(double amount) {
		return amount - (amount * 0.10);
	}

}
