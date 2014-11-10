/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package urlimage;

import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jonatanLara
 */
public class URLImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Image images = null;
        try {
            URL url= new URL("http://lh5.googleusercontent.com/-UzW5aTVIdo8/AAAAAAAAAAI/AAAAAAAABOc/JGCWrabJ6jc/s512-c/photo.jpg");
            images = ImageIO.read(url);
        } catch (Exception e) {
        }
        
        JFrame marco = new JFrame();
        marco.setSize(500, 500);
        JLabel label = new JLabel(new ImageIcon(images));
        marco.add(label);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
