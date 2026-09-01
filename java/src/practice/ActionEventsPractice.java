import javax.swing.*;
import java.awt.event.*;

public class ActionEventsPractice {

	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Happy Coding");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JLabel label = new JLabel();
            
            frame.addMouseListener(new MouseListener(){
                public void mouseClicked(MouseEvent me){
                    label.setText("Mouse clicked. (" + me.getX() + ", " + me.getY() + ")");
                }
                public void mouseEntered(MouseEvent me){
                    label.setText("Mouse entered. (" + me.getX() + ", " + me.getY() + ")");
                }
                public void mouseExited(MouseEvent me){
                    label.setText("Mouse exited. (" + me.getX() + ", " + me.getY() + ")");
                }
                public void mousePressed(MouseEvent me){
                    label.setText("Mouse pressed. (" + me.getX() + ", " + me.getY() + ")");
                }
                public void mouseReleased(MouseEvent me){
                    label.setText("Mouse released. (" + me.getX() + ", " + me.getY() + ")");
                }
            });
            
            frame.addKeyListener(new KeyListener(){
                public void keyPressed(KeyEvent ke){
                    label.setText("Key pressed. (" + ke.getKeyChar() + ")");
                }
                    
                public void keyReleased(KeyEvent ke){
                    label.setText("Key released. (" + ke.getKeyChar() + ")");
                }
        
                public void keyTyped(KeyEvent ke){
                    label.setText("Key typed. (" + ke.getKeyChar() + ")");
                }
            });
            
            frame.add(label);
            
            frame.setSize(300, 300);	
            frame.setVisible(true);
        });
	}
}
