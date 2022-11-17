package gui;

import java.awt.*;
/*
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout; */

import javax.swing.*;
/*
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea; */


public class mainFrame extends JFrame {
	public mainFrame() {
		FirstGui firstgui = new FirstGui();
		SecondGui secondgui = new SecondGui();
		ThirdGui thirdgui = new ThirdGui();
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	
	class FirstGui extends JPanel{
				private JTextArea PhoneNum_ta;
				private JTextArea people_ta;
				private JButton plus;
				private JButton minus;
			private	final String[] firstJB= {"1","2","3","4","5","6","7","8","9","delete","0","enter"};
				private JButton[] jbtn=new JButton[12];
				FirstGui(){
					Container ct=getContentPane();
					JPanel p1=new JPanel();
					JPanel p2=new JPanel();
					JPanel p3=new JPanel();
					p1.setLayout(new FlowLayout());
					PhoneNum_ta=new JTextArea(3,85);
					PhoneNum_ta.setFont(new Font("굴림체",Font.BOLD,40));
					p1.add(PhoneNum_ta);
					people_ta=new JTextArea("예약 인원 수: ",3,90);
					people_ta.setFont(new Font("굴림체",Font.BOLD,40));
					p2.add(people_ta);
					plus=new JButton("plus");
					plus.setPreferredSize(new Dimension(300,90));
					plus.setFont(new Font("굴림체",Font.BOLD,50));
					minus=new JButton("minus");
					minus.setPreferredSize(new Dimension(300,90));
					minus.setFont(new Font("굴림체",Font.BOLD,50));
					p2.add(plus);
					p2.add(minus);
					p3.setLayout(new GridLayout(4,3,15,10));
					for(int i=0;i<firstJB.length;i++) {
						p3.add(jbtn[i]=new JButton(firstJB[i]));
						p3.setPreferredSize(new Dimension(300,550));
						jbtn[i].setFont(new Font("돋움체",Font.BOLD,50));
						if(i<11) {
							jbtn[i].setBackground(Color.WHITE);
						}else {
							jbtn[i].setBackground(Color.GREEN);
						}
					}
					ct.add(p1,BorderLayout.NORTH);
					ct.add(p2,BorderLayout.CENTER);
					ct.add(p3,BorderLayout.SOUTH);
					setVisible(true);
				}
				
			}		


	class SecondGui extends JPanel {
		private JLabel secondLabel;
		private JTextArea secondTextArea;

		public SecondGui() {
			this.setLayout(new FlowLayout());
			secondLabel = new JLabel("현재 웨이팅");
			secondLabel.setSize(15, 15);
			secondLabel.setFont(new Font("Gothic", Font.BOLD, 50));
			this.add(secondLabel);

			secondTextArea = new JTextArea(5, 30);
			secondTextArea.setEditable(false);
			// secondTextArea.setFont(new Font("Arial", Font.PLAIN, 16));
			// data패키지에서 몇팀있는지 읽어오는 getName()을 통해 몇팀이 있는지 출력할 예정
			// secondTextArea.setText(d.getName());
			this.add(secondTextArea);
		}
	}

	class ThirdGui extends JPanel {
		private JLabel thirdLabel;
		private JButton thirdJB;
		
		public ThirdGui() {
			Container ct = getContentPane();
			ct.setLayout(new FlowLayout());
			thirdLabel = new JLabel("예약이 완료되었습니다");
			thirdJB = new JButton("확인");
			// 버튼 누르면 창 전환되게 하기 -> https://dinae.tistory.com/27
			
			ct.add(thirdJB);
			ct.add(thirdLabel);
			setSize(250, 150);
			setVisible(true);
		}
	}
}
