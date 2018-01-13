package chapter7;
import java.util.*;
public class Myexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner infinite = new Scanner(System.in);
	        System.out.println("what is the  value of X?");
	        double x = infinite.nextDouble();
	        System.out.println("what is the value of I?");  // !
	        int power = infinite.nextInt();

	        System.out.println(Math.exp(power));//for comparison

	        System.out.println("the final value of series is: " + myExp(x, power));
	    }

	    public static double fac(double n) {
	        if (n > 1) {
	            return n * fac(n - 1);
	        } else {
	            return 1;
	        }
	    }

	    public static double check(double x, double n) {
	        double result;
	        if (n == 0) {
	            result = 1;
	        } else {
	            result = x;
	        }
	        for (int i = 1; i < n; i++) {
	            result *= x;
	        }
	        return result;
	    }

	    public static double myExp(double x, double n) {
	        double sum = 0;
	        for (int i = 0; i <= n; i++) { // x^0 is 1
	            sum += (check(x, i) / fac(i));
	        }
	        return sum;
	    }

}
