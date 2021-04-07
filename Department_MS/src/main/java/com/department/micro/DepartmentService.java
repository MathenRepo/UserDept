package com.department.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
