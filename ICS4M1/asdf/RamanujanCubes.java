import java.io.*;
public class RamanujanCubes
{
  public static void main ( String[] args) throws IOException
  {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.println ("Enter a number:") ;
    int argas = Integer.parseInt(input.readLine()) ;
    System.out.println ("Enter a number:") ;
    int argbs = Integer.parseInt(input.readLine()) ;
    CalcCube calc = new CalcCube();
    int as = 0 ;
    int bs = 0 ;
    int cs = 0 ;
    int ctrs = 0 ;
    int result = calc.Cube ( argas , argbs , as, bs , cs , ctrs) ;
    System.out.println (result) ;
    
  }
}

class CalcCube
{
  public int Cube(int arga , int argb , int a, int b ,int  c , int ctr)
  {
    int cubes = (a*a*a) + (b*b*b) + (c*c*c) - (arga*arga*arga) ;
    if ( arga != argb)
    {
      if (cubes != 0)
      {
        if (c == arga)
        {
          c = 0; 
        }
        else if ( c != arga)
        {
          c++ ; 
        }
        if (b == arga && c == arga)
        {
          b = 0; 
        }
        else if (c == arga)
        {
          b++ ; 
        }
        else if ( b == arga)
        {
          a++ ; 
        }
      }
      else if (cubes == 0)
      {
        ctr++ ;
        arga++ ;
        a = 0 ;
        b = 0 ;
        c = 0 ;
      }
      if ( a == arga && b == arga && c == arga)
      {
        arga++ ; 
      }
      return Cube (arga ,argb ,  a, b , c , ctr) ;
    }
    else
    {
      return ctr ; 
    }
    
  }  
}
