public class BinarySearchApp2
{
    public static void main (String [] args)
    {
 int index = 0;
 char dat [] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p'}; //16 values
  char guess = 'c'; // key

  // Parameters are: item being searched, array, index of first element,
  // index of last element
 
  index = binarySearch (guess, dat, 0, 15);
 
 System.out.println ("Found guess in position " + index);
    
      } // main method

    public static int binarySearch (char key, char data [], int start, int end)
    {
  int middle = (start + end) / 2; // middle is middle subscript NOT middle value
 
 if (start > end) //no elements in list
  {
         return -1;
  }
  else if (key == data [middle])
  {
         return middle; // match was found
  }
  else if (key < data [middle])
  {
         return binarySearch (key, data, start, middle - 1); // key in first half
  }
  else // key > data [middle]
  {
         return binarySearch (key, data, middle + 1, end); // key in second half
  }
    }
} // BinarySearchApp clas

