import java.util.*;
class IsAlpha
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		char k = sc.next().charAt(0);
		int t= k;
		if(((t>=65)&&(t<=90))||((t>=97)&&(t<=122)))
		{
			System.out.println("Alphabet");
		}
		else
		System.out.println("No");
		}
}