import java.io.*;
import java.util.Scanner;
public class Mul
{
 public static void main(String[] args)
 {
	 int a,k;
     Scanner s=new Scanner(System.in);
     System.out.println("enter number");
     a=s.nextInt();
     for(int i=1;i<=10;i++)
     {
    	 k=i*a;
    	 System.out.println(k);
     }
		
}
}
