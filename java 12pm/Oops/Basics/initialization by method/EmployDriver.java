class EmployDriver
{
	public static void main(String[] args)
	{
		Employ e1=new Employ();
		Employ e2=new Employ();	
		Employ e3=new Employ();

		e1.setValue("Himanshu", 123, 34654.56);
		e2.setValue("Deepak", 120, 30654.56);
		e3.setValue("Deepanshu", 128, 24654.56);

		e1.getDetails();
		e2.getDetails();
		e3.getDetails();
	}
}

