
public class BasicElements
{
    public static void main (String[] args)// first method executed by Java
    {
       // variable declaration

       // Names of variables should be descriptive.  
       // Unlike mathematics, variables represent their 
       // function within the program.
       // It is a good idea to write understandable programs.
      

       int cost;         // one word variables are written in lowercase
       double finalCost; // the second word is capitalized 
       String myName;
       char letter;
       boolean flag;
       
       // Assignment of values

       // When assignning values to a variable the equal sign is used.
       // In this case the = sign is called an 'assignment denominator'
       
       int purchase = 43; // 43 is assigned to purchase
       double bill = 43.77;
       String lastName = "cars"; //text within double quotes
       char firstletter = 'a'; // single characters within single quotes
       boolean exit = true;// either true or false
       
       // In the following example the addition 
       // is assigned to the variable finalCost

       finalCost = purchase + 100;
       
       // To concatenate is to "join" 
       // strings and variables using the + operator

 System.out.println (" The final cost of " + lastName + " is " + finalCost); 
       
    } // main method
} // BasicElements class
