class Car
{
	static int x=30;
	int y=50;
	public static void test(){
		System.out.println("It is static test method");
		System.out.println(x);
		//test();
		demo();
		Car c1=new Car();
		System.out.println("y from test is: "+c1.y);
	}
	public static void demo(){
		System.out.println("It is static demo method");
		Car c1=new Car();
		System.out.println("y from demo is: "+c1.y);
	}
	public void start(){
		System.out.println("It is non-static start method");
		System.out.println(y);
		run();
		System.out.println(x);
		demo();
	}
	public void run(){
		System.out.println("It is non-static run method");
	}
	public static void main(String[] args){
		System.out.println("This is main Method");
		test();
		System.out.println("main ends");
		Car c1=new Car();
		c1.start();
		System.out.println("Main finally ends");
	}
}

