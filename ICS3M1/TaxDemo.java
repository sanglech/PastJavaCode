public class TaxDemo
{
  public static void main(String[] args)
  {
    System.out.println("What is your yearly income ? ");
    double income = ReadLib.readDouble();
    
    System.out.println("What is your housing cost ? ");
    double houseCost = ReadLib.readDouble();
    
    System.out.println("How many children do you have ? ");
    double totalChildren = ReadLib.readDouble();
    double schoolChildren = 0;
    if (totalChildren >= 1)
    {
      System.out.println("How many are in School ? ");
      schoolChildren = ReadLib.readDouble();
    }
    double incomeTax = 0;
    double reducedIncome = 0;
    double refund = 0;
    double taxRate = 0.18;
    if ( income > 10000) 
    {
      if ( houseCost < 8000 )
      {
        reducedIncome = income - 10000;
        incomeTax = reducedIncome*taxRate;
      }
      else if ( houseCost >= 8000 )
      {
        incomeTax = income*taxRate;
      }
    }
    else if ( income <= 10000 )
    {
      if ( houseCost < 8000 )
      {
        
        incomeTax = 0;
      }
      else if ( houseCost >= 8000 )
      {
        incomeTax = income*taxRate;
      }
    }
    
    if ( totalChildren >= 1 )
    {
      
      refund -= 500*totalChildren;
      refund -= 500*schoolChildren;
      if ( (incomeTax + refund) < 0)
      {
        if (houseCost <= 6000 && totalChildren >= 2 && schoolChildren >= 1)
        {
          incomeTax += refund;
        }
        else if ( houseCost > 6000 || totalChildren < 2 || schoolChildren < 1 )
        {
          incomeTax = 0;
        }
      }
      else if ( (incomeTax + refund ) >= 0 )
      {
        incomeTax += refund;
      }
    }
    if ( incomeTax > 2000 )
    {
      incomeTax = incomeTax + (incomeTax*taxRate);
      
    }
    if ( incomeTax > 0 )
    {
      System.out.println("You owe the government "+incomeTax+" amount of dollars for Income Tax");
    }
    else if ( incomeTax < 0 )
    {
      incomeTax *= -1;
      System.out.println("Congratulations you get a Refund of "+incomeTax+" dollars ");
      
    }
    else if (incomeTax == 0)
    {
      System.out.println("Guess what you don't owe the government anything, but the government isn't going to give you any refunds either!");
    }
    
  }
}