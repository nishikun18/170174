import javax.swing.*;
import java.awt.*;

public class TestJPasswordField extends JFrame{
	TestJPasswordField(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPasswordField fie=new JPasswordField("hello",10);

		JPanel pan=new JPanel();
		pan.add(fie,BorderLayout.NORTH);

		Container c=getContentPane();
		c.add(pan,BorderLayout.NORTH);
	}
	public static void main(String[] args){
		TestJPasswordField pas=new TestJPasswordField("Hello");
		pas.setVisible(true);
	}
}