class Car
{
	public static void test()
	{
		System.out.println("This is test method");
	}
	public void demo()
	{
		System.out.println("This is demo method");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		Car c1=new Car();
		c1.demo();
	}
}