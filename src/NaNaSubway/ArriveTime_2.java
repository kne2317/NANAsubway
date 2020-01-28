package NaNaSubway;

import java.util.Random;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.DropMode;

public class ArriveTime_2 extends JFrame {
	
	private JTextField startScanner;	//����� �Է¹޴� ����
	private JTextField arriveScanner;	//������ �Է¹޴� ����
	private String arrive;
	private String start;
	
	public ArriveTime_2() {
		
		setTitle("NaNaSubway");	//frame��ܿ� NANASUBWAY���
		
		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); //frameũ�� ����
		
		setResizable(false); //����� ������� frame ����X
		
		setLocationRelativeTo(null); //frame ������� ����
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame�ݱ�
		
		getContentPane().setLayout(null); //������ ������� ���̾ƿ� ����
		
		initialize(); //initialize �޼��� ȣ��
	}

	private void initialize() {
		
		
		JPanel ArriveTime = new JPanel();	//���� �г� ����
		ArriveTime.setBackground(Color.WHITE);
		ArriveTime.setBounds(0, 0, 1280, 720);
		getContentPane().add(ArriveTime);
		ArriveTime.setLayout(null);
		
		JButton searchBtn = new JButton("\uAC80\uC0C9\r\n");
		searchBtn.setForeground(Color.DARK_GRAY);
		searchBtn.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		searchBtn.setBackground(SystemColor.menu);
		searchBtn.setFocusable(false);
		searchBtn.setBounds(958, 391, 124, 47);
		ArriveTime.add(searchBtn);
		
		JButton backbtn = new JButton("���ư���");		//back��ư ����
		backbtn.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		backbtn.setBounds(1075, 615, 191, 55);
		backbtn.setBackground(SystemColor.menu);
		backbtn.setFocusable(false);
		ArriveTime.add(backbtn);
		
		//�ؽ�Ʈ
		JLabel text2 = new JLabel(" ��");	
		text2.setForeground(new Color(51, 102, 0));
		text2.setFont(new Font("���ʷҵ���", Font.PLAIN, 45));
		text2.setBounds(1128, 131, 62, 66);
		ArriveTime.add(text2);
		
		JLabel text1 = new JLabel(" ��");
		text1.setForeground(new Color(51, 102, 0));
		text1.setFont(new Font("���ʷҵ���", Font.PLAIN, 45));
		text1.setBounds(1128, 302, 62, 66);
		ArriveTime.add(text1);
		
		JLabel arriveScan = new JLabel("������");
		arriveScan.setForeground(new Color(51, 102, 0)); arriveScan.setFont(new Font("���ʷҵ���", Font.PLAIN, 45)); arriveScan.setBounds(950, 221, 132, 66);
		ArriveTime.add(arriveScan);
		
		JLabel startScan = new JLabel("�����");
		startScan.setForeground(new Color(51, 102, 0));
		startScan.setFont(new Font("���ʷҵ���", Font.PLAIN, 45));
		startScan.setBounds(950, 52, 132, 66);
		ArriveTime.add(startScan);
		
		//�������� �Է¹޴� �ʵ�
		arriveScanner = new JTextField();
		arriveScanner.setHorizontalAlignment(SwingConstants.CENTER);
		arriveScanner.setForeground(new Color(51, 102, 0));
		arriveScanner.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		arriveScanner.setColumns(10);
		arriveScanner.setBounds(837, 298, 292, 81);
		arriveScanner.setOpaque(false);
		ArriveTime.add(arriveScanner);
		
		
		//������� �Է¹޴� �ʵ�
		startScanner = new JTextField();
		startScanner.setHorizontalAlignment(SwingConstants.CENTER);
		startScanner.setForeground(new Color(51, 102, 0));
		startScanner.setFont(new Font("���ʷҵ���", Font.PLAIN, 30));
		startScanner.setBounds(837, 130, 292, 81);
		startScanner.setOpaque(false);
		ArriveTime.add(startScanner);
		startScanner.setColumns(10);
		
		
		JLabel subwaylogo = new JLabel();
		subwaylogo.setIcon(new ImageIcon("2subway Icon.jpg"));
		subwaylogo.setBounds(814, 42, 400, 400);
		ArriveTime.add(subwaylogo);
		
		JLabel trainMap = new JLabel();
		trainMap.setIcon(new ImageIcon("2TrainMap2.jpg"));
		trainMap.setBounds(101, 24, 699, 418);
		ArriveTime.add(trainMap);
		
		JLabel note = new JLabel("���� X");
		note.setForeground(new Color(51, 204, 0));
		note.setFont(new Font("���ʷҵ���", Font.PLAIN, 20));
		note.setBounds(1077, 454, 104, 37);
		ArriveTime.add(note);
		
		JPanel printbox = new JPanel();
		printbox.setBackground(new Color(255, 255, 204));
		printbox.setBounds(14, 454, 1046, 215);
		ArriveTime.add(printbox);
		printbox.setLayout(null);
		
		backbtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ArriveTime.setVisible(false);
				dispose();
				Choose_2 ch=new Choose_2();
				ch.setVisible(true);
				
			}
		});
		
		JLabel print = new JLabel();
		print.setHorizontalAlignment(SwingConstants.CENTER);
		print.setForeground(new Color(51, 102, 0));
		print.setFont(new Font("���ʷҵ���", Font.PLAIN, 40));
		print.setBackground(new Color(255, 255, 204));
		print.setBounds(14, 12, 1018, 96);
		printbox.add(print);
		
		JLabel print2 = new JLabel();
		print2.setHorizontalAlignment(SwingConstants.CENTER);
		print2.setForeground(new Color(51, 102, 0));
		print2.setFont(new Font("���ʷҵ���", Font.PLAIN, 40));
		print2.setBackground(new Color(255, 255, 204));
		print2.setBounds(14, 107, 1018, 96);
		printbox.add(print2);
		
		searchBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				start = startScanner.getText();
				arrive = arriveScanner.getText();
				
				print.setText(start + "������ " + arrive +"�� ���� ");
				
				if(Start_To_Arrive(start,arrive)>=60) {
					print2.setText("�� "+ Start_To_Arrive(start, arrive)/60 +"�ð�  "+Start_To_Arrive(start, arrive)%60+" �� �ҿ�˴ϴ�. ");
				}else {
				print2.setText("�� "+ Start_To_Arrive(start, arrive) + " �� �ҿ�˴ϴ�. ");
				}
				
			}
		});
	}
	
	public int Start_To_Arrive(String start, String arrive) {
		
		int s_address=0;	//����� �迭�� �ּҰ�
		
		for(int i = 0; i<Sub_station.station2.length; i++) {
			
			if(start.equals(Sub_station.station2[i])) { //�Է¹��� ��߿��� ���� �� �迭 ���Ͽ� �ּҰ� ã��
				
				s_address=i; //�ּҰ� ����
				
			}
		}
		
		int a_address=0;	//������ �迭�� �ּҰ�
		
		for(int i = 0; i < Sub_station.station2.length; i++) {
			
			if(arrive.equals(Sub_station.station2[i])) { //�Է¹��� �������� ���� �� �迭 ���Ͽ� �ּҰ� ã��
				
				a_address=i; //�ּҰ� ����
				
			}
		}
		
		int length_station; //������ �������� ����
		int right, left; //�ð����, �ð�ݴ������ ���� ����
		int alltime = 0; //�� �ҿ�ð�
		int time = 140;
		
			 if(a_address>s_address) { //������ �ּҰ��� ũ�� (����-���)
				 
				 length_station = a_address-s_address;
				 
			 } else { //�ƴϸ� (���-����)
				 
				 length_station = s_address-a_address;
				 
			 }
			 
			 right = Sub_station.station2.length - length_station; //������ �Ÿ�
			 
			 left = length_station; //���� �Ÿ�
			 
			 if(right>left) { //�� ���� ����
				 
				 alltime = left*time;
				 
			 } else {
				 
				 alltime = right*time;
				 
			 }
			 
		return alltime/60;
	}
}