// ICS4U
// Mr.Romero
// December 11, 2009
// Kevin Tse
// Christian Sangle

import java.io.*;
public class RamanujanCubesVersion4
{
  public static void main ( String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println ("Enter a number:") ;
    int arga = Integer.parseInt(input.readLine()) ;
    System.out.println ("Enter a number:") ;
    int argb = Integer.parseInt(input.readLine()) ;
    CalcCube calc = new CalcCube(); 
      
    int ctr = 0 ;
    int result = calc.Cube ( arga , argb , ctr) ;
    System.out.println (" There are " +result+ " numbers between " + arga + " and " + argb + " whose cubes are Ramanujan Cubes") ;
    
  }
}

class CalcCube
{
  public int Cube(int arga , int argb , int ctr)
  {
    int a = 1 ;
    int b = 1;
    int c = 1 ;
    if ( arga < 6)
    {
      arga = 6 ; 
    }
    while (arga != argb)
    {
      int  cube = (a*a*a) + (b*b*b) + (c*c*c) - (arga*arga*arga) ;
      if (cube == 0)
      {
        ctr++ ;
        arga++ ;
        a = 1 ;
        b = 1 ;
        c = 1 ;
      }
      else if (arga != argb)
      {        
        cube = (a*a*a) + (b*b*b) + (c*c*c) - (arga*arga*arga) ;
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
      // take comment out to see what it is doing
      // System.out.println (a +"   " + b + "     " + c + "     " + arga)    ;
    }
    if (arga == argb)
    {
      if (arga < 100)
      {
        return ctr ; 
      }
      else 
        return ctr + 1 ;
    }
    
    return Cube ( arga, argb, ctr) ;
    
  }
}
