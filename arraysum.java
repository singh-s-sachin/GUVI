import java.util.*;
class arraysum
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int s=0;
		int k = sc.nextInt();
		int l= sc.nextInt();
		if(k>=l)
		{
		int n[]=new int[k];
		for(int i=0; i<k; i++)
		{
			n[i]= sc.nextInt();
		}
		for(int i=0; i<l; i++)
			s+=n[i];
			System.out.println(s);
		}
		else
			System.out.println("Invalid");
	
}
}
