package model;

public class Customer {
	int custId;
	String custFname;
	String custLname;
	char gender;
	String phoneNo;
	String address;
	String username;
	String password;
	
	public Customer() {
		
	}
	
	public Customer(String custFname, String custLname, char gender,
			String phoneNo, String address, String username, String password) {
		this.custFname= custFname;
		this.custLname= custLname;
		this.gender= gender;
		this.phoneNo= phoneNo;
		this.address= address;
		this.username= username;
		this.password= password;
		
	}

}
