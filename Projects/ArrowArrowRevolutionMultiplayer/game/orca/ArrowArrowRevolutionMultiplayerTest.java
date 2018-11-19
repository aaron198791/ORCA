
package game.orca;

import javax.swing.JFileChooser;
import java.awt.Container;
import  java.awt.Component;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;
public class ArrowArrowRevolutionMultiplayerTest{
public static void main(String[] args)
{
	/*JFrame frame = new JFrame();
JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(frame);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
       System.out.println("You chose to open this file: " +chooser.getSelectedFile().getName());
    }*/
ArrowArrowRevolutionMultiplayer run = new ArrowArrowRevolutionMultiplayer();
run.game();
}
}