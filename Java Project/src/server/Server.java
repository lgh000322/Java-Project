package server;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Server extends JFrame {

	private JButton jb;
	private JTextArea jta;
	private ServerSocket serverSocket;
	private Socket socket;
	private int port;
	private BufferedReader br;
	private BufferedWriter bw;

	public Server() throws IOException {

		this.setTitle("서버");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		jb = new JButton("문자보내기");

		jta = new JTextArea(13, 40);

		this.add(jta, BorderLayout.NORTH);
		this.add(jb, BorderLayout.SOUTH);
		this.setVisible(true);

		port = 9999;
		serverSocket = new ServerSocket(port);
		socket = serverSocket.accept();
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		jb.addActionListener(new ActionListener() {
			String temp = "";

			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				temp = jta.getText();
				StringTokenizer st = new StringTokenizer(temp, "\n");
				System.out.println(st.nextToken());
				jta.setText("");
				while (st.hasMoreTokens()) {
					jta.append(st.nextToken() + "\n");
				}
			}
		});

		ServerThread serverThread = new ServerThread(br, jta);
		serverThread.start();
		try {
			serverThread.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		socket.close();
		serverSocket.close();

	}
	
	public void send() throws IOException 
	{
		
		bw.write("1\n");
		bw.flush();
	}

	class ServerThread extends Thread {
		private BufferedReader br;
		private JTextArea jta;

		public ServerThread(BufferedReader br, JTextArea jta) {
			this.br = br;
			this.jta = jta;
		}

		@Override
		public void run() {
			while (true) {
				String temp = null;
				try {
					temp = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				jta.append(temp + "\n");
			}
		}

	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Server();
	}
}
