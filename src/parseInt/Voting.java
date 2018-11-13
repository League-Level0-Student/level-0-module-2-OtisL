package parseInt;

import javax.swing.JOptionPane;

public class Voting {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog(null, "How old are you?");
		int age2 = Integer.parseInt(age);
		if(age2 > 17) {
			String newbie = JOptionPane.showInputDialog(null, "Hello "+age2+" year old. What should the next president be?");
			JOptionPane.showMessageDialog(null, "Your vote of '"+newbie+"' has been submitted. Thanks!");
		} else {
			JOptionPane.showMessageDialog(null, "You are t00 young. Get older.");
		}
	}
}
