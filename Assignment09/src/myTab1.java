
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class myTab1 extends JPanel
{
    //JButton jb1;
    JComboBox jcb;
    public myTab1()
    {
        setBackground(Color.MAGENTA);
        jcb = new JComboBox();
        jcb.addItem("Please Select a Difficulty Level");
        jcb.addItem("Easy");
    	jcb.addItem("Medium");
    	jcb.addItem("Hard");
	add(jcb);
        //jb1 = new JButton("Next");
        //add(jb1);
    }
}
