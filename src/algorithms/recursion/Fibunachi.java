package algorithms.recursion;

public class Fibunachi {
	int itr = 0;
	/// { 1,\;1,\;2,\;3,\;5,\;8,\;13,\;21,\34,\;55,\;89,\;144,\; }
	int[] calculated = new int[1000];
	int get(int num) {
		

		if (num == 1 || num == 2)
			return 1;

		int one = num - 1;
		int two = num - 2;
		//if(calculated[one] == 0) {
			calculated[one] = get(one);
			
		//}
		//if (calculated[two] == 0) {
			calculated[two] = get(two);
				
		//}	
		
		return calculated[one] + calculated[two];
	}
}
