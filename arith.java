import java.util.Scanner;
class arith
{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st value:");
	int a=sc.nextInt();
	 System.out.println("Enter 2nd value:");
        int b=sc.nextInt();
	    System.out.println("Sum:"+(a+b));
	    System.out.println("Difference:"+(a-b));
	    System.out.println("Product:"+(a*b));
	    System.out.println("Division:"+(a/b));

	}
}
