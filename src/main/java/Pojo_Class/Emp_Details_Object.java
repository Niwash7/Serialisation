package Pojo_Class;

public class Emp_Details_Object {

	int id;
	String name;
	int[] phno;
	Object spouse;
	String emailId;
	
	public Emp_Details_Object(int id, String name, int[] phno, Object spouse, String emailId) {
		
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.spouse = spouse;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
