class Vehicle
{
	int x=18;
	public void start(){
		System.out.println("It is non-static start method");
		int x=76;
		System.out.println("Local x is: "+x);
		System.out.println("non-static x is: "+this.x);
	}
	public static void main(String[] args){
		Vehicle v1=new Vehicle();
		v1.start();
	}
}

