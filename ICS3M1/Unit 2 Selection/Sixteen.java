public class Sixteen
{ 
  public static void main (String[] args)
  {
    System.out.println (" Imput your current year ");
    int year = ReadLib.readInt();
    
    System.out.println (" Imput your birth year");
    int birth = ReadLib.readInt();
    
    int age = year - birth;
    
    if (age > 16)
      System.out.println ( " You are older then 16");
    
    if (age <16)
      System.out.println (" You are younger then 16");
    
    if (age == 16)
      System.out.println ("You are 16");
    
    else
      {System.out.println ("lolcat");
    }
  }
  
}