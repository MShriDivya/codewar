import java.util.Scanner;
public class Noofdigits
{
public static void main(String[] args) throws java.lang.Exception
{
 int n,a=0;
 
 Scanner s=new Scanner(System.in);
System.out.println("Enter any number : ");
 n = s.nextInt();

while(n>0)
{
n=n/10;
a++;
}
System.out.println("Number of Digits in given number is: "+a);
}
}
