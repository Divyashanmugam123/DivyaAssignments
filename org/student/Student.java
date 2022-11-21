package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("From Stdent class - Student Name");
	}
	public void studentDept() {
		System.out.println("From Stdent class - Student Department");
	}
	public void studentId() {
		System.out.println("From Stdent class - Student ID");
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();

	}

}
