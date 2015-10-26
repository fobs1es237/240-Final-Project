import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class myJFrame extends JFrame
{
    
	public myJFrame ()
	{
		super ("Group 3 - Assignment 08");
  	 	myJPanel mjp = new myJPanel();
		getContentPane().add(mjp,"Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (1000, 650);
		setVisible(true);
                

                
	}

}