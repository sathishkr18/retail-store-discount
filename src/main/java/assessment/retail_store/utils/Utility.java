/**
 * 
 */
package assessment.retail_store.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import assessment.retail_store.beans.Item;
import assessment.retail_store.beans.User;
import assessment.retail_store.beans.UserInfo;
import assessment.retail_store.enums.ItemType;
import assessment.retail_store.enums.UserType;

/**
 * @author Sathish
 *
 */
public class Utility {
	
	private Utility() {
		  throw new IllegalStateException("Utility class");
	}
	
	public static final String GROCERIES = ItemType.GROCERIES.toString();
	public static final String ELECTRONICS = ItemType.ELECTRONICS.toString();
	public static final String STATIONARIES = ItemType.STATIONARIES.toString();
	public static final String DOTTED_LINE = "\n-----------------------------------------------------------";
	
	public static List<User> loadUsers(){
		
		List<User> users = new ArrayList<>();
		
		User user1 = new User();
		UserInfo userInfo1 = new UserInfo();
		userInfo1.setId("user1");
		userInfo1.setName("Sathish");
		userInfo1.setMobile("9999999999");
		user1.setUserInfo(userInfo1);
		user1.setType(UserType.EMPLOYEE);		
		user1.setFromDate(LocalDate.of(2015, 02, 14));
		users.add(user1);
		
		User user2 = new User();
		UserInfo userInfo2 = new UserInfo();
		userInfo2.setId("user2");
		userInfo2.setName("Vinoth");
		userInfo2.setMobile("8888888888");
		user2.setUserInfo(userInfo2);
		user2.setType(UserType.AFFILIATE);
		user2.setFromDate(LocalDate.of(2018, 05, 18));
		users.add(user2);
		
		User user3 = new User();
		UserInfo userInfo3 = new UserInfo();
		userInfo3.setId("user3");
		userInfo3.setName("Alex");
		userInfo3.setMobile("7777777777");
		user3.setUserInfo(userInfo3);
		user3.setType(UserType.CUSTOMER);
		user3.setFromDate(LocalDate.of(2016, 05, 20));
		users.add(user3);
		
		User user4 = new User();
		UserInfo userInfo4 = new UserInfo();
		userInfo4.setId("user4");
		userInfo4.setName("Kumar");
		userInfo4.setMobile("6666666666");
		user4.setUserInfo(userInfo4);
		user4.setType(UserType.CUSTOMER);
		user4.setFromDate(LocalDate.of(2019, 07, 20));
		users.add(user4);
		
		return users;
		
	}

	public static List<Item> loadItems() {
		List<Item> items = new ArrayList<>();

		Item item1 = new Item();
		item1.setId(1);
		item1.setName("Pen");
		item1.setPrice(40);
		item1.setType(ItemType.STATIONARIES);
		items.add(item1);

		Item item2 = new Item();
		item2.setId(2);
		item2.setName("Rice");
		item2.setPrice(140);
		item2.setType(ItemType.GROCERIES);
		items.add(item2);

		Item item3 = new Item();
		item3.setId(3);
		item3.setName("Mobile Phone");
		item3.setPrice(250);
		item3.setType(ItemType.ELECTRONICS);
		items.add(item3);

		Item item4 = new Item();
		item4.setId(4);
		item4.setName("Note Book");
		item4.setPrice(25);
		item4.setType(ItemType.STATIONARIES);
		items.add(item4);

		Item item5 = new Item();
		item5.setId(5);
		item5.setName("Laptop");
		item5.setPrice(500);
		item5.setType(ItemType.ELECTRONICS);
		items.add(item5);

		Item item6 = new Item();
		item6.setId(6);
		item6.setName("Dal");
		item6.setPrice(80);
		item6.setType(ItemType.GROCERIES);
		items.add(item6);

		Item item7 = new Item();
		item7.setId(7);
		item7.setName("Earphones");
		item7.setPrice(15);
		item7.setType(ItemType.ELECTRONICS);
		items.add(item7);

		Item item8 = new Item();
		item8.setId(8);
		item8.setName("Letterpad");
		item8.setPrice(20);
		item8.setType(ItemType.STATIONARIES);
		items.add(item8);

		return items;
	}
}
