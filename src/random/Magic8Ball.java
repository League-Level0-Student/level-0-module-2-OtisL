//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		int lol = 0;
		Random rand = new Random();
		lol = rand.nextInt(4);
		System.out.println();
		String ball = JOptionPane.showInputDialog("Give us a question for the MAGIC ATE BALL!");
		if (lol == 0) {
			JOptionPane.showMessageDialog(null, "YAS (yes)");
		}
		if (lol == 1) {
			JOptionPane.showMessageDialog(null, "Nuuuuuuuuuuuu (no)");
		}
		if (lol == 2) {
			JOptionPane.showMessageDialog(null, "MAIBEE U SHUD ASCK GOOGL! (maybe you should ask google)");
		}
		if (lol == 3) {
			JOptionPane.showMessageDialog(null, "TRAI AGEN (try again)");
		}
	}
	// 2. Make a variable that will hold a random number and put a random number
	// into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
