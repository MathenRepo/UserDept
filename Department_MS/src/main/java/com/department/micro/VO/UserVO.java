package com.department.micro.VO;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class UserVO {
	
	public UserVO() {
		super();
	}
	public UserVO(Integer userID, String userName, Integer departmentID) {
		super();
		this.userName = userName;
		this.departmentID = departmentID;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userID;
	private String userName;
	private Integer departmentID;
	
	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(Integer departmentID) {
		this.departmentID = departmentID;
	}

}
