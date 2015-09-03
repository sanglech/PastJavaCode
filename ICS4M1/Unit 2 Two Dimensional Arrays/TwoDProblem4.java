import java.io.*;
public class TwoDProblem4
{
  public static void main (String [] args) throws IOException
  {
    int table [] [] = new int [5] [5]; 
    int rows=0;
    int cols=0;
    int ctr;
    BufferedReader city = new BufferedReader (new InputStreamReader (System.in));
    
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
    
    System.out.print("\n");
    System.out.println("Enter Your Depature City");
    String depart = city.readLine();
    
    System.out.println("Enter your Destination");//depart=rows.
    String destin =city.readLine();
    
    if(depart.equals("Toronto"))
    {
      if(destin.equals("Montreal"))
      {
        System.out.println(table[0][1]);
      }
      else if (destin.equals("Vancouver"))
      {
        System.out.println(table[0][2]);
      }
      else if(destin.equals("Windsor"))
      {
        System.out.println(table[0][3]);
      }
      else if(destin.equals("Halifax"))
      {
        System.out.println(table[0][4]);
      }
    }
    if(depart.equals("Montreal"))
    {
      if(destin.equals("Toronto"))
      {
        System.out.println(table[1][0]);
      }
      else if (destin.equals("Vancouver"))
      {
        System.out.println(table[1][3]);
      }
      else if(destin.equals("Windsor"))
      {
        System.out.println(table[1][4]);
      }
      else if(destin.equals("Halifax"))
      {
        System.out.println(table[1][4]);
      }
    }
    if(depart.equals("Windsor"))
    {
      if(destin.equals("Toronto"))
      {
        System.out.println(table[2][0]);
      }
      else if (destin.equals("Vancouver"))
      {
        System.out.println(table[2][2]);
      }
      else if(destin.equals("Montreal"))
      {
        System.out.println(table[2][4]);
      }
      else if(destin.equals("Halifax"))
      {
        System.out.println(table[2][4]);
      }
    }
    if(depart.equals("Vancouver"))
    {
      if(destin.equals("Toronto"))
      {
        System.out.println(table[3][0]);
      }
      else if (destin.equals("Windsor"))
      {
        System.out.println(table[3][2]);
      }
      else if(destin.equals("Montreal"))
      {
        System.out.println(table[3][1]);
      }
      else if(destin.equals("Halifax"))
      {
        System.out.println(table[3][4]);
      }
    }
    if(depart.equals("Halifax"))
    {
      if(destin.equals("Toronto"))
      {
        System.out.println(table[4][0]);
      }
      else if (destin.equals("Windsor"))
      {
        System.out.println(table[4][2]);
      }
      else if(destin.equals("Montreal"))
      {
        System.out.println(table[4][1]);
      }
      else if(destin.equals("Vancouver"))
      {
        System.out.println(table[4][3]);
      }
    }
    if(depart.equals(destin))
    {
      System.out.println(table[0][0]);
    }
  }
}
