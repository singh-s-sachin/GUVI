import java.util.*;
class integer
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int k = sc.nextInt();
		if(k>0)
			System.out.println("Positive");
		else 
			if(k<0)
				System.out.println("Negative");
			else
				System.out.println("Zero");
	}
}