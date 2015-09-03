import java.io.*;
public class TwoDProblem2
{
  public static void main (String [] args)
  {
    int ctr=0;
    int[][] table = 
        {  {1, 2, 3, 6, 5}, 
           {1, 2, 3, 4, 5},
           {1, 2, 3, 4, 5},
           {1, 2, 3, 4, 5},
           {1, 2 ,3, 4, 5}, };
    int rows=0;
    int cols=0;
      
    for (rows=0; rows < 5 ; rows++)
    {       
      for (cols=0; cols < 5 ; cols++)
      {
       ctr+=table [cols][rows];
      }
      System.out.println(ctr);
      ctr=0;
    }
  }
}
