import java.util.*;
import java.lang.*;
import java.io.*;
public class Pnz {
    public static void main(String[] args) 

    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println("The number "+n+" is Positive");
        }
        else if(n < 0)
        {
            System.out.println("The number "+n+" is Negative");
        }
        else
        {
            System.out.println("The  number "+n+" is Zero ");
        }
    }
}
