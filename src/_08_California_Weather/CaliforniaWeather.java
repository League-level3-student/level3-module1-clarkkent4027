package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:  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
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather implements ActionListener {
	JButton button1 = new JButton("Search a City");
	JButton button2 = new JButton("Search by Weather");
	JButton button3 = new JButton("Search by Temp.");
	HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();

	void start() {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		panel.setSize(600, 600);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.add(panel);
		frame.addMouseListener(null);
		frame.setVisible(true);

		// All city keys have the first letter capitalized of each word
		String cityName = Utilities.capitalizeWords("National City");

//		if (datum == null) {
//			System.out.println("Unable to find weather data for: " + cityName);
//		} else {
//			System.out.println(
//					cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
//		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String city = JOptionPane.showInputDialog(null, "Please type in a city in California.");
			String cityName = Utilities.capitalizeWords(city);
			WeatherData datum = weatherData.get(cityName);
			if (datum == null) {
				System.out.println("Unable to find weather data for: " + cityName);
			} else {
				System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of "
						+ datum.temperatureF + " F");
			}

		}

		if (e.getSource() == button2) {
			String weather = JOptionPane.showInputDialog(null, "Please type in a weather condition.");
			String Weather = Utilities.capitalizeWords(weather);
			for(String s : weatherData.keySet()){
				WeatherData datum = weatherData.get(s);
	            if (datum.weatherSummary.equals(Weather)) {
					System.out.println(s);
				}
	        }
		        }
			
		
		if (e.getSource() == button3) {
			String temp1 = JOptionPane.showInputDialog(null, "Please type in a minimum temperature.");
			String temp2 = JOptionPane.showInputDialog(null, "Please type in a maximum temperature.");
			int t1 = Integer.parseInt(temp1);
			int t2 = Integer.parseInt(temp2);
			for (String t : weatherData.keySet()) {
				WeatherData datum = weatherData.get(t);
				if (datum.temperatureF > t1 && datum.temperatureF < t2) {
					System.out.println(t);
				}
			}
		}
	}
}
