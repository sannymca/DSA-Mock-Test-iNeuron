package Assignment4;
import java.util.*;

public class Q2DuplicatesCharacters 
{
	public static  void duplicate(String  str,int size)
	{int i,j;
		
		char newstr[]=str.toCharArray();

		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{ 
				if(newstr[i]==newstr[j])
				{			
			System.out.print(newstr[i]+",");

				}
			}
		}
	}

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Any Strnig");
	  String str= sc.nextLine();
	  int len=str.length();
	 
	  duplicate(str,len);
	 
	  
	  

	}

}
