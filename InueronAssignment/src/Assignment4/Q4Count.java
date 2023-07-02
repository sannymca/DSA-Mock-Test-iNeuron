package Assignment4;

import java.util.Scanner;

public class Q4Count {

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stu
		        int vowel=0,cons=0,sp=0,special=0,n=0;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter  String ");
		            String s=sc.nextLine();
		            String str=s.toLowerCase();
		            char ch ;
		     
		     for(int i=0;i<s.length();i++)
		     {
		        ch=str.charAt(i);
		        if(ch>='a'&&ch<='z')
		        {
		        
		         if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u')

		             vowel++;    
		         else 
		            cons++;
		        }
		        else if(ch==' ')
		        {
		          sp++;
		        }
		        else if(ch>=0 && ch<=10)
		        {
		            n++;
		        }
		        else
		        {
		        special++;
		        }
		     }
		     System.out.println(str);
		     System.out.println("number of  vowel="+vowel);
		    System.out.println("number of Constatnt="+cons);
		    System.out.println("number of special chracter="+special);
		    }
		

	}
