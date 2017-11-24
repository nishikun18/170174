import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello extends JFrame{
	Hello(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn=new JButton("click Me!");
		JPanel pan=new JPanel();
		pan.add(btn);

		Container c=getContentPane();
		c.add(pan,BorderLayout.CENTER);

	}
	public static void main(String[] args){
		Hello hello=new Hello("Hello");
		hello.setVisible(true);
	}
}