import java.io.*;
public class RamanujanCubesVersion3
{
  public static void main ( String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println ("Enter a number:") ;
    int arga = Integer.parseInt(input.readLine()) ;
    System.out.println ("Enter a number:") ;
    int argb = Integer.parseInt(input.readLine()) ;
    int a = 1 ;
    int b = 1 ;
    int c = 1 ;
    int ctr = 0 ;
    int cube = 0 ;
    if (arga < 6)
    {
      arga = 6 ; 
    }
    while (arga != argb)
    {
      cube = (a*a*a) + (b*b*b) + (c*c*c) - (arga*arga*arga) ;
      if (cube == 0)
      {
        ctr++ ;
        arga++ ;
        a = 1 ;
        b = 1 ;
        c = 1 ;
      }
      else if ( cube != 0)
      {        

        if (b == (arga - 1) && a == (arga - 1))
        { 
          c++ ; 
        }
                a++ ; 
        if (a == arga)
        {
          b++ ; 
          a = 1 ;
        }
        if (b == arga)
        {
          b = 1 ; 
        }
        
        if (b == arga && a == arga)
        {
          b = 1 ;
          a = 1 ;
        }
        if ( a == (arga - 1) && b == (arga - 1) && c == arga)
        {
          arga++ ;
          a = 1 ;
          b = 1 ;
          c = 1 ;           
        }               
      }
  //    System.out.println (a +"   " + b + "     " + c + "     " + arga)    ;
    }
    System.out.println (arga) ;
    System.out.println (argb) ;
    System.out.println (" There are:" + ctr) ;
    
  }
}



