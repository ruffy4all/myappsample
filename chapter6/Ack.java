package chapter6;

public class Ackermann {

	 public static int Ack(int m, int n) {

	      if (m == 0) {
	       return 2 * n;
	      } else if (m >= 1) {
	       if (n == 0) {
	        return 0;
	       } else if (n == 1) {
	        return 2;
	       } else {
	        return Ack(m - 1, Ack(m, n - 1));
	       }
	      }
	      return n;
	      }

	     public static void main(String args[]) {
	    	 int r=Ack(3,2);
	    	 System.out.println(r);
	     
	     }
	    }
