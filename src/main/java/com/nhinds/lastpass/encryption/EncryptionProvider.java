package com.nhinds.lastpass.encryption;

public interface EncryptionProvider {
	/** Decrypt the given encrypted data */
	String decrypt(byte[] encryptedData);
	
	/** Encrypt the given plaintext */
	byte[] encrypt(String plainText);
}