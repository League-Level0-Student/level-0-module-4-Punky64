import java.util.Scanner;

import javax.swing.JOptionPane;

public class AdventureText {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println(
				"You are in a metal house, the only thing that is not metal are the objects in the house and the door (which is wood)");
		System.out.println("The objects in the room are a cigarette box, a bowl of soup, a piece of paper, and a pen ");
		System.out.println("your name is ___");
		String name = kb.nextLine();
		System.out.println("your name is " + name);
		System.out.println(name + " do you want to leave this house");
		String awnser = kb.nextLine();
		if (awnser.equals("yes")) {
			System.out.println("figure out how to leave this house");
			String move = kb.nextLine();
			if (move.equals("move to cigarette box")) {
				String cigarette = kb.nextLine();
				if (cigarette.equals("look inside")) {
					System.out.println("there are a few cigarettes in the a box and a lighter");
					String insidebox = kb.nextLine();
					if(insidebox.equals("take lighter")) {
						String door2 = kb.nextLine();	
						if(door2.equals("move to door")) {
							
						}
					}
				}
			}
			if (move.equals("move to door")) {
				String door = kb.nextLine();
				if (door.equals("open door")) {
					System.out.println("Door is locked");
				}
			}

		}
		if (awnser.equals("no")) {
			System.out.println("you win");
		}

	}
}