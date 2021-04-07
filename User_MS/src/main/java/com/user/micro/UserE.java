package com.user.micro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "UsersT")
@Entity(name = "UsersT")
@Data
public class UserE {
	
	public UserE() {
		super();
	}
	public UserE(Integer userID, String userName, Integer departmentID) {
		super();
		this.userName = userName;
		this.departmentID = departmentID;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userid")
	private Integer userID;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "departmentid")
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
