class Store
{  
  public static void main ( String[] args )
  {
    Goods gd = new Goods( "bubble bath", 1.40);
    Food  fd = new Food ( "ox tails", 4.45, 20);
    Book  bk = new Book ( "Emma", 24.00, "Austin");
    Toy   ty = new Toy  ( "Legos", 54.45, 8 );
    
    System.out.println( gd.toString() );
    System.out.println( fd.toString() );
    System.out.print  ( ty.toString() );
    System.out.println( " Tax is: " + ty.calculateTax()  );
    
    System.out.print  ( bk.toString() );
    System.out.println(" Tax is: " + bk.calculateTax()  );
  }
}
interface Taxable
{
  double taxRate = 0.06 ;
  double calculateTax() ;
}

class Goods
{
  String description;
  double price;
  
  Goods( String des, double pr)
  {
    description = des;
    price       = pr; 
  }
  
  void display()
  {
    System.out.println( "item: " + description +  " price: " + price );
  }
}

class Food extends Goods
{
  double calories;
  
  public Food( String des, double pr, double cal)
  {
    super( des, pr);
    calories =  cal;
  }
  
  void display()
  {
    super.display();
    System.out.println( " calories: " + calories) ;
  }
}


class Toy extends Goods implements Taxable
{
  int minimumAge;
  
  public Toy( String des, double pr,  int min)
  {
    super( des, pr );
    minimumAge  = min ;
  }
  
  public void display()
  {
    super.display();
    System.out.println("minimum age: " + minimumAge) ;
  }
  
  public double calculateTax()   // implement the interface
  {
    return price * taxRate  ;
  }
}

class Book  extends Goods implements Taxable
{
  String author;
  
  public Book( String des, double pr, String auth)
  {
    super( des, pr);
    author  = auth ;
  }
  
  public String toString()
  {
    return super.toString() + " author: " + author ;
  }
  
  public double calculateTax()
  {
    return price * taxRate ;
  }
}