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
package io.github.astrapi69.crypto.algorithm;

import java.util.Arrays;

/**
 * The enum {@link KeyPairGeneratorAlgorithm}. For more info see: <a href=
 * "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#KeyPairGenerator">
 * https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#KeyPairGenerator</a>
 *
 * @version 1.0
 */
public enum KeyPairGeneratorAlgorithm implements Algorithm
{
	/** The enum constant for DIFFIE_HELLMAN algorithm. */
	DIFFIE_HELLMAN(KeyPairGeneratorAlgorithm.DIFFIE_HELLMAN_ALGORITHM_NAME),
	/** The shortcut value for the enum constant for DIFFIE_HELLMAN algorithm. */
	DH(KeyPairGeneratorAlgorithm.DH_ALGORITHM_NAME),
	/** The enum constant for DSA algorithm. */
	DSA(KeyPairGeneratorAlgorithm.DSA_ALGORITHM_NAME),
	/** The enum constant for EC algorithm. */
	EC(KeyPairGeneratorAlgorithm.EC_ALGORITHM_NAME),
	/** The enum constant for RSA algorithm. */
	RSA(KeyPairGeneratorAlgorithm.RSA_ALGORITHM_NAME),
	/** The enum constant for RSA algorithm. */
	RSASSA_PSS(KeyPairGeneratorAlgorithm.RSASSA_PSS_ALGORITHM_NAME),
	/** The enum constant if the algorithm type is unknown. */
	UNKNOWN_TYPE(KeyPairGeneratorAlgorithm.UNKNOWN_ALGORITHM_TYPE);

	/** The string constant DIFFIE_HELLMAN_ALGORITHM_NAME for the 'DiffieHellman' algorithm */
	public static final String DIFFIE_HELLMAN_ALGORITHM_NAME = "DiffieHellman";
	/**
	 * The string constant DH_ALGORITHM_NAME for the 'DH' and is a shortcut for 'DiffieHellman'
	 * algorithm
	 */
	public static final String DH_ALGORITHM_NAME = "DH";
	/** The string constant DSA_ALGORITHM_NAME */
	public static final String DSA_ALGORITHM_NAME = "DSA";
	/** The string constant EC_ALGORITHM_NAME */
	public static final String EC_ALGORITHM_NAME = "EC";
	/** The string constant RSA_ALGORITHM_NAME */
	public static final String RSA_ALGORITHM_NAME = "RSA";
	/** The string constant RSAASSA_PSS_ALGORITHM_NAME */
	public static final String RSASSA_PSS_ALGORITHM_NAME = RSA_ALGORITHM_NAME + "SSA-PSS";
	/** The Constant UNKNOWN_ALGORITHM_TYPE is if the algorithm type is unknown. */
	public static final String UNKNOWN_ALGORITHM_TYPE = "UNKNOWN ALGORITHM TYPE";
	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link KeyPairGeneratorAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	KeyPairGeneratorAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	/**
	 * Transforms the given algorithm to the corresponding {@link KeyPairGeneratorAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 * @return the {@link KeyPairGeneratorAlgorithm} object or null if not found
	 */
	public static KeyPairGeneratorAlgorithm toKeyPairGeneratorAlgorithm(final String algorithm)
	{
		return Arrays.stream(KeyPairGeneratorAlgorithm.values())
			.filter(algorithmType -> algorithmType.getAlgorithm().equals(algorithm)).findFirst()
			.orElse(KeyPairGeneratorAlgorithm.UNKNOWN_TYPE);
	}

	@Override
	public String getAlgorithm()
	{
		return algorithm;
	}
}
