
//5. WAP to implement Anagram Checking least inbuilt methods being used.

package Assignment4;
import java.util.*;
public class Q5AnagramCheck {

	
	
	public static boolean  isboolean(String str,String str1)
	{
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		if(str.length()!=str1.length())
		{
			return false;
			
		}
		else
		{
			char ch[]=str.toCharArray();
			 char ch1[]=str1.toCharArray();
			 Arrays.sort(ch);
			 Arrays.sort(ch1);
			 for(int i=0;i<ch.length;i++)
			 {
				if(ch[i]!=ch1[i])
				{
					return false;
				}
			 }
			 
			 
		}
		return true;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	System.out.println("Entput first String");
	Scanner sc=new Scanner(System .in);
			String str=sc.nextLine();
			System.out.println("Enter second String");
			String str1=sc.nextLine();
			str=str.toLowerCase();
			str1=str1.toLowerCase();
			if(isboolean(str,str1))
			{
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("String is not anagram");
			}
			
		

	}
	

}
