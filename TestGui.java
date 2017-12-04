import javax.swing.*;
import java.awt.*;

public class TestGui extends JFrame{
	TestGui(String title){
		setTitle(title);
		setLocation(0,0);
		setSize(1000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField jtf=new JTextField("baka",15);
		JPanel pan=new JPanel();
		pan.add(jtf,BorderLayout.NORTH);
		Container c=getContentPane();
		c.add(pan,BorderLayout.NORTH);

	}
	public static void main(String[] args){
		TestGui gui=new TestGui("Hello");
		gui.setVisible(true);
	}
}
	
