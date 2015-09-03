public class SlotMachines
{ 
  public static void main (String[] args)
  { 
    int play=0;
    System.out.println (" How many quarters does Samantha have?");
    int quarter = ReadLib.readInt();
    
    System.out.println ("How many times has the first machine been played since paying out?");
    int first = ReadLib.readInt();
    
    System.out.println ("How many times has the second machine been played since paying out?");
    int sec = ReadLib.readInt();
    
    System.out.println (" How many times has the third machine been played since paying out?");
    int third = ReadLib.readInt();
    
    while (quarter > 0)
    {
      if ( quarter > 0)
      {
        quarter-=1;
        play++;
        if ( first%35==0)
        { 
          quarter+=30;
        }
        first+=1;
        if ( quarter > 0)
        {
          quarter-=1;
          play++;
          
          if (sec%100==0)
          { 
            quarter+=60;
          }
          sec+=1;
          if ( quarter > 0)
          {
            quarter-=1;
            play++;
            
            if ( third%10==0)
            { 
              quarter+=9;
            }
            third+=1;
            
          }
          
         
        }
      }
    }
 
  System.out.println (" She plays " + play + " times before going broke"); 
  }
}
