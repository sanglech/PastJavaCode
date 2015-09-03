// The "PhoneRecords" class.
public class PhoneRecords
{
    public static void main (String[] args)
    {
      int startHour, callLength; char dayCode;

      System.out.println ("Enter the hour the call stated");
      startHour = ReadLib.readInt (); 
      System.out.println ("Enter the day ");
      dayCode = ReadLib.readChar ();
      System.out.println ("Enter the length of the call");
      callLength = ReadLib.readInt ();

      PhoneCall user = new PhoneCall (startHour, dayCode, callLength); // object
      
      System.out.println ("The cost of the call is " + user.getCost () + " .");

    } // main method
} // PhoneRecords class

class PhoneCall
{
    private int startHour = 0;  //the hour the call starts(0 (12:00 midnight) to 23(11:00 pm)
    private char dayCode;   //one of S for either Saturday or Sunday or M T W R F (R for Thursday)
    private int callLength = 0; //the length of the call in minutes
    private double cost = 0.0;

    PhoneCall (int hour, char day, int minutes) // Konstructor
    {
      startHour = hour;
      dayCode = day;
      callLength = minutes;
      calcCost();
    }

    //calculates the cost of the call, if day is blank, cost is 0
    private void calcCost ()   // this method must return a double
    {
      if (dayCode == 's')
      {
        cost = (startHour * 0.15);
      }
      else if (dayCode == 'm' || dayCode == 't' || dayCode == 'w' || dayCode == 'r' || dayCode == 'f')
      {
        if (startHour > 8 && startHour < 18)
        {
          cost = callLength * .40;
        }
        else if (startHour < 6)
        {
          cost = callLength * .25;
        }
        else if (startHour > 19)
        {
          cost = callLength * .25;
        }
        else
        {
          System.out.println ("not an option");
        }
      }
    }

    double getCost ()    // returns the value of data member cost
    {
      return cost;
    }
}