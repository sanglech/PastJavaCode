abstract class Card
{
  protected String recipient;
  protected public abstract void greeting();
}

class Holiday extends Card
{
  public Holiday( String r )
  {
    recipient = r;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Season's Greetings!\n\n");
  }
}

class Birthday extends Card
{
  int age;

  public Birthday ( String r, int years )
  {
    recipient = r;
    age = years;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Happy " + age + "th Birthday\n\n");
  }
}

class Valentine extends Card
{
  int kisses;

  public Valentine ( String r, int k )
  {
    recipient = r;
    kisses    = k;
  }

  public void greeting()
  {
    System.out.println("Dear " + recipient + ",\n");
    System.out.println("Love and Kisses,\n");
    for ( int j=0; j &lt <kisses; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}

public class CardTester
{
  public static void main ( String[] args )  
  {

    Card obj = new Holiday( "Amy" );
    obj.greeting();                  //Invoke a Holiday greeting()    

    obj = new Valentine( "Bob", 3 );
    obj.greeting();                      //Invoke a Valentine greeting()

    obj = new Birthday( "Cindy", 17 );
    obj.greeting();                      //Invoke a Birthday greeting()

  }
}