// Christian Sangle
// ICS3M
// Feb 12 2009
public class MyFirstLab
{ 
  public static void main (String[] args)
    
  { double fed = 0.17;
    
    double prov = 0.14; 
    // Employee One salary (all other salry will have similar code; copy and paste to other employee's)
    System.out.println ("Enter Your Hours Employee One");
    double hour = ReadLib.readDouble();
    
    System.out.println ("Enter your pay per hour Empoyee One");
    double rate = ReadLib.readDouble();
    
    double pay = hour * rate; 
    
    double federal = ( pay* fed );
    
    double provin = ( pay * prov );
    
    double finalPay = pay - ( provin + federal );
    
    System.out.println ( " Your pay before taaxes is " + pay 
                          + " Your pay after federal taxes is " 
                          + federal + " Your pay after provincial is " + provin + " Your pay after taxes is " + finalPay );
    
// Employee Two's code
    System.out.println ("Enter Your Hours Employee Two");
    hour = ReadLib.readDouble();
    
    System.out.println ("Enter your pay per hour Empoyee Two");
    rate = ReadLib.readDouble();
    
    double payOne = hour * rate; // Need to change variables fro mrest of employee's
    
    double federalOne = ( payOne * fed );
    
    double provinOne = ( payOne * prov );
    
    double finalAmo = payOne - ( provinOne + federalOne );
    
    System.out.println ( " Your pay before taxes is " + payOne 
                          + " Your pay after federal taxes is " 
                          + federalOne + " Your pay after provincial is " + provinOne + " Your pay after taxes is " + finalAmo );
    // Employee Three
    System.out.println ("Enter Your Hours Employee Three ");
    hour = ReadLib.readDouble();
    
    System.out.println ("Enter your pay per hour Empoyee Three ");
    rate = ReadLib.readDouble();
    
    double payTwo = hour * rate; 
    
    double federalTwo = ( payTwo * fed );
    
    double provinTwo = ( payTwo * prov );
    
    double finalTwo = payTwo - ( provinTwo + federalTwo );
    
    System.out.println ( " Your pay before taxes is " + pay 
                          + " Your pay after federal taxes is " 
                          + federalTwo + " Your pay after provincial is " + provinTwo + " Your pay after taxes is " + finalTwo );
    // Employee Four
    System.out.println ("Enter Your Hours Employee Four ");
    hour = ReadLib.readDouble();
    
    System.out.println ("Enter your pay per hour Empoyee Four ");
    rate = ReadLib.readDouble();
    
    double payThree = hour * rate;
    
    double federalThree = ( payThree * fed );
    
    double provinThree = ( payThree * prov );
    
    double finalThree = payThree - ( provinThree + federalThree );
    //Chart of all Employee's information
    System.out.println ( " Your pay before taxes is "+payThree+" Your pay after federal taxes is "+federalThree+" Your pay after provincial is "+provinThree+" Your pay after taxes is "+"finalPay" );
    System.out.println ( "|" + "Employee #" + "|"+"Hours" + "|"+ "Pay Rate"+"|"+"Before taxes"+"|"+"Prov. Taxes"+"|"+"Federal taxes"+"|"+"Both Taxes" );
    System.out.println ( "|"+"1111"+" | "+"40.0"+" | "+"15.00"+" | "+pay+" | "+provin+"|"+federal+"|"+finalPay+"|" );
    System.out.println ( "|"+"2222"+" | "+"35.0"+" | "+"25.00"+" | "+payOne+" | "+provinOne+" | "+federalOne+" | "+finalAmo+" | ");
    System.out.println ( "|"+"3333"+" | "+"10.0"+" | "+"10.00"+" | "+payTwo+" | "+provinTwo+" | "+federalTwo+" | "+finalTwo+" | ");
    System.out.println ( "|"+"4444"+" | "+"20.0"+" | "+"12.75"+" | "+payThree+" | "+provinThree+" | "+federalThree+" | "+finalThree+" | ");
  }
  
  
  
}