public class TestBubbleSort {
  
  public static void main(String[] args) {
    
    int unsortedArray[] = {10, 97, 6, 23, 0, -45, 697, -1000, 1, 0}; //Random set of numbers for example.
    
    int i;
    
    bubbleSort(unsortedArray, unsortedArray.length); //Pass the array to be sorted and its length.
    
    System.out.println("After sorting, the list elements are: "); //Just to show you it worked. :)
    
   
    for(i=0; i<unsortedArray.length; i++) {
      
      System.out.print(unsortedArray[i] + " ");
      
    }
    
  }
  
  private static void bubbleSort(int[] unsortedArray, int length) {
    
    int temp, counter, index;
    
    boolean exit= true;
    

    for(counter=0; counter<length-1||!exit; counter++) { //Loop once for each element in the array.
      
      for(index=0; index<length-1-counter||!exit; index++) { //Once for each element, minus the counter.
        
        if(unsortedArray[index] > unsortedArray[index+1]&&exit==true) { //Test if need a swap or not.
          
          temp = unsortedArray[index]; //These three lines just swap the two elements:
          
          unsortedArray[index] = unsortedArray[index+1];
          
          unsortedArray[index+1] = temp;
        }
        else
        {
          exit=false;
        }
        
      }
      
    }
    
  }
  
} 