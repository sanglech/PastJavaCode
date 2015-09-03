public class KilometersMiles
{
  public static void main (String[] args)
  { System.out.println ("Enter your starting value");
    double start = ReadLib.readDouble();
   
    System.out.println (" Enter your finsihing value");
    double finish = ReadLib.readDouble();
    
      double i;
    double x = 0;
     
    for ( i = 5; i <=100 ; i+= 98)
    {  
        x = finish / start;
        
      
      System.out.println ( " Miles " + x);
    }
  }
}
