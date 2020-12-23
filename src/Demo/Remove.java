package Demo;

import java.util.Scanner;

public class Remove 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string ");
String s=sc.nextLine();
for(int i=0;i<=s.length()-1;i++)
{
	if (s.charAt(i)==' ')
	{
		
	}
	else
	{
		System.out.print(s.charAt(i));
	}
}
}
}
