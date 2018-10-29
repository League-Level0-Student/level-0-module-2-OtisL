package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		int lotteryNumber = 56023;
		int yourNumber1 = 0;
		int yourNumber2 = 0;
		int yourNumber3 = 0;
		int yourNumber4 = 0;
		int yourNumber5 = 0;
		Random l = new Random();
		for (int q = 0; q < 200; q++) {
			yourNumber1 = l.nextInt(10);
			yourNumber2 = l.nextInt(10);
			yourNumber3 = l.nextInt(10);
			yourNumber4 = l.nextInt(10);
			yourNumber5 = l.nextInt(10);
			System.out.println(yourNumber1 + yourNumber2 + yourNumber3 + yourNumber4 + yourNumber5);
			if (yourNumber1 == 5 && yourNumber2 == 6 && yourNumber3 == 0 && yourNumber4 == 2 && yourNumber5 == 3)
				;
			{
				JOptionPane.showMessageDialog(null, "YOU WON!!!");
			}
		}
	}
}
