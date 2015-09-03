// The "PhraseIn" class.
import java.util.*; // must import when using the Tokenizer
public class PhraseIn
{
    public static void main (String[] args)
    {
      String phraseIn = "Good morning to you Mr. Romero";

      // pass phrase as an argument; instantiate object
      // phraseIn of type Tokenizer 
      
      StringTokenizer tokObj = new StringTokenizer (phraseIn);

      while (tokObj.hasMoreTokens ()) // a boolean method, returns True or False
      {      
        System.out.println (tokObj.nextToken ());// fetches the next token
        
        // returns an integer (from high to low)
        System.out.println (tokObj.countTokens ());
      }
    } // main method
} // PhraseIn class


