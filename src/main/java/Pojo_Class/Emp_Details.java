package Pojo_Class;

public class Emp_Details {

	int id;
	String name;
	int phno;
	String address;
	String email;
	
	public Emp_Details(int id, String name, int phno, String address, String email) {
	
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.address = address;
		this.email = email;
	}
	
	public Emp_Details() {
		
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

	public int getPhno() {
		return phno;
	}

	public void setPhno(int phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
