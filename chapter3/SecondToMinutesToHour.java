import java.util.Scanner;
public class chapter3 {
	public static void main(String [] args) {
		//A program to convert seconds to hour, minutes and seconds
		int hour, minute, second, seconds, min_rem, sec_rem;
		
		final int SEC_PER_MIN = 60;
        final int MIN_PER_HOUR = 60;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Excertly how many seconds ");
		second = input.nextInt();
		
		minute =  second/ SEC_PER_MIN;
		min_rem = minute % MIN_PER_HOUR;
		
		hour = minute / MIN_PER_HOUR;
		
		sec_rem = hour % SEC_PER_MIN;
		
		System.out.printf("%d seconds = %d hours, %d minutes and %d seconds", second, hour, min_rem, sec_rem );
		
		
	}

}
