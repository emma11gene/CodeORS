
public class RegestrationForm {

	public String customerFirstName;
	public String customerLastName;
	public String address;
	public String emailAddress;
	public String phoneNumber;
	public String userName;
	public String password;
	
	
	public RegestrationForm(String customerFirstName, String customerLastName, String address, String emailAddress, String phoneNumber, String userName, String password)
	{
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
	}
	
	public String toString()
	{
		return customerFirstName + " " + address + " " + emailAddress + " " + phoneNumber + " " + userName + " " + password;
	}
}
