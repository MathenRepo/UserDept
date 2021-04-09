package com.user.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.micro.VO.UsersListWrapperVO;

import ch.qos.logback.classic.Logger;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
	
	@Autowired
	private UserService userService;
	 
	@RequestMapping("/{uname}/{udId}")
	@ResponseBody
	public UserE saveUser(@PathVariable("uname") String userName, 
			@PathVariable("udId") Integer udID) {
		UserE userObj = new UserE(1,userName,udID);
		return userService.saveUser(userObj);
		
	}
	
	@RequestMapping("/saveuser")
	@ResponseBody
	public UserE saveUserJson(@RequestBody UserE user) {
		return userService.saveUser(user);
		
	}
	
	@RequestMapping("/user/{id}")
	public UserE getUser(@PathVariable("id") Integer userID) {
		
		return userService.retrieveUser(userID);
		
	}
	
	@RequestMapping("/deptusers/{deptId}")
	public UsersListWrapperVO getDepartmentUser(@PathVariable("deptId") Integer deptID) {
		
		return userService.retrieveDeptUsers(deptID);
		
	}

	@RequestMapping("/all")
	public UsersListWrapperVO getAllUsers() {
		return userService.retrieveAllUsers();
	}
}
