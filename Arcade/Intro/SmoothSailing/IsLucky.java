/*Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[time limit] 3000ms (java)
[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 ≤ n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.*/

boolean isLucky(int n) {
	int firstHalf=0 ,secondHalf=0;
		String s = Integer.toString(n);
		int len = s.length();

		for (int i=0; i<len; i++) {
			if (i+1<=len/2) 
				firstHalf += s.charAt(i) - '0';
			else
				secondHalf += s.charAt(i) - '0';
		}
		
		System.out.println("\n" + firstHalf + " " + secondHalf);
		
		if (firstHalf == secondHalf)
			return true;
		else
			return false;
	}
