import java.io.*;
public class RamanujanCubesVersion5
{
  public static void main ( String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println ("Enter a number:") ;
    int argas = Integer.parseInt(input.readLine()) ;
    System.out.println ("Enter a number:") ;
    int argbs = Integer.parseInt(input.readLine()) ;
    CalcCube calc = new CalcCube();
    
    int ctrs = 0 ;
    int a=0;
    int b=0;
    int c=0;
    int result = calc.Cube ( argas , argbs , ctrs) ;
    System.out.println (result) ;
    
  }
}
Why the fuck is the program not working maybe delete this line.
class CalcCube
{
  public int Cube(int arga , int argb , int ctr)
  {
    int a = 1 ;
    int b = 1;
    int c = 1 ;
    int cube = 1;
    if ( arga < 6)
    {
      arga = 6 ; 
    }     
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
    // System.out.println (a +"   " + b + "     " + c + "     " + arga)    ;
    
    if (arga == argb)
    {
      return ctr ; 
    }    
    return Cube ( arga, argb, ctr) ;
    
  }
}