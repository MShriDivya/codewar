import java.lang.*;
import java.io.*;
import java.util.*;

class Factorial
{
    public static void main(String[] args)
    {
    	int f=1;
    	int a;
   	 Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        a=s.nextInt();
        for(int i=1;i<=a;i++)
        {
        f= f*i;
       
        }
        System.out.println("factorial "  +f);
      }
}
