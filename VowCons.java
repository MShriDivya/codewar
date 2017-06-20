 import java.util.*;
import java.lang.*;
import java.io.*;
    public class VowCons

    {

        public static void main(String[] args) throws Exception 

        {

            char n;
            Scanner s=new Scanner(System.in);
          

            System.out.print("Enter the character you want to check:");
            n=s.next().charAt(0);
            
            switch(n)

            {

                case 'a':

                System.out.println("The  character "+n+" is vowel");

                break;

     

                case 'e':

                System.out.println("The  character "+n+" is vowel");

                break;

     

                case 'i':

                System.out.println("The character "+n+" is vowel");

                break;

     

                case 'o':

                System.out.println("The  character "+n+" is vowel");

                break;

     

                case 'u':

                System.out.println("The  character "+n+" is vowel");

                break;

     

                default:

                System.out.println("The  character "+n+" is consonant");

                break;

            }

        }

    }
