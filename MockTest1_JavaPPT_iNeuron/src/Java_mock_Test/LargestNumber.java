
//Write a Java program to find the largest of three numbers using nested if-else statements.
package Java_mock_Test;
import java.util.*;
public class LargestNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		
		int b=sc.nextInt();
		System.out.println("Enter Third Number");
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				
			 System.out.println(a+"is largest");
			 
			}
		}
		else if(b>c)
		{
			if(b>a)
			{
				System.out.println(b+" is largest");
			}
		}
		else
		{
			System.out.println(c+" is largest");
		}

	}

}
