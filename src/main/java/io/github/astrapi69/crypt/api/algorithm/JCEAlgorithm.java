/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.crypt.api.algorithm;

/**
 * The enum {@link JCEAlgorithm} represents various algorithms provided by the Java Cryptography
 * Extension (JCE).
 */
public enum JCEAlgorithm
{
	/**
	 * MD5 algorithm for computing a message digest (hash) from input data.
	 */
	MD5("MessageDigest", "Used for computing a message digest (hash) from input data.",
		new String[] { "MD5" }),
	/**
	 * SHA-1 algorithm for computing a message digest (hash) from input data.
	 */
	SHA1("MessageDigest", "Used for computing a message digest (hash) from input data.",
		new String[] { "SHA1", "SHA-1" }),
	/**
	 * SHA-256 algorithm for computing a message digest (hash) from input data.
	 */
	SHA256("MessageDigest", "Used for computing a message digest (hash) from input data.",
		new String[] { "SHA256", "SHA-256" }),
	/**
	 * SHA-384 algorithm for computing a message digest (hash) from input data.
	 */
	SHA384("MessageDigest", "Used for computing a message digest (hash) from input data.",
		new String[] { "SHA384", "SHA-384" }),
	/**
	 * SHA-512 algorithm for computing a message digest (hash) from input data.
	 */
	SHA512("MessageDigest", "Used for computing a message digest (hash) from input data.",
		new String[] { "SHA512", "SHA-512" }),
	/**
	 * AES algorithm for encrypting and decrypting data.
	 */
	AES("Cipher", "Used for encrypting and decrypting data using the AES algorithm.",
		new String[] { "AES" }),
	/**
	 * DES algorithm for encrypting and decrypting data.
	 */
	DES("Cipher", "Used for encrypting and decrypting data using the DES algorithm.",
		new String[] { "DES" }),
	/**
	 * 3DES (DESede) algorithm for encrypting and decrypting data.
	 */
	DESede("Cipher", "Used for encrypting and decrypting data using the 3DES algorithm.",
		new String[] { "DESede" }),
	/**
	 * Blowfish algorithm for encrypting and decrypting data.
	 */
	Blowfish("Cipher", "Used for encrypting and decrypting data using the Blowfish algorithm.",
		new String[] { "Blowfish" }),
	/**
	 * RC2 algorithm for encrypting and decrypting data.
	 */
	RC2("Cipher", "Used for encrypting and decrypting data using the RC2 algorithm.",
		new String[] { "RC2" }),
	/**
	 * RC4 algorithm for encrypting and decrypting data.
	 */
	RC4("Cipher", "Used for encrypting and decrypting data using the RC4 algorithm.",
		new String[] { "RC4" }),
	/**
	 * RSA algorithm for encrypting and decrypting data.
	 */
	RSA("Cipher", "Used for encrypting and decrypting data using the RSA algorithm.",
		new String[] { "RSA" }),
	/**
	 * DSA algorithm for generating and verifying digital signatures.
	 */
	DSA("Signature",
		"Used for generating and verifying digital signatures using the DSA algorithm.",
		new String[] { "DSA" }),
	/**
	 * EC algorithm for generating elliptic curve key pairs.
	 */
	EC("KeyPairGenerator", "Used for generating elliptic curve key pairs.", new String[] { "EC" }),
	/**
	 * DH algorithm for key agreement using the Diffie-Hellman algorithm.
	 */
	DH("KeyAgreement", "Used for key agreement using the Diffie-Hellman algorithm.",
		new String[] { "DH" }),
	/**
	 * ECDH algorithm for key agreement using the Elliptic Curve Diffie-Hellman algorithm.
	 */
	ECDH("KeyAgreement",
		"Used for key agreement using the Elliptic Curve Diffie-Hellman algorithm.",
		new String[] { "ECDH" }),
	/**
	 * HmacMD5 algorithm for computing a message authentication code (MAC) using HMAC-MD5.
	 */
	HmacMD5("Mac", "Used for computing a message authentication code (MAC) using HMAC-MD5.",
		new String[] { "HmacMD5" }),
	/**
	 * HmacSHA1 algorithm for computing a message authentication code (MAC) using HMAC-SHA1.
	 */
	HmacSHA1("Mac", "Used for computing a message authentication code (MAC) using HMAC-SHA1.",
		new String[] { "HmacSHA1" }),
	/**
	 * HmacSHA256 algorithm for computing a message authentication code (MAC) using HMAC-SHA256.
	 */
	HmacSHA256("Mac", "Used for computing a message authentication code (MAC) using HMAC-SHA256.",
		new String[] { "HmacSHA256" }),
	/**
	 * HmacSHA384 algorithm for computing a message authentication code (MAC) using HMAC-SHA384.
	 */
	HmacSHA384("Mac", "Used for computing a message authentication code (MAC) using HMAC-SHA384.",
		new String[] { "HmacSHA384" }),
	/**
	 * HmacSHA512 algorithm for computing a message authentication code (MAC) using HMAC-SHA512.
	 */
	HmacSHA512("Mac", "Used for computing a message authentication code (MAC) using HMAC-SHA512.",
		new String[] { "HmacSHA512" }),
	/**
	 * RSA key pair generator for generating RSA key pairs.
	 */
	RSA_KEYPAIR("KeyPairGenerator", "Used for generating RSA key pairs.",
		new String[] { "RSA_KEYPAIR", "RSA" }),
	/**
	 * DSA key pair generator for generating DSA key pairs.
	 */
	DSA_KEYPAIR("KeyPairGenerator", "Used for generating DSA key pairs.",
		new String[] { "DSA_KEYPAIR", "DSA" }),
	/**
	 * EC key pair generator for generating elliptic curve key pairs.
	 */
	EC_KEYPAIR("KeyPairGenerator", "Used for generating elliptic curve key pairs.",
		new String[] { "EC_KEYPAIR", "EC" }),
	/**
	 * RSA key factory for converting between different representations of RSA keys.
	 */
	RSA_KEYFACTORY("KeyFactory",
		"Used for converting between different representations of RSA keys.",
		new String[] { "RSA_KEYFACTORY", "RSA" }),
	/**
	 * DSA key factory for converting between different representations of DSA keys.
	 */
	DSA_KEYFACTORY("KeyFactory",
		"Used for converting between different representations of DSA keys.",
		new String[] { "DSA_KEYFACTORY", "DSA" }),
	/**
	 * EC key factory for converting between different representations of elliptic curve keys.
	 */
	EC_KEYFACTORY("KeyFactory",
		"Used for converting between different representations of elliptic curve keys.",
		new String[] { "EC_KEYFACTORY", "EC" }),
	/**
	 * X.509 certificate factory for generating X.509 certificates from their encodings.
	 */
	X509_CERT("CertificateFactory", "Used for generating X.509 certificates from their encodings.",
		new String[] { "X509_CERT", "X.509" }),
	/**
	 * Java KeyStore (JKS) type for storing cryptographic keys and certificates.
	 */
	JKS_KEYSTORE("KeyStore",
		"Java KeyStore (JKS) type for storing cryptographic keys and certificates.",
		new String[] { "JKS_KEYSTORE", "JKS" }),
	/**
	 * PKCS#12 type for storing cryptographic keys and certificates.
	 */
	PKCS12_KEYSTORE("KeyStore", "PKCS#12 type for storing cryptographic keys and certificates.",
		new String[] { "PKCS12_KEYSTORE", "PKCS12" }),
	/**
	 * Key manager factory for managing key material for X.509 certificates using SunX509 algorithm.
	 */
	SUNX509_KEYMANAGER("KeyManagerFactory",
		"Used for managing key material for X.509 certificates.",
		new String[] { "SUNX509_KEYMANAGER", "SunX509" }),
	/**
	 * Key manager factory for managing key material with PKIX trust management.
	 */
	PKIX_KEYMANAGER("KeyManagerFactory",
		"Used for managing key material with PKIX trust management.",
		new String[] { "PKIX_KEYMANAGER", "PKIX" }),
	/**
	 * Trust manager factory for managing trust material for X.509 certificates using SunX509
	 * algorithm.
	 */
	SUNX509_TRUSTMANAGER("TrustManagerFactory",
		"Used for managing trust material for X.509 certificates.",
		new String[] { "SUNX509_TRUSTMANAGER", "SunX509" }),
	/**
	 * Trust manager factory for managing trust material with PKIX trust management.
	 */
	PKIX_TRUSTMANAGER("TrustManagerFactory",
		"Used for managing trust material with PKIX trust management.",
		new String[] { "PKIX_TRUSTMANAGER", "PKIX" }),
	/**
	 * Certification path builder using the PKIX algorithm.
	 */
	PKIX_CERTPATH("CertPathBuilder",
		"Used for building certification paths using the PKIX algorithm.",
		new String[] { "PKIX_CERTPATH", "PKIX" });

	/** The class name where the algorithm is used. */
	private final String className;

	/** The description of the algorithm. */
	private final String description;

	/** The possible algorithm names. */
	private final String[] algorithms;

	/**
	 * Instantiates a new {@link JCEAlgorithm} object.
	 *
	 * @param className
	 *            the class name where the algorithm is used
	 * @param description
	 *            the description of the algorithm
	 * @param algorithms
	 *            the possible names for the algorithm
	 */
	JCEAlgorithm(String className, String description, String[] algorithms)
	{
		this.className = className;
		this.description = description;
		this.algorithms = algorithms;
	}

	/**
	 * Gets the class name where the algorithm is used.
	 *
	 * @return the class name
	 */
	public String getClassName()
	{
		return className;
	}

	/**
	 * Gets the description of the algorithm.
	 *
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * Gets the possible names for the algorithm.
	 *
	 * @return the algorithm names
	 */
	public String[] getAlgorithms()
	{
		return algorithms;
	}
}
