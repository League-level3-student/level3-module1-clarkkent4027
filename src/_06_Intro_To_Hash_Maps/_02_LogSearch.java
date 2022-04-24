package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	/*
	 * Create a HashMap of Integers for the keys and Strings for the values. Create
	 * a GUI with three buttons.
	 */

	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();
		log.GUI();
	}

	HashMap<Integer, String> logSearch = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("View List");
	JButton button4 = new JButton("Remove Entry");
	void GUI() {
		panel.setSize(600, 600);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.add(panel);
		frame.addMouseListener(null);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String number = JOptionPane.showInputDialog(null, "Please enter an ID number");
			String name = JOptionPane.showInputDialog(null, "Please enter an name");
			int num = Integer.parseInt(number);
			logSearch.put(num, name);
		}
		if (e.getSource() == button2) {
			String id = JOptionPane.showInputDialog(null, "Please enter an ID number");
			int ID = Integer.parseInt(id);
			JOptionPane.showMessageDialog(null, logSearch.get(ID));

		}
		if (e.getSource() == button3) {
			for (Integer i : logSearch.keySet()) {
				JOptionPane.showMessageDialog(null, "key " + i + ", value: " + logSearch.get(i));
			}
		}
		if (e.getSource() == button4) {
			String b4 = JOptionPane.showInputDialog(null, "Please enter an ID number");
			int B4 = Integer.parseInt(b4);
	            if (logSearch.containsKey(B4)) {
					logSearch.remove(B4);
				}else {
					JOptionPane.showMessageDialog(null, "Sorry, no");
				}
	        
		}
		/*
		 * Button 1: Add Entry When this button is clicked, use an input dialog to ask
		 * the user to enter an ID number. After an ID is entered, use another input
		 * dialog to ask the user to enter a name. Add this information as a new entry
		 * to your HashMap.
		 */

		/*
		 * Button 2: Search by ID When this button is clicked, use an input dialog to
		 * ask the user to enter an ID number. If that ID exists, display that name to
		 * the user. Otherwise, tell the user that that entry does not exist.
		 */

		/*
		 * Button 3: View List When this button is clicked, display the entire list in a
		 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
		 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
		 */

		/*
		 * When this is complete, add a fourth button to your window. Button 4: Remove
		 * Entry When this button is clicked, prompt the user to enter an ID using an
		 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
		 * the user that the ID is not in the list.
		 */

	}
}