package org.student;

public class Students {
	public void getStudentInfo()
	{
		System.out.println("Testing Overloading");
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Id = "+id+", "+"Name = "+name);
	}
	public void getStudentInfo(String email, long phNo)
	{
		System.out.println("EmailId = "+email+", "+"Phone Number = "+phNo);
	}

	public static void main(String[] args) {
		Students s1 = new Students();
		s1.getStudentInfo();
		s1.getStudentInfo(100001, "Divya");
		s1.getStudentInfo("divyas.shanmugam@gmail.com", 8754461373L);

	}

}
