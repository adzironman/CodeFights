/*Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
Input/Output

[time limit] 3000ms (java)
[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.*/

boolean checkPalindrome(String word) {
int len = word.length();
		
		if (len==0 || word==null)
			return false;
		else if (len==1)
			return true;
		
		else if (len % 2 == 0 ) {
			for (int i=0; i<len/2; i++) {
				if(word.charAt(i)!= word.charAt(len-i-1)) 
					return false;	
			}	
		}
		else if (len % 2 != 0) {
			for (int i=0; i<(len-1)/2; i++) {
				if(word.charAt(i)!= word.charAt(len-i-1)) 
					return false;
			}
			
		}
		return true;
}
