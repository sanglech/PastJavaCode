public class PyramidTester
{
  public static void main ( String[] args)
  {
    int argument = Integer.parseInt( args[0] ); // Get argument from the command line

    Calculate calc = new Calculate();
    int result = calc.Triangle( argument );
    System.out.println("Pyramid(" + argument + ") is " + result );
  }
}
class Calculate
{
  public int Triangle( int N )
  {
    if ( N == 1 )
      return 1;
    else
      return N + Triangle( N-1 );
  }

  public int Pyramid( int N )
  {
    if ( N == 1 ) 
      return 1;
    else
      return Pyramid ( N-1 ) + Triangle ( N );
  }
}