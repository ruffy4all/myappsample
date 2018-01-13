package chapter8;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] n={1,2,3,4,5,6,7,8,9,33,44,44,55,66,77,22,11,90,18};
	
		sieve(n);



	}
		
		
	public static void  sieve(int[] n){
	    boolean isPrime = true;             

	    for (int i = 2; i<n.length;i++){          
	        for (int j=2; j<i; j++)         
	        {
	            if((n[i] % j)== 0){           
	                                       
	                isPrime=false;     
	            break;                  
	        }
	            }               
	        if(isPrime)           
	        {

	            System.out.println(i + " is Prime");
	        }
	        isPrime = true;      
	    }
	    }
		
		
		
	
		
	}


