public class Dice3
{ 
  public static void main (String[] args)
  { 
    int ctr=0;
    
    System.out.println (" Enter how many sides there are on n");
    int ndie = ReadLib.readInt();
    
    System.out.println ("Enter how many sides there on die m");
    int mdie = ReadLib.readInt();
    
    
    for ( int x = 1; x <= mdie; x++)
    { 
      for ( int y = 1; y <= ndie; y++)
      {
        if ( (x + y)%10==0)
        {
          ctr++;
        }
      }
      
    }
    
    System.out.println ("You can get ten "+ ctr + " times");
  }
}