package week3.day1;

public class AssignmentStudentinfoOverloading {

	void getStudentInfo1(int id) {
		System.out.println("id is:" + id);
	}

	void getStudentInfo2(int id, String name) {
		System.out.println("id is:" + id);
		System.out.println("Name is:" + name);
	}

	public void getStudentInfo3(String email, long Phnum) {
		System.out.println("mail id :" + email);
		System.out.println("phnum is:" + Phnum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentStudentinfoOverloading obj = new AssignmentStudentinfoOverloading();
		obj.getStudentInfo1(3120);
		obj.getStudentInfo2(3120, "SELENIUM");
		obj.getStudentInfo3("testleaf@gmail.com",123456789);

	}

}
