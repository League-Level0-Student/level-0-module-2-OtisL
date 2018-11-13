package parseInt;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
		String doof = JOptionPane.showInputDialog(null, "How tall are you? (in inches)", "Rollercoaster", JOptionPane.QUESTION_MESSAGE);
		int noof = Integer.parseInt(doof);
		if (noof < 48) {
			JOptionPane.showMessageDialog(null, "You are too short. Grow taller.", "Oops", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "You are tall enough. Have fun!", "Yay!", JOptionPane.PLAIN_MESSAGE);
		}
	}
}
