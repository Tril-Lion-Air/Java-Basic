//
//
//public class Test {
//	private static void bubbleSort(int[] arr) {
//   		bubbleSort(arr, arr.length -1);
//    }
//    private static void bubbleSort(int[] arr, int lastIdx) {
//    	boolean terminate = true;
//    	if (lastIdx > 0) {
//        	for(int i = 1; i <= lastIdx; i++) {
//            	if (arr[i-1] > arr[i]) {
//                	swap(arr, i -1, i);
//                    terminate = false;
//                }
//            }
//        	if (terminate == true) return;
//            bubbleSort(arr,lastIdx - 1);
//        }
//    }
//    
//    private static void swap(int[] arr, int source, int target) {
//    	int tmp = arr[source];
//        arr[source] = arr[target];
//        arr[target] = tmp;
//    }
//    
//    private static void printArray(int[] arr) {
//    	for (int data : arr) {
//    		System.out.print(data + ", ");
//    	}
//    	System.out.println();
//    }
//    
//    public static void main(String[] args) {
//    	int[] arr = {3,6,1,8,2,4};
//    	printArray(arr);
//    	bubbleSort(arr);
//    	printArray(arr);
//    }
//}