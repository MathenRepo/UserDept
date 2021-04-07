package com.user.micro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserE, Integer>{

	List<UserE> findByDepartmentID(Integer deptID);

//	@Query("SELECT FROM UsersT ut WHERE ut.departmentid=?1")
//	public List<UserE> findAllBydepartmentID(Integer deptID);
}
