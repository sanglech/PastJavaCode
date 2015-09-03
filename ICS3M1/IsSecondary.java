//Christian Sangle
public class IsSecondary
{
  public static void main (String[] args)
  {
    System.out.println(" Enter the grade you are in  ");
    int grade=ReadLib.readInt();
    boolean highSchool = School(grade);
    
    if (highSchool== true)
    {
      System.out.println(" You are in Secondary School ");
    }
    
    else
    {
      System.out.println(" You are not in a secondary school ");
    }
    
  }
  public static boolean School(int grade)// Takes an integer value representing their grade
    //and converts it to a boolean expression.
  {
    if (grade>=9&&grade<=12)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}
// isSecondary program