//Christian Sangle
import java.util.*;
import java.io.*;

public class SnakesAndLadders
{
  public static void main (String [] args)throws IOException
  {
    BufferedReader dice = new BufferedReader (new InputStreamReader (System.in));
    int roll=0;
    
    for(int space=1;space<100;space+=0)
    {
      System.out.println("Enter Sum of Dice");
      roll = Integer.parseInt(dice.readLine ());
      
      if(roll<2||roll>12)
      {
        System.out.println("You Quit!");
        space+=100;
      }
      
      else if(roll>=2||roll<=12)
      {
        space+=roll;
        
        if(space>100)
        {
          space-=roll;
        }
        if(space==54)
        {
          space-=35;
        }
        else if(space==90)
        {
          space-=42;
        }
        
        else if(space==99)
        {
          space-=22;
        }
        else if(space==9)
        {
          space+=25;
        }
        else if(space==40)
        {
          space+=24;
        }
        else if(space==67)
        {
          space+=19;
        }
        else if(space==100)
        {
          System.out.println("YOU WIN!");
        }
        System.out.println("You are now on square "+space);
      }
      
    }
  }
}