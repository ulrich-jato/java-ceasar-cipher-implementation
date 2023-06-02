package pkgCeasarCipher;

/**
 * The context class for the strategy design pattern that uses a concrete implementation
 * of the CipherStrategy interface to perform encryption and decryption operations.
 * 
 * @version 1.0
 * @author Jato Ulrich Guiffo Kengne
 * @since January 22th, 2023
 *
 */
public class CipherContext {
	/**
	 * The current strategy used for encryption and decryption operations.
	 */
	private CeasarCipher strategy;
	
	/**
	 * Sets the strategy for the context to use for encryption and decryption operations.
	 * @param strategy the concrete implementation of the CipherStrategy interface
	 */
	public void setStrategy(CeasarCipher strategy) {
		this.strategy = strategy;
	}
	
	/**
	 * Encrypts the plaintext using the current strategy.
	 * @param plaintext the text to be encrypted
	 * @return the encrypted ciphertext
	 */
	public String encrypt(String plaintext) {
		return strategy.encrypt(plaintext);
	}
	
	/**
	 * Decrypts the ciphertext using the current strategy.
	 * @param ciphertext the text to be decrypted
	 * @return the decrypted plaintext
	 */
	public String decrypt(String ciphertext) {
		return strategy.decrypt(ciphertext);
	}
}
