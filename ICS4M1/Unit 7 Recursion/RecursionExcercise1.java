import java.util.*;
import java.io.*;
public class RecursionExcercise1
{
  public static void main ( String[] args)throws IOException
  {
    BufferedReader hand = new BufferedReader (new InputStreamReader (System.in));
    System.out.println(" Enter a number");
    int argument = Integer.parseInt( hand.readLine()); // Get argument from the command line
    int d = argument-1;
    Calculate calc = new Calculate();
    boolean result = calc.Prime( argument, d);
    System.out.println("Prime(" + argument + ") is a Prime number" ); 
  }
}

class Calculate
{
  public boolean Prime( int N,int d )
  {
    if(d==1)
    {
      return true;
    }
    else if (N%d==0)
    {
      return false;
    }
    else{
      return Prime(N,d-1);
    }
  }
}