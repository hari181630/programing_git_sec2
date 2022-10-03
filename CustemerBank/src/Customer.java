
public class Customer {
	//private class member
	private String customerName;
	private int customerId;
	private int balance;
	public boolean status;
	//constructor
	public Customer() {
		this.customerId=1;
		this.customerName="Hari";
		this.balance=15000;
		this.status=false;
		
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		if(status==true)
		this.customerName = customerName;
		else
			System.out.println("your account is inactive,please active your account");
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int b) {
		if(status==true) {
		this.balance = b;
	}
		else
			System.out.println("your account is inactive,please activate");
	}
	public void withdrawal(int x) {
		setBalance(this.balance-x);
	}

	}
	
