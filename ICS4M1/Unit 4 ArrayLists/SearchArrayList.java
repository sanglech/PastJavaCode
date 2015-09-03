import java.util.* ;
class SearchArrayList
{
  public static void main ( String[] args)
  {
    ArrayList<String> names = new ArrayList<String>();

    names.add( "Amy" );     
    names.add( "Bob" );
    names.add( "Chris" );   
    names.add( "Deb" );
    names.add( "Elaine" );  
    names.add( "Joe" );

    System.out.println( names.indexOf( "Elaine" ) ); // 4
    System.out.println( names.indexOf( "Zoe" ) );  // -1
  }
}
