/*Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[time limit] 3000ms (java)
[input] string s1

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 ≤ s1.length ≤ 15.

[input] string s2

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 ≤ s2.length ≤ 15.

[output] integer

*/

int commonCharacterCount(String s1, String s2) {
    		int len1 = s1.length();
		int len2 = s2.length();
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		int count = 0;
		
		
		if (len1 >= len2) {
			for (int i=0; i<len2; i++) {
				for (int j=0; j<len1; j++) {
					if(charArray2[i]==charArray1[j]) {
						count++;
						charArray1[j]=0;
						break;
					}
					
				}
			}
		}else {
			for (int i=0; i<len1; i++) {
				for (int j=0; j<len2; j++) {
					if(charArray1[i]==charArray2[j]) {
						count++;
						charArray2[j]=0;
                        break;
					}
				}
			}
			
		}
		
		System.out.println(count);
		return count;
}
