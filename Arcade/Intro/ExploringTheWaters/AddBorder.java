/*Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[time limit] 3000ms (java)
[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 ≤ picture.length ≤ 5,
1 ≤ picture[i].length ≤ 5.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.*/

String[] addBorder(String[] picture) {
		String[] pictureWithBorder = new String[picture.length + 2];
		int elementLength = picture[0].length();
		String border = "";
		for(int i=0; i<elementLength+2; i++) {
			border = border.concat("*");	
		}
		
		pictureWithBorder[0]= border;
		pictureWithBorder[pictureWithBorder.length -1] = border;
		for (int i =1; i<pictureWithBorder.length-1; i++) {
		pictureWithBorder[i] = ("*" + picture[i-1] + "*");
		}
		
		
		//System.out.println(Arrays.toString(pictureWithBorder) + "\n");
		return pictureWithBorder;
	}

