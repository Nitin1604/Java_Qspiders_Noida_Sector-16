class Car
{
	public static void test(int y){
		System.out.println("This is Test method");
		System.out.println(y);
	}
	public static void main(String[] args){
		System.out.println("This is main method");
		test(1246);
		demo(34.56);
	}
	public static void demo(double y){
		System.out.println("This is demo method");
		System.out.println(y);
	}
}

