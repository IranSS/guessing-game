package Game;

import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {
		
		try (Scanner Entrada = new Scanner(System.in)) {
			int numberAttemptsr, winningNumber, Contador;
			
			System.out.print("number of attempts: ");
			numberAttemptsr = Entrada.nextInt();
			
			System.out.print("winning number: ");
			winningNumber = Entrada.nextInt();
			
			for(Contador = 0; Contador != numberAttemptsr; Contador++) {
				
				System.out.print("Try to guess the number: ");
				int Adv = Entrada.nextInt();
				
				if(winningNumber == Adv){
					System.out.print("You WIN! :D");
					break;
				}
				else if(Adv > winningNumber) {
					System.out.println("Try a smaller number.");
				}
				else if(Adv < winningNumber) 
				{
					System.out.println("Try a larger number.");
				}
			}
			
			if(Contador == numberAttemptsr) 
			{
				System.out.print("You Lost! :(");
			}
			
			Entrada.close();
		}
	}

}
