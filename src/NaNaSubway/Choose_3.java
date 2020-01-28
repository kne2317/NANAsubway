package NaNaSubway;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Choose_3 extends JFrame{

	public Choose_3() {
		
		setTitle("NaNaSubway");	//frame상단에 NANASUBWAY출력
		
		setSize(NaNaSubway.SCREEN_WIDTH, NaNaSubway.SCREEN_HEIGHT); //frame크기 지정
		
		setResizable(false); //사용자 마음대로 frame 변경X
		
		setLocationRelativeTo(null); //frame 가운데에서 열림
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //frame닫기
		
		getContentPane().setLayout(null); //개발자 마음대로 레이아웃 지정
		
		
		initialize(); //initialize 메서드 호출
	}

	void initialize() {
		
		
		JPanel choose = new JPanel();
		choose.setBounds(0, 0, 1280, 720);
		getContentPane().add(choose);
		choose.setLayout(null);
		
		JButton backbtn = new JButton("\uB3CC\uC544\uAC00\uAE30");
		backbtn.setBackground(SystemColor.menu);
		backbtn.setBounds(429, 571, 423, 99);
		backbtn.setFocusable(false);
		choose.add(backbtn);
		backbtn.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		
		
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choose.setVisible(false);
				dispose();
				ChooseSubway chs=new ChooseSubway();
				chs.setVisible(true);
			}
		});
		
		JLabel chooseimg = new JLabel("");
		chooseimg.setIcon(new ImageIcon("3choose.jpg"));
		chooseimg.setBounds(0, 0, 1280, 720);
		choose.add(chooseimg);
		
		JButton arriveTimeBtn = new JButton("");
		arriveTimeBtn.setBounds(49, 32, 555, 510);
		choose.add(arriveTimeBtn);
		arriveTimeBtn.setBorderPainted(false);
		arriveTimeBtn.setContentAreaFilled(false);
		
		JButton nextTrainBtn = new JButton("");
		nextTrainBtn.setBounds(676, 32, 561, 510);
		choose.add(nextTrainBtn);
		nextTrainBtn.setBorderPainted(false);
		nextTrainBtn.setContentAreaFilled(false);
		
		nextTrainBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choose.setVisible(false);
				dispose();
				NextTrain_3 nt=new NextTrain_3();
				nt.setVisible(true);
		    }
		});
		
		arriveTimeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				choose.setVisible(false);
				dispose();
				ArriveTime_3 at=new ArriveTime_3();
				at.setVisible(true);
			}
		});

	}		
}
