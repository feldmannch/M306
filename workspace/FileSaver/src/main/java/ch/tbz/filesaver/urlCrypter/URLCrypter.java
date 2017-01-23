package ch.tbz.filesaver.urlCrypter;

import java.security.MessageDigest;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class URLCrypter {

	private final static String KEY = "lkzbga72nauiur";

	private static SecretKeySpec getSKS() {
		try {
		// Das Passwort bzw der Schluesseltext
		String keyStr = "1asdf89s";
		// byte-Array erzeugen
		byte[] key = (keyStr).getBytes("UTF-8");
		// aus dem Array einen Hash-Wert erzeugen mit MD5 oder SHA
		MessageDigest sha = MessageDigest.getInstance("SHA-256");
		key = sha.digest(key);
		// nur die ersten 128 bit nutzen
		key = Arrays.copyOf(key, 16);
		// der fertige Schluessel
		SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
		return secretKeySpec;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * Verschlüsseln einer URL
	 * @param text
	 * @return
	 */
	public static String URLEncrypt(String text) {
		try {
			SecretKeySpec SKS = getSKS();
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, SKS);
			byte[] encrypted = cipher.doFinal(text.getBytes());

			BASE64Encoder myEncoder = new BASE64Encoder();
			String geheim = myEncoder.encode(encrypted);

			return geheim;
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * Entschlüsseln einer URL.
	 * @param text
	 * @return
	 */
	public static String URLDecrypt(String text){
		try {
		SecretKeySpec SKS = getSKS();
		BASE64Decoder myDecoder2 = new BASE64Decoder();
		byte[] crypted2 = myDecoder2.decodeBuffer(text);
		 
		Cipher cipher2 = Cipher.getInstance("AES");
		cipher2.init(Cipher.DECRYPT_MODE, SKS);
		byte[] cipherData2 = cipher2.doFinal(crypted2);
		String erg = new String(cipherData2);
		return erg;
		} catch (Exception e) {
			return null;
		}
	}
}
