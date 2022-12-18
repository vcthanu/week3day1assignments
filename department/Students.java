package org.department;

public class Students {
	
	public static void main(String[] args) {
		
		Students overload = new Students();
		overload.getStudentInfo();
		overload.getStudentInfo(755398);
		overload.getStudentInfo(3456, "Thanu");
		overload.getStudentInfo(678, "Shy@gmail.com", "The");
	}
	
	public void getStudentInfo() {
		// TODO Auto-generated method stub

	}
	
	public int getStudentInfo(int id) {
		
		return id;

	}

	public String getStudentInfo(int id, String name) {
		
		return name;

	}
	public int getStudentInfo(int mobno,String email,String name) {
		
		return mobno;

	}
}
