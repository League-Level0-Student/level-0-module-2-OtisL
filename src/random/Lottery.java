package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		int lotteryNumber = 560235;
		int yourNumber1 = 0;
		int yourNumber2 = 0;
		int yourNumber3 = 0;
		int yourNumber4 = 0;
		int yourNumber5 = 0;
		Random l = new Random();
		for (int q = 0; q < 9999990; q++) {
			yourNumber1 = l.nextInt((999999-100000)+1)+100000;
			//yourNumber2 = l.nextInt(10);
			//yourNumber3 = l.nextInt(10);
			//yourNumber4 = l.nextInt(10);
			//yourNumber5 = l.nextInt(10);
			System.out.println(yourNumber1 + yourNumber2 + yourNumber3 + yourNumber4 + yourNumber5);
			if (yourNumber1 == lotteryNumber)
			{
				JOptionPane.showMessageDialog(null, "YOU WON!!!");
			}
		}
	}
}
