package test1_9;

public class Test8JumpFloor {
	public int JumpFloor(int target) {
		if(target == 1) return 1;
		if(target == 2) return 2;
		return JumpFloor(target - 1) + JumpFloor(target - 2); 
    }
	
	static int array[] = new int[1000];
	static{
		array[1] = 1; 
		array[2] = 2;
		for(int i = 3;i < 1000; i++){
			array[i] = array[i-1]+array[i-2];
		}
	}
	
    public int JumpFloor2(int target) {
		if(target == 1) return 1;
		if(target == 2) return 2;
		return JumpFloor(target - 1) + JumpFloor(target - 2); 
    }
    
    public int JumpFloor3(int target) {
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
		System.out.println(new Test8JumpFloor().JumpFloor3(5));
	}
}
