package chapter8;
import java.util.*;
public class IndexOfMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] a=new int[5];
  a[0]=6;
  a[1]=3;
  a[2]=50;
  a[3]=9;
  a[4]=6;
  int c;
 c= indexOfMax(a);
		System.out.println(c);
	}
	
	private static int indexOfMax( int array[]) {
		// TODO Auto-generated method stub
		 int largest = array[0];
		    int largestIndex = 0;

		    for(int i = 0; i < array.length; i++)
		    {
		        if(array[i] > largest) {
		            largest = array[i]; 
		            largestIndex =i;
		        }  
		    }
		return largestIndex;
	}

	
	}
	
