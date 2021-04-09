package com.department.micro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.micro.VO.UsersListWrapperVO;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentDAO departmentRepo;

	public Department saveDepartment(Department dept) {
		return departmentRepo.save(dept);
	}

	public Department findDeptbyID(Integer id) {
		return departmentRepo.findById(id).orElse(new Department());
	}

	public List<Department> retrieveAllDepartments() {
		return departmentRepo.findAll();
	}
}
