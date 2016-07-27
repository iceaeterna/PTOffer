package test10_19;

public class Test10RectCover {
	
	public int RectCover(int target) {
		if(target == 1) return 1;
		if(target == 2) return 2;
		int array[] = new int[target+1];
		array[1] = 1;
		array[2] = 2;
		for(int i = 3; i <= target; i++){
			array[i] = array[i-1] + array[i-2];
		}
		return array[target];
    }
	
	public static void main(String[] args) {
		System.out.println(new Test10RectCover().RectCover(4));
	}
}
