/**
 * 
 */
package assessment.retail_store.beans;

import java.time.LocalDate;

import assessment.retail_store.enums.UserType;

/**
 * @author Sathish
 *
 */
public class User {

	private UserInfo userInfo;
	private UserType type;
	private LocalDate fromDate;
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	
}
