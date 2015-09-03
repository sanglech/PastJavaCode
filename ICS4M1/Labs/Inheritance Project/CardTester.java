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