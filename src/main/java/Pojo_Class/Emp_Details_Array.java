package Pojo_Class;

public class Emp_Details_Array {
	
	String name;
	int[] phno;
	String emailId;

	public Emp_Details_Array(String name, int[] phno, String emailId) {
		
		this.name = name;
		this.phno = phno;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getPhno() {
		return phno;
	}

	public void setPhno(int[] phno) {
		this.phno = phno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}

