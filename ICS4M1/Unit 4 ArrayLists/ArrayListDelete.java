import java.util.* ;
class ArrayListDelete
{
  public static void main ( String[] args)
  {
    ArrayList<String> names = new ArrayList<String>(); 

    names.add( "Amy" );    
    names.add( "Bob" );
    names.add( "Chris" );  
    names.add( "Deb" );

    names.remove(2); // remove object in position 2

    for ( int j=0; j < names.size(); j++ )
    {
      System.out.println( j + ": " + names.elementAt(j)); 
    }

  }
}
