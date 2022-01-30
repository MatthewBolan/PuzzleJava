import java.util.ArrayList;

import java.util.Random;

public class TestPuzzle {
    
	public static void main(String[] args) {


		PuzzleJava generator = new PuzzleJava();


        Random randMachine = new Random();




		ArrayList<Integer> randomRolls = generator.getTenRolls();

		System.out.println();

		System.out.println(randomRolls);

		System.out.println();

    	//..
		//  other test cases.
		//..

		String randomLetter = generator.getRandomLetter();

		System.out.println();

		System.out.println(randomLetter);

		System.out.println();



		String randomPassword = generator.getRandomPassword();

		System.out.println();

		System.out.println(randomPassword);

		System.out.println();




		int length = 8;

		String [] newPasswordSet = generator.getNewPasswordSet(length);

		for (int i = 0; i < length; i++)

			System.out.println(newPasswordSet[i]);

			System.out.println();

		

		



	}
}
