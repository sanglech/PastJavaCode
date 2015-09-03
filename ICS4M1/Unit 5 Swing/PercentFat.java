import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
   
public class PercentFat extends JFrame implements ActionListener
{
  JLabel heading   = new JLabel("Percent of Calories from Fat");
  JLabel fatLabel  = new JLabel("Enter grams of fat:   ");
  JLabel calLabel  = new JLabel("Enter total calories: ");
  JLabel perLabel  = new JLabel("Percent calories from fat: ");
    
  JTextField inFat  = new JTextField( 7 );
  JTextField inCal  = new JTextField( 7 );
  JTextField outPer = new JTextField( 7 );
    
  JButton    doit   = new JButton("Do It!");
    
  double calories ;  // input: total calories per serving
  double fatGrams ;  // input: grams of fat per serving
  double percent;   // result: percent of calories from fat
    
  public PercentFat()   
  {  
    setTitle( "Calories from Fat" );
    setLayout( new FlowLayout() );
   
    add( heading );  
    add( fatLabel );  
    add( inFat );    
    add( calLabel );  
    add( inCal );    
    add( perLabel );   
    add( outPer );   
    outPer.setEditable( false );    
   
    add( doit );     
    doit.addActionListener( this );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }
   
  // The application
  public void calcPercent( )  
  {
    percent = ((fatGrams * 9) / calories) * 100 ;
  }
   
  public void actionPerformed( ActionEvent evt)  
  {
    String userIn ;
    userIn    = inFat.getText()  ;
    fatGrams  = Double.parseDouble( userIn ) ;
   
    userIn    = inCal.getText()  ;
    calories  = Double.parseDouble( userIn ) ;
   
    calcPercent() ;
   
    // Convert percent to a nice string and write it to the output field
    outPer.setText( new DecimalFormat("#0.0##").format( percent ) );
    repaint();                  
  }
   
  public static void main ( String[] args )
  {
    PercentFat fatApp  = new PercentFat() ;
    fatApp.setSize( 280, 200 );     
    fatApp.setVisible( true );         
  }
}
