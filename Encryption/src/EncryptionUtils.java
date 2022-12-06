import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptionUtils {
	
	static String opco = "opcoreferencedataapiadvisorwork";
	
	static final String key = "12345678123456781234567812345678";
	/* static final String key = "1234567812345678123456781234567812345678123456781234567812345678" +
								"1234567812345678123456781234567812345678123456781234567812345678" +
								"1234567812345678123456781234567812345678123456781234567812345678" +
								"1234567812345678123456781234567812345678123456781234567812345678"; */

	public static void main(String[] args) throws Exception {
		
		String encryptedText = encrypt("AES", "Rajeshwaran");
		System.out.println("encryptedText:" + encryptedText);
		System.out.println("DecryptedText:" + decrypt("AES", encryptedText));
		System.out.println(new StringBuffer(opco).reverse());
	}

	public static String generateKey() {
		
		//KeyGenerator keyGen = KeyGenerator.getInstance("AES")
		
		return "";
	}
	
	static String encrypt(String algorithm, String input) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		
		SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
		cipher.init(Cipher.ENCRYPT_MODE, keySpec);
		byte[] cipherText = cipher.doFinal(input.getBytes());
		
		return Base64.getEncoder().encodeToString(cipherText);
	}
	
	static String decrypt(String algorithm, String cipherText) throws Exception {
		Cipher cipher = Cipher.getInstance("AES");
		SecretKeySpec dKeySpec = new SecretKeySpec(key.getBytes(), "AES");
		
		cipher.init(Cipher.DECRYPT_MODE, dKeySpec);
		
		byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));
		
		System.out.println();
		return new String(plainText);
	}
	
}
