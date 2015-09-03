class LinkRecord
{
  protected String key;
  protected String info;
  protected  Object val;
  
  protected LinkRecord next; // not an object but a reference variable
  // used to point to the next node.  
  // The class contains a variable of its own type.  Recursive.
  // Self-referential.
  
  // Constructor pointing to null
  public LinkRecord (String key, String info)
  {
    this.key = key;
    this.info = info;
    next = null;
  }
  
  public LinkRecord (String info, LinkRecord nxt)
  {       
    this.info = info;
    next = nxt;
  }
  
  public LinkRecord (Object value, LinkRecord nxt)
  {       
    val = info;
    next = nxt;
  }
  
  // Constructor pointing to the next node
  public LinkRecord (String key, String info, LinkRecord next)
  {
    this.key = key;
    this.info = info;
    this.next = next;
  }
  
  public String getInfo ()// data
  {
    return info;
  }
  
  public String getKey ()// 'key' is used to search/delete/display nodes
  {
    return key;
  }
  
  public LinkRecord getNext ()// variable to point at next node
  {
    return next;
  }
  
  
  public void setInfo (String info)// mutator 
  {
    this.info = info;
  }
  
  public void setNext (LinkRecord next)// method to set next in node
  {
    this.next = next;
  }
}
