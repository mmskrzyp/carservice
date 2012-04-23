package edu.pk.carservice.encryption;

public interface PasswordHasher {
	public String encrypt(String plainPassword);
}
