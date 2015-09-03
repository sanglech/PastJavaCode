class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );

    item1.show();
    item2.show();
  }
}

class Movie extends Video
{
  String  director;     // name of the director
  String  rating;       // G, PG, R, or X


  public Movie( String ttl, int lngth, String dir, String rtng )
  {
    super( ttl, lngth );  // use the super class's constructor
    director = dir;  
    rating = rtng;      
  }

}

class Video
{
  String  title;   
  int     length;   
  boolean avail;    // is the video in the store?


  public Video( String ttl )
  {
    title = ttl; 
    length = 90; 
    avail = true; 
  }

  public Video( String ttl, int lngth )
  {
    title = ttl; 
    length = lngth; 
    avail = true; 
  }

  public void show()
  {
    System.out.println( title + ", " + length + " min. available:" + avail );
  }
  
}