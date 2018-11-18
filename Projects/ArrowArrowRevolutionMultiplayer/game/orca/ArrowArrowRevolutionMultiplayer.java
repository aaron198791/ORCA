package game.orca;

import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import java.awt.Font;
public class ArrowArrowRevolutionMultiplayer {
	public void game(){
		JFrame jframe = new JFrame("ORCA Game");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    // set the jframe size and location, and make it visible
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    jframe.setSize(screenSize.width, screenSize.height);
   // jframe.pack();
    jframe.setLocationRelativeTo(null);
    jframe.setVisible(true);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.black);
	jframe.add(panel);
	
	JButton button = new JButton("Enter the Game");
	 button.setFont(new Font("Courier New", Font.ITALIC, 20));
    button.setForeground(Color.white);

	button.setSize(600,300);
	button.setLocation(300,20);
	button.setBackground(Color.red);
button.setOpaque(true);
button.setBorderPainted(false);
  BufferedImage image;
  try {                
          image = ImageIO.read(new File("C:/Users/SP513/ORCA/Projects/ArrowArrowRevolutionMultiplayer/game/orca/ArrowArrowRevolutionMultiplayerProcessing/Down.jpg"));
       button.setIcon(new ImageIcon(image));
	   } catch (IOException ex) {
		   JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame,"Cannot Find file");
       }
	button.setVisible(true);
	panel.add(button);
	
	button.addActionListener(new ActionListener() { 
  public void actionPerformed(ActionEvent e) { 
 jframe.setVisible(false);	
    JFrame jframe = new JFrame("Welcome to ORCA Game");
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    // set the jframe size and location, and make it visible
   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    jframe.setSize(screenSize.width, screenSize.height);
   // jframe.pack();
    jframe.setLocationRelativeTo(null);
    jframe.setVisible(true);
	JPanel panelGame= new JPanel();
	JButton button1=new JButton("Stats"); //add action listener
	button1.setSize(400,100);
	button1.setLocation(30,100);
	button1.setBackground(Color.red);
button.setOpaque(true);
button.setBorderPainted(false);
panelGame.add(button1);
JButton button2=new JButton("Social"); //add action listener
	button2.setSize(400,100);
	button2.setLocation(500,30);
	button2.setBackground(Color.green);
button2.setOpaque(true);
button2.setBorderPainted(false);
panelGame.add(button2);
	
	JButton button3=new JButton("Enter if you dare"); //add action listener
	button3.setSize(400,100);
	button3.setLocation(600,30);
	button3.setBackground(Color.pink);
button3.setOpaque(true);
button3.setBorderPainted(false);
panelGame.add(button3);
panelGame.setBackground(Color.black);
	jframe.add(panelGame);
	
	
  } 
} );


	}
}