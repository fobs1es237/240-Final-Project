import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myJPanel extends JPanel implements ActionListener
{
    myJPanel1 p1;
    myJPanel2 p2;
    myJPanel3 p3;
    myJTabbedPane p4;
	public myJPanel()
	{
		setLayout(new BorderLayout());
	        p1 = new myJPanel1();
                p2 = new myJPanel2();
                p3 = new myJPanel3();
                p4 = new myJTabbedPane();
                add(p1, "Center");
                p1.j1.addActionListener(this);
                p1.j2.addActionListener(this);
                p1.j3.addActionListener(this);
                p2.b1.addActionListener(this);
                p3.b1.addActionListener(this);
        }

    @Override
    public void actionPerformed(ActionEvent event) 
    {
        Object obj1 = event.getSource();
        if (obj1 == p1.j1)
        {
            remove(p1);
            add(p4,"Center");
            validate();
            repaint();
        }
        else if (obj1 == p1.j2)
        {
            remove(p1);
            add(p2,"Center");
            validate();
            repaint();     
        }
        else if (obj1 == p1.j3)
        {
            remove(p1);
            add(p3,"Center");
            validate();
            repaint();
        }
        else if (obj1 == p2.b1)
        {
            remove(p2);
            add(p1,"Center");
            validate();
            repaint();
        }
        else if (obj1 == p3.b1)
        {
            remove(p3);
            add(p1,"Center");
            validate();
            repaint();
        }
    }

}