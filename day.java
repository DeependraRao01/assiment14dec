package geeksternew;

import java.util.Scanner;

public class day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("time : ");
		int time = sc.nextInt();
		
				   if(time<=6)
				     System.out.println("good morning");
				   else if(time>6 && time<12)
					   System.out.println("fore noon");
				    else if(time>=12 && time<4)
				    	System.out.println("after noon");
				    else if(time>=6)
				    	System.out.println("good evening");
				    else
				    	System.out.println("invalid input");


	}

}
