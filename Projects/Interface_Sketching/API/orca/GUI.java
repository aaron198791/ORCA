package API.orca;
import API.orca.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.io.*;
import java.nio.file.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class GUI implements ActionListener{
	public void account(String username){
		File file = new File("API\\orca\\users\\" + username + ".txt");
		JFrame baseScreen = new JFrame();
		baseScreen.setBounds(700, 400, 300, 300);
		baseScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button1 = new JButton("Display notes");
		button1.setActionCommand("display notes");
		button1.addActionListener(this);
		button1.setToolTipText("Display Notes");
		baseScreen.getContentPane().add(button1, BorderLayout.NORTH);
		baseScreen.setVisible(true);//For when it's ready
	}
	public void actionPerformed(ActionEvent e){
		if("display notes".equals(e.getActionCommand())){
			System.out.println("Time for the next step");
		}
	}
	public static void main(String[] args){
	}
}