import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the last number for range : ");
	       int n=Integer.parseInt(sc.nextLine());
	       harmonicnumbers(n);
	      
	}
	static void harmonicnumbers(int n)
	{
		System.out.println("Harmonic Numbers=");
	       for(int i=1; i<=n; i++)
	       {
	    	   System.out.print("1/"+i);
	    	   if (i<n)
	    		   System.out.print("+");
	       }
	}
}

