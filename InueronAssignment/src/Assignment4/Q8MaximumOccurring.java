
//8. WAP to find the maximum occurring character in a String
package Assignment4;
import java.util.*;
public class Q8MaximumOccurring {

	
	public static char getMaximumOccurring(String str)
	{
		int asci=256;
		int count[]=new int[256];
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;	
		}
		int max=-1;
		char result=' ';
		for(int i=0;i<str.length();i++)
		{
			if(max<count[str.charAt(i)])
			{
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		return result;
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word or string");
		String str=sc.nextLine();
		
		char result=getMaximumOccurring(str);
		System.out.print(result +"   is maximum occurring character");

	}

}
