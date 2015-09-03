// The "SelectionSort" class.
public class SelectionSort
{
    public static void main (String[] args)
    {
      int a[] = {15,3,15, 4, 15,2,15, 5,15, 6,};
   // Selection Sort
  
   for (int i = 0 ; i < a.length ; i++)
   {
     // Find the subscript of the smallest element in a[] at or after position i
     int swapIndex = findSmall (a, i);
     
     // Swap current element with the smallest remaining
     int temp = a [i]; // store current position to a temp
     a [i] = a [swapIndex]; // passing the smallest position index to current position
     a [swapIndex] = temp; // passing current position to old smallest position index
   }
   
   // Output sorted array
   for (int i = 0 ; i < a.length ; i++)
   {
     System.out.print (a [i] + " ");
   }
    } // main method
    
    
    // Find the subscript of the smallest element
    public static int findSmall (int b[], int start)  
    {
      int indexMin = start; // 'start' changes as 'i' changes
      
      for (int i = start ; i < b.length ; i++)
      {           
        if (b [i] < b [indexMin])
        {
          indexMin = i; // found a smallest value, record subscript
        }
      }
      
      return indexMin; // return index of smallest value
      
    } // findSmall
} // SelectionSort class
