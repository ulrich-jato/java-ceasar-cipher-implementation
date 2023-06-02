package pkgCeasarCipherTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import pkgCeasarCipher.CeasarCipher;
import pkgCeasarCipher.CipherContext;

/**
 * The CeasarCipherTest class allows the user to interactively test the Caesar cipher 
 * implementation using different shift values. The user can choose between encrypting 
 * and decrypting messages by providing the appropriate input and viewing the corresponding 
 * output.
 *
 */
public class CeasarCipherTest {

	/**
	 * The main method that runs the Caesar cipher test.
	 * @param args the command-line arguments
	 */
	public static void main(String[] args) {
		CipherContext context = new CipherContext() ;
		
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		do {
			try {
			System.out.println("Choose an option: ");
			System.out.println("1. Encrypt: ");
			System.out.println("2. Decrypt: ");
			System.out.println("3. Exit: ");
			
			int option = scanner.nextInt();
			
			if(option == 1  || option == 2) {
				System.out.println("Enter the shift value:");
				int shift = scanner.nextInt();
				
				context.setStrategy(new CeasarCipher(shift));
				
				scanner.nextLine();
				
				String inputText;
				String outputText;
				
				if(option == 1) {
					System.out.println("Enter the plaintext:");
					inputText = scanner.nextLine();
					outputText = context.encrypt(inputText);
					System.out.println("Encrypted: " + outputText);
				}else if(option == 2) {
					System.out.println("Enter the ciphertext:");
					inputText = scanner.nextLine();
					outputText = context.decrypt(inputText);
					System.out.println("Decrypted: " + outputText);
				}
				
			}else if(option == 3) {
				System.out.println("Thanks for testing my program");
				exit = true;
			}else {
				System.out.println("Invalid option");
			}
			System.out.println();
			}catch(InputMismatchException e) {
				System.out.println("Invalid input! Please provide a valid option");
				scanner.nextLine();
			}
		}while(!exit);
		scanner.close();
	}

}
