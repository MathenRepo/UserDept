package com.department.micro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.department.micro.VO.ResponseTemplateWrapperVO;
import com.department.micro.VO.UserVO;
import com.department.micro.VO.UsersListWrapperVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	static
	{
		System.out.println("Loaded Dept. Controller");
	}
	
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public Department saveDepartment(@RequestBody Department dept) {
		return departmentService.saveDepartment(dept);
	}
	
	@RequestMapping("/{id}")
	public Department getDepartment(@PathVariable("id") Integer id)
	{
		return departmentService.findDeptbyID(id);
	}
	
	@RequestMapping("/deptdetails/{id}")
	public ResponseTemplateWrapperVO getDepartmentDetails(@PathVariable("id") Integer id)
	{
		UsersListWrapperVO userList = restTemplate.getForObject("http://USERINFOMS/users/deptusers/" + id, UsersListWrapperVO.class);
		Department dept = departmentService.findDeptbyID(id);
		ResponseTemplateWrapperVO responseVO = new ResponseTemplateWrapperVO(userList, dept);
		return responseVO;
	}
	
	@RequestMapping("/all")
	public List<Department> getAllUsers() {
		return departmentService.retrieveAllDepartments();
	}
}
