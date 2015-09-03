import java.util.Arrays;
class EntryTester
{
  public static void main ( String[] args )
  {
    Entry[] wordList = new Entry[10];
    
    wordList[0] = new Entry( "WWW", "World Wide Web" );
    wordList[1] = new Entry( "HTTP","Hypertext Transport Protocol" );
    wordList[2] = new Entry( "DNS", "Domain Name System" );
    wordList[3] = new Entry( "AWT", "Application Windowing Toolkit" );
    wordList[4] = new Entry( "CPU", "Central Processing Unit" );
    wordList[5] = new Entry( "RAM", "Random Access Memory" );
    wordList[6] = new Entry( "URL", "Uniform Resource Locator" );
    wordList[7] = new Entry( "GUI", "Graphical User Interface" );
    wordList[8] = new Entry( "API", "Application Programming Interface" );
    wordList[9] = new Entry( "ROM", "Read-only Memory" );
    
    Arrays.sort( wordList );
    
    for ( int j=0; j<wordList.length; j++ )
      System.out.println( wordList[j].toString() );
  }  

}
class Entry implements Comparable<Entry>
{
  private String word;
  private String definition;
  
  public Entry ( String word, String definition )
  {
    this.word = word;
    this.definition = definition;
  }
  
  public String getWord()
  {
    return word;
  }

  public String getDefinition()
  {
    return definition;
  }
  
  public String toString()
  {
    return getWord() + "\t" + getDefinition();
  }
}
