public class TwoDProblem1
{
  public static void main (String [] args)
  {
    int table [] [] = new int [5] [5]; 
    int rows=0;
    int cols=0;
    int ctr;
    
    for (rows=0; rows < 5 ; rows++)
    {
      System.out.print ("\n");
      ctr=0;
      for (cols=0; cols < 5 ; cols++)
      {
        ctr+=1;
      table [rows] [cols] = ctr;
            
      if(rows==cols)
        {
          table[rows] [cols]=0;
        }
     System.out.print (table [rows] [cols] + " \t");
    }
    }
  }
}// main method
// TwoDsample class