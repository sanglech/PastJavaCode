import java.util.* ;
class IteratorEnhanceLoop
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

    // no danger of an index that might go out of bounds. 
    for ( String name : names ) // assigns references to name
      System.out.println( name );

  }
}