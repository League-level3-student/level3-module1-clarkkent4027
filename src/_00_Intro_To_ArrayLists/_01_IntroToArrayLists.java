package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> planets = new ArrayList<String>();
		// 2. Add five Strings to your list
		planets.add("Mercury");
		planets.add("Venus");
		planets.add("Earth");
		planets.add("Mars");
		planets.add("Jupiter");
		// 3. Print all the Strings using a standard for-loop
//for (int i = 0; i < planets.size(); i++) {
//System.out.println(planets.get(i));
//}
		// 4. Print all the Strings using a for-each loop
//for (String p : planets) {
//System.out.println(p);
//}
		// 5. Print only the even numbered elements in the list.
//for (int i = 0; i < planets.size(); i += 2) {
//System.out.println(planets.get(i));
//}
		// 6. Print all the Strings in reverse order.
//for (int i = planets.size()-1; i >= 0; i--) {
//System.out.println(planets.get(i));
//}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int j = 0; j < planets.size(); j++) {
			if (planets.get(j).contains("e")) {
				System.out.println(planets.get(j));
			}else {
				System.out.println("");
			}
		}

	}
}
