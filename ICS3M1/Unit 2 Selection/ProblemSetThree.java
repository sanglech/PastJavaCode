public class ProblemSetThree
{ 
  public static void main (String[] args)
  {
    System.out.println (" Enter integer one ");
    int one = ReadLib.readInt();
    
    System.out.println ( "Enter in integer two");
    int two = ReadLib.readInt();
    
    System.out.println ("Enter in Interger three");
    int three = ReadLib.readInt();
    
    if ( one > two && one > two && two > three)

    { System.out.println ( three + "," + two + ","+ one);
      }
      
    if (one > two && one > three && three > two)
      { System.out.println ( two + "," + three + ","+ one);
      }
    
 if (two > one &&  two > three && one > three)
    {
      System.out.println ( three + "," + one + ","+ two);
    }
    
      if ( two > one && two > three && three > one)
      {
        System.out.println ( one + "," + three + ","+ two);
      }
    
    else if (three > two && three > two && two >one)
    {
        System.out.println ( one + "," + two + ","+ three);
      }
    
      if (three > two && three > two && two < one)
      { System.out.println ( two + "," + one + ","+ three);
      }
    
  }
}