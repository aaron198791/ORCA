package API.orca;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.io.*;
import java.nio.file.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class FrameTest implements ActionListener {
	private JFrame frame;
	public JTextField username;
	public JTextField password;
	public JButton button;
	
	public FrameTest(){
		this.frame = framer();
		this.username = buildUsername();
		this.password = buildPassword();
		this.button = submitButton();
		this.frame.getContentPane().add(this.username, BorderLayout.NORTH);
		this.frame.getContentPane().add(this.password, BorderLayout.CENTER);
		this.frame.getContentPane().add(this.button, BorderLayout.SOUTH);
	}
	public static JFrame framer(){
		JFrame frame = new JFrame();
		frame.setBounds(700, 400, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return frame;
	}
	public JTextField buildUsername(){
		JTextField username = new JTextField();
		username.setText("Username:");
		username.addActionListener(this);
		return username;
	}
	public JTextField buildPassword(){
		JTextField password = new JTextField();
		password.setText("Password:");
		password.addActionListener(this);
		return password;
	}
	public JButton submitButton(){
		JButton button = new JButton("Submit");
		button.setMnemonic(KeyEvent.VK_ENTER);
		button.setActionCommand("submit");
		button.addActionListener(this);
		button.setToolTipText("Submit");
		return button;
	}
	public void actionPerformed(ActionEvent e){
		if("submit".equals(e.getActionCommand())){
			String user = username.getText();
			String usern[] = user.split("Username:");
			String pass = password.getText();
			String[] passw = pass.split("Password:");
			user = "";
			pass = "";
			user += usern[0];
			user += usern[1];
			pass += passw[0];
			pass += passw[1];
			try{
				Path path = Paths.get("API/orca/Accounts.txt");
				File output = path.toFile();
				FileWriter writer = new FileWriter(output, true);
				writer.write(user + ";" + pass + "\n");
				writer.close();
			}
			catch(IOException o){
				System.err.println(o + "Please create an Accounts.txt file along the path API/orca. Otherwise, the program cannot run");
			}
			System.exit(0);
		}
	}
//	public static void submitKey(){
//		InputMap im = new InputMap();
//		ActionMap am = new ActionMap();
//		im.put(KeyStroke.getKeyStroke("ENTER"), KeyEvent.VK_ENTER);
//		am.put(KeyEvent.VK_ENTER, SubmitAction());
//	}
	public static void main(String[] args){
		FrameTest window = new FrameTest();
		window.frame.setVisible(true);
	}
	public static JFrame frameBuilder(String title){//Mostly drawn from https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html , hence the comments
		JFrame.setDefaultLookAndFeelDecorated(true);
		//1. Create the frame.
		JFrame frame = new JFrame(title);
		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//3. Create components and put them in the frame.
		//...create emptyLabel...
		Label emptyLabel = new Label();
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		//4. Size the frame.
		frame.pack();
		frame.setLocationRelativeTo(null);
		//5. Show it.
		frame.setVisible(true);
		return frame;
	}
}