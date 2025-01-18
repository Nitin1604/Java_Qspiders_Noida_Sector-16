class CarDriver
{
	public static void main(String[] args)
	{
		System.out.println("This is Test class");
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		c1.name="TATA";
		c1.price=35346.56;
		c1.hp=120;
		c2.name="MAruti";
		c2.price=34644.67;
		c2.hp=150;
		System.out.println("======Car1 details=====");
		System.out.println("Name is: "+c1.name);
		System.out.println("Price is: "+c1.price);
		System.out.println("HP is: "+c1.hp);
		c1.start();
		c1.stop();
		System.out.println("======Car2 details=====");
		System.out.println(c2.name);
		System.out.println(c2.price);
		System.out.println(c2.hp);
		c2.start();
		c2.stop();
		System.out.println("======Car3 details=====");
		System.out.println(c3.name);
		System.out.println(c3.price);
		System.out.println(c3.hp);
		c3.start();
		c3.stop();
	}
}

