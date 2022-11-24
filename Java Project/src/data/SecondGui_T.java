package data;
import gui.*;
public class SecondGui_T{
	private int count;
	private String str;

	public SecondGui_T() {
		count=0;
	}

	public String getstr() {
		str = Integer.toString(count);
		count+=1;
		return str;
	}
	

	
}
