import java.util.* ;

class ArrayListEgTwo
{
  public static void main ( String[] args)
  {    
    // Create an ArrayList 
    // <dataType>  reference to data type
    ArrayList<String> names = new ArrayList<String>();    
   
    // specify original size  
    System.out.println("initial size: " + names.size() );    
    
    // Add three String references   
    names.add("Anna");    
    names.add("Camille");    
    names.add("Clint");  
    
    // show new size
    System.out.println("new size: " + names.size() ); 
   
    // Access and print out the Objects    
    for ( int j=0; j<names.size(); j++ )      
      System.out.println("element " + j + ": " + names.get(j) );  
  }
}