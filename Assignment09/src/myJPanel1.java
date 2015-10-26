
import java.awt.Color;
import javax.swing.ImageIcon;
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
public class myJPanel1 extends JPanel
{
    JButton j1, j2, j3;
    JLabel lab1;
    ImageIcon b;

    public myJPanel1()
    {
    super();
		setBackground(Color.pink);
		
		setLayout(null);

		j1 = new JButton("New Game");
                j2 = new JButton("Instructions");
                j3 = new JButton("About Us");
                lab1 = new JLabel();
                
                b = new ImageIcon("images/bowling.jpg");
                lab1.setIcon(b);
                
                j1.setBackground(Color.yellow);
                j2.setBackground(Color.PINK);
                j3.setBackground(Color.GREEN);
                
                add(j1);
                add(j2);
                add(j3);
                add(lab1);
                
                j1.setBounds(00, 512, 333, 100);
                j2.setBounds(333, 512, 333, 100);
                j3.setBounds(666, 512, 333, 100);
                lab1.setBounds(0, 0, 1000, 550);
    }
}
