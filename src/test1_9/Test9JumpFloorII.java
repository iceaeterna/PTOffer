package test1_9;

public class Test9JumpFloorII {
    
    public int JumpFloor(int target) {
    	if(target == 1) return 1;
		if(target == 2) return 2;
    	int array[] = new int[target+1];
		array[0] = 1;
    	array[1] = 1;
		array[2] = 2;
		for(int i = 3; i <= target; i++){
			for(int j = 0; j < i; j++){
				array[i] += array[j];
			}
		}
		return array[target];
    }
    
    public int JumpFloor2(int target) {
    	return 1<<(target-1);
    }
	
	public static void main(String[] args) {
		System.out.println(new Test9JumpFloorII().JumpFloor(5));
		System.out.println(new Test9JumpFloorII().JumpFloor2(5));
	}
}
