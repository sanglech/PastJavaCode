public class MultiplicationTable
{ 
  public static void main (String[] args)
  { 
    
    
    System.out.println (" Enter your integer");
    int i = ReadLib.readInt();
     
     for (int x = 0; x < 13 ; x++)
    {
      int a = x*i;
    
      System.out.println ( i + "x"+ x + "=" + a );
    }
    
    
  }
}
                      