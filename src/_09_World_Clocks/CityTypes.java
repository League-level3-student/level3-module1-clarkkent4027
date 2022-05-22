package _09_World_Clocks;

import java.util.TimeZone;

import javax.swing.JTextArea;

public class CityTypes {
	String city;
	String dateStr;
	JTextArea textArea;
	TimeZone timeZone;

	public CityTypes(String city, JTextArea textArea, String dateStr, TimeZone timeZone) {
		this.city = city;
		this.textArea = textArea;
		this.dateStr = dateStr;
		this.timeZone = timeZone;
	}
}
