// The "StringDemo" class.
public class StringDemo
{
    public static void main (String [] args)
    {
 /*
  Strings are stored using the Java String class, which is not a primitive data type.
  We have already used Strings in a number of programs and you have seen some
  String methods. For example, the equals() method is used instead of == to see
  if two Strings are equal.
 */

 // A String is declared with statements such as:

 String myName;
 String name = new String ("Eve");
 String nameDemo = "Adam";

 /*
 The next section contains examples of common String methods and their uses.

 Breaking Strings Apart

 The substring() and charAt() methods can be used to break strings into smaller strings
 (substrings) and characters.
 A String can be though of as a number of characters grouped together.
 The String word = "computer" has a total of 8 characters,
 numbered from 0 to 7.
 */

 // Examples:

 String word = "computer";

 // System.out.println (word.length ()); // is 8, returns an integer value
 //System.out.println (word.substring (5));// is "ter" or from character 5 to the end of word.
 //System.out.println (word.substring (4, 7)); // is "ute" or characters 4, 5 and 6

 // Joining or Concatenating Strings

 // If word1 = "word" and word2 = "processing" and word3 = word1 + word2;
 // then word3 is "wordprocessing", the strings are joined together
 // in the order specified with no space between then.

 String word1 = "word ";
 String word2 = "processing ";
 String word3 = word1 + word2;

 // System.out.println (word3);

 word3 = word2 + word1; // would result in "processingword", like:

 // System.out.println (word3);

 //There is also the concat method:

 word3 = word1.concat (word2);
 //System.out.println (word3);
 // would result in "wordprocessing", like word1 + word2

 word3 = word2.concat (word1);


 //  Replacing Characters in Strings

 String word5 = "computerWorld";
 String word6 = word5.replace ('o', 'a'); //would result in "camputerWarld",
 // the o being replaced by a.

 // System.out.println (word6);

 String word7 = word5.toUpperCase (); // would result in "COMPUTERWORLD"
 //System.out.println (word7);
 //word7 = word5.toLowerCase (); // would result in "computerworld" again
 //System.out.println (word7);


 // Searching for Characters and String within Strings

 String word9 = "computer";

 int position = word9.indexOf ("put");
 // would return the integer value 3, the location of the p in computer.
 //System.out.println (position);

 int position2 = word9.indexOf ((int) 'p');
 // would return 5, the position of the letter t.
 // Note that the cast integer (int) must be used with a single character.
 //System.out.println (position2);

 int position3 = word9.charAt (0);
 System.out.println (position3);

    } // main method
} // StringDemo class
