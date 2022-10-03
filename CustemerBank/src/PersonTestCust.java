
public class PersonTestCust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		System.out.println("Display Customer Details");
		System.out.println("CustomerId "+c.getCustomerId());
		System.out.println("Customer Name"+c.getCustomerName());
		System.out.println("Balance account"+c.getBalance());
		System.out.println("status"+c.status);
		c.setCustomerName("Hari");
		System.out.println("==============After Update==============");
		System.out.println("Display Customer Detail");
		System.out.println("customer id"+c.getCustomerId());
		System.out.println("customer Name"+c.getCustomerName());
		System.out.println("balance account"+c.getBalance());
		System.out.println("status:"c.status);
		
		
		c.withdrawal(4000);
		System.out.println("Balance Amount"c.getBalance());
		
		
		
		

	}

}
