import java.util.Scanner;
class doWhileCode1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char c;
		do{
			System.out.println("Enter the Number: ");
			int n=sc.nextInt();
			int fact=1;
			int i=1;
			while(i<=n){
				fact=fact*i;
			i++;
			}
			System.out.println(n+"!= "+fact);
			System.out.println("ENter Y/y to Continue...");
			c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("=====Program Ends!!=====");	
}
	}