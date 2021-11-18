
 
	import java.awt.*;

	
	import javax.swing.*;

	public class Calculator extends JFrame {
	   private JButton keys[];
	   private JPanel keyPad;
	   private JTextField lcd;

	   
	   public Calculator()
	   {
	      super( "Calculator" );

	      lcd = new JTextField( 20 );
	      lcd.setEditable( true );

	      keys = new JButton[ 16 ];

	      
	      for ( int i = 0; i <= 9; i++ )
	         keys[ i ] = new JButton( String.valueOf( i ) );

	      
	      keys[ 10 ] = new JButton( "/" );
	      keys[ 11 ] = new JButton( "*" );
	      keys[ 12 ] = new JButton( "-" );
	      keys[ 13 ] = new JButton( "+" );
	      keys[ 14 ] = new JButton( "=" );
	      keys[ 15 ] = new JButton( "." );

	      
	      keyPad = new JPanel();
	      keyPad.setLayout( new GridLayout( 4, 4 ) );

	      
	     
	      for ( int i = 7; i <= 10; i++ )
	         keyPad.add( keys[ i ] );

	      
	      for ( int i = 4; i <= 6; i++ )
	         keyPad.add( keys[ i ] );

	      
	      keyPad.add( keys[ 11 ] );

	      
	      for ( int i = 1; i <= 3; i++ )
	         keyPad.add( keys[ i ] );

	      
	      keyPad.add( keys[ 12 ] );

	      
	      keyPad.add( keys[ 0 ] );

	      
	      for ( int i = 15; i >= 13; i-- )
	         keyPad.add( keys[ i ] );

	      
	      Container container = getContentPane();
	      container.add( lcd, BorderLayout.NORTH );
	      container.add( keyPad, BorderLayout.CENTER );

	      setSize( 300, 300 );
	      setVisible( true );

	   }  

	   
	   public static void main( String args[] )
	   {
	      Calculator application = new Calculator();

	      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	   }

	}  

