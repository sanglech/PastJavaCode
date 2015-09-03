public class MethodReview
{
  public static void main (String[] args)
  {
    System.out.println("Plzzz Enter Your Room Number");
    int room= ReadLib.readInt();
    
    System.out.println("Plzzz Enter How many nights You are staying");
    int nights = ReadLib.readInt();
    
    System.out.println("Plzzzz Enter your room rate");
    double rate = ReadLib.readDouble();
    
    System.out.println("Enter your telephone charges");
    double phone = ReadLib.readDouble();
    
    System.out.println("Enter your Restaurant charges");
    double meal= ReadLib.readDouble();
    
    double bill= Calc(nights,rate,phone,meal);
    System.out.println("Your total for room " + room + " is " + bill + ". Thank you for staying at the Joes Motel!");
  }
  
  public static double Calc (int nights, double rate, double phone, double meal)
  {
    double roomCost= nights*rate;
    double tax = roomCost*0.04;
    double subTotal= roomCost+tax;
    double total= subTotal+ phone + meal;
    return total;
  }
}