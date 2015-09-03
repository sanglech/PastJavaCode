//Christian Sangle
import java.io.*;
public class Calendar
{ 
  public static void main (String [] args) throws IOException
  {
    BufferedReader num = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.println("Enter day");
    int day = Integer.parseInt(num.readLine ());
    
    System.out.println("Enter the number of days in the month");
    int month = Integer.parseInt(num.readLine ());
    
    int weeks[][]=new int [5][7];
    int ctr=0;
    
    for (int t = 0; t < 5 ; t++)
    {
      System.out.print ("\n");
      for (int i=0; i < weeks[t].length ; i++)
      {
        ctr+=1;
        weeks[t][i]=ctr;
        if(day==3)
        {
          weeks[0][0]=0;
          weeks[0][1]=0;
        }
        
        System.out.print (weeks[t][i] + " \t");
      }
    }
  }
}