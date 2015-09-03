import java.util.*;
import java.io.*;
public class Test
{
  public static void main (String [] args)throws IOException
  {
    BufferedReader hand = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.println(" Please Enter your Hand ");//User enters their hand.
    String cards= hand.readLine();    
    Check hand2= new Check(cards);
    cards=hand2.checkHand();
    System.out.println(cards); 
  }
}
//4C3C6CTSTHAD2S8DACQHKS2D4H
class Check //Checks the hand if it is legal.
{
  private String card2="";
  
  Check(String c)throws IOException
  {
    card2=c;
    checkHand();
  }
  public String checkHand() throws IOException
  {
    BufferedReader hand = new BufferedReader (new InputStreamReader (System.in));  
    if(card2.length()!=26)
    {
      System.out.println("Try Again");
    System.out.println(" Please Enter your Hand ");
    card2= hand.readLine(); 
      return checkHand();
    }
    else
    {
      return card2;
    }
  }
}