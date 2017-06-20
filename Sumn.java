import java.util.Scanner;

public class Test
{
    public static void main(String args[])
    {
        int i, n, sum=0, num;
        Scanner scan = new Scanner(System.in);
		
        System.out.print(" count of numbers to add? ");
        n = scan.nextInt();
		
        System.out.print("Enter " +n+ " numbers : ");
        for(i=0; i<n; i++)
        {
            num = scan.nextInt();
            sum = sum + num;
        }
		
        System.out.print("Sum of all " +n+ " numbers is " +sum);
    }
}
