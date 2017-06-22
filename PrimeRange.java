import java.util.Scanner;
public class PrimeRange
{
    public static void main(String args[])
    {
         int ll, ul, s3, flag = 0, i, j;
         Scanner s = new Scanner(System.in);
         System.out.println ("Enter the lower limit :"); 
         ll = s.nextInt();
         System.out.println ("Enter the upper limit :"); 
         ul = s.nextInt();
         System.out.println ("The prime numbers  are :");
         for(i = ll; i <= ul; i++)
         {
             for( j = 2; j < i; j++)
             {
                 if(i % j == 0)
                 {
                     flag = -1;
                     break;
                 }
                 else
                 {
                     flag = 0;
                    

                 }
                 
             }
             if(flag ==0)
             {
            	 System.out.println(i);
             }
            
            
         }
    }
}
