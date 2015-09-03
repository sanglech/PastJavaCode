import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Repeater extends JFrame implements ActionListener
{

   JLabel inLabel    = new JLabel( "Enter Your Name:  " ) ;
   TextField inText  = new TextField( 15 );

   JLabel outLabel   = new JLabel( "Here is Your Name :" ) ;
   TextField outText = new TextField( 15 );
   
   public Repeater( String title)      // constructor
   {  
      super( title );
      setLayout( new FlowLayout() ); 
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;

      inText.addActionListener( this );
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
   }

  // The application code.
  void copyText()
  {
    String name = inText.getText();
    outText.setText( name );
  }

  public void actionPerformed( ActionEvent evt)  
  {
    copyText();
    repaint();                  
  }

  public static void main ( String[] args )
  {
    Repeater echo  = new Repeater( "Repeater" ) ;
    echo.setSize( 300, 100 );     
    echo.setVisible( true );      
  }
}
