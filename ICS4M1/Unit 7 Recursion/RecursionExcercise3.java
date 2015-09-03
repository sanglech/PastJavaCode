import java.util.*;
import java.io.*;
public class RecursionExcercise3
{
  public static void main ( String[] args)throws IOException
  {
    BufferedReader num = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Enter the First Integer ");
    int number1 = Integer.parseInt( num.readLine());
    
    System.out.println("Enter the Second Integer ");
    int number2 = Integer.parseInt( num.readLine());
    
    int gdc=GDC(number1,number2);
    System.out.println(gdc + " is the GDC" ); 
  }
  
 static int GDC( int n1,int n2 )
  {
    if(n2%n1==0)
    {
      return n1;
    }
    else if (n1%n2==0)
    {
      return n2;
    }
    else{
      return GDC(n2,n1-1);
    }
  }
}