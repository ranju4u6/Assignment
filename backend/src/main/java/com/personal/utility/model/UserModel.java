package com.personal.utility.model;

/**
 * Model class that represents user
 * @author renjith
 *
 */
public class UserModel {
	
	private String userId;
	private String userName;
	private UserTypeModel userType;
	private String sessionId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserTypeModel getUserType() {
		return userType;
	}
	public void setUserType(UserTypeModel userType) {
		this.userType = userType;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	

}
