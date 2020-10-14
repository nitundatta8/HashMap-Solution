//Find whether an array is subset of another array

package geeksforgeek;

// Find whether an array is subset of another array
import java.util.HashMap;
import java.util.Map;

public class SubsetArray1 {
	public static boolean findSUbset(int [] A, int [] B) {
		Map<Integer,Integer> map = new HashMap<>();
	
		for(int i=0;i<A.length;i++) {
			map.put(A[i],i);
		}
		
		for(int i=0;i<B.length;i++) {
			if(!map.containsKey(B[i])) {
				return false;
			}
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		int [] A = {11, 1, 13, 21, 3, 7};
		int [] B = {11, 3, 7, 1};
		boolean res = findSUbset(A,B);
		System.out.println(res);

	}

}
