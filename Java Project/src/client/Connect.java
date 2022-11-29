package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Connect {

	private String IpAddress;
	private int port;
	Socket socket;
	private static BufferedWriter bw;
	private BufferedReader br;

	public Connect() throws UnknownHostException, IOException {
		IpAddress = "127.0.0.1";
		port = 9999;
		socket = new Socket(IpAddress, port);
		System.out.println("서버 접속 성공");
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		ConnectThread connectThread = new ConnectThread();
		connectThread.start();
		try {
			connectThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		socket.close();

	}

	public static void send(String Message1, String Message2) throws IOException {
		bw.write(Message1 + "  " + Message2 + "\n");
		bw.flush();
	}

	class ConnectThread extends Thread {

		public ConnectThread() {

		}

		public void run() {
			while (true) {
				String temp = null;
				try {
					temp = new String(br.readLine());

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch(Exception e)
				{
					e.printStackTrace();
				}

				if (temp.equals("1")) {
					int count = 0;
					count = mainFrame.secondgui.count--;
					mainFrame.secondgui.secondTextArea.setText("\n" + "               " + (count - 1) + " Teams");

				}

			}
		}
	}
}
