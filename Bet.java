 import java.util.*;
import java.lang.*;
import java.io.*;
    public class Bet

    {

        public static void main(String[] args) throws Exception 

        {

            char ch;
            Scanner s=new Scanner(System.in);
          

            System.out.print("Enter the character you want to check:");
            ch=s.next().charAt(0);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) 
            {
            	System.out.println("the character "+ch+" is alphabet");
            }
            else
            {
            	System.out.print("the character "+ch+" is not an alphabet");
            }
           

        }

    }
