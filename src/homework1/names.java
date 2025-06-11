package homework1;

public class names {
	
	// Question 2
	public static void main(String[] args) {
		// a. Calculate the average number of letters per name
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int totalLetters = 0;
		for (String name : names) {
		    totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println(averageLetters);

		// b. Concatenate all the names together with spaces
		StringBuilder concatenatedNames = new StringBuilder();
		for (String name : names) {
		    concatenatedNames.append(name).append(" ");
		}
		System.out.println(concatenatedNames.toString().trim());  // Trim to remove trailing space
		
		// question 5 
		// Creating  a new array to store the lengths of names
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
		    nameLengths[i] = names[i].length();
		}
		
		// Question 6 
		
		// calculating the sum of elements in the array length.
		
		int sum = 0;
		for (int length : nameLengths) {
		    sum += length;
		}
		System.out.println(sum);  // Output the sum
		
	}
	
	// Question 7 
	// method to concatenate a word n times
	public String repeatWord(String word, int n) {
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < n; i++) {
	        result.append(word);
	    }
	    return result.toString();
	}
	
	// Question 8 
	// method to concetenate 2 names
	public String getFullName(String firstName, String lastName) {
	    return firstName + " " + lastName;
	}
   
	// Question 9
	// method that takes an array of integers and returns true if the sum of all the 
	//ints in the array is greater than 100
	public boolean isSumGreaterThan100(int[] array) {
	    int sum = 0;
	    for (int num : array) {
	        sum += num;
	    }
	    return sum > 100;
	}
	
	//Question 10 
	
	// method that takes in an array and returns its average
	
	public double calculateAverage(double[] array) {
	    double sum = 0;
	    for (double num : array) {
	        sum += num;
	    }
	    return sum / array.length;
	}

	
	
	// Question 11
	
	// method that will return true if the average of 1st array 
	// is greater than the average of the second array
	
	
	
	public boolean compareAverages(double[] array1, double[] array2) {
	    double avg1 = calculateAverage(array1);
	    double avg2 = calculateAverage(array2);
	    return avg1 > avg2;
	}

	
	
	// Question 12
	// method to buy a drink if the money is greater than 10.5 and is hot outside
	
	public boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	    return isHotOutside && moneyInPocket > 10.50;
	}

	

	// Question 13
	
	// Method to check if a number is even or odd
	// This method will return a string that says whether the number is even or odd.
	public String checkEvenOdd(int number) {
	    if (number % 2 == 0) {
	        return number + " is even.";
	    } else {
	        return number + " is odd.";
	    }
	}

	
	
	


 
}
