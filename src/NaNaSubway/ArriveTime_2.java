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
	
	private JTextField startScanner;	//출발지 입력받는 변수
	private JTextField arriveScanner;	//도착지 입력받는 변수
	private String arrive;
	private String start;
	
	public ArriveTime_2() {
		
		setTitle("NaNaSubway");	//frame상단에 NANASUBWAY출력
		
		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); //frame크기 지정
		
		setResizable(false); //사용자 마음대로 frame 변경X
		
		setLocationRelativeTo(null); //frame 가운데에서 열림
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame닫기
		
		getContentPane().setLayout(null); //개발자 마음대로 레이아웃 지정
		
		initialize(); //initialize 메서드 호출
	}

	private void initialize() {
		
		
		JPanel ArriveTime = new JPanel();	//메인 패널 생성
		ArriveTime.setBackground(Color.WHITE);
		ArriveTime.setBounds(0, 0, 1280, 720);
		getContentPane().add(ArriveTime);
		ArriveTime.setLayout(null);
		
		JButton searchBtn = new JButton("\uAC80\uC0C9\r\n");
		searchBtn.setForeground(Color.DARK_GRAY);
		searchBtn.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		searchBtn.setBackground(SystemColor.menu);
		searchBtn.setFocusable(false);
		searchBtn.setBounds(958, 391, 124, 47);
		ArriveTime.add(searchBtn);
		
		JButton backbtn = new JButton("돌아가기");		//back버튼 생성
		backbtn.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		backbtn.setBounds(1075, 615, 191, 55);
		backbtn.setBackground(SystemColor.menu);
		backbtn.setFocusable(false);
		ArriveTime.add(backbtn);
		
		//텍스트
		JLabel text2 = new JLabel(" 역");	
		text2.setForeground(new Color(51, 102, 0));
		text2.setFont(new Font("함초롬돋움", Font.PLAIN, 45));
		text2.setBounds(1128, 131, 62, 66);
		ArriveTime.add(text2);
		
		JLabel text1 = new JLabel(" 역");
		text1.setForeground(new Color(51, 102, 0));
		text1.setFont(new Font("함초롬돋움", Font.PLAIN, 45));
		text1.setBounds(1128, 302, 62, 66);
		ArriveTime.add(text1);
		
		JLabel arriveScan = new JLabel("도착지");
		arriveScan.setForeground(new Color(51, 102, 0)); arriveScan.setFont(new Font("함초롬돋움", Font.PLAIN, 45)); arriveScan.setBounds(950, 221, 132, 66);
		ArriveTime.add(arriveScan);
		
		JLabel startScan = new JLabel("출발지");
		startScan.setForeground(new Color(51, 102, 0));
		startScan.setFont(new Font("함초롬돋움", Font.PLAIN, 45));
		startScan.setBounds(950, 52, 132, 66);
		ArriveTime.add(startScan);
		
		//도착지를 입력받는 필드
		arriveScanner = new JTextField();
		arriveScanner.setHorizontalAlignment(SwingConstants.CENTER);
		arriveScanner.setForeground(new Color(51, 102, 0));
		arriveScanner.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		arriveScanner.setColumns(10);
		arriveScanner.setBounds(837, 298, 292, 81);
		arriveScanner.setOpaque(false);
		ArriveTime.add(arriveScanner);
		
		
		//출발지를 입력받는 필드
		startScanner = new JTextField();
		startScanner.setHorizontalAlignment(SwingConstants.CENTER);
		startScanner.setForeground(new Color(51, 102, 0));
		startScanner.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
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
		
		JLabel note = new JLabel("띄어쓰기 X");
		note.setForeground(new Color(51, 204, 0));
		note.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
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
		print.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		print.setBackground(new Color(255, 255, 204));
		print.setBounds(14, 12, 1018, 96);
		printbox.add(print);
		
		JLabel print2 = new JLabel();
		print2.setHorizontalAlignment(SwingConstants.CENTER);
		print2.setForeground(new Color(51, 102, 0));
		print2.setFont(new Font("함초롬돋움", Font.PLAIN, 40));
		print2.setBackground(new Color(255, 255, 204));
		print2.setBounds(14, 107, 1018, 96);
		printbox.add(print2);
		
		searchBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				start = startScanner.getText();
				arrive = arriveScanner.getText();
				
				print.setText(start + "역에서 " + arrive +"역 까지 ");
				
				if(Start_To_Arrive(start,arrive)>=60) {
					print2.setText("약 "+ Start_To_Arrive(start, arrive)/60 +"시간  "+Start_To_Arrive(start, arrive)%60+" 분 소요됩니다. ");
				}else {
				print2.setText("약 "+ Start_To_Arrive(start, arrive) + " 분 소요됩니다. ");
				}
				
			}
		});
	}
	
	public int Start_To_Arrive(String start, String arrive) {
		
		int s_address=0;	//출발지 배열의 주소값
		
		for(int i = 0; i<Sub_station.station2.length; i++) {
			
			if(start.equals(Sub_station.station2[i])) { //입력받은 출발역의 값과 역 배열 비교하여 주소값 찾기
				
				s_address=i; //주소값 대입
				
			}
		}
		
		int a_address=0;	//도착지 배열의 주소값
		
		for(int i = 0; i < Sub_station.station2.length; i++) {
			
			if(arrive.equals(Sub_station.station2[i])) { //입력받은 도착역의 값과 역 배열 비교하여 주소값 찾기
				
				a_address=i; //주소값 대입
				
			}
		}
		
		int length_station; //역에서 역까지의 길이
		int right, left; //시계방향, 시계반대방향의 역의 개수
		int alltime = 0; //총 소요시간
		int time = 140;
		
			 if(a_address>s_address) { //도착의 주소값이 크면 (도착-출발)
				 
				 length_station = a_address-s_address;
				 
			 } else { //아니면 (출발-도착)
				 
				 length_station = s_address-a_address;
				 
			 }
			 
			 right = Sub_station.station2.length - length_station; //오른쪽 거리
			 
			 left = length_station; //왼쪽 거리
			 
			 if(right>left) { //갈 방향 고르기
				 
				 alltime = left*time;
				 
			 } else {
				 
				 alltime = right*time;
				 
			 }
			 
		return alltime/60;
	}
}