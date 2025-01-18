class Vehicle
{
	public static void start(String a,int b,double c){
		System.out.println("This is start method");
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);
		System.out.println("c is: "+c);
	}
	public static void main(String[] args){
		System.out.println("This is main method");
		Vehicle.start("rakesh", 123, 3456.78);
		System.out.println("=================");
		start("abc", 100, 234.56);
		System.out.println("=================");
		start("xy", 188, 1456.67);

	}
}

