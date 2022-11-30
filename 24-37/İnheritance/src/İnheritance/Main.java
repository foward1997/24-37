package İnheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer =new Customer();
		
		customer.setAdress("Bursa Yildirim");
		
		
		CustomerManager customerManager=new CustomerManager();
		EmployeeManager employeeManager=new EmployeeManager();
		
		employeeManager.List();
	}

}
