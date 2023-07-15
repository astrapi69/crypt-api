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
package io.github.astrapi69.crypt.api.algorithm.key;

import io.github.astrapi69.crypt.api.algorithm.AesAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.Algorithm;
import io.github.astrapi69.crypt.api.algorithm.CipherAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.SunJCEAlgorithm;

/**
 * The enum {@link KeyGeneratorAlgorithm}. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#keygenerator-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#keygenerator-algorithms</a>
 */
public enum KeyGeneratorAlgorithm implements Algorithm
{


	/** The enum constant for AES algorithm. */
	AES(AesAlgorithm.AES_ALGORITHM_NAME),

	/** The enum constant for ARCFOUR algorithm. */
	ARCFOUR(SecretKeyFactoryAlgorithm.ARCFOUR_ALGORITHM_NAME),

	/** The Blowfish algorithm. */
	Blowfish(SunJCEAlgorithm.BLOWFISH_ALGORITHM_NAME),

	/** The ChaCha20 algorithm. */
	ChaCha20(CipherAlgorithm.CHA_CHA_20_ALGORITHM_NAME),

	/** The DES algorithm. */
	DES(SunJCEAlgorithm.DES_ALGORITHM_NAME),

	/** The DESede algorithm. */
	DESede(SunJCEAlgorithm.DES_EDE_ALGORITHM_NAME),

	/** The DESede algorithm. */
	HmacMD5(KeyGeneratorAlgorithm.H_MAC_MD5_ALGORITHM_NAME),

	/** The enum constant for HmacSHA1 algorithm. */
	HmacSHA1(KeyGeneratorAlgorithm.H_MAC_SHA1_ALGORITHM_NAME),

	/** The enum constant for HmacSHA224 algorithm. */
	HmacSHA224(KeyGeneratorAlgorithm.H_MAC_SHA224_ALGORITHM_NAME),

	/** The enum constant for HmacSHA256 algorithm. */
	HmacSHA256(KeyGeneratorAlgorithm.H_MAC_SHA256_ALGORITHM_NAME),

	/** The enum constant for HmacSHA384 algorithm. */
	HmacSHA384(KeyGeneratorAlgorithm.H_MAC_SHA384_ALGORITHM_NAME),

	/** The enum constant for HmacSHA512 algorithm. */
	HmacSHA512(KeyGeneratorAlgorithm.H_MAC_SHA512_ALGORITHM_NAME),

	/** The RC2 algorithm. */
	RC2(CipherAlgorithm.RC2_ALGORITHM_NAME);

	/**
	 * The string constant H_MAC_MD5_ALGORITHM_NAME
	 */
	public static final String H_MAC_MD5_ALGORITHM_NAME = "HmacMD5";

	/**
	 * The string constant H_MAC_SHA1_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA1_ALGORITHM_NAME = "HmacSHA1";

	/**
	 * The string constant H_MAC_SHA224_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA224_ALGORITHM_NAME = "HmacSHA224";

	/**
	 * The string constant H_MAC_SHA256_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA256_ALGORITHM_NAME = "HmacSHA256";

	/**
	 * The string constant H_MAC_SHA384_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA384_ALGORITHM_NAME = "HmacSHA384";

	/**
	 * The string constant H_MAC_SHA512_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA512_ALGORITHM_NAME = "HmacSHA512";

	/** The algorithm */
	private final String algorithm;

	/**
	 * Instantiates a new {@link KeyGeneratorAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	KeyGeneratorAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAlgorithm()
	{
		return algorithm;
	}

}
