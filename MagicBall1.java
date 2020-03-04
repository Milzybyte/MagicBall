import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MagicBall1 extends JFrame implements ActionListener
{
	//instances and vars and constants
	JLabel title = new JLabel("Magic8Ball");
	JLabel input = new JLabel("");
	JTextField ask = new JTextField(15);
	JLabel respons = new JLabel("");
	JButton button = new JButton("ASK!");
	
	//constructor method 
	public MagicBall1()
	{
		super("Magic Ball");
		setBounds(670, 450, 200, 180);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		add(title);
		add(input);
		add(ask);
		add(respons);
		add(button);
		button.addActionListener(this);
		ask.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		game();
	}
	public void game()
	{
		// array to hold 8-ball responses
		String[] responses = {"It is certain", "Ask again later", "Very doubtful", "Don't count on it", "Signs point to YES", "dout it", "it wont happen", "think again", "are you lost", "i win you loss", "just walk away", "please stop asking"};
		//String question = "";
		int randomNum = (int)(Math.random() * responses.length);
		respons.setText(responses[randomNum]);
	}
	public static void main(String[] args)
	{
		MagicBall1 askme = new MagicBall1();
		askme.setVisible(true);
	}
}