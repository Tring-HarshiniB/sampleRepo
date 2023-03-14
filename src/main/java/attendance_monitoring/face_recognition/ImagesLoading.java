package attendance_monitoring.face_recognition;

import java.awt.Graphics; 
import java.awt.Image; 
import java.awt.image.BufferedImage; 
 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
 
public class ImagesLoading extends JPanel { 
 
   public void paint(Graphics g) { 
      Image img = createImageWithText(); 
      g.drawImage(img, 20,20,this); 
   } 
 
   private Image createImageWithText(){ 
      BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB); 
      Graphics g = bufferedImage.getGraphics(); 
 
      g.drawString("string1", 20,20); 
      g.drawString("string2", 20,40); 
      g.drawString("string3", 20,60); 
      g.drawString("string4", 20,80); 
      
      return bufferedImage; 
   } 
    
   public static void main(String[] args) { 
      JFrame frame = new JFrame(); 
      frame.getContentPane().add(new ImagesLoading()); 
 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      frame.setSize(200, 200); 
      frame.setVisible(true); 
   } 
} 