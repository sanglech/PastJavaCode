public class TwoDProblem3
{
  public static void main (String [] args)
  {
    int ctr=0;
    int[][] table = 
        {  {1, 2, 3, 4, 5}, 
           {1, 2, 3, 4, 5},
           {1, 2, 3, 4, 5},
           {1, 2, 3, 4, 5},
           {1, 2 ,3, 4, 5}, };
    int rows=0;
    int cols=0;
      
    for (rows=0; rows < 5 ; rows+=2)
    {       
      for (cols=0; cols < 5 ; cols++)
      {
       ctr+=table [cols][rows];//Inside variable first.
      }
      System.out.println(ctr);
      ctr=0;
    }
  }
}