
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		int ans = JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);

		if (ans == 0) {
			int ans2 = JOptionPane.showConfirmDialog(null, "are you on vacation", "", JOptionPane.YES_NO_OPTION);
			if (ans2 == 0) {
				JOptionPane.showMessageDialog(null, "you may sleep");
			} else {
				JOptionPane.showMessageDialog(null, "Dood wake up");

			}
		}

		if (ans == 1) {
			JOptionPane.showMessageDialog(null, "you may sleep");
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}
