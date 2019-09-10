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

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link assessment.retail_store.MainApp#main(java.lang.String[])}.
	 * @throws RetailStoreDiscountException 
	 */
	@Test
	public void testEmployeeUser() throws RetailStoreDiscountException {
		User user = Utility.loadUsers().get(0);
		List<LineItem> list = new ArrayList<>();
		
		LineItem item1 = new LineItem();
		item1.setItem(Utility.loadItems().get(1));
		item1.setQuantity(3);
		list.add(item1);
		
		LineItem item2 = new LineItem();
		item2.setItem(Utility.loadItems().get(3));
		item2.setQuantity(2);
		list.add(item2);
		
		LineItem item3 = new LineItem();
		item3.setItem(Utility.loadItems().get(0));
		item3.setQuantity(4);
		list.add(item3);
		
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, list);
		assertEquals(new Double(542.0), actual);
	}
	
	@Test
	public void testAffiliateUser() throws RetailStoreDiscountException {
		User user = Utility.loadUsers().get(1);
		List<LineItem> list = new ArrayList<>();
		
		LineItem item1 = new LineItem();
		item1.setItem(Utility.loadItems().get(1));
		item1.setQuantity(3);
		list.add(item1);
		
		LineItem item2 = new LineItem();
		item2.setItem(Utility.loadItems().get(3));
		item2.setQuantity(2);
		list.add(item2);
		
		LineItem item3 = new LineItem();
		item3.setItem(Utility.loadItems().get(0));
		item3.setQuantity(4);
		list.add(item3);
		
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, list);
		assertEquals(new Double(579.0), actual);
	}
	
	@Test
	public void testOldCustomerUser() throws RetailStoreDiscountException {
		User user = Utility.loadUsers().get(2);
		List<LineItem> list = new ArrayList<>();
		
		LineItem item1 = new LineItem();
		item1.setItem(Utility.loadItems().get(1));
		item1.setQuantity(3);
		list.add(item1);
		
		LineItem item2 = new LineItem();
		item2.setItem(Utility.loadItems().get(3));
		item2.setQuantity(2);
		list.add(item2);
		
		LineItem item3 = new LineItem();
		item3.setItem(Utility.loadItems().get(0));
		item3.setQuantity(4);
		list.add(item3);
		
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, list);
		assertEquals(new Double(589.5), actual);
	}
	
	@Test
	public void testNewCustomerUser() throws RetailStoreDiscountException {
		User user = Utility.loadUsers().get(3);
		List<LineItem> list = new ArrayList<>();
		
		LineItem item1 = new LineItem();
		item1.setItem(Utility.loadItems().get(1));
		item1.setQuantity(3);
		list.add(item1);
		
		LineItem item2 = new LineItem();
		item2.setItem(Utility.loadItems().get(3));
		item2.setQuantity(2);
		list.add(item2);
		
		LineItem item3 = new LineItem();
		item3.setItem(Utility.loadItems().get(0));
		item3.setQuantity(4);
		list.add(item3);
		
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		Double actual = retailStoreApp.shop(user, list);
		assertEquals(new Double(600.0), actual);
	}
	
	@Test(expected = RetailStoreDiscountException.class)
	public void testUserTypeException() throws RetailStoreDiscountException {
		User user = new User();
		List<LineItem> list = new ArrayList<>();
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		retailStoreApp.shop(user, list);
	}

}
