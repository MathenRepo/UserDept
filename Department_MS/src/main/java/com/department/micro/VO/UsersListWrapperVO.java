package com.department.micro.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersListWrapperVO {
	
	public UsersListWrapperVO() {
		super();
	}

	public UsersListWrapperVO(List<UserVO> userList) {
		super();
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "UsersListWrapperVO [userList=" + userList + ", getUserList()=" + getUserList() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	private List<UserVO> userList;

	public List<UserVO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserVO> userList) {
		this.userList = userList;
	} 

}
