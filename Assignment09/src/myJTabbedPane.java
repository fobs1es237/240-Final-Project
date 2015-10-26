import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class myJTabbedPane extends JTabbedPane
{
	myTab1  tb1;
	myTab2  tb2;
	myTab3  tb3; 
        myGamePanel mgp;
	
	public myJTabbedPane()
	{
		setBackground(Color.pink);
    	tb1 = new myTab1();
    	tb2 = new myTab2();
    	tb3 = new myTab3();
        mgp = new myGamePanel(tb1, tb2, tb3);
        
    	
    	addTab("Difficulty", tb1);
    	addTab("Theme", tb2);
    	addTab("Number of Computer Players", tb3);
        addTab("Final Selections", mgp);
        this.addChangeListener(new ChangeListener(){

                    @Override
                    public void stateChanged(ChangeEvent ce) {
                        JTabbedPane pane = (JTabbedPane)ce.getSource();
                        int x = pane.getSelectedIndex();
                        
                        if (x == 3)
                        {
                            String diff = tb1.jcb.getSelectedItem().toString();
                            String theme = tb2.jcb.getSelectedItem().toString();
                            String players = tb3.jcb.getSelectedItem().toString();
                
                            mgp.jl1 = new JLabel(diff);
                            mgp.jl2 = new JLabel(theme);
                            mgp.jl3 = new JLabel(players);
                            
                            mgp.add(mgp.jl1);
                            mgp.add(mgp.jl2);
                            mgp.add(mgp.jl3);
                            
                        }
                    } //To change body of generated methods, choose Tools | Templates.
                    }
);
        
	}

    /*@Override
    public void actionPerformed(ActionEvent event) 
    {
        Object obj = event.getSource();
        if (obj == tb1.jb1)
        {
            tb1.setSelectedIndex(0);  // 0 activates the first tab
//-------------------------------------------
	    	tb1.setEnabledAt(0,true);
    		mjp1.setEnabledAt(1,false);
    		mjp1.setEnabledAt(2,false);
        }
        
    }*/


}