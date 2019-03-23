import java.util.*;
class vowel
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		char k = sc.next().charAt(0);
		int t= k;
		if(((t>=65)&&(t<=90))||((t>=97)&&(t<=122)))
		{
		if((k=='a')||(k=='e')||(k=='i')||(k=='o')||(k=='u')||(k=='A')||(k=='E')||(k=='I')||(k=='O')||(k=='U'))
			System.out.println("Vowel");
		else 
			System.out.println("Consonant");
	}
	else
		System.out.println("Invalid");
	}
}