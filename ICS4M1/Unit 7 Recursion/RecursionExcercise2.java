import java.util.*;
import java.io.*;
public class RecursionExcercise2
{
  public static void main ( String[] args)throws IOException
  {
    BufferedReader rabbits = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.println(" How many months have passed by? ");
    int months = Integer.parseInt( rabbits.readLine());
    int alive=fib(months);
    int dead=0;
    
    
    int total= alive-dead;
    System.out.println("Rabbits: " + total); 
  }
  static int fib(int n)
  {
    if(n==1)
    {
      return 1;
    }
    else if (n==2)
    {
      return 1;
    }
    else if(n==3)
    {
      return fib(n-1)+fib(n-2); 
    }
    else if(n==4)
    {
      return fib(n-1)+fib(n-2); 
    }
    else
    {
      return fib(n-2)+fib(n-3);
    }
  }
}