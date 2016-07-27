package test1_9;

public class Test6MinNumberInRotateArray {
	public int minNumberInRotateArray(int [] array) {
	    int len = array.length;
		int start = 0, end = len, mid;
	    for(mid=len/2; start != end; mid = (start+end)/2){
	    	if(array[mid] <= array[len-1]){
	    		if(array[mid-1] > array[len-1]) break;
	    		end = mid - 1;
	    	}else{
	    		start = mid + 1;
	    	}
	    }
		return array[mid];
    }
	
	public static void main(String[] args) {
		System.out.println(new Test6MinNumberInRotateArray().minNumberInRotateArray(new int[]{4,5,6,3,4}));
	}
}
