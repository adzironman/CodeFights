/*Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[time limit] 3000ms (java)
[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.

Guaranteed constraints:
5 ≤ a.length ≤ 15,
-1 ≤ a[i] ≤ 200.

[output] array.integer

Sorted array a with all the trees untouched.*/

int[] sortByHeight(int[] a) {
	int[] result = new int[a.length];
		result = Arrays.copyOfRange(a, 0, a.length);
		Arrays.sort(a);
		int count = (int) Arrays.stream(a).filter(i -> i ==-1).count();
		
		for (int i= 0; i< a.length ; i++) {
			if(result[i]!= -1) {
				result[i] = a[count];
				count++;
			}
		}
		System.out.println(Arrays.toString(result) + "\n" + count);

		return result;
}
