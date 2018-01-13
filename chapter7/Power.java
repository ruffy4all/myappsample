package chapter7;

public class Power {



	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int r=power(4,2);
	System.out.println(r);
		}
		
		
	public static int power(double n,int m){
		int ans=0;
		double r;
		double m2=(double)m;
		
		if(Math.pow(n,m2)==1){
			return 1;
		}else
		{
			while(Math.pow(n, m2)!=1){
				
				 ans =(int)Math.pow(n, m2)*(int)n;
				m2--;
				
		}
		
		
		
		}
		
		return ans;
		
	}
	}
