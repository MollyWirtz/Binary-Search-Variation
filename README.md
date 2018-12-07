# Binary-Search-Variation
Variation of Binary Search Algorithm where middle element to be compared is 1/3 instead of 1/2 


This program takes one argument which is the key K to be searched for. It prints: 
  (a) Whether K is found or not 
  (b) The number of comparisons done by the algorithm 
  (c) The position at which K is found (if K exists) 
  
In the beginning, this program creates an array composed of only even numbers between 1 and 400 in ascending order, and uses this as the search space for the input value K. 

To run and compile in Eclipse: Select the ProbFour.java file and execute by going to the
‘Run’ menu and choosing the ‘Run Configurations...’ option. From the window that opens up, select the tab titled ‘Arguments’.
In the first box (headed as ‘Program Arguments: ‘) type in the command line input to run the program (any integer).

To run and compile in the terminal: cd to the directory where this .zip has been downloaded (for me, cd eclipse-workspace, cd AlgHW1Final, cd src) and type javac ProbFour.java to compile. To run, after being compiled, enter the command java -cp . ProbFour [command argument: any integer].

For this algorithm, the Best-Case time complexity is 1 comparison, or O(1), and the Worst-Case time complexity would be O(log3/2(N)). A binary search algorithms works by dividing the amount of work done by two at each comparison. This gives us an equation of N, N/K, N/K^2, ..., 1, which can be simplified to log2(N). However, this algorithm is for a modified binary search, where the middle element to be compared is located at 1/3 of the search space. In the worst case scenario, when the key being search for is always in the larger 2/3 portion of the search space, we have an equation of N, N/(2/3), N/(2/3)^2, ..., 1. Therefore, the worst case time complexity for this algorithm would be O(log3/2(N)).
