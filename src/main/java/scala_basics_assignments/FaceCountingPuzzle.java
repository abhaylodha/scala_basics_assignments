package scala_basics_assignments;

import java.util.HashMap;
import java.util.Map;
/**
	1-1
	2-1
	3-1
	4-1
	5-1
	6-1
	Face : 6
	Opp Face : 1
	 1, 2, 3, 4, 5, 6 ->6
	1-2
	2-1
	3-1
	4-0
	5-0
	6-0
	Face : 1
	Opp Face : 6
	 1, 2, 1, 3 ->3
	1-1
	2-1
	3-1
	4-0
	5-0
	6-1
	Face : 6
	Opp Face : 1
	 1, 2, 6, 3 ->4
	1-1
	2-1
	3-1
	4-0
	5-1
	6-0
	Face : 5
	Opp Face : 2
	 1, 2, 5, 3 ->5
 */

public class FaceCountingPuzzle {
	public static void main(String args[]) {
		System.out.println(" 1, 2, 3, 4, 5, 6 ->" + solution(new int[] { 1, 2, 3, 4, 5, 6 }));
		System.out.println(" 1, 2, 1, 3 ->" + solution(new int[] { 1, 2, 1, 3 }));
		System.out.println(" 1, 2, 6, 3 ->" + solution(new int[] { 1, 2, 6, 3 }));
		System.out.println(" 1, 2, 5, 3 ->" + solution(new int[] { 1, 2, 5, 3 }));
	}

	static int solution(int[] A) {
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		count.put(1, 0);
		count.put(2, 0);
		count.put(3, 0);
		count.put(4, 0);
		count.put(5, 0);
		count.put(6, 0);

		for (int i = 0; i < A.length; i++) {
			count.put(A[i], count.get(A[i]) + 1);
		}

		for (int i = 1; i <= 6; i++) {
			System.out.println(i + "-" + count.get(i));
		}

		int max_number = 0;
		int face = 0;
		for (int i = 1; i <= 6; i++) {
			if (count.get(i) >= max_number) {
				max_number = count.get(i);
				face = i;
			}
		}

		System.out.println("Face : " + face);
		System.out.println("Opp Face : " + (7 - face));

		int counts = (2 * count.get(7 - face));

		int x = A.length - count.get(max_number) - count.get(7 - max_number);

		return counts + x;
	}

}
