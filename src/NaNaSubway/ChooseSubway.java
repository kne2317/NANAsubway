package NaNaSubway;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;

public class ChooseSubway extends JFrame {

	public ChooseSubway() {
		
		setTitle("NaNaSubway");	//frame��ܿ� NANASUBWAY���
		
		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); //frameũ�� ����
		
		setResizable(false); //����� ������� frame ����X
		
		setLocationRelativeTo(null); //frame ������� ����
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame�ݱ�
		
		getContentPane().setLayout(null); //������ ������� ���̾ƿ� ����
		
		initialize(); //initialize �޼��� ȣ��
	}

	private void initialize() {
		
		JPanel chooseSubway = new JPanel();
		chooseSubway.setBounds(0, 0, 1280, 720);
		getContentPane().add(chooseSubway);
		chooseSubway.setLayout(null);
		chooseSubway.setVisible(true);
		
		JButton sub2_btn = new JButton("");
		sub2_btn.setBounds(69, 55, 363, 521);
		sub2_btn.setBorderPainted(false);
		sub2_btn.setContentAreaFilled(false);
		chooseSubway.add(sub2_btn);
		
		JButton sub3_btn = new JButton("");
		sub3_btn.setContentAreaFilled(false);
		sub3_btn.setBorderPainted(false);
		sub3_btn.setBounds(460, 55, 363, 521);
		chooseSubway.add(sub3_btn);
		
		JButton sub4_btn = new JButton("");
		sub4_btn.setContentAreaFilled(false);
		sub4_btn.setBorderPainted(false);
		sub4_btn.setBounds(850, 55, 363, 521);
		chooseSubway.add(sub4_btn);
		
		JButton backBtn = new JButton("\uB3CC\uC544\uAC00\uAE30");
		backBtn.setBackground(SystemColor.menu);
		backBtn.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		backBtn.setBounds(69, 595, 1144, 71);
		chooseSubway.add(backBtn);
		
		JLabel backgroundImg = new JLabel("");
		backgroundImg.setBounds(0, 0, 1280, 720);
		backgroundImg.setIcon(new ImageIcon("choose_Sub.jpg"));
		chooseSubway.add(backgroundImg);
		
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Intro intro=new Intro();
				chooseSubway.setVisible(false);
				dispose();
				intro.setVisible(true);
	          }
		});
		
		sub2_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choose_2 ch2=new Choose_2();
				chooseSubway.setVisible(false);
				dispose();
				ch2.setVisible(true);
	          }
		});
		sub3_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choose_3 ch3=new Choose_3();
				chooseSubway.setVisible(false);
				dispose();
				ch3.setVisible(true);
	          }
		});
		sub4_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Choose_4 ch4=new Choose_4();
				chooseSubway.setVisible(false);
				dispose();
				ch4.setVisible(true);
	          }
		});
	}
}
