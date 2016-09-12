package iterationsloops;

import java.util.Scanner;

public class Namereversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner amount = new Scanner(System.in);
		System.out.println("Type your name: ");
		String a = amount.next();
		int i = a.length();
		for(i = i-1; i >= 0; i--){
			System.out.print(a.substring(i, i+1));
			
			
		}
		
		
	}

}
