package test1_9;

public class Test1FindInArrays {
	 public boolean Find(int [][] array,int target) {
	        int rows = array.length;
	        int columns = array[0].length;
	        for(int i=rows-1, j=0; i>=0 && j<columns;){
	        	if(array[i][j] == target) return true;
	        	else if(array[i][j] < target) j++;
	        	else i--;
	        }
	        return false;
	 }
	 
	 public boolean Find2(int [][] array,int target) {
	        int rows = array.length;
	        int columns = array[0].length;
	        for(int i=0, j=columns-1; i<rows && j>=0;){
	        	if(array[i][j] == target) return true;
	        	else if(array[i][j] < target) i++;
	        	else j--;
	        }
	        return false;
	 }
	
	public static void main(String[] args) {
		System.out.println(new Test1FindInArrays().Find2(new int[][]{{1,2},{3,4},{5,6}}, 3));
	}
}
