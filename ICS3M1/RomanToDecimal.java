public class RomanToDecimal
{
  public static void main (String [] args)
  {
    
    String num = ReadLib.readString ();
    
    int length = num.length ();
    
    int value = 0;
    int  I = 0;   int V = 0;  int X = 0;  int L = 0;
    int C = 0;   int D = 0;  int M = 0;
    
    for (int i= 0; i < length; i++)
    {
      if (num.charAt(i) == 'X')
      {
        X+=10;
        if ((length - 1) > i){
          
          if (num.charAt (i+1) == 'I')
          {
            I++;
          }
        }
           if ((length - 1) > i){
          if ((num.charAt(1)) == 'I')
          {
            I--;;
          }
        }
      }
      
      //if (num.charAt(i) == 'I')    {
        //I++;
      //}
      
      else if (num.charAt(i) == 'V')
      {
        V+=5;
      }
      
//      if (num.charAt(i) == 'X')
//     {
//        X+=10;
//      }
      
      else if (num.charAt(i) == 'L')
      {
        L+=50;
      }
      
      else if (num.charAt(i) == 'C')
      {
        C+=100;
      }
      else if (num.charAt(i) == 'D')
      {
        D+=500;
      }
      else if (num.charAt(i) == 'M')
      {
        M+=1000;
      }
      
      value = I + V + X + L + C + D + M;
    }
    
    int number = value;
    System.out.println (number);
  }
  
  
}