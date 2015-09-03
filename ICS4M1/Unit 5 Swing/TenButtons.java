import java.awt.*; 
import java.awt.event.*;
import javax.swing.*; 

public class TenButtons extends JFrame implements ActionListener
{
  JButton button0;
  JButton button1;
  JButton button2;
  JButton button3;
  JButton button4;
  JButton button5;
  JButton button6;
  JButton button7;
  JButton button8;
  JButton button9;
  int ctr=1;
  
  // constructor for TwoButtons
  public TenButtons(String title)                           
  {
    super( title );
    
   button0 = new JButton("0");
    button1 = new JButton("1");
    button2=new JButton("2");
    button3= new JButton("3");
    button4= new JButton("4");
    button5=new JButton("5");
    button6= new JButton("6");
    button7= new JButton("7");
    button8= new JButton("8");
   button9=new JButton("9");
    
    button0.setActionCommand( "0" );   // set the  command 
    button1.setActionCommand( "1" );   // set the  command 
    button2.setActionCommand( "2" );   // set the  command 
    button3.setActionCommand( "3" );   // set the  command 
    button4.setActionCommand( "4" ); // set the  command 
    button0.setActionCommand( "5" );   // set the  command 
    button0.setActionCommand( "6" );   // set the  command 
    button0.setActionCommand( "7" );   // set the  command 
    button0.setActionCommand( "8" );   // set the  command 
    button0.setActionCommand( "9" );   // set the  command 
    

    // register the buttonDemo frame
    // as the listener for both Buttons.
    button0.addActionListener( this );
    button1.addActionListener( this );
    button2.addActionListener( this );
    button3.addActionListener( this );
    button4.addActionListener( this );
    button5.addActionListener( this );
    button6.addActionListener( this );
    button7.addActionListener( this );
    button8.addActionListener( this );
    button9.addActionListener( this );
    

    setLayout( new FlowLayout() ); 
    add( button0 );
    add( button1 );
    add( button2 );
    add( button3 );
    add( button4 );
    add( button5 );
    add( button6 );
    add( button7 );
    add( button8 );
    add( button9 );
    
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }

  public void actionPerformed( ActionEvent evt)
  {
    // check which command has been sent
    if ( evt.getActionCommand().equals( "7" )&&ctr==1)
    {
      getContentPane().setBackground(  Color.blue  );
      ctr+=1;
    }
    else if (evt.getActionCommand().equals("3")&&ctr==2)
    {
      getContentPane().setBackground(Color.blue);
      ctr+=1;
    }
    else if (evt.getActionCommand().equals("5")&&ctr==3)
    {
      getContentPane().setBackground(Color.blue);
      ctr+=1;
    }
    else 
    {
      getContentPane().setBackground( Color.red );
      repaint();
      ctr=1;
    }
    if(ctr>=4)
    {
      System.exit(0);
    }
  }
  public static void main ( String[] args )
  {
    TenButtons demo  = new TenButtons( "Click a Button" ) ;
    
    demo.setSize( 200, 150 );     
    demo.setVisible( true );      
  }
}
  