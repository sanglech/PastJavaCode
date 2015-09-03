import java.util.* ;
class WrapperExample
{
  public static void main ( String[] args)
  {
    ArrayList<Integer> data = new ArrayList<Integer>();

    data.add( new Integer(1) );
    data.add( new Integer(3) );
    data.add( new Integer(17) );
    data.add( new Integer(29) );

    for ( Integer val : data ) // store 'data' in as an Integer value
      System.out.print( val + " " );

    System.out.println( );
  }
}
