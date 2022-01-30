import java.util.ArrayList;

import java.util.Random;


public class PuzzleJava {



    // getTenRolls

    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive.

    // To get a random integer, you can use the nextInt method of the Random class. Random Class documentation


    public ArrayList<Integer> getTenRolls() {

        Random rand = new Random();

        ArrayList<Integer> random10num = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {

            random10num.add(rand.nextInt(20) + 1);

        }

        return random10num;

    }



// getRandomLetter

    // Write a method that will:

    // Create an array or other datatype within the method that contains all 26 letters of the alphabet (must have 26 values).

    // Generate a random index between 0-25, and use it to pull a random letter out of the array.

    // Return the random letter.


    public String getRandomLetter() {

        Random rand = new Random();

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        return alphabet[rand.nextInt(26)];

    }








    // generatePassword

    // Write a method that uses the previous method to create a random string of eight characters, and return that string.

    public String getRandomPassword() {

        String password = "";

        for (int i = 0; i < 8; i++) {

        password = password + getRandomLetter();

        }

        return password;

    }



    
    // getNewPasswordSet

    // Write a method that takes an int length as an argument

    // and creates an array of random eight character words.

    // The array should be the length passed in as an int.

    public String [] getNewPasswordSet(int length) {

        String [] newPasswordSet = new String [length];

        for(int i = 0; i < length; i++) {

            newPasswordSet[i] = getRandomPassword();

        }

        return newPasswordSet;

    }



    public static void shuffeArray(Object[] arr) {

		Random rand = new Random();

		for(int i = 0; i < arr.length/2; i++) {

			Object temp = arr[i];

			int randomIdx = rand.nextInt(arr.length - i) + i;

			arr[i] = arr[randomIdx];

			arr[randomIdx] = temp;

		}

        return;

	}


}
