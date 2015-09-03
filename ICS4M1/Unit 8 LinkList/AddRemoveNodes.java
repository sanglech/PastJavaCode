// The "AddRemoveNodes" class.
public class AddRemoveNodes
{
  public static void main (String [] args)
  {
    int command;
    String name;
    LinkRecord head = null;
    LinkRecord searchNode;
    
    System.out.println ("Enter a command");
    System.out.println ("1.   Add a name");
    System.out.println ("2.   Remove a name");
    System.out.println ("3.   Search for a name");
    System.out.println ("4.   Quit");
    
    System.out.println ("Commnand: ");
    command = ReadLib.readInt ();
   
    while (command != 4)
    {
      if (command == 1)
      {
        System.out.println ("Enter a new name: ");
        name = ReadLib.readString ();
        head = new LinkRecord (name, head);
      }
      else if (command == 2)
      {
        System.out.println ("What name would you like to remove? ");
        name = ReadLib.readString ();
        remove(name,head);
      }
      else if (command == 3)
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
  
  public void insert (String val)
  {
    LinkRecord before, after, newNode;
    LinkRecord head = null;
    
    before = null;
    after = head;
    
    while ((after != null) &&  (!val.equals (after.getInfo ())))
    {
      before = after;
      after = after.getNext ();
    }
    
    // Create the new node with link part pointing
    // to after.
    newNode = new LinkRecord (val, after);
    
    // Adjust head of list or set before's link part
    // to point to newNode, as appropriate.
    if (before == null)
    {
      head = newNode;
    }
    else
    {
      before.setNext (newNode);
    }
  } // insert method
  
  
  private static void remove (String val,LinkRecord head)
  {
    LinkRecord before, current;
    before = null;
    current = head;
    
    while ((current != null) &&
           (!val.equals (current.getInfo ())))
    {
      before = current;
      current = current.getNext ();
    }
    
    // Check if val found in linked list.
    if (current == null)
    {
      System.out.println (val + " not found");
      return;
    }
    
    // Adjust head of list or set before's link part
    // to point to the node after current, as appropriate.
    if (before == null)
    {
      head = current.getNext ();
    }
    else
    {
      before.setNext (current.getNext ());
    }
  } // remove method
  
} // AddRemoveNodes class
