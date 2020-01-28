package NaNaSubway;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class NaNaSubway extends JFrame{
	
	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
		public static void main(String[] args) {
			
            Intro start=new Intro();
            start.setVisible(true);
		}
}