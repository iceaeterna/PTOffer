package test20_29;

public class Test23VerifySquenceOfBST {

	public boolean verify(int []seq, int start, int end){
		int cut_point = -1;
		System.out.println(start+"~"+end);
		if(start >= end) return true;
		for(int i = start; i < end; i++){
			if(seq[i] > seq[end] && cut_point == -1) {
				cut_point = i;
			}else if(seq[i] < seq[end] && cut_point != -1){
				return false;
			}
		}
		System.out.println("cut point:" + cut_point);
		
		if(cut_point != -1){
			return verify(seq, start, cut_point - 1) & verify(seq, cut_point, end-1);
		}
		else{
			return verify(seq,start,end-1);
		}
	}
	
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length < 1) return false;
		return verify(sequence, 0, sequence.length - 1);
    }
	
	
	public static void main(String[] args) {
		System.out.println(new Test23VerifySquenceOfBST().VerifySquenceOfBST(new int[]{4,8,6,12,16,14,10}));
	}
}
