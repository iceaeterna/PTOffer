package test10_19;

public class Test12Power {
	public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
	 }
	
	public double Power2(double base, int exponent) {
        if(base == 0) return 0;
        if(exponent == 0) return 1;
        boolean negtive = exponent < 0;
        exponent = negtive ? (-exponent):exponent;
        
        double res = 1;
        while(exponent-- > 0){
        	res *= base;
        }
        return (negtive) ? (1/res):res;
	 }
	
	public static void main(String[] args) {
		System.out.println(new Test12Power().Power2(1.5, 0));
	}
}
