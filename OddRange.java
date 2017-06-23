import java.util.Scanner;
class OddRange
{
   public static void main(String args[])
   {		
	   int ll, ul,i;
       Scanner s = new Scanner(System.in);
       System.out.println ("Enter the lower limit :"); 
       ll = s.nextInt();
       System.out.println ("Enter the upper limit :"); 
       ul = s.nextInt();
       System.out.println ("The odd numbers  are :");
      for(i=ll;i<=ul;i++)
      {    
    	  if(i%2!=0)
    	  
    		  System.out.println(i);
    		 
    	  
    	 
      }
          
          

   }
}
