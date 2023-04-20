package EmployeeSalary;

public class Employee {

	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80
    double HRA = 1000.50
    
    public Employee(long id, String name, String address,long phone) {
		this.id = employeeId;
		
		
		
       
		System.out.println("emp id:  " +id);
             System.out.println("emp name: " +name);
             System.out.println("emp addr: " +address);
             System.out.println("emp phone: " +phone);
		
	}
	
    public int calculateSalary () {
    	double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * HRA/100);
    	System.out.println ("Salary  is " +salary);
    	
    	
    	
    }
	
	
}
