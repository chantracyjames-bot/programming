package tracy.calc;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class idkman {
    public static void tarcySux() {
        SwingUtilities.invokeLater(() -> {
            try {
                File file = new File("/home/tarcy/Downloads/667831464_2146533686290311_2485997770010834743_n.jpg");
                BufferedImage probs = ImageIO.read(file);

                JFrame yes = new JFrame("tarcy sux");
                yes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon no = new ImageIcon(probs);
                JLabel maybe = new JLabel(no);

                yes.add(maybe);
                yes.pack();
                yes.setLocationRelativeTo(null);
                yes.setVisible(true);
            } catch (IOException e) {
                System.out.println("help: " + e);
            }
        }); 
    }

    public static void mrkrabs() {
        SwingUtilities.invokeLater(() -> {
            try {
                File file = new File("/home/tarcy/Downloads/download (8).jpeg");
                BufferedImage probs = ImageIO.read(file);

                JFrame yes = new JFrame("stupid calculator");
                yes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                ImageIcon no = new ImageIcon(probs);
                JLabel maybe = new JLabel(no);

                yes.add(maybe);
                yes.pack();
                yes.setLocationRelativeTo(null);
                yes.setVisible(true);

                String videoPath = "/home/tarcy/Downloads/snaptik_7355506070225194273_v3.mp4";
                String[] command = {
                    "haruna", videoPath
                };

                ProcessBuilder pb = new ProcessBuilder(command);
                pb.start();
            } catch (IOException e) {
                System.out.println("help: " + e);
            }
        }); 
    }
}
