/**
 * 
 */
package assessment.retail_store;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import assessment.retail_store.beans.LineItem;
import assessment.retail_store.beans.User;
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
	 */
	@Test
	public void testEmployeeUser() {
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
		System.out.println(retailStoreApp.shop(user, list));
	}
	
	@Test
	public void testAffiliateUser() {
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
		System.out.println(retailStoreApp.shop(user, list));
	}
	
	@Test
	public void testOldCustomerUser() {
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
		System.out.println(retailStoreApp.shop(user, list));
	}
	
	@Test
	public void testNewCustomerUser() {
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
		System.out.println(retailStoreApp.shop(user, list));
	}
	
	@Test
	public void testUserTypeException() {
		User user = new User();
		List<LineItem> list = new ArrayList<>();
			
		
		RetailStoreApp retailStoreApp = new RetailStoreApp();
		System.out.println(retailStoreApp.shop(user, list));
	}

}
