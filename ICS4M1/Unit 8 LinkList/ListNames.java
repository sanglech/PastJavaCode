public class ListNames
{
  private static ListNode head = null; 
  
  public static void main (String [] args)
  {
    String name;
    ListNode node;
    
    while (true)
    {
      // Get the name and exit loop if newline.
      System.out.print ("Enter a name (empty to quit): ");
      name = ReadLib.readString ();
      if (name.length () == 0)
      {
        break;
      }
      
      insert (name); // Insert name in linked list.
      
      // Output all the names in the list.
      node = head;
      while (node != null)
      {
        System.out.println (node.getValue ());
        node = node.getNext ();
      }
    }
  } // main method
  
  private static void insert (Comparable val)
  {
    ListNode before, after, newNode;
    before = null;
    after = head;
    
    while ((after != null) && (val.compareTo (after.getValue ())) > 0)
    {
      before = after;
      after = after.getNext ();
    }
    
    // Create the new node with link part pointing
    // to after.
    newNode = new ListNode (val, after);
    
    // Adjust head of list or set before's link part
    // to point to newNode, as appropriate.
    if (before == null)
    {
      head = newNode;// nothing points at the new node
    }
    else
    {
      before.setNext (newNode);
    }
  } // end of insert method
} // ListNames class
