// The "StringDemo" class.
public class StringDemo
{
  public static void main (String[] args)
  {
    /* String and String Methods
     Strings are stored using the Java String class, which is NOT
     a primitive data type. We have already used Strings in a number 
     of programs and you may have seen some String methods. 
     For example, the equals() method is used
     instead of == to see if two Strings are equal */
    
    // A String is declared with statements such as:
     
     String myName = "Eve";
     String newName = new String ("Eve"); // create an object
     
     /* Breaking Strings Apart
     
     The substring() and charAt() methods can be used to break strings
     into smaller strings (substrings) and characters.
     A String can be thought of as a number of characters grouped
     together.
     
     The String word = "computer" has a total of 8 characters,
     numbered from 0 to 7 = 0 c, 1 o, 2 m, 3 p, 4 u, 5 t, 6 e, 7 r. */
    
     
    // first position starts at 0 so last character will be in 
    // position length - 1.
    String word = "justin";
    int len = word.length ();//returns integer value of 6
       
    System.out.println (word.length ()); 
    
    // is "" from character 3 to the end of word.
    System.out.println (word.substring (3));
    
    System.out.println ("length - 2 = " + word.substring (len - 2));
    
    System.out.println ("0 to length - 2 = " + word.substring (0, len - 2));
    
    /* Joining or Concatenating Strings

     If word1 = "word" and word2 = "processing" and word3 = word1 + word2;
     then word3 is "wordprocessing", the strings are joined together
     in the order specified with no space between then  */
    
//    String word1 = "word ";
//    String word2 = "processing ";
//    
//    String word3 = word1 + word2;
//    System.out.println (word3);
    
    // There is also the concat() method:
    
     String word13;
     String word11 = "wo"; String word12 = "rd";
     word13 = word11.concat (word12);
     System.out.println (word13);
     
    
    /* the method replace would replace all occurrences 
    of the first character by the second*/
    
    String word5 = "oregano";
    String word6 = word5.replace ('o', 'a');
    
    System.out.println (word5);
    System.out.println (word6);
        
    String word7 = "Computer World";
    String word8 = word5.toUpperCase (); // would result in "COMPUTERWORLD"
    System.out.println (word8);
    word7 = word5.toLowerCase (); // would result in "computerworld" again
    System.out.println (word7);
      
   // Searching for Characters and String within Strings
    
    String word9 = "computer";
    
    int position = word9.indexOf ("puter");
    //would return the integer value 3, the location of the p in computer.
    System.out.println (position);
    
    // returns 5, the position of 't'
    int position2 = word9.indexOf ((int) 't'); 
    // Note that the cast integer (int) must be used with a single character.
    // to cast is to force a conversion fro one data type to another
    
    System.out.println (position2);
    
    /*The charAt() method will return the character in the position specified.
     Make sure to declare the variable as a 'char' */
    
    String chewy = "Bubblegum";
    
    char position5 = chewy.charAt (7);
    System.out.println ("character at position 5 = " + position5);
    
    int position6 = chewy.charAt (7);
    System.out.println ("integer at position 5 " + position6); // ascii value
    
    for (int i = 0 ; i < chewy.length () ; i++)
    {
     System.out.println (chewy.charAt (i));
    }
       
  } // main method
} // StringDemo class
