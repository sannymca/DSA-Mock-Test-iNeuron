
//6. WAP to implement Pangram Checking with least inbuilt methods being used.

package Assignment4;
import java.util.*;
public class Q6PangramCheck {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	System.out.println("Enter String for check Panagram or Not");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	str=str.toUpperCase();
	str=str.replace(" ","");
	
	char ch[]=str.toCharArray();
	int size=ch.length;
	int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int i=0;
	while(i!=size)
	{
		int index=ch[i]-65;
		a[index]=1;
		++i;
	}
	i=0;
	while(i!=26)
	{
		if(a[i]==1)
		{
		i++;
		}
		else
		{
			System.out.println("Non-Panagram");
			System.exit(0);
				
		}
	}
	System.out.println("Panagram");

	}

}
