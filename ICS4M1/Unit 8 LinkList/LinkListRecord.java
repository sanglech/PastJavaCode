// The "LinkListRecord" class.
public class LinkListRecord
{
  protected String data;
  protected LinkListRecord next;
  
  public LinkListRecord (String name)
  {
    data = name;
    next = null;
  }
    
  public LinkListRecord (String name, LinkListRecord nextNode) 
  {
    data = name;
    next = nextNode; // link to next node.Last node points to null
  }
  
  public String getData ()
  {
    return data;
  }
   
  public LinkListRecord getNext ()
  {
    return next;
  }
  
  
  public void setData (String data)
  {
    this.data = data;
  }
    
  // Method to set next in node.
  public void setNext (LinkListRecord next)
  {
    this.next = next;
  }
}
  