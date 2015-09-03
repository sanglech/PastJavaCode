import java.util.*;
import java.io.*;
public class CuberootTest
{
  public static void main ( String[] args)throws IOException
  {
    BufferedReader num = new BufferedReader (new InputStreamReader (System.in));
    System.out.println("Enter the First Integer ");
    int number1 = Integer.parseInt( num.readLine());
    
    double E = Math.cbrt(number1);
    if(E==int)
    {
    System.out.println("THe cubroot is " + E);
  }
}
}