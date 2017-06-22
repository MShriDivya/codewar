import java.lang.*;
import java.io.*;
import java.util.*;

class Reverse
{
    public static void main(String[] args)
    {
        String input = "Godwillbewatching";
        byte [] str = input.getBytes();
        byte [] result = new byte [str.length];
 
         for (int i = 0; i<str.length; i++)
            result[i] =str[str.length-i-1];
         System.out.println(new String(result));
    }
}
