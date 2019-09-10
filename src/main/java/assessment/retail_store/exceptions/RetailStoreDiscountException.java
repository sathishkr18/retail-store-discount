/**
 * 
 */
package assessment.retail_store.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Sathish
 *
 */
public class RetailStoreDiscountException extends Exception {

	private static final Logger LOGGER = LogManager.getLogger(RetailStoreDiscountException.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RetailStoreDiscountException(String message) {
		super(message);
		LOGGER.error("{}", message);
	}

}
