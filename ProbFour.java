
public class ProbFour {

	public static void main (String[] args) { 

		// convert command line arguments from string to integer 
		int input = Integer.parseInt(args[0]) ; 	
		
		// run binarySearchVariation with input command line arg
		binarySearchVariation(input) ; 
	}


	static void binarySearchVariation (int K) {

		// create array of even numbers from 1 - 400 in ascending order 		
		int[] evenArray = new int[200] ;
		int evenNums = 2 ; 

		// populate array 
		for (int i = 0 ; i< 200 ; i++) { 
			evenArray[i] = evenNums;
			evenNums = evenNums + 2 ; 
		}


		// new object for return value
		ReturnObjs returnVal2 = new ReturnObjs (true, 0, 0) ;

		// helper function to sort down to the correct value 
		ReturnObjs finalReturnVal = loopHelper(evenArray, 0, 200, K, 0, 0, returnVal2) ;

		// assign results to variables to pass in print statements 
		boolean foundFinal = finalReturnVal.foundK ;   
		int comparisonsFinal = finalReturnVal.numComparisons ; 
		int positionFinal = finalReturnVal.Kposition ; 

		// Print out line saying if K was found in the array, and where 
		if (foundFinal == true) { 
			System.out.println("Yes, K was found in the array at position " + positionFinal + ".") ; 
		}

		else { 
			System.out.println("No, K was not found in the array.") ; 
		}

		// Print out line for how many comparisons were made in algorithm 
		System.out.println("This algorithm made " + comparisonsFinal + " comparisons.") ; 

	}


	// helper function that is recursively called either left or right until the correct value is found 
	static ReturnObjs loopHelper(int evenArray[], int lower, int upper, int K, int comparisons, int position, ReturnObjs returnVal2) { 


		// is number is not in array ( less than 0, greater than 400, or odd)
		if ((K > 0) && (K <= 400) && (K%2 == 0)) {

			// increase number of comparisons done, reset position in array of comparison value 
			comparisons += 1 ; 
			position = lower + ((upper - lower) / 3) ;

			// if K is equal to 1/3 comparison value 
			if (K == evenArray[lower + ((upper - lower) / 3)]) { 
				returnVal2.foundK = true ;
				returnVal2.Kposition = position ; 
				returnVal2.numComparisons = comparisons ; 
			}

			// is K < 1/3 comparison value?
			else if (K < evenArray[position]) { 
				loopHelper(evenArray, lower, position - 1, K, comparisons, position, returnVal2) ; 
			}

			// is K > 1/3 comparison value?
			else if (K > evenArray[position]) {
				loopHelper(evenArray, position + 1 , upper, K, comparisons, position, returnVal2) ; 
			}
		}

		// number is not in list 
		else {
			returnVal2.foundK = false ; 
			return returnVal2 ; 
		}

		return returnVal2 ;
	}

}

