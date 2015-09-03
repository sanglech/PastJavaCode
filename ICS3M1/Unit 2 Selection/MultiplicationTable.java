public class MultiplicationTable
{
  public static void main (String[] args)
  
  {

    System.out.println (" Enter an integer");
      int i = ReadLib.readInt();
    
    for (int x =0; x<13;x++)
    {
      int a = x *i;   
 
    System.out.println (x + "x" + i + "="+ a);
    }
  }
}
