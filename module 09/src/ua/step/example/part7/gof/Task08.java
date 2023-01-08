package ua.step.example.part7.gof;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 * 
 * Strategy известен также под названием Policy. Суть его состоит в том, чтобы
 * создать несколько моделей поведения (стратегий) для одного объекта и вынести
 * их в отдельные классы.
 * 
 */
public class Task08 {
	public static void main(String[] args) {
		String key = "key";
		String text = "text";
		Algorithm algoritm = new DESAlgorithm();
		Encryption encryption = new Encryption(algoritm);
		String cryptedText = encryption.crypt(text, key);
		System.out.println(cryptedText);

		// смена алгоритма шифрования
		algoritm = new RSAAlgorythm();
		encryption.setAlgorithm(algoritm);
		cryptedText = encryption.crypt(text, key);
		System.out.println(cryptedText);
	}
}

interface Algorithm {
	String crypt(String text, String key);
}

class DESAlgorithm implements Algorithm {
	public String crypt(String text, String key) {
		String cryptedString = null;
		KeyPairGenerator keyGen;
		try {
			keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
			SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");

			keyGen.initialize(1024, random);

			KeyPair pair = keyGen.generateKeyPair();
			PrivateKey priv = pair.getPrivate();
			PublicKey pub = pair.getPublic();

			Signature dsa = Signature.getInstance("SHA1withDSA", "SUN");
			dsa.initSign(priv);
			byte[] data = text.getBytes();
			dsa.update(data);
			cryptedString = new String(data);
		} catch (NoSuchAlgorithmException | NoSuchProviderException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (SignatureException e) {
			e.printStackTrace();
		}

		return cryptedString;
	}
}

class RSAAlgorythm implements Algorithm {
	public String crypt(String text, String key) {
		String cryptedString = text;
		try {
			Cipher cipher = Cipher.getInstance("RSA");
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(2048);
			KeyPair kp = keyGen.genKeyPair();

			PublicKey publicKey = kp.getPublic();
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] x = cipher.doFinal(text.getBytes());
			cryptedString = new String(x);

		} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
		} catch (BadPaddingException e) {
			e.printStackTrace();
		}
		return cryptedString;
	}
}

class Encryption {
	private Algorithm algorithm;

	public Encryption(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	public void setAlgorithm(Algorithm algorithm) {
		this.algorithm = algorithm;
	}

	public String crypt(String text, String key) {
		return algorithm.crypt(text, key);
	}
}