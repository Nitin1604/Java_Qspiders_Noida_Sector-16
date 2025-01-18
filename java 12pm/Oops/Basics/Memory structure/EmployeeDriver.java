class EmployeeDriver
{
	public static void main(String[] args)
	{
		System.out.println("This is Employee Driver");
		System.out.println(Employee.compName);
		Employee.giveBiometric();
		Employee e1=new Employee();
		Employee e2=new Employee();	
		Employee e3=new Employee();
		e2.compName="Samsung Company";
		e2.empName="Rakesh";
		System.out.println(Employee.compName);
		System.out.println("======Employee1 details=====");
		System.out.println("Object address is: "+e1);
		System.out.println("Company Name is: "+e1.compName);
		System.out.println("Employee Name is: "+e1.empName);
		System.out.println("ID is: "+e1.id);
		e1.giveBiometric();
		e1.work();
		System.out.println("======Employee2 details=====");
		System.out.println("Object address is: "+e2);
		System.out.println("Company Name is: "+e2.compName);
		System.out.println("Employee Name is: "+e2.empName);
		System.out.println("ID is: "+e2.id);
		e2.giveBiometric();
		e2.work();
		System.out.println("======Employee details=====");
		System.out.println("Object address is: "+e3);
		System.out.println("Company Name is: "+e3.compName);
		System.out.println("Employee Name is: "+e3.empName);
		System.out.println("ID is: "+e3.id);
		e3.giveBiometric();
		e3.work();
	}
}

