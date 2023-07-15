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

import io.github.astrapi69.crypt.api.algorithm.key.KeyPairGeneratorAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.key.SecretKeyFactoryAlgorithm;

/**
 * The enum {@link CipherAlgorithm} that defines the names for the algorithm component in a
 * transformation when requesting an instance of Cipher object
 */
public enum CipherAlgorithm implements Algorithm
{

	/** The enum constant for AES algorithm. */
	AES(AesAlgorithm.AES_ALGORITHM_NAME),

	/** The enum constant for AES algorithm. */
	AESWrap(CipherAlgorithm.AES_WRAP_ALGORITHM_NAME),

	/** The enum constant for ARCFOUR algorithm. */
	ARCFOUR(SecretKeyFactoryAlgorithm.ARCFOUR_ALGORITHM_NAME),

	/** The Blowfish algorithm. */
	Blowfish(SunJCEAlgorithm.BLOWFISH_ALGORITHM_NAME),

	/** The ChaCha20 algorithm. */
	ChaCha20(CipherAlgorithm.CHA_CHA_20_ALGORITHM_NAME),

	/** The ChaCha20-Poly1305 algorithm. */
	ChaCha20_Poly1305(CipherAlgorithm.CHA_CHA_20_POLY1305_ALGORITHM_NAME),

	/** The DES algorithm. */
	DES(SunJCEAlgorithm.DES_ALGORITHM_NAME),

	/** The DESede algorithm. */
	DESede(SunJCEAlgorithm.DES_EDE_ALGORITHM_NAME),

	/** The DESedeWrap algorithm. */
	DESedeWrap(CipherAlgorithm.DES_EDE_WRAP_ALGORITHM_NAME),

	/** The DESedeWrap algorithm. */
	ECIES(CipherAlgorithm.ECIES_ALGORITHM_NAME),

	/** The RC2 algorithm. */
	RC2(CipherAlgorithm.RC2_ALGORITHM_NAME),

	/** The RC4 algorithm. */
	RC4(CipherAlgorithm.RC4_ALGORITHM_NAME),

	/** The RC5 algorithm. */
	RC5(CipherAlgorithm.RC5_ALGORITHM_NAME),

	/** The enum constant for RSA algorithm. */
	RSA(KeyPairGeneratorAlgorithm.RSA_ALGORITHM_NAME);

	/** The string constant AES_WRAP_ALGORITHM_NAME */
	public static final String AES_WRAP_ALGORITHM_NAME = AesAlgorithm.AES_ALGORITHM_NAME + "Wrap";

	/** The string constant CHA_CHA_20_ALGORITHM_NAME */
	public static final String CHA_CHA_20_ALGORITHM_NAME = "ChaCha20";

	/** The string constant CHA_CHA_20_ALGORITHM_NAME */
	public static final String CHA_CHA_20_POLY1305_ALGORITHM_NAME = CHA_CHA_20_ALGORITHM_NAME
		+ "-Poly1305";

	/** The string constant DES_EDE_WRAP_ALGORITHM_NAME */
	public static final String DES_EDE_WRAP_ALGORITHM_NAME = SunJCEAlgorithm.DES_EDE_ALGORITHM_NAME
		+ "Wrap";

	/** The string constant ECIES_ALGORITHM_NAME */
	public static final String ECIES_ALGORITHM_NAME = "ECIES";

	/** The string constant RC2_ALGORITHM_NAME */
	public static final String RC2_ALGORITHM_NAME = "RC2";

	/** The string constant RC4_ALGORITHM_NAME */
	public static final String RC4_ALGORITHM_NAME = "RC4";

	/** The string constant RC5_ALGORITHM_NAME */
	public static final String RC5_ALGORITHM_NAME = "RC5";

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link CipherAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	CipherAlgorithm(final String algorithm)
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
