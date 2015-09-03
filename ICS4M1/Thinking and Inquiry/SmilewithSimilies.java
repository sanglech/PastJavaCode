//Christian Sangle
//ICS4M1
//October 09 2009
import java.io.*;
public class SmilewithSimilies
{ 
  public static void main (String [] args) throws IOException
  {
    BufferedReader sim = new BufferedReader (new InputStreamReader (System.in));
    
    System.out.println("PLease Enter How Many Adjectives You Will Use");
    int a = Integer.parseInt(sim.readLine ());
    
    System.out.println("PLease Enter How Many Nouns You Will Use");
    int n = Integer.parseInt(sim.readLine ());
    
    String array1 [] = new String [a];
    String array2 [] = new String [n];
    
    for (int rows=0; rows < a ; rows++)
    {
      System.out.println("Enter an Adjective");
      String adj = sim.readLine();
      array1[rows]=adj;
    }
    for (int cols=0; cols < n ; cols++)
    {
      System.out.println("Enter a Noun");
      String non = sim.readLine();
      array2[cols]=non;
    }
    for(int i=0; i<a;i++)
    {
      for(int x=0;x<n;x++)
      {
        System.out.println(array1[i]+" as "+ array2[x]);
      }
    }
  }
}
        
        