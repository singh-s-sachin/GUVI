import java.util.*;
class greatest
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		if((k>l)&&(k>m))
		{
			System.out.println(k);
		}
		else
		if((m>l)&&(m>k))
		{
			System.out.println(m);
		}
		else
			System.out.println(l);
		}
}