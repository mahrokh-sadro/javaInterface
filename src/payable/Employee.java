package payable;

public class Employee implements Payable{

	private String firstName;
	private String lastName;
	private String ssn;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Employee(String first, String last, String ssn) {
		this.firstName=first;
		this.lastName=last;
		this.ssn=ssn;
	}
	@Override
	public String toString() {
		return "FirstName : " + getFirstName() + " | LastName : " + getLastName() + " | Ssn : "
				+ getSsn() + "\n";
	}
	
	
}
