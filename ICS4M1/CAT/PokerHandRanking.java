//Christian Sangle
//My Program uses MultiDimensional Arrays,Recursion, Search and Sort, and Inheritance.
//ICS4M1
//Jan 21 2009
import java.util.*;
import java.io.*;

abstract class Cards //Abstract class, Hold most of my variables which get inherited by other classes.
{
  protected String hand1="";
  protected int ctrClubs=0;
  protected int ctrSpades=0;
  protected int ctrHearts=0;
  protected int ctrDiams=0;
  protected int[][] array;
  protected int score =0;
  protected int rank=0;
  protected int temp;
}

public class PokerHandRanking extends Cards
{
  public static void main (String [] args)throws IOException
  {
    String command="";
    while(!command.equals("Fold"))
    {
      BufferedReader poker = new BufferedReader (new InputStreamReader (System.in));
      System.out.println(" Please Enter the First Hand.T=10. No Dashes Please.");//User enters their hand.
      String handOne= poker.readLine();  
      Check cardsOne= new Check(handOne);
      handOne=cardsOne.checkHand();   
      Insert help = new Insert(handOne);
      
      int lol[][]=help.array();
      
      for(int x=0;x<1;x++)
      {
        for (int i = 0 ; i < lol.length ; i++)
        {
          int swapIndex = findSmall (lol, i);
          int temp = lol [x][i]; 
          lol [x][i] = lol [x][swapIndex];
          lol[x] [swapIndex] = temp; 
        }
      }
      Rank first = new Rank(lol);   
      int firstRank=first.getRank();
      
      System.out.println(" PLease Enter the Second Hand.T=10.No Dashes Please.");//User enters the second hand.
      String handTwo= poker.readLine();  
      
      Check cardsTwo= new Check(handTwo);    
      handTwo=cardsTwo.checkHand();   
      Insert help2 = new Insert(handTwo);
      
      int lol2[][]=help2.array();
      
      for(int x=0;x<1;x++)
      {
        for (int i = 0 ; i < lol2.length ; i++)
        {
          int swapIndex2 = findSmall (lol2, i);
          int temp2 = lol2 [x][i]; 
          lol2 [x][i] = lol2 [x][swapIndex2];
          lol2[x] [swapIndex2] = temp2; 
        }
      }
      Rank second = new Rank(lol2); 
      
      int secondRank=second.getRank();
      if(firstRank>secondRank)
      {
        System.out.print("First hand: "+ handOne);
        System.out.println(" Second hand: "+ handTwo);
        System.out.println("The first hand Will Win");
        System.out.println("Enter Fold to quit");
        command=poker.readLine();
      }
      
      else if(secondRank>firstRank)
      {
        System.out.print("First hand: "+ handOne);
        System.out.println(" Second hand: "+ handTwo);
        System.out.println("The Second hand will win");
        System.out.println("Enter Fold to quit");
        command=poker.readLine();
      }
      else
      {
        System.out.print("First hand: "+ handOne);
        System.out.println(" Second hand: "+ handTwo);
        System.out.println("Split Pot");
        System.out.println("Enter Fold to quit");
        command=poker.readLine();
      }
      
    }
    System.out.println("Thanks for playing. Have a nice day!");
  }
  public static int findSmall (int b[][], int start)  //Uses Selection Sort, to Sort the hand
  {
    int indexMin = start; 
    
    for(int x=0;x<1;x++)
    {
      for (int i = start ; i < b.length ; i++)
      {           
        if (b [x][i] < b [x][indexMin])
        {
          indexMin = i;
        }
      }
    }
    return indexMin;
  }
}
class Check //Checks the hand if it is legal.
{
  private String card2="";
  
  Check(String c)throws IOException
  {
    card2=c;
    checkHand();
  }
  public String checkHand() throws IOException //Usus Recursion, because if the hand is not legal it recalls 
    //itself and tells them to enter the hand again.
  {
    BufferedReader hand = new BufferedReader (new InputStreamReader (System.in));
    
    if(card2.length()!=10) //Card length
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
class Insert extends Cards                                         //Class inhererits from the abstract class, and uses a 
  //multi dimensional array to store the values.
{
  Insert(String h)
  {
    hand1=h;
    array();
  }
  public int [][] array()
  { 
    String names [] [] = new String [hand1.length()] [hand1.length()];
    
    for (int t = 0 ; t < 1 ; t++)                              //Need 2 for loops in order to go through the 2D array
    {      
      for (int i = 0 ; i < hand1.length() ; i++)
      {     
        names [t] [i] = hand1.substring(i,i+1);
      }
    }
    int a1[][]=new int[names.length][names.length];
    for(int x=0;x<1;x++)                                      // Changes the String array into an integer array.
    {
      for(int a=0;a<names.length;a++)
      {
        if(names[x][a].equals("A"))                           // Assign a value to The Letter's.
        {
          a1[x][a]=14;
        }
        else if(names[x][a].equals("K"))
        {
          a1[x][a]=13;
        }
        else if(names[x][a].equals("Q"))
        {
          a1[x][a]=12;
        }
        else if(names[x][a].equals("J"))
        {
          a1[x][a]=11;
        }
        else if(names[x][a].equals("T"))
        {
          a1[x][a]=10;
        }
        else if(names[x][a].equals("C"))
        {
          a1[x][a]=15;
        }
        else if(names[x][a].equals("D"))
        {
          a1[x][a]=16;
        }
        else if(names[x][a].equals("H"))
        {
          a1[x][a]=17;
        }
        else if(names[x][a].equals("S"))
        {
          a1[x][a]=18;
        }
        else
        {
          a1[x][a]=Integer.parseInt(names[x][a]);
        }   
      }
    }
    return a1;
  }
}
class Rank extends Cards                                              //Inherits from the abstract class
{
  Rank(int[][]a)
  {
    array=a;
    findRank();
  }
  private void findRank()                                           //Counts how much of each suit is in their hand
  {
    for(int x=0;x<1;x++)
    {
      for(int a=0;a<array.length;a++)
      {
        int temp= array[x][a];        
        if(temp==15)
        {
          ctrClubs++;
        }
        else if(temp==16)
        {
          ctrDiams++;
        }
        else if(temp==17)
        {
          ctrHearts++;
        }
        else if(temp==18)
        {
          ctrSpades++;
        }   
      }
    }
    for(int x=0;x<1;x++)
    {
      for (int i = 0 ; i !=1 ; i++)
      {
        if(ctrClubs==5||ctrDiams==5||ctrHearts==5||ctrSpades==5)
        {
          if(array[x][i]==10&&array[x][i+1]==11&&array[x][i+2]==12&&array[x][i+3]==13&&array[x][i+4]==14)//Royal FLush
          {
            rank=10;
          }
          else if(array[x][i]==array[x][i+1]-1&&array[x][i+1]==array[x][i+2]-1&&array[x][i+3]==array[x][i+4]-1)//Straight FLush
          {
            rank =9;
          }
          else//flush
          {
            rank =6;
          }
        }
        else
        {
          if(array[x][i]==array[x][i+1]&&array[x][i]==array[x][i+2]&&array[x][i]==array[x][i+3])//4 of a kind
          {
            rank=8;
          }
          else if(array[x][i+4]==array[x][i+3]&&array[x][i+4]==array[x][i+2]&&array[x][i+4]==array[x][i+1])//4 of a kind
          {
            rank=8;
          }
          else if(array[x][i]==array[x][i+1]&&array[x][i]==array[x][i+2]&&array[x][i+3]==array[x][i+4])//ful house
          {
            rank=7;
          }
          else if(array[x][i+4]==array[x][i+3]&&array[x][i+4]==array[x][i+2]&&array[x][i]==array[x][i+1])//full house
          {
            rank=7;
          }
          else if(array[x][i]==array[x][i+1]-1&&array[x][i+1]==array[x][i+2]-1&&array[x][i+3]==array[x][i+4]-1)//Straight
          {
            rank =5;
          }
          else if(array[x][i]==array[x][i+1]&&array[x][i]==array[x][i+2])//trips
          {
            rank=4;
          }
          else if(array[x][i+4]==array[x][i+3]&&array[x][i+4]==array[x][i+2])//trips
          {
            rank=4;
          }
          else if(array[x][i+4]==array[x][i+3]&&array[x][i]==array[x][i+1])//2 pair
          {
            rank=3;
          }
          else if(array[x][i+4]==array[x][i+3]&&array[x][i+2]==array[x][i+1])//2 pair
          {
            rank=3;
          }
          else if(array[x][i]==array[x][i+1]&&array[x][i+2]==array[x][i+3])//2 pair
          {
            rank=3;
          }
          else if(array[x][i]==array[x][i+1]||array[x][i+1]==array[x][i+2]||array[x][i+2]==array[x][i+3]||array[x][i+3]==array[x][i+4])//1 pair
          {
            rank=2;
          }
          else // high card
          {
            rank=1;
          }
        }
      }
    }
  }
  public int getRank() // accesor method
  {
    return rank;
  }
}