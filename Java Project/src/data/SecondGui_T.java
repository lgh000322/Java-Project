package data;

public class SecondGui_T {
	private int count;
	private String str;

	public SecondGui_T() {

	}

	public String getstr() {
		count++;
		str = Integer.toString(count);

		return str;
	}
}
