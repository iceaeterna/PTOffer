package test10_19;

import java.util.ArrayList;

public class Test19PrintMatrix {
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	    ArrayList<Integer> list = new ArrayList<>();   
		int rows = matrix.length;
	       int columns = matrix[0].length;
	       for(int i = 0; i <= (Math.min(rows,columns)-1)/2; i++){
	    	   for(int j = i; j < columns - i; j++) list.add(matrix[i][j]);
	    	   for(int j = i+1; j < rows - i; j++) list.add(matrix[j][columns-i-1]);
	    	   if(rows - i - 1 != i)
	    		   for(int j = columns - i - 2;j >= i; j--) list.add(matrix[rows-i-1][j]);
	    	   if(columns - i - 1 != i)
	    	       for(int j = rows - i - 2; j > i; j--) list.add(matrix[j][i]);
	       }
	    return list;
    }
	
	public static void main(String[] args) {
//		int [][]matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][]matrix = new int[][]{{1},{2},{3},{4},{5}};
		ArrayList<Integer> list = new Test19PrintMatrix().printMatrix(matrix);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
}
