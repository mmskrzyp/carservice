package edu.pk.carservice.encryption;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sha1PasswordEncryptorTest {
	
	private PasswordHasher hasher = new Sha1PasswordHasher();
	private String expectedResult = "B073D7937C38E7177DCF18E71A31D2161DA9193F";
	
	@Test
	public void encryptorShouldRetrunValidHash() {
		String hash = hasher.encrypt("testowe_haslo");
		assertEquals(expectedResult, hash.toUpperCase());
	}
	
}
