import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class StringExcerciseTwo extends JFrame implements ActionListener
{
  JButton redButton ;
  JButton grnButton ;

  // constructor for TwoButtons
  public TwoButtons(String title)                           
  {
    super( title );
    
    redButton = new JButton("Red");
    grnButton = new JButton("Green");
    redButton.setActionCommand( "red" );   // set the  command 
    grnButton.setActionCommand( "green" ); // set the  command   

    // register the buttonDemo frame
    // as the listener for both Buttons.
    redButton.addActionListener( this );
    grnButton.addActionListener( this );     

    setLayout( new FlowLayout() ); 
    add( redButton );                      
    add( grnButton );
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }
}

  public void actionPerformed( ActionEvent evt)
  {
    // check which command has been sent
    if ( evt.getActionCommand().equals( "red" ) )
      getContentPane().setBackground(  Color.red  );    
    else 
      getContentPane().setBackground( Color.green );    

    repaint();
  }

  public static void main ( String[] args )
  {
    TwoButtons demo  = new TwoButtons( "Click a Button" ) ;
    
    demo.setSize( 200, 150 );     
    demo.setVisible( true );      
  }
