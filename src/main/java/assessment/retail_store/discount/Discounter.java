/**
 * 
 */
package assessment.retail_store.discount;

/**
 * @author Sathish
 *
 */
@FunctionalInterface
public interface Discounter {

	double applyDiscount(double amount);
	
}
