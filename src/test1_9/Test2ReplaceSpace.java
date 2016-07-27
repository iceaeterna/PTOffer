package test1_9;

public class Test2ReplaceSpace {
	public String replaceSpace(StringBuffer str) {
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < str.length(); i++){
	    	if(str.charAt(i) == ' '){
	    		sb.append("%20");
	    	}else{
	    		sb.append(str.charAt(i));
	    	}
	    }
	    
	    return sb.toString();
	}
	
	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer("hello world");
		System.out.println(new Test2ReplaceSpace().replaceSpace(sBuffer));
	}
}
