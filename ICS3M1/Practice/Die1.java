public class Die1
{
  public static void main (String[] args)
  { 
    int die1;
    int die2;
    int ctr2=0;
    int ctr3=0;
    int ctr4=0;
    int ctr5=0;
    int ctr6=0;
    int ctr7=0;
    int ctr8=0;
    int ctr9=0;
    int ctr10=0;
    int ctr11=0;
    int ctr12=0;
    int sum;
      
    for (int x =1; x<=500; x++)
    {
      die1=(int)(Math.random() * 6) + 1;
      
      die2=(int)(Math.random() * 6) + 1;
      
      sum = die1+ die2;  
      {
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
        
        else if (sum==7)
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
    }
    System.out.println( "2's = "+ ctr2 + " times");
    System.out.println( "3's = "+ ctr3 + " times");
    System.out.println( "4's = "+ ctr4 + " times");
    System.out.println( "5's = "+ ctr5 + " times");
    System.out.println( "6's = "+ ctr6 + " times");
    System.out.println( "7's = "+ ctr7 + " times");
    System.out.println( "8's = "+ ctr8 + " times");
    System.out.println( "9's = "+ ctr9 + " times");
    System.out.println( "10's = "+ ctr10 + " times");
    System.out.println( "11's = "+ ctr11 + " times");
    System.out.println( "12's = "+ ctr12 + " times");
  }
}