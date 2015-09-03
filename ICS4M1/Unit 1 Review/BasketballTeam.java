import java.io.*;
public class BasketballTeam
{
  public static void main (String [] args)throws IOException
  {
    BufferedReader person = new BufferedReader (new InputStreamReader (System.in));
    System.out.println(" Enter the player's name ");
   
    String name = (person.readLine());
   
    Stats player = new Stats(name);
    
    int position1 = player.getPosition();
    double scoringAvg= player.getScoring();
    double reboundingAvg= player.getRebounding();
    System.out.println(name + "'s "+":"+ "Position is " + position1);
    System.out.println(name + "'s "+":"+ "Scoring Average is " + scoringAvg);
    System.out.println(name + "'s "+":"+ "Rebounding Average is " + reboundingAvg);
    
    Personal player1 = new Personal(name);
    
    String address1=player1.getAddress();
    String phoneNumber1=player1.getphoneNumber();
    String city1=player1.getCity();
    
    System.out.println(name + "'s "+":"+ "Position is " + address1);
    System.out.println(name + "'s "+":"+ "Scoring Average is " + phoneNumber1);
    System.out.println(name + "'s "+":"+ "Rebounding Average is " + city1);
  }
}

class Stats
{
  private String nam=" ";
  private int pos=0;
  private double sa = 0;
  private double ra=0;
  
  Stats(String n)
  {
    nam=n;
    position();
    scoringAverage();
    reboundingAverage();
  }
  private void position()
  {
    pos=1;
  }
  int getPosition()
  {
    return pos;
  }
  private void scoringAverage()
  {
    sa=24.4;
  }
  double getScoring()
  {
    return sa;
  }
  private void reboundingAverage()
  {
    ra=15.3;
  }
  double getRebounding()
  {
    return ra;
  }
}

class Personal
{
  private String nam1=" ";
  private String add="";
  private String phone="";
  private String city ="";
  
  Personal(String n)
  {
    nam1=n;
    address();
    phoneNumber();
    municipality();
  }
   private void address()
  {
    add="5898 CoolGuy Drive";
  }
   String getAddress()
   {
     return add;
   }
      private void phoneNumber()
  {
    phone="416 647 6969";
  }
   String getphoneNumber()
   {
     return phone;
   }  
   private void municipality()
  {
    city="Mississauga";
  }
   String getCity()
   {
     return city;
   }
}
