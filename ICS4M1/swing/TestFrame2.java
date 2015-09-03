import java.awt.*; 
import javax.swing.*;

public class TestFrame2
{
  public static void main ( String[] args )
  {
    MyFrame frame = new MyFrame("Hello"); // construct a MyFrame object</span>
    frame.setVisible( true );         // ask it to become visible</span>
  }
}
class MyFrame extends JFrame
{
  JPanel panel;
  JLabel label;

// constructor
  MyFrame( String title )
  {
    super( title );                      // invoke the JFrame constructor</span>
    setSize( 250, 100 );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    
    setLayout( new FlowLayout() );      // set the layout manager</span>
    label = new JLabel("ERROR 10001: You are a Failure!"); // construct a JLabel</span>
    add( label );                       // add the label to the JFrame</span>
  }

} 