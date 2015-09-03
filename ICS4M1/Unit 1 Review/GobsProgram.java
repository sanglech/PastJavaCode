import java.io.*;
public class GobsProgram
{
  public static void main (String [] args)throws IOException
  {
    BufferedReader ask = new BufferedReader (new InputStreamReader (System.in));
    System.out.println(" Would you Like to run Gob's program? Y/N ");
    
     String answer = (ask.readLine());
     int i=1;
     if(answer.equals("y"))
     {
       while(i>0)
       {
         System.out.print("penus");
       }
     }
     else
     {
      System.out.println(" Are You sure?");
      String m = (ask.readLine());
     }
  }
}
       