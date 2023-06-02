package pkgCeasarCipher;

/**
 * The CipherStrategy interface represents a strategy for performing encryption and decryption 
 * operations on text using a Caesar cipher. provides methods to encrypt and decrypt text using 
 * the chosen cipher strategy.
 * 
 *@version 1.0
 *@author Jato Ulrich Guiffo Kengne
 *@since January 22th, 2023
 *
 */
public interface CipherStrategy {
	
	/**
     * Encrypts the provided plaintext using the implemented cipher strategy.
     *
     * @param plaintext The text to be encrypted.
     * @return The encrypted ciphertext.
	 */
	String encrypt(String plaintext);
	
	/**
     * Decrypts the provided ciphertext using the implemented cipher strategy.
     *
     * @param ciphertext The text to be decrypted.
     * @return The decrypted plaintext.
     */
	String decrypt(String ciphertext);
	
}
