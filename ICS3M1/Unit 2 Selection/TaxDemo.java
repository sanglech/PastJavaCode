public class TaxDemo
{ 
  public static void main (String[] args)
  
  { System.out.println ( " Enter your income ");
    int income = ReadLib.readInt();
    
    System.out.println ( "Enter your housing cost ");
    int houseCost = ReadLib.readInt();
    
    System.out.println ( "Enter how many childern you have");
    int totalChildern = ReadLib.readInt();
    
    System.out.println ( "Enter how many childern you have going to school");
    int schoolChildern = ReadLib.readInt();
    
    double richIncome ;
    double mainTax = 0.18;
    double poorIncome ;
    int childTax ;
    int schoolTax ;
    double finalIncome ;
    double finalzIncome ;
    
    if (houseCost <= 8000)
    {
      poorIncome = (income - 10000) * mainTax;
    }
    else { poorIncome = 0;
    }
    
    if (houseCost > 8000)
    {
      richIncome = (income) * mainTax;
    }
    else {
      richIncome = 0;
    }
  if (6000 > houseCost && totalChildern >= 2 && schoolChildern >= 1)
    {
      childTax = (totalChildern - schoolChildern) * 500;
      schoolTax =  schoolChildern * 1000;
    }
  else {
    childTax = 0;
    schoolTax = 0;
  }
  
    if (richIncome + childTax + schoolTax <= 2000)
      
    {
      finalIncome = (richIncome + childTax + schoolTax) *0.18;
    }
    else { finalIncome = 0;
    }
    System.out.println ("You wil pay " + finalIncome);
    
    if (poorIncome + childTax + schoolTax <= 2000)
    {
      finalzIncome= (poorIncome + childTax + schoolTax)* 0.18;
    }
    {finalzIncome = 0;
    }
    System.out.println (" You wil pay " + finalzIncome);
  }
}


