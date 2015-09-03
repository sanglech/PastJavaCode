public class Dice2
{ 
  public static void main (String[] args)
  {
    int die2;
    int die1;
    int ctr2 = 0;
    int ctr3 = 0;
    int ctr4 = 0;
    int ctr5 = 0;
    int ctr6 = 0;
    int ctr7 = 0;
    int ctr8 = 0;
    int ctr9 = 0;
    int ctr10 = 0;
    int ctr11 = 0;
    int ctr12 = 0;
    int sum = 0;
    for (int x = 0; x<=500;x++)
    {
      
      die1 = (int)(Math.random() * 6) + 1; 
      die2 =(int)(Math.random() * 6) + 1;
      sum = die1 + die2;
      if (sum==2)
      {
        ctr2++;
      }
      else if (sum==3)
      {
        ctr3++;
      }  
      
      else if (sum==4)
      {
        ctr4++;
      }  
     else if (sum==5)
      {
        ctr5++;
      }  
    
     else if (sum==6)
      {
        ctr6++;
      }  
    
     if (sum==7)
      {
        ctr7++;
      }  
     else if (sum==8)
      {
        ctr8++;
      }  
    
     else if (sum==9)
      {
        ctr9++;
      }  
     else if (sum==10)
      {
        ctr10++;
      }  
   
      else if (sum==11)
      {
        ctr11++;
      }  
   
     else if (sum==12)
      {
        ctr12++;
      }  
    
   
    }
  System.out.println (" 2's came up " + ctr2 +" times");
      System.out.println (" 3's came up " + ctr3 +" times");
      System.out.println (" 4's came up " + ctr4 +" times");
      System.out.println (" 5's came up " + ctr5 +" times");
      System.out.println (" 6's came up " + ctr6 +" times");
      System.out.println (" 7's came up " + ctr7 +" times");
      System.out.println (" 8's came up " + ctr8 +" times");
      System.out.println (" 9's came up " + ctr9 +" times");
      System.out.println (" 10's came up " + ctr10 +" times");
      System.out.println (" 11's came up " + ctr11 +" times");
      System.out.println (" 12's came up  " + ctr12 +" times"); }
}