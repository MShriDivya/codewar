import java.util.*;
import java.lang.*;
import java.io.*;
public class Evenodd {
    public static void main(String[] args) 

    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = s.nextInt();
        if(n%2== 0)
        {
            System.out.println("The number "+n+" is Even");
        }
        
        else
        {
            System.out.println("The  number "+n+" is Odd ");
        }
    }
}
