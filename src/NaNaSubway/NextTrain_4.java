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

public class NextTrain_4 extends JFrame{
	private String nowStation;
	protected int [] subwaynumleft = {4094, 4148, 4192, 4934, 4010, 4044, 4098, 4145};
	protected int [] subwaynumright = {4084, 4138, 4144, 4278, 4344, 4946, 4926, 4052};
	
	
	public NextTrain_4() {
		
		setTitle("NaNaSubway");	//frame상단에 NANASUBWAY출력
		
		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); //frame크기 지정
		
		setResizable(false); //사용자 마음대로 frame 변경X
		
		setLocationRelativeTo(null); //frame 가운데에서 열림
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame닫기
		
		getContentPane().setLayout(null); //개발자 마음대로 레이아웃 지정
		
		initialize(); //initialize 메서드 호출
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
		TrainMap.setBounds(346, 73, 585, 351);
		TrainMap.setIcon(new ImageIcon("4TrainMap1.jpg"));
		NextTrain.add(TrainMap);
		
		
		//숫자 출력
		
		JLabel num1 = new JLabel("1.");
		num1.setBounds(83, 490, 40, 60);
		NextTrain.add(num1);
		num1.setToolTipText("");
		num1.setHorizontalAlignment(SwingConstants.LEFT);
		num1.setForeground(new Color(0, 153, 255));
		num1.setFont(new Font("함초롬돋움", Font.BOLD, 40));

		JLabel num2 = new JLabel("2.");
		num2.setBounds(83, 550, 40, 60);
		num2.setToolTipText("");
		num2.setHorizontalAlignment(SwingConstants.LEFT);
		num2.setForeground(new Color(0, 153, 255));
		num2.setFont(new Font("함초롬돋움", Font.BOLD, 40));
		NextTrain.add(num2);

		JLabel num3 = new JLabel("3.");
		num3.setBounds(83, 610, 40, 60);
		num3.setToolTipText("");
		num3.setHorizontalAlignment(SwingConstants.LEFT);
		num3.setForeground(new Color(0, 153, 255));
		num3.setFont(new Font("함초롬돋움", Font.BOLD, 40));
		NextTrain.add(num3);
		
		
		//왼쪽 출력1
		
		JPanel leftPrint1_P = new JPanel();
		leftPrint1_P.setBounds(125, 490, 520, 55);
		leftPrint1_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(leftPrint1_P);
		leftPrint1_P.setLayout(null);

		JLabel leftPrint1_L = new JLabel("");
		leftPrint1_L.setForeground(new Color(0, 153, 255));
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
		leftPrint2_L.setForeground(new Color(0, 153, 255));
		leftPrint2_L.setHorizontalAlignment(SwingConstants.CENTER);
		leftPrint2_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		leftPrint2_L.setBounds(0, 0, 520, 55);
		leftPrint2_P.add(leftPrint2_L);

		
		//왼쪽 출력3
		
		JPanel leftPrint3_P = new JPanel();
		leftPrint3_P.setBounds(125, 610, 520, 60);
		leftPrint3_P.setBackground(new Color(255, 255, 204));
		NextTrain.add(leftPrint3_P);
		leftPrint3_P.setLayout(null);

		JLabel leftPrint3_L = new JLabel("");
		leftPrint3_L.setForeground(new Color(0, 153, 255));
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
		rightPrint1_L.setForeground(new Color(0, 153, 255));
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
		rightPrint2_L.setForeground(new Color(0, 153, 255));
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
		rightPrint3_L.setForeground(new Color(0, 153, 255));
		rightPrint3_L.setHorizontalAlignment(SwingConstants.CENTER);
		rightPrint3_L.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		rightPrint3_L.setBounds(0, 0, 520, 55);
		rightPrint3_P.add(rightPrint3_L);
						
		
		//'현재 역 입력 :     역' 출력
		
		JLabel st = new JLabel("역");
		st.setBounds(930, 10, 50, 55);
		st.setForeground(new Color(0, 153, 255));
		st.setFont(new Font("함초롬돋움", Font.BOLD, 35));
		NextTrain.add(st);

		JPanel st_p = new JPanel();
		st_p.setBounds(930, 12, 50, 55);
		st_p.setBackground(new Color(255, 255, 204));
		NextTrain.add(st_p);
				
		JPanel scPanel = new JPanel();
		scPanel.setBounds(252, 12, 235, 55);
		scPanel.setBackground(new Color(255, 255, 204));
		NextTrain.add(scPanel);
		scPanel.setLayout(null);

		JLabel scLabel = new JLabel(" 현재 역 입력 : ");
		scLabel.setBounds(0, 5, 236, 46);
		scPanel.add(scLabel);
		scLabel.setForeground(new Color(0, 153, 255));
		scLabel.setFont(new Font("함초롬돋움", Font.BOLD, 35));
		
		
		//안내사항 출력
		
		JLabel guide_label1 = new JLabel("* 가장 가까이 있는 순으로 정렬");
		guide_label1.setBounds(946, 277, 278, 42);
		guide_label1.setForeground(new Color(0, 153, 255));
		guide_label1.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		NextTrain.add(guide_label1);
						
		JLabel guide_label2 = new JLabel("* 띄어쓰기를 하지 말아주세요 !");
		guide_label2.setBounds(946, 324, 278, 33);
		guide_label2.setForeground(new Color(0, 153, 255));
		guide_label2.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		NextTrain.add(guide_label2);
		
		
		//back 버튼

		JButton backbtn = new JButton("돌아가기");
		backbtn.setBounds(1037, 369, 191, 55);
		backbtn.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		backbtn.setBackground(SystemColor.menu);
		backbtn.setFocusable(false);
		NextTrain.add(backbtn);
				
				
		//search 버튼
				
		JButton searchBtn = new JButton("\uC870\uD68C\uD558\uAE30");
		searchBtn.setBounds(1000, 10, 138, 55);
		searchBtn.setFont(new Font("함초롬돋움", Font.PLAIN, 22));
		searchBtn.setForeground(Color.BLACK);
		searchBtn.setBackground(SystemColor.info);
		NextTrain.add(searchBtn);
		
		
		//현재 역을 입력받는 필드
		
		JTextField nowStationScanner = new JTextField();
		nowStationScanner.setBounds(487, 12, 444, 55);
		nowStationScanner.setHorizontalAlignment(SwingConstants.CENTER);
		nowStationScanner.setForeground(new Color(0, 153, 255));
		nowStationScanner.setFont(new Font("함초롬돋움", Font.PLAIN, 30));
		nowStationScanner.setBackground(new Color(255, 255, 204));
		NextTrain.add(nowStationScanner);
		nowStationScanner.setColumns(10);
		
		
		//도착예정시간 출력
		
		JLabel arrival_tPrint1R = new JLabel("");
		arrival_tPrint1R.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint1R.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint1R.setForeground(new Color(0, 153, 255));
		arrival_tPrint1R.setBackground(Color.WHITE);
		arrival_tPrint1R.setBounds(14, 117, 297, 60);
		NextTrain.add(arrival_tPrint1R);
						
		JLabel arrival_tPrint2R = new JLabel("");
		arrival_tPrint2R.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint2R.setForeground(new Color(0, 153, 255));
		arrival_tPrint2R.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint2R.setBackground(Color.WHITE);
		arrival_tPrint2R.setBounds(14, 312, 297, 60);
		NextTrain.add(arrival_tPrint2R);
						
		JLabel arrival_tPrint1L = new JLabel("");
		arrival_tPrint1L.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint1L.setForeground(new Color(0, 153, 255));
		arrival_tPrint1L.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint1L.setBackground(Color.WHITE);
		arrival_tPrint1L.setBounds(14, 249, 297, 60);
		NextTrain.add(arrival_tPrint1L);
					
		JLabel arrival_tPrint2L = new JLabel("");
		arrival_tPrint2L.setHorizontalAlignment(SwingConstants.CENTER);
		arrival_tPrint2L.setForeground(new Color(0, 153, 255));
		arrival_tPrint2L.setFont(new Font("함초롬돋움", Font.PLAIN, 26));
		arrival_tPrint2L.setBackground(Color.WHITE);
		arrival_tPrint2L.setBounds(14, 180, 297, 60);
		NextTrain.add(arrival_tPrint2L);
			
						
		//어디행 열차인지 출력
				
		JLabel left = new JLabel("당고개");
		left.setHorizontalAlignment(SwingConstants.CENTER);
		left.setForeground(new Color(0, 153, 255));
		left.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		left.setBounds(852, 445, 247, 33);
		NextTrain.add(left);
				
		JLabel right = new JLabel("오이도");
		right.setHorizontalAlignment(SwingConstants.CENTER);
		right.setForeground(new Color(0, 153, 255));
		right.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		right.setBounds(252, 445, 247, 33);
		NextTrain.add(right);
		
		
		//back 버튼을 누르면
		
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NextTrain.setVisible(false);
				dispose();
				Choose_4 ch=new Choose_4();
				ch.setVisible(true);
			}
		});
		
		searchBtn.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
				
				nowStation = nowStationScanner.getText();
				
				int sub_ad = Nowstation(nowStation);
				
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
					
					if(nearLeft1<0) {
						
						arrival_tPrint1L.setText("당고개행 열차");
						arrival_tPrint2L.setText("도착 예정 정보 없음");
						
						leftPrint1_L.setText( "");
						leftPrint2_L.setText( "");
						leftPrint3_L.setText( "");
						
						break;
					}
					if(nearLeft2<0) {
						
						leftPrint1_L.setText( subwaynumleft[l_index1] + "번 열차 " + Sub_station.station4[nearLeft1] + "역  "+ Sub_station.getsub_Condition() );
						leftPrint2_L.setText( "");
						leftPrint3_L.setText( "");
						arrival_tPrint1L.setText("당고개행 열차");
						arrival_tPrint2L.setText(getWaitTime(nearLeft1)+"분 후 도착 예정");
						break;
					}
					if(nearLeft3<0) {
						while(true) {
							if(nearLeft1 != nearLeft2) {
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
							
								leftPrint2_L.setText( subwaynumleft[l_index2] + "번 열차 " + Sub_station.station4[nearLeft2] + "역  "+ Sub_station.getsub_Condition() );
								leftPrint2_L.setText( subwaynumleft[l_index2] + "번 열차 " + Sub_station.station4[nearLeft2] + "역  "+ Sub_station.getsub_Condition() );
								leftPrint3_L.setText( "");
						
								arrival_tPrint1L.setText("당고개행 열차");
								arrival_tPrint2L.setText(getWaitTime(nearLeft1)+"분 후 도착 예정");
						
								break;
							}
						}
					}
					
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
						
						leftPrint1_L.setText( subwaynumleft[l_index1] + "번 열차 " + Sub_station.station4[nearLeft1] + "역  "+ Sub_station.getsub_Condition() );
						leftPrint2_L.setText( subwaynumleft[l_index2] + "번 열차 " + Sub_station.station4[nearLeft2] + "역  "+ Sub_station.getsub_Condition() );
						leftPrint3_L.setText( subwaynumleft[l_index3] + "번 열차 " + Sub_station.station4[nearLeft3] + "역  "+ Sub_station.getsub_Condition() );
						
						arrival_tPrint1L.setText("당고개행 열차");
						arrival_tPrint2L.setText(getWaitTime(nearLeft1)+"분 후 도착 예정");
						
						break;
					}
					
				}
				
				while(true) {
					
					nearRight1=next_StationRight(sub_ad);
					nearRight2=next_StationRight(nearRight1);
					nearRight3=next_StationRight(nearRight2);
					
					
					if(nearRight1>Sub_station.station4.length) {
						
						arrival_tPrint1R.setText("오이도행 열차");
						arrival_tPrint2R.setText("도착 예정 정보 없음");
						
						rightPrint1_L.setText( "" );
						rightPrint2_L.setText( "" );
						rightPrint3_L.setText( "" );

						break;
					}
					if(nearRight2>Sub_station.station4.length) {
						
						rightPrint1_L.setText( subwaynumright[r_index1] + "번 열차 " + Sub_station.station4[nearRight1]+ "역  " + Sub_station.getsub_Condition() );
						rightPrint2_L.setText( "" );
						rightPrint3_L.setText( "" );
						
						arrival_tPrint1R.setText("오이도 열차");
						arrival_tPrint2R.setText(getWaitTime(nearRight1)+"분 후 도착 예정");
						break;
					}
					if(nearRight3>Sub_station.station4.length) {
						
						while(true) {
							if(nearRight1 != nearRight2) {
							
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
								rightPrint1_L.setText( subwaynumright[r_index1] + "번 열차 " + Sub_station.station4[nearRight1]+ "역  " + Sub_station.getsub_Condition() );
								rightPrint2_L.setText( subwaynumright[r_index2] + "번 열차 " + Sub_station.station4[nearRight2]+ "역  " + Sub_station.getsub_Condition() );
								rightPrint3_L.setText( "" );
						
								arrival_tPrint1R.setText("오이도행 열차");
								arrival_tPrint2R.setText(getWaitTime(nearRight1)+"분 후 도착 예정");
								break;
							}
						}
					}
					
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
						
						rightPrint1_L.setText( subwaynumright[r_index1] + "번 열차 " + Sub_station.station4[nearRight1]+ "역  " + Sub_station.getsub_Condition() );
						rightPrint2_L.setText( subwaynumright[r_index2] + "번 열차 " + Sub_station.station4[nearRight2]+ "역  " + Sub_station.getsub_Condition() );
						rightPrint3_L.setText( subwaynumright[r_index3] + "번 열차 " + Sub_station.station4[nearRight3]+ "역  " + Sub_station.getsub_Condition() );

						arrival_tPrint1R.setText("오이도행 열차");
						arrival_tPrint2R.setText(getWaitTime(nearRight1)+"분 후 도착 예정");
						break;
					}
					
				}
				
			}
		});
	}

	public static int Nowstation(String nowStation) { // 현재역
		int sub_ad = 0;
		for (int i = 0; i < Sub_station.station4.length; i++) {
			if (nowStation.equals(Sub_station.station4[i])) { // 입력받은 출발역의 값과 역 배열 비교하여 주소값 찾기

				sub_ad = i; // 주소값 대입

			}
		}
		return sub_ad;
	}


	public int next_StationLeft(int sub_ad) { // 왼쪽방향 첫번째

		int index = (int) (Math.random() * Sub_station.howfar_station.length);
		sub_ad -= Sub_station.howfar_station[index];
		
		return sub_ad;
	}

	public int next_StationRight(int sub_ad) { // 오른쪽방향 첫번째

		int index = (int) (Math.random() *Sub_station.howfar_station.length);
		sub_ad += Sub_station.howfar_station[index];
		
		return sub_ad;
	}
	public int getWaitTime(int station) {

		int length;
		int time=150;
		int alltime;
		int right, left;
		
		 if(Nowstation(nowStation)>station) { 
			 
			 length =Nowstation(nowStation)-station;
			 
		 } else { 
			 
			 length = station-Nowstation(nowStation);
			 
		 }
		 
		 right = Sub_station.station4.length - length; 
		 
		 left = length; 
		 
		 if(Sub_station.station4.length - length>length) { 
			 
			 alltime = left*time;
			 
		 } else {
			 
			 alltime = right*time;
			 
		 }
		
		return alltime/60;
	}
}