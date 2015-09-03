import java.util.* ;
class IteratorArrayList
{
  public static void main ( String[] args)
  {
    ArrayList<String> names = new ArrayList<String>();

    names.add( "Amy" );    
    names.add( "Bob" ); 
    names.add( "Chris" );  
    names.add( "Deb" ); 
    names.add( "Elaine" ); 
    names.add( "Frank" );
    names.add( "Gail" );   
    names.add( "Hal" );

    Iterator<String> iter = names.iterator();

    while ( iter.hasNext() )// Return true if not all elements have been visited
      System.out.println( iter.next() ); // Returns the next element of the list.

  }
}
