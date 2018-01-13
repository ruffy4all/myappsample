package chapter7;

public class InfiniteSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double x=20;
int n=5;

System.out.println("Find exp(-x^2)");
//double x = inDouble("Enter x: ");
System.out.println("myexp(" + -x*x + ") = " + gauss(x, 20));
System.out.println("Math.exp(" + -x*x + ") = " + Math.exp(-x*x));
double ans=gauss(x,n);
System.out.print(ans);
	}
	public static double gauss(double x,int n) 
	{
		x = -x*x;
	  
	double exp = 0, error = 1, numerator = 1, denominator = 1;
	    double machineEpsilon = 1.0;
	    // calculate machineEpsilon
	    while ((1.0 + 0.5 * machineEpsilon) != 1.0)
	        machineEpsilon = 0.5 * machineEpsilon;
	    
	    // while the error is large enough to be representable in terms of the current data type
	    while ((error >= machineEpsilon) || (-error <= -machineEpsilon))
	    {
	        exp += error;
	        // calculate the numerator (it is 1 if we just start, but -x times its past value otherwise)
	        numerator = ((n == 0) ? 1 : -numerator * x);
	        // calculate the denominator (denominator gets multiplied by n)
	        denominator *= (n++);
	        // calculate error
	        error = numerator/denominator;
	    }
	    return exp;
	}
}
