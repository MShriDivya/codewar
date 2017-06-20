 import java.util.*;
import java.lang.*;
import java.io.*;
    public class Large

    {

        public static void main(String[] args) throws Exception 

        {

            int a;
            int b;
            int c;
            Scanner s=new Scanner(System.in);
            System.out.println("enter 3 numbers");
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            if(b>a)
            {
            	if(b>c)
            	{
            		System.out.println("b is larger "+b);
            	}
            	else
            	{
            		System.out.println("c is larger "+c);
            	}
            }
            else
            {
            	System.out.println("a is larger "+a);
            	
            }
            

           

        }

    }
