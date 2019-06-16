public class Problem1 {
		void ExamSort(int[]a, int size)
		{
		for (int i=0; i+1<size+1; i++){			// first for loop
					
			for (int j=0; j<size+1; i++) {		// second for loop
					
				if (a[i] > a[j+1]){			//create temp for in-place sorting alogrithm 
					int temp =a[j];
					a[j] = j+1;
								
				}
				
				for (int i=0; i<size; i++ ){
					System.out.println (size); 	// print 
				}
			}
		}
	

		// run sort on an array {15,9,60,44,12,1,4), print array contents after finishing sort , modify internal elements of array w/o using anymore than O(1) space
	
