package org.student;

import org.department.Department;

public class Student extends Department 
{
	public void studentName()
	{
		System.out.println("The student name is Vandana");
	}
	
	public void studentDept()
	{
		System.out.println("The student dept is CS");
	}

	public void studentId()
	{
		System.out.println("The student Id is 12589");
	}
	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentId();
		stu.studentName();
		stu.studentDept();
	}
	
}
