import java.util.*;
class numberofdigit
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int s=0;
		int k = sc.nextInt();
		while(k!=0)
		{
			s++;
			k=k/10;
		}
		System.out.println(s);
}
}