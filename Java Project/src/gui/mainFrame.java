package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/*
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea; */

public class mainFrame {
	public mainFrame() {
		FirstGui firstgui = new FirstGui();
	}

	class FirstGui extends JFrame {
		private JTextArea PhoneNum_ta;
		private JTextArea people_ta;
		private JButton plus;
		private JButton minus;
		private final String[] firstJB = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "delete", "0", "enter" };
		private JButton[] jbtn = new JButton[12];

		FirstGui() {
			setTitle("식당 웨이팅 프로그램");
			this.setSize(400, 300);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setLayout(new FlowLayout());
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			JPanel p3 = new JPanel();
			p1.setLayout(new GridLayout(2,1,0,10));
			PhoneNum_ta = new JTextArea(1, 30);
			PhoneNum_ta.setEditable(false);
			PhoneNum_ta.setFont(new Font("굴림체", Font.BOLD, 20));
			p1.add(PhoneNum_ta);
			people_ta = new JTextArea("예약 인원 수: ", 1, 30);
			people_ta.setFont(new Font("굴림체", Font.BOLD, 15));
			people_ta.setEditable(false);
			p1.add(people_ta);
			plus = new JButton("plus");
			plus.setFont(new Font("굴림체", Font.BOLD, 15));
			minus = new JButton("minus");
			minus.setFont(new Font("굴림체", Font.BOLD, 15));
			p2.add(plus,BorderLayout.CENTER);
			p2.add(minus,BorderLayout.EAST);
			p3.setLayout(new GridLayout(4, 3, 10, 10));
			for (int i = 0; i < firstJB.length; i++) {
				p3.add(jbtn[i] = new JButton(firstJB[i]));
				jbtn[i].setFont(new Font("돋움체", Font.BOLD, 15));
				if (i < 11) {
					jbtn[i].setBackground(Color.WHITE);
				} else {
					jbtn[i].setBackground(Color.GREEN);
				}
			}
			this.add(p1, BorderLayout.NORTH);
			this.add(p2, BorderLayout.CENTER);
			this.add(p3, BorderLayout.SOUTH);
			setVisible(true);
		}

	}

	class SecondGui extends JPanel {
		private JLabel secondLabel;
		public JTextArea secondTextArea;
		private data.SecondGui_T secondGui_T;
		private String temp;
		public SecondGui() {
			secondGui_T=new data.SecondGui_T();
			this.setLayout(new FlowLayout());
			secondLabel = new JLabel("현재 웨이팅");
			secondLabel.setSize(15, 15);
			secondLabel.setFont(new Font("Gothic", Font.BOLD, 50));
			this.add(secondLabel);

			secondTextArea = new JTextArea(5, 30);
			secondTextArea.setEditable(false);
			secondTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
			//data패키지에서 몇팀있는지 읽어오는 getstr()을 통해 몇팀이 있는지 출력할 예정
			temp=secondGui_T.getstr();
			secondTextArea.setText(temp);
			this.add(secondTextArea);
		}
	}

	class ThirdGui extends JPanel {
		private JLabel thirdLabel;
		private JButton thirdJB;

		public ThirdGui() {
			this.setLayout(new FlowLayout());
			thirdLabel = new JLabel("예약이 완료되었습니다");
			thirdJB = new JButton("확인");
			// 버튼 누르면 창 전환되게 하기 -> https://dinae.tistory.com/27

			this.add(thirdJB);
			this.add(thirdLabel);
			setSize(250, 150);
			setVisible(true);
		}
	}
}
