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

/**
 * The enum {@link KeyPairGeneratorAlgorithm}. For more info see: <a href=
 * "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#KeyPairGenerator">https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#KeyPairGenerator</a>
 *
 * @version 1.0
 */
public enum KeyPairGeneratorAlgorithm implements Algorithm
{
	/** The enum constant for DIFFIE_HELLMAN algorithm. */
	DIFFIE_HELLMAN(KeyPairGeneratorAlgorithm.DIFFIE_HELLMAN_ALGORITHM_NAME),
	/** The enum constant for DSA algorithm. */
	DSA(KeyPairGeneratorAlgorithm.DSA_ALGORITHM_NAME),
	/** The enum constant for EC algorithm. */
	EC(KeyPairGeneratorAlgorithm.EC_ALGORITHM_NAME),
	/** The enum constant for RSA algorithm. */
	RSA(KeyPairGeneratorAlgorithm.RSA_ALGORITHM_NAME),
	/** The enum constant for RSA algorithm. */
	RSAASSA_PSS(KeyPairGeneratorAlgorithm.RSAASSA_PSS_ALGORITHM_NAME);

	/** The algorithm. */
	private final String algorithm;
	/** The string constant DIFFIE_HELLMAN_ALGORITHM_NAME */
	public static final String DIFFIE_HELLMAN_ALGORITHM_NAME = "DiffieHellman";
	/** The string constant DSA_ALGORITHM_NAME */
	public static final String DSA_ALGORITHM_NAME = "DSA";
	/** The string constant EC_ALGORITHM_NAME */
	public static final String EC_ALGORITHM_NAME = "EC";
	/** The string constant RSA_ALGORITHM_NAME */
	public static final String RSA_ALGORITHM_NAME = "RSA";
	/** The string constant RSAASSA_PSS_ALGORITHM_NAME */
	public static final String RSAASSA_PSS_ALGORITHM_NAME = RSA_ALGORITHM_NAME + "ASSA-PSS";

	/**
	 * Instantiates a new {@link KeyPairGeneratorAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	private KeyPairGeneratorAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	@Override
	public String getAlgorithm()
	{
		return algorithm;
	}

}
