package charAt_scanners_optionDialogs;


import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	//0
	// this will be used to store the happiness of your pet
	static int happinessLevel =0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
        String pet = JOptionPane.showInputDialog("what type of pet do you want to get? A dog, a Cockatoo or a cat?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i=0; i<6; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (ex: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want your pet to do?", "Hapopypet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "hate you", "like you", "be lazy" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			
                   
				if(task == 0) {
					feed(pet);
				}
				
				if(task == 1) {
					pet(pet);
					
					
				}
				
				if (task == 2) {
				PlayWith(pet);	
					
					
				}
				}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
            if (happinessLevel > 10) {
            JOptionPane.showMessageDialog(null, "You love your pet! ");	
            
            }
		}

	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (ex. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void feed(String Option1) {
		System.out.println(Option1 + " hates you and ran away from home but only came back for food and water.   ");
		happinessLevel+=2;
	}
		
		public static void pet(String Option2) {
			System.out.println(Option2 + " is happy and became a ball of feathers/fur because you pet it so much that it's feathers/fur fluffed out");
			happinessLevel+=2;
		}
			
			public static void PlayWith(String Option3) {
				System.out.println(Option3 + " is happy and sleepy now and it now came to you as you were going to sleep and started sleeping on you.");
				happinessLevel+=2;
	}
			
}

