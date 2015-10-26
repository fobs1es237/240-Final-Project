
import java.awt.Color;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
public class myGamePanel extends JPanel implements ChangeListener
{
    JLabel lab1;
    JButton b1;
    myTab1 t1;
    myTab2 t2;
    myTab3 t3;
    JLabel jl1, jl2, jl3;
    public myGamePanel(myTab1 x, myTab2 y, myTab3 z)
    {
        super();
        t1 = x;
        t2 = y;
        t3 = z;
                //setLayout(new GridLayout());
		setBackground(Color.RED);
                lab1 = new JLabel ("THE ACTUALL GAME WILL BE HERE");
                b1 = new JButton ("Return to home screen.");
                

                
                add(b1);
                add(lab1);

                
                
                
     	    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue) 
    {
       System.out.println(oldValue +""+newValue);
    }
    }

