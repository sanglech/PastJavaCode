public class Average
{ 
  public static void main (String[] args)
  {
    System.out.println (" Enter your mark");
    int mark = ReadLib.readInt();
    
    if ( mark >= 80 && mark <= 100)
    {
      {
        System.out.println (" You get an A");
      }
      if ( mark >= 90 && mark <= 94)
      { System.out.println (" You get a grant");
      }
      
      if (mark >= 95 && mark <= 100)
      {System.out.println (" You get a scholarship");
      }
      
    }
    
    else if (mark >= 70 && mark <= 79)
    {System.out.println (" You get a B");
    }
    else if (mark >= 60 && mark <= 69)
    {System.out.println (" You get a C");
    }
    
    else if (mark >= 50 && mark <= 59)
    {System.out.println (" You get a D");
    }
    else if (mark < 50)
    { 
      {System.out.println (" You get a F");
    }
     if (mark >= 40 && mark == 49)
      {System.out.println (" You can go to credit revovery");
    }
    }
  }
}