public class ProblemSetTwo
{ 
  public static void main (String[] args)
  { 
    System.out.println (" Enter your income for a year");
    double income = ReadLib.readDouble();
    
    double taxOne = 0.17;
    double taxTwo = 0.24;
    double taxThree = 0.29;
    
    if ( income <= 120000 && income > 0 )
      
    { if (income <= 27500) 
      { double fina1 = income * taxOne;
      System.out.println (" You will owe " + fina1);
    }
    if (income >= 27500 && income <= 55000)
    {  
    double fina1z = ((income - 27500) * taxTwo) + (27500 *0.17);
     System.out.println (" You will owe " + fina1z);
    }
    if ( income > 55000)
    { 
      double finals = (income - 55000) *0.29 + (27500 * 0.17);
     System.out.println (" You will owe " + finals);
    }
    
    else
    {System.out.println ( "lolcat");
    }
    }
  }
}
  
    