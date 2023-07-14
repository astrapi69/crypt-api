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

import io.github.astrapi69.crypt.api.algorithm.Algorithm;

/**
 * The enum {@link KeyFactoryAlgorithm}. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#keyfactory-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#keyfactory-algorithms</a>
 */
public enum KeyFactoryAlgorithm implements Algorithm
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
	RSASSA_PSS(KeyPairGeneratorAlgorithm.RSASSA_PSS_ALGORITHM_NAME),

	/**
	 * The enum constant for XDH algorithm. The Diffie-Hellman key agreement with elliptic curves as
	 * defined in <a href="https://tools.ietf.org/html/rfc7748">RFC 7748</a>
	 */
	XDH(KeyPairGeneratorAlgorithm.XDH_ALGORITHM_NAME),

	/**
	 * The enum constant for X25519 algorithm. The Diffie-Hellman key agreement with Curve25519 as
	 * defined in <a href="https://tools.ietf.org/html/rfc7748">RFC 7748</a>
	 */
	X25519(KeyPairGeneratorAlgorithm.X25519_ALGORITHM_NAME),

	/**
	 * The enum constant for X448 algorithm. The Diffie-Hellman key agreement with Curve448 as
	 * defined in <a href="https://tools.ietf.org/html/rfc7748">RFC 7748</a>
	 */
	X448(KeyPairGeneratorAlgorithm.X448_ALGORITHM_NAME);

	/** The algorithm */
	private final String algorithm;

	/**
	 * Instantiates a new {@link KeyFactoryAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	KeyFactoryAlgorithm(final String algorithm)
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
