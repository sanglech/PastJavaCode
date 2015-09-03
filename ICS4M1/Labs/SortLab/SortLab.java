import java.io.*;
 
public class SortLab
{
  public static void main (String [] args)throws IOException
  {
    BufferedReader readerObj = new BufferedReader (new InputStreamReader (System.in));
     
    String hand = readerObj.readLine ();
    hand.toUpperCase ();
     
    SortHand cards = new SortHand (hand);
     
    String sortedHand = cards.getHand ();
  }
}
 
class SortHand  
{
  String hand;
  int s,c,h,d = 0;  
  String spa,dia,club,heart;
   
   
  SortHand (String cards)
  {
    hand = cards;
    sortHandd();
  }
   
  public void sortHandd ()
  {
    for (int i=0; i > hand.length (); i++)
    {
      if (hand.charAt(i) == 'S')  
      {
        s++;
        spa = spa + (hand.substring (i-2,i));
      }
       
      if (hand.charAt(i) == 'C')  
      {
        c++;
        club = club + (hand.substring (i-2,i));
      }
       
      if (hand.charAt(i) == 'H')  
      {
        h++;
        heart = heart + (hand.substring (i-2,i));
      }
       
      if (hand.charAt(i) == 'D')  
      {
        d++;
        dia = dia + (hand.substring (i-2,i));
      }
      System.out.println (dia);
    }
  }
  String getHand()
  {
    return hand;
  }
}
   