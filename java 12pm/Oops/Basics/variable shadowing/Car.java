class Car
{
	static int x=30;
	public static void test(){
		System.out.println("It is static test method");
		int x=44;
		System.out.println("Local x is: "+x);
		System.out.println("static x is: "+Car.x);
	}
	public static void main(String[] args){
		test();
	}
}

