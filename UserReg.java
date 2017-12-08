import javax.swing.*;
import java.awt.*;

public class UserReg  extends JFrame{
	UserReg(String title){
		setTitle(title);
		setSize(300,300);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField fie=new JTextField(10);
		JPasswordField pas=new JPasswordField(10);

		JLabel lab=new JLabel("メールアドレス");
		JLabel lab1=new JLabel("パスワード");
		JPanel pan=new JPanel();
		pan.setLayout(new GridLayout(2,2));

		pan.add(lab,BorderLayout.CENTER);
		pan.add(fie,BorderLayout.CENTER);
		pan.add(lab1,BorderLayout.CENTER);
		pan.add(pas,BorderLayout.CENTER);

		Container c=getContentPane();
		c.add(pan,BorderLayout.CENTER);

	}
	public static void main(String[] args){
		UserReg usa=new UserReg("Hello");
		usa.setVisible(true);
	}
}