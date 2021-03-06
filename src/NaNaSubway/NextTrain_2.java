package NaNaSubway;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class NextTrain_2 extends JFrame {
	private String nowStation; 		// 현재 역
	protected int[] subwaynumleft = { 2094, 2148, 2192, 2934, 2010, 2044, 2098, 2145 }; // 열차번호
	protected int[] subwaynumright = { 2084, 2138, 2144, 2278, 2344, 2946, 2926, 2052 }; // 열차번호

	public NextTrain_2() {

		setTitle("NaNaSubway"); // frame상단에 NANASUBWAY출력

		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); // frame크기 지정

		setResizable(false); // 사용자 마음대로 frame 변경X

		setLocationRelativeTo(null); // frame 가운데에서 열림

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame닫기

		getContentPane().setLayout(null); // 개발자 마음대로 레이아웃 지정

		initialize(); // initialize 메서드 호출
	}

	private void initialize() {
		
		
		//백그라운드 패널
		
		JPanel NextTrain = new JPanel();					
		NextTrain.setBackground(new Color(255, 255, 255));
		NextTrain.setBounds(0, 0, 1280, 720);
		getContentPane().add(NextTrain);
		NextTrain.setLayout(null);

		
		//노선도 이미지
		
		JLabel TrainMap = new JLabel(""); 
		TrainMap.setBounds(347, 73, 585, 351);
		TrainMap.setIcon(new ImageIcon("2TrainMap1.jpg"));
		NextTrain.add(TrainMap);

		
		//숫자 출력
		
		JLabel num1 = new JLabel("1.");
		num1.setBounds(83, 490, 40, 60);
		NextTrain.add(num1);
		num1.setToolTipText("");
		num1.setHorizontalAlignment(SwingConstants.LEFT);
		num1.setForeground(new Color(0, 204, 0));
		num1.setFont(new Font("함초롬돋움", Font.BOLD, 40));
		
		JLabel num2 = new JLabel("2.");
		num2.setBounds(83, 550, 40, 60);
		num2.setToolTipText("");
		num2.setHorizontalAlignment(SwingConstants.LEFT);
		num2.setForeground(new Color(0, 204, 0));
		num2.setFont(new Font("함초롬돋움", Font.BOLD, 40));
		NextTrain.add(num2);

		JLabel num3 = new JLabel("3.");
		num3.setBounds(83, 610, 40, 60);
		num3.setToolTipText("");
		num3.setHorizontalAlignment(SwingConstants.LEFT);
		num3.setForeground(new Color(0, 204, 0));
		num3.setFont(new Font("함초롬돋움", Font.BOLD, 40));
		NextTrain.add(num3);
		
		
		//왼쪽 출력1
		
		JPanel leftPrint1_P = new JPanel();
		leftPrint1_P.setBounds(125, 490, 520, 55);
		leftPrint1_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(leftPrint1_P);
		leftPrint1_P.setLayout(null);
		
		JLabel leftPrint1_L = new JLabel("");
		leftPrint1_L.setForeground(new Color(0, 102, 0));
		leftPrint1_L.setHorizontalAlignment(SwingConstants.CENTER);
		leftPrint1_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		leftPrint1_L.setBounds(0, 0, 520, 55);
		leftPrint1_P.add(leftPrint1_L);

		
		//왼쪽 출력2
		
		JPanel leftPrint2_P = new JPanel();
		leftPrint2_P.setBounds(125, 550, 520, 55);
		leftPrint2_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(leftPrint2_P);
		leftPrint2_P.setLayout(null);
		
		JLabel leftPrint2_L = new JLabel("");
		leftPrint2_L.setForeground(new Color(0, 102, 0));
		leftPrint2_L.setHorizontalAlignment(SwingConstants.CENTER);
		leftPrint2_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		leftPrint2_L.setBounds(0, 0, 520, 55);
		leftPrint2_P.add(leftPrint2_L);

		
		//왼쪽 출력3
		
		JPanel leftPrint3_P = new JPanel();
		leftPrint3_P.setBounds(125, 610, 520, 60);
		leftPrint3_P.setBackground(new Color(255, 255, 204));
		leftPrint3_P.setLayout(null);
		NextTrain.add(leftPrint3_P);
		
		JLabel leftPrint3_L = new JLabel("");
		leftPrint3_L.setForeground(new Color(0, 102, 0));
		leftPrint3_L.setHorizontalAlignment(SwingConstants.CENTER);
		leftPrint3_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		leftPrint3_L.setBounds(0, 0, 520, 55);
		leftPrint3_P.add(leftPrint3_L);
		
		
		//오른쪽 출력1
		
		JPanel rightPrint1_P = new JPanel();
		rightPrint1_P.setBounds(708, 490, 520, 55);
		rightPrint1_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(rightPrint1_P);
		rightPrint1_P.setLayout(null);
		
		JLabel rightPrint1_L = new JLabel("");
		rightPrint1_L.setForeground(new Color(0, 102, 0));
		rightPrint1_L.setHorizontalAlignment(SwingConstants.CENTER);
		rightPrint1_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		rightPrint1_L.setBounds(0, 0, 520, 55);
		rightPrint1_P.add(rightPrint1_L);
		
		
		//오른쪽 출력2
		
		JPanel rightPrint2_P = new JPanel();
		rightPrint2_P.setBounds(708, 550, 520, 55);
		rightPrint2_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(rightPrint2_P);
		rightPrint2_P.setLayout(null);
		
		JLabel rightPrint2_L = new JLabel("");
		rightPrint2_L.setForeground(new Color(0, 102, 0));
		rightPrint2_L.setHorizontalAlignment(SwingConstants.CENTER);
		rightPrint2_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		rightPrint2_L.setBounds(0, 0, 520, 55);
		rightPrint2_P.add(rightPrint2_L);

		
		//오른쪽 출력3
		
		JPanel rightPrint3_P = new JPanel();
		rightPrint3_P.setBounds(708, 610, 520, 60);
		rightPrint3_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(rightPrint3_P);
		rightPrint3_P.setLayout(null);

		JLabel rightPrint3_L = new JLabel("");
		rightPrint3_L.setForeground(new Color(0, 102, 0));
		rightPrint3_L.setHorizontalAlignment(SwingConstants.CENTER);
		rightPrint3_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		rightPrint3_L.setBounds(0, 0, 520, 55);
		rightPrint3_P.add(rightPrint3_L);

		
		//'현재 역 입력 :      역' 출력
		
		JLabel st = new JLabel("역");
		st.setBounds(930, 10, 50, 55);
		st.setForeground(new Color(0, 204, 0));
		st.setFont(new Font("함초롬돋움", Font.BOLD, 35));
		NextTrain.add(st);
		
		JPanel st_P = new JPanel();
		st_P.setBounds(930, 12, 50, 55);
		st_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(st_P);
		
		JPanel scPanel = new JPanel();
		scPanel.setBounds(252, 12, 235, 55);
		scPanel.setBackground(new Color(255, 255, 204));
		NextTrain.add(scPanel);
		scPanel.setLayout(null);

		JLabel scLabel = new JLabel(" 현재 역 입력 : ");
		scLabel.setBounds(0, 5, 236, 46);
		scPanel.add(scLabel);
		scLabel.setForeground(new Color(0, 204, 0));
		scLabel.setFont(new Font("함초롬돋움", Font.BOLD, 35));

		
		//안내사항 출력
		
		JLabel guide_label1 = new JLabel("* 가장 가까이 있는 순으로 정렬");
		guide_label1.setBounds(946, 277, 278, 42);
		guide_label1.setForeground(new Color(0, 204, 0));
		guide_label1.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		NextTrain.add(guide_label1);
				
		JLabel guide_label2 = new JLabel("* 띄어쓰기를 하지 말아주세요 !");
		guide_label2.setBounds(946, 324, 278, 33);
		guide_label2.setForeground(new Color(0, 204, 0));
		guide_label2.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		NextTrain.add(guide_label2);

		
		//back버튼

		JButton backbtn = new JButton("돌아가기");
		backbtn.setBounds(1033, 369, 191, 55);
		backbtn.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		backbtn.setBackground(SystemColor.menu);
		backbtn.setFocusable(false);
		NextTrain.add(backbtn);
		
		
		//search버튼
		
		JButton searchBtn = new JButton("조회하기");
		searchBtn.setBounds(1000, 10, 138, 55);
		searchBtn.setFont(new Font("함초롬돋움", Font.PLAIN, 22));
		searchBtn.setForeground(Color.BLACK);
		searchBtn.setBackground(SystemColor.info);
		NextTrain.add(searchBtn);

		
		//현재 역을 입력받는 필드
		
		JTextField nowStationScanner = new JTextField();
		nowStationScanner.setBounds(487, 12, 444, 55);
		nowStationScanner.setHorizontalAlignment(SwingConstants.CENTER);
		nowStationScanner.setForeground(new Color(0, 102, 0));
		nowStationScanner.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		nowStationScanner.setBackground(new Color(255, 255, 204));
		nowStationScanner.setColumns(10);
		NextTrain.add(nowStationScanner);
		
		
		//도착예정시간 출력
		
		JLabel arrival_tPrint1R = new JLabel("");
		arrival_tPrint1R.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint1R.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint1R.setForeground(new Color(51, 204, 0));
		arrival_tPrint1R.setBackground(Color.WHITE);
		arrival_tPrint1R.setBounds(14, 117, 297, 60);
		NextTrain.add(arrival_tPrint1R);
		
		JLabel arrival_tPrint2R = new JLabel("");
		arrival_tPrint2R.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint2R.setForeground(new Color(51, 204, 0));
		arrival_tPrint2R.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint2R.setBackground(Color.WHITE);
		arrival_tPrint2R.setBounds(14, 312, 297, 60);
		NextTrain.add(arrival_tPrint2R);
		
		JLabel arrival_tPrint1L = new JLabel("");
		arrival_tPrint1L.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint1L.setForeground(new Color(51, 204, 0));
		arrival_tPrint1L.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint1L.setBackground(Color.WHITE);
		arrival_tPrint1L.setBounds(14, 249, 297, 60);
		NextTrain.add(arrival_tPrint1L);
		
		JLabel arrival_tPrint2L = new JLabel("");
		arrival_tPrint2L.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint2L.setForeground(new Color(51, 204, 0));
		arrival_tPrint2L.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint2L.setBackground(Color.WHITE);
		arrival_tPrint2L.setBounds(14, 180, 297, 60);
		NextTrain.add(arrival_tPrint2L);
		
		

		//어디행 열차인지 출력
		
		JLabel right = new JLabel("");
		right.setHorizontalAlignment(SwingConstants.CENTER);
		right.setForeground(new Color(51, 204, 0));
		right.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		right.setBounds(125, 445, 520, 33);
		NextTrain.add(right);
		
		JLabel left = new JLabel("");
		left.setHorizontalAlignment(SwingConstants.CENTER);
		left.setForeground(new Color(51, 204, 0));
		left.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		left.setBounds(708, 445, 516, 33);
		NextTrain.add(left);
		
		
		//back 버튼을 누르면

		backbtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				NextTrain.setVisible(false);
				dispose();
				Choose_2 ch = new Choose_2();
				ch.setVisible(true);
			}
		});
		
		
		//search 버튼을 누르면

		searchBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
				
				nowStation = nowStationScanner.getText(); 		//nowStationScanner에 입력된 값 읽어오기
				
				int sub_ad = Nowstation(nowStation);		//배열의 주소값
				
				int l_index1, l_index2, l_index3;
				int r_index1, r_index2, r_index3;
				
				
				while(true) {
					
					l_index1 = (int) (Math.random() * (subwaynumleft.length)); // 열차 번호 랜덤추출 1
					l_index2 = (int) (Math.random() * (subwaynumleft.length)); // 열차 번호 랜덤추출 2
					l_index3 = (int) (Math.random() * (subwaynumleft.length)); // 열차 번호 랜덤추출 3
					
					if(l_index1 != l_index2 && l_index1 != l_index3 && l_index2 != l_index3) {
						break;
					}
					
				}
				
				while(true) {
					
					r_index1 = (int) (Math.random() * (subwaynumleft.length)); // 열차 번호 랜덤추출 1
					r_index2 = (int) (Math.random() * (subwaynumleft.length)); // 열차 번호 랜덤추출 2
					r_index3 = (int) (Math.random() * (subwaynumleft.length)); // 열차 번호 랜덤추출 3
					
					if(r_index1 != r_index2 && r_index1 != r_index3 && r_index2 != r_index3) {
						
						break;
					}
					
				}
				
				
				int nearLeft1, nearLeft2, nearLeft3;
				
				int nearRight1, nearRight2, nearRight3;
				
				while(true) {
					
					nearLeft1=next_StationLeft(sub_ad);
					nearLeft2=next_StationLeft(nearLeft1);
					nearLeft3=next_StationLeft(nearLeft2);
					
					if(nearLeft1 != nearLeft2 && nearLeft1 != nearLeft3 && nearLeft2 != nearLeft3) {
						int sortLeft[]= {nearLeft1, nearLeft2, nearLeft3};
						
						for (int i = 0; i < sortLeft.length; i++) {
				            for (int j = i + 1; j < sortLeft.length; j++) {
				                if (sortLeft[i] > sortLeft[j]) {
				                    int tmep = sortLeft[i];
				                    sortLeft[i] = sortLeft[j];
				                    sortLeft[j] = tmep;
				                }
				            }
				        }
						nearLeft1=sortLeft[2];
						nearLeft2=sortLeft[1];
						nearLeft3=sortLeft[0];
						break;
					}
					
				}
				
				while(true) {
					
					nearRight1=next_StationRight(sub_ad);
					nearRight2=next_StationRight(nearRight1);
					nearRight3=next_StationRight(nearRight2);
					
					if(nearRight1 != nearRight2 && nearRight1 != nearRight3 && nearRight2 != nearRight3) {
						int sortRight[]={nearRight1,nearRight2,nearRight3};

						for (int i = 0; i < sortRight.length; i++) {
				            for (int j = i + 1; j < sortRight.length; j++) {
				                if (sortRight[i] > sortRight[j]) {
				                    int tmep = sortRight[i];
				                    sortRight[i] = sortRight[j];
				                    sortRight[j] = tmep;
				                    
				                }
				            }
				        }
						nearRight1=sortRight[0];
						nearRight2=sortRight[1];
						nearRight3=sortRight[2];
						break;
					}
					
				}
				
			
				leftPrint1_L.setText( subwaynumleft[l_index1] + "번 열차 " + Sub_station.station2[nearLeft1] + "역  "+ Sub_station.getsub_Condition() );
				leftPrint2_L.setText( subwaynumleft[l_index2] + "번 열차 " + Sub_station.station2[nearLeft2] + "역  "+ Sub_station.getsub_Condition() );
				leftPrint3_L.setText( subwaynumleft[l_index3] + "번 열차 " + Sub_station.station2[nearLeft3] + "역  "+ Sub_station.getsub_Condition() );
				
				rightPrint1_L.setText( subwaynumright[r_index1] + "번 열차 " + Sub_station.station2[nearRight1]+ "역  " + Sub_station.getsub_Condition() );
				rightPrint2_L.setText( subwaynumright[r_index2] + "번 열차 " + Sub_station.station2[nearRight2]+ "역  " + Sub_station.getsub_Condition() );
				rightPrint3_L.setText( subwaynumright[r_index3] + "번 열차 " + Sub_station.station2[nearRight3]+ "역  " + Sub_station.getsub_Condition() );

				arrival_tPrint1L.setText(Sub_station.station2[nearLeft1]+"행 열차");
				left.setText(Sub_station.station2[nearLeft1]+", "+Sub_station.station2[nearLeft2]+"행");
				arrival_tPrint2L.setText(getWaitTime(nearLeft1)+"분 후 도착 예정");
				
				
				arrival_tPrint1R.setText(Sub_station.station2[nearRight1]+"행 열차");
				right.setText(Sub_station.station2[nearRight1]+", "+Sub_station.station2[nearRight2]+"행");
				arrival_tPrint2R.setText(getWaitTime(nearRight1)+"분 후 도착 예정");
				
			}
		});
	}

	public static int Nowstation(String nowStation) { // 현재역
		int sub_ad = 0;
		for (int i = 0; i < Sub_station.station2.length; i++) {
			if (nowStation.equals(Sub_station.station2[i])) { // 입력받은 출발역의 값과 역 배열 비교하여 주소값 찾기

				sub_ad = i; // 주소값 대입

			}
		}
		return sub_ad;
	}

	public int next_StationLeft(int sub_ad) { // 왼쪽방향 첫번째

		int index = (int) (Math.random() * Sub_station.howfar_station.length);
		sub_ad -= Sub_station.howfar_station[index];
		
		
		if (sub_ad < 0) {
			sub_ad = Sub_station.station2.length - Sub_station.howfar_station[index];
		}
		return sub_ad;
	}

	public int next_StationRight(int sub_ad) { // 오른쪽방향 첫번째

		int index = (int) (Math.random() *Sub_station.howfar_station.length);
		sub_ad += Sub_station.howfar_station[index];
		
		if (sub_ad > Sub_station.station2.length - 1) {
			sub_ad -= Sub_station.station2.length;
		}
		
		return sub_ad;
	}
	public int getWaitTime(int station) {

		int length;
		int time=140;
		int alltime;
		int right, left;
		
		 if(Nowstation(nowStation)>station) { 
			 
			 length =Nowstation(nowStation)-station;
			 
		 } else { 
			 
			 length = station-Nowstation(nowStation);
			 
		 }
		 
		 right = Sub_station.station2.length - length; //오른쪽 거리
		 
		 left = length; //왼쪽 거리
		 
		 if(Sub_station.station2.length - length>length) { //갈 방향 고르기
			 
			 alltime = left*time;
			 
		 } else {
			 
			 alltime = right*time;
			 
		 }
		
		return alltime/60;
	}
}