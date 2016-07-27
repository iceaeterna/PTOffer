package test10_19;

public class Test13ReOrderArray {
	public void reOrderArray(int [] array) {
		int last_even = -1;
		for(int i = 0; i < array.length; i++){
			if((array[i] & 0x1) != 0){
				if(last_even != -1){
					int tmp = array[i];
					for(int j = i; j > last_even; j--){
						array[j] = array[j-1];
					}
					array[last_even++] = tmp;
				}
			}else{
				if(last_even == -1)
					last_even = i;
			}
		}
    }
	
	public static void main(String[] args) {
		int array[] = new int[]{1,2};
		new Test13ReOrderArray().reOrderArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
	}
}
