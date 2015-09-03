public class Dice
{ 
  public static void main (String[] args)
  {
    int rolls = 0;
    int die2 ;
    int die1 = (int)(Math.random() * 6) + 1; 
    
    die2 =(int)(Math.random() * 6) + 1;
    while ( die1!=die2 )
    {
      die2 =(int)(Math.random() * 6) + 1;
    rolls++;
    }
  
    
  System.out.println(" It will take " + rolls +" roll(s)");
  }
} 