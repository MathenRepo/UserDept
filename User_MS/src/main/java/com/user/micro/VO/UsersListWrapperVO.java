package com.user.micro.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersListWrapperVO {
	
	private List<UserVO> userList;

	public List<UserVO> getUserList() {
		return userList;
	}

	public void setUserList(List<UserVO> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "UsersListWrapperVO [userList=" + userList + ", getUserList()=" + getUserList() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public UsersListWrapperVO(List<UserVO> userList) {
		super();
		this.userList = userList;
	}

	public UsersListWrapperVO() {
		super();
	} 

}
