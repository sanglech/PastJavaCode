// The "BufferDemo" class.
public class BufferDemo
{
    public static void main (String [] args)
    {
      // create an empty StringBuffer, a String that holds
      //"computer", a string that holds "world" and an
      // empty String result

      StringBuffer buffyObj = new StringBuffer ("");

      String word = "computer";
      String word2 = "world";

      // add the String to the buffer
      buffyObj.append (word);

      // add a space to the buffer
      buffyObj.append (' ');

      // add a character to the buffer
      buffyObj.append (word2);

      // convert the buffer contents to a String
      String phraseOut = buffyObj.toString ();

      System.out.println ("The Buffer content is " + phraseOut);

    } // main method
} // BufferDemo class
