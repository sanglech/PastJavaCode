public class InsertionSort
{
  public static void main (String[] args)
  { 
    insertion ();
    
  } // main method
  
  public static void insertion () 
  {
    int a[] = {53, 43, 63, 93, 103, 83, 13, 33, 23, 3, 73};
    int index = 0;
    int itemToInsert;
    
    // for every element except the leftmost one
    // insert it where it belongs in the sorted segment
    
    for(int i = 1; i < a.length; i++)
    {
      itemToInsert = a[i];
      index = i;
      
      // walk down from the current poistion (i) 
      // shifting up every element larger than itemToInsert
      
      while((index >= 1) && (itemToInsert < a[index -1]))
      {
        a[index] = a [index - 1];
        index--;
      }
      
      // now we know where itemToInsert belongs, so put it there
      a[index] =  itemToInsert;   
    }  
       for (int i = 0 ; i < a.length ; i++)
    {
      System.out.print (a [i] + " ");
    }  
    
  } // insertion method
} // Insertion Sort class