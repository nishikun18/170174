import javax.swing.*;
import java.awt.*;

public class TestCheckBox extends JFrame{
	TestCheckBox(String title){
		setTitle(title);
		setSize(100,100);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pan=new JPanel();

		JCheckBox b1=new JCheckBox("1");
		JCheckBox b2=new JCheckBox("2");
		JCheckBox b3=new JCheckBox("3");

		pan.add(b1);
		pan.add(b2);
		pan.add(b3);

		Container c=getContentPane();
		c.add(pan,BorderLayout.NORTH);

	}

	public static void main(String args[]){
		TestCheckBox t=new TestCheckBox("Hello");
		t.setVisible(true);
	}
}