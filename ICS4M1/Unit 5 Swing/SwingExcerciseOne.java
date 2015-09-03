import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class SwingExcerciseOne
{
  public static void main ( String[] args )
  {
    ButtonFrame frm = new ButtonFrame("Super Kool Awesome Program");

    frm.setSize( 200, 100 );     
    frm.setVisible( true );   
  }
}
class ButtonFrame extends JFrame implements ActionListener
{
  JButton bChange ; // reference to the button object
  int ctr =0;

  // constructor for ButtonFrame
  ButtonFrame(String title) 
  {
    super( title );                   // invoke the JFrame constructor
    setLayout( new FlowLayout() );    // set the layout manager

    // construct a Button
    bChange = new JButton("Click Me!"+" You clicked me "+ctr);
    
    // register the ButtonFrame object as the listener for the JButton.
   bChange.addActionListener( this ); 
   add( bChange ); // add the button to the JFrame
   setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
  public void actionPerformed( ActionEvent evt)
  { 
    getContentPane().setBackground( Color.blue );     // Change the Frame's background
    repaint();  // ask the system to paint the screen.
    ctr+=1;
    bChange.setText("Click Me!" + " You CLicked Me" + ctr);
  }
}
