
import java.awt.Color;
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
public class myTab2 extends JPanel
{
    //JButton jb1;
    JComboBox jcb;
    public myTab2()
    {
        setBackground(Color.MAGENTA);
        jcb = new JComboBox();
        jcb.addItem("Please Select a Theme");
        jcb.addItem("IST");
    	jcb.addItem("PSU");
    	jcb.addItem("Soccer");
	add(jcb);
        //jb1 = new JButton("Next");
        //add(jb1);
    }
    
}
