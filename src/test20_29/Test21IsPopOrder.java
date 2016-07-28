package test20_29;

public class Test21IsPopOrder {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      	int prev = -1;
	      	boolean hash[] = new boolean [pushA.length];
			for(int i = 0; i < popA.length; i++){
			  int curPos = -1;
	    	  for(int j = pushA.length - 1; j >= 0 ; j--){
	    		  if(pushA[j] == popA[i] && hash[j] == false) {
	    			  curPos = j;
	    			  break;
	    		  }
	    	  }
	    	  
//	    	  System.out.println((prev+1) + ","+(curPos+1));
	    	  if(curPos == -1) return false;
	    	  if(curPos < prev){
	    		  for(int j = curPos + 1; j < prev; j++){
	    			  if(hash[j] == false) return false;
	    		  }
	    	  }
	    	  
	    	  prev = curPos;
	    	  hash[curPos] = true;
	      }
		  return true;
    }
	
	public static void main(String[] args) {
//		System.out.println(new Test21IsPopOrder().IsPopOrder(new int[]{1,2,3,4,5}, new int[]{3,4,5,2,1}));
		System.out.println(new Test21IsPopOrder().IsPopOrder(new int[]{1}, new int[]{2}));
	}
}
