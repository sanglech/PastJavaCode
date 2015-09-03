// The "List" class.
class List
{
  protected LinkRecord first; // variable to establish first node
  
  // Constructor for empty list.
  public List ()
  {
    first = null;
  }
  
  
  // Change info for item ASSUMED in list.
  public void change (String key, String info)
  {
    LinkRecord where = find (key); // find () used only by lookUp() and change()
    
    if (where != null)
      where.setInfo (info);
  }
  
  
  // Delete item assumed already in list.
  public void delete (String key)
  {
    LinkRecord where;
    
    if (first.getKey ().equals (key))// first node
    {
      where = first; // assign node to temp
      first = where.getNext (); // assign the next value to first
    }
    else
    {
      LinkRecord prev = first; // assign first to previous node
      where = prev.getNext (); // assign next after previous to 'where'
      
      
      while (!where.getKey ().equals (key)) // while the getKey does not equal the key
      {                                       
        prev = where; // searches for a key in list
        where = prev.getNext ();
      }
      prev.next = where.getNext ();
    }
  }
  
  
  // Print all items in list.
  public void display ()
  {
    LinkRecord p = first;
    
    if (p != null)// if list is not empty
    {
      do
      {
        System.out.println (p.getKey () + "   " + p.getInfo ());
        p = p.next; // go to next node
      }
      while (p != null); // for as long as not empty
    }
    else
      System.out.println ("There are no items in list");
  }
  
  
  // Add a new item assumed not already present.
  // Add to head of list.
  public void enter (String key, String info)
  {
    LinkRecord p = new LinkRecord (key, info, first);
    first = p;
  }
  
  
  // This method used internally not exported.
  protected LinkRecord find (String key)
  {
    LinkRecord where = first; // assign first reference variable to 'where'
    
    while (where != null && !where.getKey ().equals (key))
    {
      where = where.getNext (); // assign next value to 'where'.  Start again
    }
    return where;
  }
  
  
  public String lookUp (String key)
  {
    String info;
    LinkRecord where = find (key);// find () used only by lookUp() and change()
    
    if (where != null)
      info = where.getInfo ();
    else
      info = null;
    return info;
  }
}
