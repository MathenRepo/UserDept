package com.department.micro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "DepartmentT")
@Entity(name = "DepartmentT")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	@Column(name = "DepartmentID")
	private Integer depID;
	@Getter
	@Setter
	@Column(name = "DepartmentName")
	private String depName;
	
	public Integer getDepID() {
		return depID;
	}
	public void setDepID(Integer depID) {
		this.depID = depID;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	

}
