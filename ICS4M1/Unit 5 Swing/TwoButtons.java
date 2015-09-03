import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class TwoButtons extends JFrame implements ActionListener
{
  JButton redButton ;
  JButton grnButton ;
  JButton bluButton;

  // constructor for TwoButtons
  public TwoButtons(String title)                           
  {
    super( title );
    
    redButton = new JButton("Red");
    grnButton = new JButton("Green");
    bluButton=new JButton("Blue");
    redButton.setActionCommand( "red" );   // set the  command 
    grnButton.setActionCommand( "green" ); // set the  command
    bluButton.setActionCommand("blue");

    // register the buttonDemo frame
    // as the listener for both Buttons.
    redButton.addActionListener( this );
    grnButton.addActionListener( this );
    bluButton.addActionListener(this);

    setLayout( new FlowLayout() ); 
    add( redButton );                      
    add( grnButton );
    add(bluButton);
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }

  public void actionPerformed( ActionEvent evt)
  {
    // check which command has been sent
    if ( evt.getActionCommand().equals( "red" ) )
      getContentPane().setBackground(  Color.red  );
    else if (evt.getActionCommand().equals("blue"))
      getContentPane().setBackground(Color.blue);
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
}

