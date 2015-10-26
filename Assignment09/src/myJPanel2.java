
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zxm117
 */
public class myJPanel2 extends JPanel  
{
	JButton b1;
        JLabel label;
	public myJPanel2()
	{
		super();
		setBackground(Color.CYAN);
                label = new JLabel ("INSTRUCTIONS WILL BE HERE");
                b1 = new JButton ("Return to home screen.");
                add(b1);
                add(label);
        }

		
}
