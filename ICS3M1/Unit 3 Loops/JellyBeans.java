public class JellyBeans
{ 
  public static void main (String[] args)
  {
    int days = 0;
    int jely = 231;
    
    for (int x = 0; jely >=0; x++)
    {
      days++;
      
      if ( days%3 == 0)
      {
        jely-=6;   
      }
      
      if (days%5==0)
      {
        jely+=8;
      }
       
    }
   System.out.println (" He will finish his jellybeans in " +days +" days");
  }
}