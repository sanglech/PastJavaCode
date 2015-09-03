// The "TestLink" class.
public class TestLink
{
  public static void main (String [] args)
  {
    int command;
    String name;
    LinkRecord head = null;
    LinkRecord searchNode;
    
    System.out.println ("Enter a command");
    System.out.println ("1.   Add a name");
    System.out.println ("2.   Search for a name");
    System.out.println ("3.   Quit");
    
    System.out.println ("Commnand: ");
    command = ReadLib.readInt ();
    
    while (command != 3)
    {
      if (command == 1)
      {
        System.out.println ("Enter a new name: ");
        name = ReadLib.readString ();
        head = new LinkRecord (name, head);
      }
      else if (command == 2)
      {
        System.out.println ("Enter a name to search:  ");
        name = ReadLib.readString ();
        searchNode = head;
        
        while ((searchNode != null) && (!name.equals (searchNode.getInfo ())))
        {
          searchNode = searchNode.getNext ();
        }
        
        if (searchNode == null)
        {
          System.out.println (name + " not found");
        }
        else
        {
          System.out.println (name + " found");
        }
      }
      else
      {
        System.out.println ("try again");
      }
      System.out.println ("Command: ");
      command = ReadLib.readInt ();
    }   
  } // main method
} // TestLink class
