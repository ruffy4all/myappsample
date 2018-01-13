package chapter5;

public class BottleOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		part1(n);
	
	
		

	}

	
	public static void part1(int n){
		//int n=nd;
	
		while(n==1){
			if (n>=1){
			System.out.println("99 bottles of beer on the wall");
			part1(n+=1);
			part2();
			System.out.println("98 bottles of beer on the wall.");
			System.out.println("No bottles of beer on the wall,");
			System.out.println("no bottles of beer,");
			part3();
			break;
			}
			
			
		}
		
		
		
		
	}
	public static void part2(){
		System.out.println("ya’ take one down, ya’ pass it around,");
	}
	public static void part3(){
		System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
		System.out.println("’cause there are no more bottles of beer on the wall!");
	}
}

