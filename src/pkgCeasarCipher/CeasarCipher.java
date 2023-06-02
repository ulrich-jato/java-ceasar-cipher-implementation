package pkgCeasarCipher;

/**
 * Implementation of the CipherStrategy interface that represents the Caesar cipher algorithm.
 * The Caesar cipher is a substitution cipher that replaces each letter in the plaintext by a letter
 * some fixed number of positions down the alphabet.
 * 
 * @version 1.0
 * @author Jato Ulrich Guiffo Kengne
 * @since January 22th, 2023
 */
public class CeasarCipher implements CipherStrategy {
	
	/**
	 * shift value used as the key for encryption and decryption operations
	 */
	private int shift;
	
	/**
	 * Parameterized constructor.
	 * Constructs a CeasarCipher object with the specified shift value.
	 * @param shift the number of positions to shift each letter in the alphabet
	 */
	public CeasarCipher(int shift) {
		this.shift = shift;
	}
	
	/**
	 * Encrypts the plaintext using the Caesar cipher algorithm.
	 * @param plaintext the text to be encrypted
	 * @return the encrypted ciphertext
	 */
	@Override
	public String encrypt(String plaintext) {
		StringBuilder ciphertext = new StringBuilder();
		for (char c : plaintext.toCharArray()) {
			if (Character.isLetter(c)) {
				char base = Character.isUpperCase(c) ? 'A':'a';
				char encryptedChar = (char)((c - base + shift)%26 + base);
				ciphertext.append(encryptedChar);
			}else {
				ciphertext.append(c);
			}
		}
		return ciphertext.toString();
	}

	/**
	 * Decrypts the ciphertext using the Caesar cipher algorithm.
	 * @param ciphertext the text to be decrypted
	 * @return the decrypted plaintext
	 */
	@Override
	public String decrypt(String ciphertext) {
		StringBuilder plaintext = new StringBuilder();
		for(char c: ciphertext.toCharArray()) {
			if (Character.isLetter(c)) {
				char base = Character.isUpperCase(c)? 'A':'a';
				char decryptedChar = (char)((c - base - shift + 26 )%26 + base);
				plaintext.append(decryptedChar);
			}else {
				plaintext.append(c);
			}
		}
		return plaintext.toString();
	}

}
