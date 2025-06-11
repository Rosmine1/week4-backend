package homework1;

public class ages {
	// Question 1

    public static void main(String[] args) {
        // a. Create the ages array and subtract the first from the last element
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int result = ages[ages.length - 1] - ages[0];
        System.out.println(result);  // printing the result

        // b. Create a new array ages2 with 9 elements
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};  // This array is longer
        // i. Make sure there are 9 elements
        System.out.println(ages2.length); // Should print 9

        // ii. Subtract the first element from the last element of ages2
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println(result2);  // Output the result

        // iii. Dynamic behavior: This will work for arrays of different lengths 
        //because we used ages.length or ages2.length.
        
     // Question 3 
    	// how to access the last element in the array
    	int lastElement = ages[ages.length - 1];
    	System.out.println(lastElement);
    	// Question 4
    	// accessing the last element in the array 
    	int firstElement = ages[0];
    	System.out.println(firstElement);
    	
    	 

    }
    
}
