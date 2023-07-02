package Assignment4;

import java.util.Scanner;

public class Q3CheckPalindrome {
	public static boolean palindrome(int num)
	{
		int rev=0;
		int temp=num;
		while(num>0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;			
		}
		if(rev==temp)
		{
			return true;
		}
				return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number for check palindrome Or not");
		int n=sc.nextInt();
		boolean result=palindrome(n);
		if(result)
		{
			System.out.println(n+" is palindrome");
		}
		else
		{
			System.out.println(n+" is not palindrome");
		}

	}

}
