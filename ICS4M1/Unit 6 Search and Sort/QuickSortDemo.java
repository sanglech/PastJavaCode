// The "QuickSortDemo" class.
public class QuickSortDemo
{
  public static void main (String[] args)
  {
    int a[] = {53, 43, 63, 93, 103, 83, 13, 33, 23, 6, 73};  // last subscript: 10
    
    System.out.println ("53, 43, 63, 93, 103, 83, 13, 33, 23, 6, 73");
    System.out.println ("");
    
    quickSort (a, 0, 10);
    
    System.out.println ("");
    
    // Output sort
    for (int i = 0 ; i < a.length ; i++)
    {
      System.out.print (a [i] + " ");
    }  
  } // main method
    
  public static void quickSort (int a[], int start, int end)
  {
    if (start < end)
    {
      /*
       rearrange into 2 sub arrays, from a[start] to a[split]
       and from a[split + 1] to a[end] in such a way that every
       element in the left part is less than or equal to the every
       element in the right part
       */
      
      int split = partition (a, start, end);
      
      // show split
      System.out.println ("split " + split);
      System.out.println ("");
      
      // sort the left sublist
      quickSort (a, start, split);
      
      // now sort the right sublist
      quickSort (a, split + 1, end);
    }
  }
  
  
  // rearrange the portion of the array a[] so that each element
  // in a[start]....a[split] is less than or equal to each element in
  // a[split + 1].....a[end], and return the index split.
  
  
  public static int partition (int a[], int start, int end)
  {
    // start with 2 indices, top and bottom,
    // just outside of the list we are partitioning
    
    int bottom = start - 1;
    int top = end + 1;
    
    // pick a value pivot. Arrange the list according to:  <= or >= to pivot
    
    int pivot = a [start];
    
    System.out.println ("pivot is " + pivot);
    
    // walk bottom and top towards each other, using them to swap array
    // elements as we go, and stopping when bottom and top pass each other.
    
    while (bottom < top)
    {
      // walk until you find an element that is not in its current sublist
      
      do
      {
        bottom++;
      }
      while (a [bottom] < pivot);
      
      do
      {
        top--;
      }
      while (a [top] > pivot);
      
      // swap a[bottom] and a[top], thus putting the values in the
      // correct sublist
      
      int temp = a [bottom];
      a [bottom] = a [top];
      a [top] = temp;
    }
    
    // undo the last swap that took place after the bottom and top
    // indices passed each other.
    
    int temp = a [bottom];
    a [bottom] = a [top];
    a [top] = temp;
    
    // finally, return split index
    return top;
    
  } // partition method
} // QuickSortDemo class

















