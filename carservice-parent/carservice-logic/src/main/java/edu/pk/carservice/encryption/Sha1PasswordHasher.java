package edu.pk.carservice.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha1PasswordHasher implements PasswordHasher {

	public String encrypt(String password) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
			byte[] byteHash;
			digest.update(password.getBytes());
			byteHash = digest.digest();
			String stringHash = bytesToHash(byteHash);
			return stringHash;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public String bytesToHash(byte[] b) {
		char hexDigit[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		StringBuffer buf = new StringBuffer();
		for (int j = 0; j < b.length; j++) {
			buf.append(hexDigit[(b[j] >> 4) & 0x0f]);
			buf.append(hexDigit[b[j] & 0x0f]);
		}
		return buf.toString();
	}

}
