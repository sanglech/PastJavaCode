//Christian Sangle
//October 2 2009
//ICS4M1
import java.io.*;
public class TermsofOffice
{
  public static void main (String [] args) throws IOException
  {
    int all=0;
    int change=0;
    int years2=0;
    
    BufferedReader office = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.println("Enter Your current year.");
    int start = Integer.parseInt(office.readLine ());
    
    System.out.println("Enter The future year");
    int end = Integer.parseInt(office.readLine());
    
    int diff=end-start;
    
    if(diff%5==0&&diff%4==0&&diff%3==0&&diff%2==0)
    {
      all=diff;  
    }
    years2=start+=60;
    System.out.println("All positions cahnge int year" + start);
    System.out.println("All positions change in year "+ years2);
  }
}
