public class RecursionSquare
{
  public static void main (String[] args)
  { 
    int num=Square(125);
    System.out.println(num);
  }
  public static int Square(int n)
  {
    if (n==1)
    {
      return 1;
    }
    else
    {
      return Square(n-1)+2*n-1;
    }
  }
}