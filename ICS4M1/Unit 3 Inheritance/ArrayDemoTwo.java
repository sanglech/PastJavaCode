import java.util.Arrays;

class ArrayDemoTwo
{
  public static void main ( String[] args )
  {
    String[] animals = {"bat", "fox", "gnu", "eel", "ant", "dog", "fox", "gnat" };
    
    System.out.print("Scrambled array:  ");
    for ( int j=0; j < animals.length; j++ )
      System.out.print( animals[j] + " ");
      
    System.out.println();
    
    Arrays.sort( animals );
    
    System.out.print("Sorted    array:  ");
    for ( int j=0; j < animals.length; j++ )
      System.out.print( animals[j] + " ");
      
    System.out.println();
       
  }
}