package com.department.micro.VO;

import com.department.micro.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateWrapperVO {
	
	UsersListWrapperVO usersWrapper;
	Department department;
	
	public UsersListWrapperVO getUsersWrapper() {
		return usersWrapper;
	}
	public void setUsersWrapper(UsersListWrapperVO usersWrapper) {
		this.usersWrapper = usersWrapper;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	public ResponseTemplateWrapperVO(UsersListWrapperVO usersWrapper, Department department) {
		super();
		this.usersWrapper = usersWrapper;
		this.department = department;
	}

}
