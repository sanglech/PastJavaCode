import java.io.*;
public class TestEmployee
{
  static public void main (String args [])
  {
    String name, info, num;
    String command;
    int ctr = 0;
    
    List e = new List (); // Instantiate a list.
    
    System.out.println ("Employee program");
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
          System.out.println ("Enter employee number: ");
          num = ReadLib.readString ();
          ctr++;
          // Look to see if already in list.
          info = e.lookUp (name);
          
          if (info != null)
            e.enter (name, num);
          else
            System.out.println ("Item already in list");
          break;
        case 'd': // Delete.
          System.out.println ("Give name: ");
          name = ReadLib.readString ();
          info = e.lookUp (name);
          if (info != null)
          {
            e.delete (name);
            System.out.println ("Entry is deleted");
          }
          else
            System.out.println ("Item is not in list");
          break;
        case 'c': // Change.
          System.out.println ("Give name: ");
          name = ReadLib.readString ();
          info = e.lookUp (name);
          if (info != null)
          {
            System.out.println ("Give new employee number: ");
            num = ReadLib.readString ();
            e.change (name, num);
          }
          else
            System.out.println ("Name not in book");
          break;
        case 'l':   // Lookup.
          System.out.println ("Give name: ");
          name = ReadLib.readString ();
          num = e.lookUp (name);
          if (num != null)
            System.out.println ("New employee number is " + num);
          else
            System.out.println ("Name not in book");
          break;
        case 'p': // Print.
          e.display ();
          break;
        default:
          System.out.println ("Command \"" + command + "\" not available");
      }
    }
    System.out.println ("Quitting list not saved");
  } // main method
} /* TestList class */
// The "List" class.
class List
{
  protected Employee first;
  String name;
  String empNum;
  double hourlyRate;
  double hoursWorked;
  
  // Constructor for empty list.
  public List ()
  {
    first = null;
  }
  
  
  // Change hourlyRate for item assumed in list.
  public void change (String name, String empNum)
  {
    Employee where = find (name);
    if (where != null)
      where.setEmpNum (empNum);
  }
  
  
  // Delete item assumed already in list.
  public void delete (String name)
  {
    Employee where;
    if (first.getName ().equals (name))
    {
      where = first;
      first = where.getNext ();
    }
    else
    {
      Employee prev = first;
      where = prev.getNext ();
      
      while (!where.getName ().equals (name))
      {
        prev = where;
        where = prev.getNext ();
      }
      prev.next = where.getNext ();
    }
  }
  
  
  // Print all items in list.
  public void display ()
  {
    Employee p = first;
    if (p != null)
    {
      do
      {
        System.out.println (p.getName () + "   " + p.getEmpNum ());
        p = p.next;
      }
      while (p != null);
    }
    else
      System.out.println ("There are no items in list");
  }
  
  
  // Add a new item assumed not already present.
  // Add to head of list.
  
  public void enter (String name, String empNum)
  {
    Employee p = new Employee (name, empNum);
    first = p;
  }
  
  
  // This method used internally not exported.
  protected Employee find (String name)
  {
    Employee where = first;
    while (where != null && !where.getName ().equals (name))
    {
      where = where.getNext ();
    }
    return where;
  }
  
  
  public String lookUp (String name)
  {
    double hourlyRate;
    Employee where = find (name);
    
    if (where != null)
      empNum = where.getEmpNum ();
    else
      empNum = "";
    return empNum;
  }
}
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

public class ListNode
{
  private Object value;
  private ListNode next;
  
  public ListNode (Object initValue, ListNode initNext)
  {
    value = initValue;
    next = initNext;
  }
  
  public Object getValue ()
  {
    return value;
  }
  
  public ListNode getNext ()
  {
    return next;
  }  
  public void setValue (Object theNewValue)
  {
    value = theNewValue;
  } 
  public void setNext (ListNode theNewNext)
  {
    next = theNewNext;
  }
} // ListNode class

public class Employee
{
  
  private String name;
  private String empNum;
  private double hourlyRate;
  private double hoursWorked;
  private double regularPay;
  private double overtimePay;
  protected Employee next;
  
  // constructors - first with parameters and second without)
  public Employee (String name, String empNum, double hourlyRate, double hoursWorked)
  {
    this.name = name;
    this.empNum = empNum;
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
    calcPay ();
  }
    
  public Employee (String name, String empNum)
  {
    this.name = name;
    this.empNum = empNum;
    //calcPay ();
  }
  
  
  public Employee ()
  {
    name = "";
    empNum = "";
    hourlyRate = 0;
    hoursWorked = 0;
  }
  
  
  
  public void setName (String name)
  {
    this.name = name;
  }
  
  
  public void setEmpNum (String empNum)
  {
    this.empNum = empNum;
  }
  
  
  public void setHourlyRate (double hourlyRate)
  {
    this.hourlyRate = hourlyRate;
  }
  
  
  public void setHoursWorked (double hoursWorked)
  {
    this.hoursWorked = hoursWorked;
  }
  
  
  public void calcPay ()
  {
    if (hoursWorked > 40)
    {
      regularPay = 40 * hourlyRate;
      overtimePay = (hoursWorked - 40) * hourlyRate * 1.5;
    }
    else
    {
      regularPay = hoursWorked * hourlyRate;
      overtimePay = 0;
    }
  }
  
  
  public String getName ()
  {
    return name;
  }
  
  
  public String getEmpNum ()
  {
    return empNum;
  }
  
  
  public double getHourlyRate ()
  {
    return hourlyRate;
  }
  
  
  public double getHoursWorked ()
  {
    return hoursWorked;
  }
  
  
  public double getRegularPay ()
  {
    return regularPay;
  }
  
  
  public double getOvertimePay ()
  {
    return overtimePay;
  }
  
  
  public Employee getNext ()
  {
    return next;
  }
}


