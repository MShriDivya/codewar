
import java.util.*;
import java.lang.*;
import java.io.*;
class Leap
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a;
	 Scanner s=new Scanner(System.in);
     System.out.println("enter year");
     a=s.nextInt();
		
	if(a%4==0)
			System.out.println("Leap Year:"+a);
	else
		System.out.println("not a leap year"+a);
		
		
	
	
	}
}
