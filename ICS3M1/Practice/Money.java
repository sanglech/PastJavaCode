public class Money
  
{
  public static void main (String[] args)
  {
    System.out.println (" Enter your chnage");
    int change = ReadLib.readInt();
    
    int quarter = change/25;
    int dime = (change - (25* quarter))/10;
    int nickel = (change - ( 25 * quarter) - (10 * dime))/5;
    int penny = (change - (25* quarter) - (10* dime) - (5 * nickel));
    
    if (quarter >= 1)
    { System.out.println ( "Quarter:" + quarter);
    }
    
    if ( dime >=1)
    { System.out.println ( "Dime:" + dime);
    }
    
    if ( nickel >= 1)
    { System.out.println ( "Nickel:" + nickel);
    }
    
    if ( penny >=1)
    { System.out.println ( "Penny:" + penny);
    }    
  }
}