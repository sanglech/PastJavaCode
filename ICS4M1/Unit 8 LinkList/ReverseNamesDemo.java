//Christian Sangle
import java.util.*;
import java.io.*;
public class ReverseNamesDemo
{
  static public void main (String args [])
  {
    String names="";
    String command="";
    LinkListRecord head =null;
    String returnhead;
    LinkListRecord searchNode;
    
    System.out.println ("Reverse Name Program ");
    
    while (!command.equals("q"))
    {
      System.out.println("1: Enter a name.");
      System.out.println("q:quit");
      command=ReadLib.readString();
      if(command.equals("1"))
      {
        System.out.println("Please enter a Name.");
        names = ReadLib.readString ();
        head = new LinkListRecord (names, head);
      }
    }
    searchNode=head;
    while(searchNode!=null)
    {    
      System.out.println(searchNode.getData()); 
      searchNode=searchNode.getNext(); 
    }
  }
}