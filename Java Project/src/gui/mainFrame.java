package gui;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class mainFrame extends JFrame {
	public mainFrame() {
		FirstGui firstgui = new FirstGui();
		SecondGui secondgui = new SecondGui();
		ThirdGui thirdgui = new ThirdGui();
		this.setSize(400,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	class FirstGui extends JPanel {
		public FirstGui() {

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
		public ThirdGui() {

		}
	}
}
