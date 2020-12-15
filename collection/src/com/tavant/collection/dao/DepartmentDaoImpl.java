package com.tavant.collection.dao;

import java.util.ArrayList;
import java.util.List;

import com.tavant.collection.models.Department;
import com.tavant.collection.models.Employee;

public class DepartmentDaoImpl implements DepartmentDao {
	private List<Department> departments = new ArrayList<Department>(20);

	@Override
	public Department getDepartmentById(String departmentId) {
		for (Department department : departments) {
			if (department.getDepartmentId().equals(departmentId))
				return department;
		}
		return null;
	}

	

	@Override
	public Boolean isExists(String departmentId) {
		return (this.getDepartmentById(departmentId)!= null) ? true : false;
	}

	@Override
	public Boolean addDepartment(Department department) {
		return this.departments.add(department);
	}

	@Override
	public Department updateDepartment(String departmentId, Department department) {
		Department tempdDepartment = this.getDepartmentById(departmentId);
		tempdDepartment.setDepartmentName(department.getDepartmentName());
		return tempdDepartment;
	}

	@Override
	public List<Department> getDepartments() {
		return this.departments;
	}

	@Override
	public Boolean deleteDepartment(String departmentId) {

		return this.departments.remove(this.getDepartmentById(departmentId));
	}


}
