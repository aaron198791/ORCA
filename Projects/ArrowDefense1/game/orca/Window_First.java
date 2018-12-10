package game.orca;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;

public class Window_First {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * @wbp.nonvisual location=222,9
	 */
	private final JTextField textField_2 = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_First window = new Window_First();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window_First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField_2.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setLocation(new Point(100, 100));
		frame.setBounds(100, 100, 725, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextPane txtpnLoginPage = new JTextPane();
		txtpnLoginPage.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 11));
		txtpnLoginPage.setText("Login Page");
		frame.getContentPane().add(txtpnLoginPage, BorderLayout.NORTH);
		
		txtUserName = new JTextField();
		txtUserName.setForeground(Color.RED);
		txtUserName.setText("User Name:");
		frame.getContentPane().add(txtUserName, BorderLayout.WEST);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtPassword.setText("PassWord:");
		frame.getContentPane().add(txtPassword, BorderLayout.CENTER);
		txtPassword.setColumns(10);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.EAST);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		frame.getContentPane().add(textField_1, BorderLayout.SOUTH);
		textField_1.setColumns(10);
	}

}
