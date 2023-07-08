package Assignment4;
//7. WAP to find if String contains all unique characters
import java.util.*;
public class Q7Uniquecharacter {

		public static  boolean isUnique(String str)
		{
			for(int i=0;i<str.length();i++)
			{int  count=0;
				for(int j=i;j<str.length();j++)
				{
					
					if(str.charAt(i)==str.charAt(j))
					{
						count++;
					}
				}
				if(count>1)
				{
					return false;
				}
			}
		
		return true;
		}
			public static void main(String[] args)
			{
				
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Any word or sentence");
			String str=sc.nextLine();
			boolean result=isUnique(str);
			if(result)
			{
				System.out.println("All character are uique");
			}
			else
			{
				System.out.println("Not unique");
			}

	}
		}


