public class DaBeans
{
  public static void main (String[] args)
  {
    int beans = 231;
    int days=0;
    
    while (beans>=0)
    {
      days++;
        if (days%3==0)
      {
        beans-=6;
      }
      
        if (days%5==0)
      {
        beans+=8;
      }
    }
    System.out.println (" therefore it will take " + days + " for him to finish the jellybeans");
  }
}