package NaNaSubway;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.SystemColor;

public class Intro extends JFrame{
	
	public Intro() {
		
		setTitle("NaNaSubway");	//frame상단에 NANASUBWAY출력
		
		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); //frame크기 지정
		
		setResizable(false); //사용자 마음대로 frame 변경X
		
		setLocationRelativeTo(null); //frame 가운데에서 열림
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame닫기
		
		getContentPane().setLayout(null); //개발자 마음대로 레이아웃 지정
		
		initialize(); //initialize 메서드 호출
	}
	

	void initialize() {
		
		JPanel intro = new JPanel();
		intro.setBounds(0, 0, 1280, 720);
		getContentPane().add(intro);
		intro.setLayout(null);
		intro.setVisible(true);
		
		JButton endbtn = new JButton("종료");
		endbtn.setBackground(SystemColor.menu);
		endbtn.setBounds(965, 244, 217, 83);
		endbtn.setFocusable(false);
		intro.add(endbtn);
		
		JButton startbtn = new JButton("시작");
		startbtn.setBackground(SystemColor.menu);
		startbtn.setBounds(966, 121, 216, 83);
		startbtn.setFocusable(false);
		intro.add(startbtn);
		
		
		startbtn.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		endbtn.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		
		
		JLabel intro_background = new JLabel("New label");
		intro_background.setIcon(new ImageIcon("introBackground.jpg"));
		intro_background.setBounds(0, 0, 1280, 720);
		intro.add(intro_background);
		
		
		startbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChooseSubway ch_sub=new ChooseSubway();
				intro.setVisible(false);
				dispose();
				ch_sub.setVisible(true);
	          }
		});
		endbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}		
		});
	}
}