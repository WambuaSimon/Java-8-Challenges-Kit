
public class SelectionSort {

	static void sort(int[] arr) {
		int len = arr.length;
		for(int i = 0; i<len-1; i++) {
//			Assuming min element is at ith index
			int minIdx = i;
			for(int j=i+1;j<len;j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
//			swap min element with first element
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {4,1,10,-3,12};
		SelectionSort.sort(arr);
		for(int result:arr) {
			System.out.print(result+"  ");
		}
	}

}
