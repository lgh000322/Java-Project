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
		System.out.println("getstr의 count "+count);
		count+=1;
		return str;
	}
	

	
}
