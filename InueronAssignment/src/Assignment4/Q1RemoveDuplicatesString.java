package Assignment4;
import java .util.*;

public class Q1RemoveDuplicatesString {

	public static void main(String[] args) 
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String newstr="";
		for(i=0;i<ch.length;i++)
		{
			for( j=0;j<i;j++)
			{
			   if(ch[i]==ch[j])
			  {
				break;
			  }
	    	}
			   if(i==j)
			  {
			
			   newstr=newstr+ch[i];
			    }
		}
		System.out.println(newstr);
		
	
		


	}

}
