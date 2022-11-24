package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class mainFrame {
	FirstGui firstgui;
	SecondGui secondgui;
	ThirdGui thirdgui;
	alert alert;

	public mainFrame() {
		firstgui = new FirstGui();
		secondgui = new SecondGui();
		thirdgui = new ThirdGui();
		alert = new alert();
		firstgui.setVisible(true);
	}

	class FirstGui extends JFrame {
		private JTextArea PhoneNum_ta;
		private JTextArea people_ta;
		private JButton plus;
		private JButton minus;
		private final String[] firstJB = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "delete", "0", "enter" };
		private JButton[] jbtn = new JButton[12];
		private int peopleCount = 0;

		FirstGui() {
			setTitle("식당 웨이팅 프로그램");
			this.setSize(400, 300);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setLayout(new FlowLayout());

			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			JPanel p3 = new JPanel();

			p1.setLayout(new GridLayout(2, 1, 0, 10));
			PhoneNum_ta = new JTextArea(1, 30);
			PhoneNum_ta.setEditable(false);
			PhoneNum_ta.setFont(new Font("굴림체", Font.BOLD, 20));
			p1.add(PhoneNum_ta);

			people_ta = new JTextArea("예약 인원 수: 0", 1, 30);
			people_ta.setFont(new Font("굴림체", Font.BOLD, 15));
			people_ta.setEditable(false);
			p1.add(people_ta);

			plus = new JButton("plus");
			plus.setFont(new Font("굴림체", Font.BOLD, 15));
			minus = new JButton("minus");
			minus.setFont(new Font("굴림체", Font.BOLD, 15));
			p2.add(plus, BorderLayout.CENTER);
			p2.add(minus, BorderLayout.EAST);

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

			plus.addActionListener(new ActionListener() {
				String temp;

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					peopleCount++;
					temp = Integer.toString(peopleCount);
					people_ta.setText("예약 인원 수: " + temp);
				}

			});

			minus.addActionListener(new ActionListener() {
				String temp;

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					if (peopleCount >= 1) {
						peopleCount--;
						temp = Integer.toString(peopleCount);
						people_ta.setText("예약 인원 수: " + temp);
					} else
						System.out.println("잘못된 입력");

				}

			});

			jbtn[0].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("1");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[1].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("2");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[2].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("3");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[3].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("4");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[4].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("5");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[5].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("6");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[6].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("7");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[7].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("8");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[8].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("9");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[9].addActionListener(new ActionListener() {
				String temp;

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					temp = PhoneNum_ta.getText();
					if (temp.length() >= 1)
						temp = temp.substring(0, temp.length() - 1);
					PhoneNum_ta.setText(temp);
				}

			});

			jbtn[10].addActionListener(new ActionListener() {
				String temp;
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					PhoneNum_ta.append("0");
					temp=PhoneNum_ta.getText();
					if(temp.length()==3||temp.length()==8)
						PhoneNum_ta.append("-");
				}

			});

			jbtn[11].addActionListener(new ActionListener() {
				String temp[] = new String[2];

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					temp[0] = PhoneNum_ta.getText();
					temp[1] = people_ta.getText();
					if (temp[0].equals("") && temp[1].equals("예약 인원 수: 0")) {
						System.out.println("정보를 입력해주세요.");
						alert.setVisible(true);
					} else {
						firstgui.setVisible(false);
						PhoneNum_ta.setText("");
						people_ta.setText("예약 인원 수: 0");
						peopleCount = 0;
						secondgui.setVisible(true);
					}
				}

			});

		}

	}

	class SecondGui extends JFrame {
		private JLabel secondLabel;
		public JTextArea secondTextArea;
		private data.SecondGui_T secondGui_T;
		private JButton jbtn;
		private String temp;

		public SecondGui() {
			this.setSize(400, 300);
			this.setLocationRelativeTo(null);
			this.setTitle("현재 대기중인 팀");
			jbtn = new JButton("확인");
			secondGui_T = new data.SecondGui_T();
			this.setLayout(new FlowLayout());
			secondLabel = new JLabel("현재 웨이팅");
			secondLabel.setSize(15, 15);
			secondLabel.setFont(new Font("Gothic", Font.BOLD, 50));
			this.add(secondLabel);

			secondTextArea = new JTextArea(3, 15);
			secondTextArea.setEditable(false);
			secondTextArea.setFont(new Font("Arial", Font.PLAIN, 40));
			temp = secondGui_T.getstr();
			secondTextArea.setText("\n" + "               " + temp + " Teams");
			this.add(secondTextArea);
			this.add(jbtn);

			jbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					temp = secondGui_T.getstr();
					secondTextArea.setText("\n" + "               " + temp + " Teams");
					thirdgui.setVisible(true);
				}
			});

		}

	}

	class ThirdGui extends JFrame {
		private JLabel thirdLabel;
		private JButton thirdJB;

		public ThirdGui() {
			this.setLayout(new FlowLayout());
			this.setLocationRelativeTo(null);
			this.setTitle("예약 완료창");
			thirdLabel = new JLabel("예약이 완료되었습니다");
			thirdLabel.setSize(15, 15);
			thirdLabel.setFont(new Font("Gothic", Font.BOLD, 17));
			thirdJB = new JButton("확인");
			// 버튼 누르면 창 전환되게 하기 -> https://dinae.tistory.com/27

			this.add(thirdLabel);
			this.add(thirdJB);
			thirdJB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					firstgui.setVisible(true);
				}
			});
			setSize(250, 100);

		}
	}

	class alert extends JFrame {
		private JLabel alertLabel;
		private JButton alertbutton;

		public alert() {
			this.setLayout(new FlowLayout());
			this.setLocationRelativeTo(null);
			this.setTitle("경고 알림창");
			alertLabel = new JLabel("정보를 입력해주세요.");
			alertLabel.setSize(18, 18);
			alertLabel.setFont(new Font("Gothic", Font.BOLD, 18));
			alertbutton = new JButton("확인");
			// 버튼 누르면 창 전환되게 하기 -> https://dinae.tistory.com/27

			this.add(alertLabel);
			this.add(alertbutton);
			alertbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			setSize(250, 100);

		}
	}
}
