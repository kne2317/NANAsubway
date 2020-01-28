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
		
		setTitle("NaNaSubway");	//frame��ܿ� NANASUBWAY���
		
		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); //frameũ�� ����
		
		setResizable(false); //����� ������� frame ����X
		
		setLocationRelativeTo(null); //frame ������� ����
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame�ݱ�
		
		getContentPane().setLayout(null); //������ ������� ���̾ƿ� ����
		
		initialize(); //initialize �޼��� ȣ��
	}
	

	void initialize() {
		
		JPanel intro = new JPanel();
		intro.setBounds(0, 0, 1280, 720);
		getContentPane().add(intro);
		intro.setLayout(null);
		intro.setVisible(true);
		
		JButton endbtn = new JButton("����");
		endbtn.setBackground(SystemColor.menu);
		endbtn.setBounds(965, 244, 217, 83);
		endbtn.setFocusable(false);
		intro.add(endbtn);
		
		JButton startbtn = new JButton("����");
		startbtn.setBackground(SystemColor.menu);
		startbtn.setBounds(966, 121, 216, 83);
		startbtn.setFocusable(false);
		intro.add(startbtn);
		
		
		startbtn.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		endbtn.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		
		
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