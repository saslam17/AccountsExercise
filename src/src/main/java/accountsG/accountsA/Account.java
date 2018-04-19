package src.main.java.accountsG.accountsA;

public class Account {
	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public Account(String firstName, String lastName, String accountNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAccNum() {
		return accountNumber;
	}
	
	public String toString() {
		return "First Name: " + firstName + " " +  "Last Name:" + lastName + " " + "Account Number: " + accountNumber;
	}
}