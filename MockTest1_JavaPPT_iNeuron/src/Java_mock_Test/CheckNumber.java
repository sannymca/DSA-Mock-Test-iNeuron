//1. Write a Java program to check whether a given number is 
//positive, negative, or zero using an if-else statement.

package Java_mock_Test;
import java.util.*;
public class CheckNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		if(num>0)
		{
			System.out.println(num+" is positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative number");
			
		}
		else 
		{
			System.out.println(num);
		}
		

	}

}
