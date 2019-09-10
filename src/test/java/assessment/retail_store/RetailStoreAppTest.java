/**
 * 
 */
package assessment.retail_store;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import assessment.retail_store.beans.LineItem;
import assessment.retail_store.beans.User;
import assessment.retail_store.exceptions.RetailStoreDiscountException;
import assessment.retail_store.utils.Utility;

/**
 * @author Sathish
 *
 */
public class RetailStoreAppTest {

	List<LineItem> lineItems = null;
	List<User> users = null;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		lineItems = new ArrayList<>();
		users = Utility.loadUsers();
		
		LineItem item1 = new LineItem();
		item1.setItem(Utility.loadItems().get(1));
		item1.setQuantity(3);
		lineItems.add(item1);
		
		LineItem item2 = new LineItem();
		item2.setItem(Utility.loadItems().get(4));
		item2.setQuantity(1);
		lineItems.add(item2);
		
		LineItem item3 = new LineItem();
		item3.setItem(Utility.loadItems().get(0));
		item3.setQuantity(4);
		lineItems.add(item3);

	}

	/**
	 * Test method for {@link assessment.retail_store.MainApp#main(java.lang.String[])}.
	 * @throws RetailStoreDiscountException 
	 */
	@Test
	public void testEmployeeUser() throws RetailStoreDiscountException {
		User user = users.get(0);
				
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, lineItems);
		assertEquals(new Double(842.0), actual);
	}
	
	@Test
	public void testAffiliateUser() throws RetailStoreDiscountException {
		User user = users.get(1);
		
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, lineItems);
		assertEquals(new Double(964.0), actual);
	}
	
	@Test
	public void testOldCustomerUser() throws RetailStoreDiscountException {
		User user = users.get(2);
		
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, lineItems);
		assertEquals(new Double(997.0), actual);
	}
	
	@Test
	public void testNewCustomerUser() throws RetailStoreDiscountException {
		User user = users.get(3);

		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, lineItems);
		assertEquals(new Double(1030.0), actual);
	}
	
	@Test(expected = RetailStoreDiscountException.class)
	public void testUserTypeException() throws RetailStoreDiscountException {
		User user = new User();
		List<LineItem> list = new ArrayList<>();
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		retailStoreApp.shop(user, list);
	}
	
	@Test(expected = RetailStoreDiscountException.class)
	public void testUserNull() throws RetailStoreDiscountException {
		List<LineItem> list = new ArrayList<>();
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		retailStoreApp.shop(null, list);
	}

	@Test(expected = RetailStoreDiscountException.class)
	public void testLineItemsNull() throws RetailStoreDiscountException {
		User user = users.get(3);

		RetailStoreApp retailStoreApp = new RetailStoreApp();
		retailStoreApp.shop(user, null);
	}
	
}
