package com.gl.main;

import com.gl.departments.AdminDepartment;
import com.gl.departments.HrDepartment;
import com.gl.departments.TechDepartment;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrDepartment HrDept = new HrDepartment();
		TechDepartment TechDept = new TechDepartment();
		AdminDepartment AdminDept = new AdminDepartment();

		System.out.println("Welcome to " + AdminDept.departmentName());
		System.out.println(AdminDept.getTodaysWork());
		System.out.println(AdminDept.getWorkDeadline());
		System.out.println(AdminDept.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + HrDept.departmentName());
		System.out.println(HrDept.doActivity());
		System.out.println(HrDept.getTodaysWork());
		System.out.println(HrDept.getWorkDeadline());
		System.out.println(HrDept.isTodayAHoliday());
		System.out.println();

		System.out.println("Welcome to " + TechDept.departmentName());
		System.out.println(TechDept.getTodaysWork());
		System.out.println(TechDept.getWorkDeadline());
		System.out.println(TechDept.getTechStackInformation());
		System.out.println(TechDept.isTodayAHoliday());
		System.out.println();
	}

}
