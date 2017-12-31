//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	static int happiness = 0;
	//    Initialize to zero.

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
         int b = JOptionPane.showOptionDialog(null, "Wich pet would you like", "Wich pet would you like", 0, JOptionPane.INFORMATION_MESSAGE, null,
        		 new String[] { "3. Cat", "2. Dog", "1. Fish" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your dog happy", "Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Walk them", "Groom", "Clean up Poop"}, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void crapAndStuff(int b, int task){
	if( b == 1 && task == 5  )	{
		happiness=happiness+100;
		JOptionPane.showMessageDialog(null, "You leave your cat alone becouse of it the cat is happy" + "Happyness" + happiness);
		JOptionPane.showMessageDialog(null, "Your cat is now dead since you didn't feed it");
		
	}
	if( b == 1 && task == 5  )	{
		happiness=happiness;
		JOptionPane.showMessageDialog(null, "Your pet");
		
	}
	}
}