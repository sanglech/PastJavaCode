public class PhoneDemo
{
  static public void main (String args [])
  {
    String name, phone, info;
    String command;
    
    List p = new List (); // Instantiate a list.
    
    System.out.println ("Phone list program");
    System.out.println ("You must give a command and supply requested information");
    System.out.println ("Enter(e), Delete(d), Change(c), LookUp(l), Print(p), or Quit(q)");
    
    while (true)
    {
      System.out.println ("Command: ");
      command = ReadLib.readString ();
      
      if (command.charAt (0) == 'q')
        break;
      switch (command.charAt (0))
      {
        case 'e': // Enter.
          System.out.println ("Give name: ");
          name = ReadLib.readString ();
          System.out.println ("Give phone number: ");
          phone = ReadLib.readString ();
          // Look to see if already in list.
          info = p.lookUp (name);
          if (info == null)
            p.enter (name, phone);
          else
            System.out.println ("Item already in list");
          break;
        case 'd': // Delete.
          System.out.println ("Give name: ");
          name = ReadLib.readString ();
          info = p.lookUp (name);
          if (info != null)
          {
            p.delete (name);
            System.out.println ("Entry is deleted");
          }
          else
            System.out.println ("Item is not in list");
          break;
        case 'c': // Change.
          System.out.println ("Give name: ");
          name = ReadLib.readString ();
          info = p.lookUp (name);
          if (info != null)
          {
            System.out.println ("Give new phone number: ");
            phone = ReadLib.readString ();
            p.change (name, phone);
          }
          else
            System.out.println ("Name not in book");
          break;
        case 'l':   // Lookup.
          System.out.println ("Give name: ");
          name = ReadLib.readString ();
          phone = p.lookUp (name);
          if (phone != null)
            System.out.println ("Phone number is " + phone);
          else
            System.out.println ("Name not in book");
          break;
        case 'p': // Print.
          p.display ();
          break;
        default:
          System.out.println ("Command \"" + command + "\" not available");
      }
    }
    System.out.println ("Quitting list not saved");
  } // main method
} /* TestList class */
