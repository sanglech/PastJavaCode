// The "QuickSortDemoC" class.
public class QuickSortDemoC
{
    public static void main (String [] args)
    {

 int size = 10;
 int a [] = {53, 43, 63, 93, 103, 83, 13, 33, 23, 6, 73};

 quickSort (a, 0, size);

 // Output sort
 for (int i = 0 ; i < a.length ; i++)
 {
     System.out.print (a [i] + " ");
 }


    } // main method


    public static void quickSort (int a [], int lower, int upper)
    {
 int ppoint = 0;

 partition (a, lower, upper, ppoint);

 if (lower < ppoint)
     quickSort (a, lower, ppoint - 1);
 if (upper > ppoint)
     quickSort (a, ppoint + 1, upper);
    }

   public static void partition (int a [], int lo, int hi, int ppoint)
    {

 int pivot = a [lo];

 while (lo < hi)
 {
     // right to left scan until smaller value found
     while (pivot < a [hi] && lo < hi)
     {
  hi--;
  if (hi != lo)
  {
      a [lo] = a [hi];
      lo++;
  }
     }

     // left to right scan until larger value found
     while (pivot > a [lo] && lo < hi)
     {
  lo++;
  if (hi != lo)
  {
      a [hi] = a [lo];
      hi++;
  }
     }
 }

 // right to left scan looking for smaller value
 // on next iteration
 a [hi] = pivot;
 ppoint = hi;
    }
} // QuickSortDemoC class

















