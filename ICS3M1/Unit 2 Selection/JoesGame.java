public class JoesGame
{ 
  public static void main (String[] args)
    
    //double SAJ = 5.00;
    //double SMA = 5.00;
    //double JMA = 3.00;
    //double Coach = 0.00;
    //double AFOS = 6.00;
    //double  SFOS = 7.00;
    //double Adults = 10.00;
    //double Teach = 9.00;
    // double JFA = 3.50;
    //double SFA = 6.00;
    
  {System.out.println(" Are you a Student, Adult, or Athlete?");
    String rank = ReadLib.readString();
    
    if(rank.equals("Adult"))
    {
      System.out.println(" State your postition ");
      String adults = ReadLib.readString();
      
      if (adults.equals("Teacher"))
        
      { System.out.println (" You have to pay 9.00 ");
      }
      
      else if (adults.equals("Coach"))
        
      { System.out.println (" You have to pay 0.00");
      }
      
     else if (adults.equals("Adult"))
      { System.out.println (" You have to pay 10.00 ");
      }
      
    }
    else if (rank.equals("Student")) 
    {
      System.out.println(" Are You From St.Joes? ");
      String student = ReadLib.readString();
      
      if (student.equals ("Yes"))
        
        System.out.println (" You have to pay 5.00 ");
      
      
      if (student.equals("No"))
        
      { System.out.println (" You have to pay 7.00");
      }
    }
    else if(rank.equals("Athlete")) 
    {
      System.out.println(" Are You From St.Joes? ");
      String athlete = ReadLib.readString();
       
      if (athlete.equals ("No"))
      { System.out.println ( "You will pay 6.00 ");
      }
      {
      if (athlete.equals ("Yes"))
        
        System.out.println (" Are you Jr.and Sr.? ");
      String joess = ReadLib.readString();
      
      if (joess.equals ( "Jr"))
        System.out.println (" Are you male or female? ");
      String gender = ReadLib.readString();
      
      if (gender.equals ("Male"))
        
  System.out.println (" You have to pay 3.00 ");
      
      if (gender.equals ("Female"))
        
      System.out.println (" You have to pay 3.50 ");
      
      if (joess.equals ( "Sr"))
        
        System.out.println (" Are you male or female? ");
      String genderTwo = ReadLib.readString();
      
      if (genderTwo.equals ("Male"))
        
      {System.out.println (" You have to pay 5.00 ");
        
      }
      if (genderTwo.equals ("Female"))
        
      {System.out.println (" You have to pay 6.00 ");
      }
    
  else System.out.println ( "3 of aces ");   
    }
    }
  }
}




