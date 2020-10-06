package scala_basics_assignments;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Abhay
 *
 *         This is a demo task.
 * 
 *         Write a function:
 * 
 *         class Solution { public int solution(int[] A); }
 * 
 *         that, given an array A of N integers, returns the smallest positive
 *         integer (greater than 0) that does not occur in A.
 * 
 *         For example, given A = [1, 3, 6, 4, 1, 2], the function should return
 *         5.
 * 
 *         Given A = [1, 2, 3], the function should return 4.
 * 
 *         Given A = [−1, −3], the function should return 1.
 * 
 *         Write an efficient algorithm for the following assumptions:
 * 
 *         N is an integer within the range [1..100,000]; each element of array
 *         A is an integer within the range [−1,000,000..1,000,000].
 * 
 *
 */
public class TestProgram {

	public static void main(String[] args) {
		test();

		System.out.println(solution(new int[] { 1, 3, 6, 4, 1, 2 }));
		System.out.println(solution(new int[] { 1, 2,3 }));

	}

	public static void test() {
		System.out.println("Hello from test");
	}

	public static int solution(int[] A) {

		int min = 1000001;
		int max = 1;
		Map<Integer, Byte> found = new HashMap<Integer, Byte>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] < min)
				min = A[i];
			if (A[i] > max)
				max = A[i];
			if (A[i] > 0)
				found.put(A[i], (byte) 'a');
		}

		int number = max + 1;

		for (int i = 1; i <= max + 1; i++) {
			number = i;
			if (!found.containsKey(i)) {
				break;
			}
		}
		return number;

	}
}
