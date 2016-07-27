package test1_9;

public class Test7Fibonacci {
	static int array[] = new int[40];
	static{
		array[0] = 0; 
		array[2] = array[1] = 1;
		for(int i = 3;i < 40; i++){
			array[i] = array[i-1]+array[i-2];
		}
	}
	public int Fibonacci(int n) {
		return array[n];
    }
	
	public static void main(String[] args) {
		System.out.println(new Test7Fibonacci().Fibonacci(4));
	}
}
