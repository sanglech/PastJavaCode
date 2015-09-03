//Christian Sangle
//ICS4M1
//Nov 24 2009
import java.util.*;
import java.io.*;

abstract class Card
{
  protected String hand="";
  protected String clubs="";
  protected String hearts="";
  protected String diams="";
  protected String spades="";
}
public class DemoSortLab
{
  public static void main (String [] args)throws IOException
  {
    boolean playAgain=false;
    while(playAgain!=true)//Will allow the user if they want to enter another hand.
    {
      BufferedReader hand = new BufferedReader (new InputStreamReader (System.in));
      
      System.out.println(" Please Enter your Hand ");//User enters their hand.
      String cards= hand.readLine();    
      
      Check hand2= new Check(cards);
      cards=hand2.checkHand();
      
      Sort cards2=new Sort(cards);
      
      String spadeCard=cards2.getSpades();
      String clubCard=cards2.getClubs();
      String diamsCard= cards2.getDiams();
      String heartCard= cards2.getHearts();
      
      SortHand card4=new SortHand(cards,spadeCard,heartCard,diamsCard,clubCard);
      
      Points card3= new Points(cards,spadeCard,heartCard,diamsCard,clubCard);   
      int points=card3.getPoints();
      
      System.out.println("");  
      System.out.println("Points: "+ points);
      
      System.out.println("Would you like to Enter Another Hand? Y/N ");
      String play= hand.readLine();
      if(play.equals("Y"))
      {
        playAgain=false;
      }
      else
      {
        playAgain=true;
        System.out.println("Thank you for playing Bridge!");
      }
    }
  }
}
//4DTCKC5H7CQSAH4H6SJHAC9H2H
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
    if(card2.length()!=26)//If the hand is not 26 cards then it asks them to enter a proper hand.
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
class Sort extends Card//Sorts the hand into their respective suits and puts it into a String.
{
  Sort(String ca)
  {
    hand=ca;
    sorting();
  }
  public void sorting()
  {
    for(int i=0;i<hand.length();i++)
    {
      if(hand.charAt(i)=='S')
      {
        spades+= hand.charAt(i-1);
      }
      if(hand.charAt(i)=='H')
      {
        hearts+= hand.charAt(i-1);
      }
      if(hand.charAt(i)=='D')
      {
        diams+= hand.charAt(i-1) ;
      }
      if(hand.charAt(i)=='C')
      {
        clubs+= hand.charAt(i-1);
      }      
    }
  }
  String getClubs()
  {
    return clubs;
  }
  String getDiams()
  {
    return diams;
  }
  String getHearts()
  {
    return hearts;
  }
  String getSpades()
  {
    return spades;
  }
}
class Points extends Card//Calculates the points of the hand
{
  int points=0;
  
  Points(String ca,String s, String h, String d, String c)
  {
    hand=ca;
    clubs=c;
    hearts=h;
    diams=d;
    spades=s;
    calc();
    cardCount();
  }
  public void calc()//Calculates the points on the card
  {
    for(int i=0; i<hand.length();i++)
    {
      if(hand.charAt(i)=='A')
      {
        points+=4;
      }   
      else if(hand.charAt(i)=='K')
      {
        points+=3;
      }
      else if(hand.charAt(i)=='Q')
      {
        points+=2;
      }
      else if(hand.charAt(i)=='J')
      {
        points+=1;
      }
    }
  }
  public void cardCount()//Checks for special points. Doubleton, Singleton, or void.
  {
    if(spades.length()==2)
    {
      points+=1;
    }
    else if(spades.length()==1)
    {
      points+=2;
    }
    else if(spades.length()==0)
    {
      points+=3;
    }
    if(diams.length()==2)
    {
      points+=1;
    }
    else if(diams.length()==1)
    {
      points+=2;
    }
    else if(diams.length()==0)
    {
      points+=3;
    }
    if(hearts.length()==2)
    {
      points+=1;
    }
    else if(hearts.length()==1)
    {
      points+=2;
    }
    else if(hearts.length()==0)
    {
      points+=3;
    }   
    if(clubs.length()==2)
    {
      points+=1;
    }
    else if(clubs.length()==1)
    {
      points+=2;
    }
    else if(clubs.length()==0)
    {
      points+=3;
    }
  }
  int getPoints()
  {
    return points;
  }
}
class SortHand extends Points  //Puts the suit of cards into their own seperate array and Sorts it.
{
  int sp=spades.length();
  int dm= diams.length();
  int cl=clubs.length();
  int he=hearts.length();
  
  String spadeArray [] = new String [sp]; //String array for each suit.
  String diamsArray [] = new String [dm]; 
  String clubsArray [] = new String [cl];
  String heartsArray [] = new String [he];
  
  int itemToInsert;
  int index=0;
  
  SortHand(String ca,String c, String d, String h, String s)throws IOException
  {
    super( ca,c,d,h,s);//Uses the same values in points
    calcSort();
    insertionSort();
  }
  public void calcSort()//Puts each string value of each suit and put it into a string array
  {
    for (int i=0;i<spadeArray.length;i++)
    {
      spadeArray[i]=spades.substring(i,i+1);
    }
    for(int i=0;i<diamsArray.length;i++)
    {
      diamsArray[i]=diams.substring(i,i+1);
    }    
    for(int i=0;i<clubsArray.length;i++)
    {
      clubsArray[i]=clubs.substring(i,i+1);
    }   
    for(int i=0;i<heartsArray.length;i++)
    {
      heartsArray[i]=hearts.substring(i,i+1);
    }
  }
  public void insertionSort()throws IOException//puts cards in order in decreasing point value
  {
    int h[]= new int [heartsArray.length];//Int array for each suit.
    int s[]=new int[spadeArray.length];   //Int array is for easy comparisons.
    int c[]=new int[clubsArray.length];
    int d[]=new int[diamsArray.length];
    
    for(int i=0;i<h.length;i++)//Sort for Hearts.
    {
      if(heartsArray[i].equals("A"))//Assigns a value to A, K,Q,J,T, plus the numbers
      {
        h[i]=14; //Sets a high number for A, so it can be the first card after the sort.
      }
      else if(heartsArray[i].equals("K"))
      {
        h[i]=13;
      }
      else if(heartsArray[i].equals("Q"))
      {
        h[i]=12;
      }
      else if(heartsArray[i].equals("J"))
      {
        h[i]=11;
      }
      else if(heartsArray[i].equals("T"))
      {
        h[i]=10;
      }
      else
      {
        h[i]=Integer.parseInt(heartsArray[i]);
      }
    }
    
    for(int i = 0; i < h.length; i++) //Insertion Sort
    {   
      itemToInsert = h[i];
      index=i;
      
      while((index >= 1) && (itemToInsert > h[index -1])) 
      {
        h[index] = h[index - 1];
        index--;
      }
      h[index] =  itemToInsert;
    }
    
    for(int x=0; x<h.length;x++)//Converts from the int array to the string array.
    {
      if(h[x]==14)//When it sees the number previously set for A, it convets it back to A.
      {
        heartsArray[x]="A";
      }
      else if(h[x]==13)
      {
        heartsArray[x]="K";
      }
      else if(h[x]==12)
      {
        heartsArray[x]="Q";
      }
      else if(h[x]==11)
      {
        heartsArray[x]="J";
      }
      else
      {
        heartsArray[x]=Integer.toString(h[x]);;
      }
    }
    //Spades Hand sort.
    for(int i=0;i<s.length;i++)
    {
      if(spadeArray[i].equals("A"))
      {
        s[i]=14;
      }
      else if(spadeArray[i].equals("K"))
      {
        s[i]=13;
      }
      else if(spadeArray[i].equals("Q"))
      {
        s[i]=12;
      }
      else if(spadeArray[i].equals("J"))
      {
        s[i]=11;
      }
      else if(spadeArray[i].equals("T"))
      {
        s[i]=10;
      }
      else
      {
        s[i]=Integer.parseInt(spadeArray[i]);
      }
    }
    
    for(int i = 0; i < s.length; i++) //Spades Hand insertion sort.
    {   
      itemToInsert = s[i];
      index=i;
      
      while((index >= 1) && (itemToInsert > s[index -1]))
      {
        s[index] = s[index - 1];
        index--;
      }
      s[index] =  itemToInsert;
    }
    
    for(int x=0; x<s.length;x++)
    {
      if(s[x]==14)
      {
        spadeArray[x]="A";
      }
      else if(s[x]==13)
      {
        spadeArray[x]="K";
      }
      else if(s[x]==12)
      {
        spadeArray[x]="Q";
      }
      else if(s[x]==11)
      {
        spadeArray[x]="J";
      }
      else
      {
        spadeArray[x]=Integer.toString(s[x]);;
      }
    }
    //Diamonds Hand Sort.
    for(int i=0;i<d.length;i++)
    {
      if(diamsArray[i].equals("A"))
      {
        d[i]=14;
      }
      else if(diamsArray[i].equals("K"))
      {
        d[i]=13;
      }
      else if(diamsArray[i].equals("Q"))
      {
        d[i]=12;
      }
      else if(diamsArray[i].equals("J"))
      {
        d[i]=11;
      }
      else if(diamsArray[i].equals("T"))
      {
        d[i]=10;
      }
      else
      {
        d[i]=Integer.parseInt(diamsArray[i]);
      }
    }
    
    for(int i = 0; i < d.length; i++)
    {   
      itemToInsert = d[i];
      index=i;
      
      while((index >= 1) && (itemToInsert > d[index -1]))
      {
        d[index] = d[index - 1];
        index--;
      }
      d[index] =  itemToInsert;
    }
    
    for(int x=0; x<d.length;x++)
    {
      if(d[x]==14)
      {
        diamsArray[x]="A";
      }
      else if(d[x]==13)
      {
        diamsArray[x]="K";
      }
      else if(d[x]==12)
      {
        diamsArray[x]="Q";
      }
      else if(d[x]==11)
      {
        diamsArray[x]="J";
      }
      else
      {
        diamsArray[x]=Integer.toString(d[x]);;
      }
    }
    //Clubs Handsort
    for(int i=0;i<c.length;i++)
    {
      if(clubsArray[i].equals("A"))
      {
        c[i]=14;
      }
      else if(clubsArray[i].equals("K"))
      {
        c[i]=13;
      }
      else if(clubsArray[i].equals("Q"))
      {
        c[i]=12;
      }
      else if(clubsArray[i].equals("J"))
      {
        c[i]=11;
      }
      else if(clubsArray[i].equals("T"))
      {
        c[i]=10;
      }
      else
      {
        c[i]=Integer.parseInt(clubsArray[i]);
      }
    }
    
    for(int i = 0; i < c.length; i++)
    {   
      itemToInsert = c[i];
      index=i;
      
      while((index >= 1) && (itemToInsert > c[index -1]))
      {
        c[index] = c[index - 1];
        index--;
      }
      c[index] =  itemToInsert;
    }
    
    for(int x=0; x<c.length;x++)
    {
      if(c[x]==14)
      {
        clubsArray[x]="A";
      }
      else if(c[x]==13)
      {
        clubsArray[x]="K";
      }
      else if(c[x]==12)
      {
        clubsArray[x]="Q";
      }
      else if(c[x]==11)
      {
        clubsArray[x]="J";
      }
      else
      {
        clubsArray[x]=Integer.toString(c[x]);;
      }
    }   
    //Prints the hand at the end.
    System.out.print("Spades: ");
    
    for(int i=0;i<spadeArray.length;i++)
    {
      System.out.print(spadeArray[i]+" ");
    }
    System.out.println(" ");
    System.out.print("Hearts: ");
    
    for(int i=0;i<heartsArray.length;i++)
    {
      System.out.print(heartsArray[i]+" ");
    }
    System.out.println("");
    System.out.print("Diamonds: ");
    
    for(int i=0;i<diamsArray.length;i++)
    {
      System.out.print(diamsArray[i]+" ");
    }
    System.out.println("");
    System.out.print("Clubs: ");
    
    for(int i=0;i<clubsArray.length;i++)
    {
      System.out.print(clubsArray[i]+" ");
    }
  }
}