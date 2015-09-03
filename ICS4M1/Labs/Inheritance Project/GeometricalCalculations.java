//Christian Sangle
//ICS4M1
//Oct 15 2009
public class GeometricalCalculations
{
  public static void main ( String args[] )
  {
    Shape[] shapes=new Shape[5];//Populate an array with shapes.
    
    shapes[0]= new Rectangle(15.0,10.0);
    shapes[1] = new Triangle(19.0,21.0,12.0);
    shapes[2] = new Square(10.0);   
    shapes[3]= new Rectangle(20.0,10.0);
    shapes[4] = new Triangle(3.0,4.0,5.0);

    for(int j=0; j<shapes.length;j++)
    {
      shapes[j].perm();
      shapes[j].area();
    }
  }
}
abstract class Shape // Shape is an abstract class. It is also the parent class.
{
  protected double side;
  protected double side1;
  protected double side2;
  protected double side3;
  protected double len;
  protected double width;
  public abstract void perm();
  public abstract void area();
}

class Rectangle extends Shape//Rectangle is a child of the Shape class.
{
  private double perm=0.0;
  private double area=0.0;
  
  public Rectangle(double l, double w)
  {
    len=l;
    width=w;
  }
  public void perm()//Overrides the abstract perm method.
  {
    System.out.print("\n");
    perm=(2*len)+(2*width);
    System.out.println("The Perimter of the Rectangle is "+ perm);
  }
  public void area()//Overrides the abstract area method.
  {
    area=len*width;
    System.out.println("The Area of the Rectangle is "+ area);
  }
}

class Triangle extends Shape//Triangle is another child of the parent class Shapes.
{
  private double perimeter;
  private double area;
  
  public Triangle(double s1,double s2,double s3)
  {
    side1=s1;
    side2=s2;
    side3=s3;
  }
  public void perm()
  {
    perimeter=side1+side2+side3;
    System.out.print("\n");
    System.out.println("The Perimeter of the triangle is "+perimeter);
  }
  public void area()
  {
    area=Math.sqrt((perimeter/2*(perimeter/2-side1)*(perimeter/2-side2)*(perimeter/2-side3)));//Calculation to find area of a triangle.
    System.out.println("The area of the triangle is "+area);
  }
}

class Square extends Rectangle// Square is a child class of rectangle.
{
  private double perm=0.0;
  private double area=0.0;
  
  public Square(double l)
  {
    super(l,l);//Use's the super class's constructor.
    side=l;
  }
  public void perm()//Overrides the rectangle perm method.
  {
    perm=4*side;
    System.out.print("\n");
    System.out.println("The Perimeter of the Square is " + perm);
  }
  public void area()//Overrides the rectangle area method.
  {
    area=(side*side);
    System.out.println("The Area of the Square is " +area);
  }
}