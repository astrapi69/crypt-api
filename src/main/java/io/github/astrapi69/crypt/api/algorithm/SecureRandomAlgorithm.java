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


import java.security.SecureRandom;

/**
 * The enum {@link SecureRandomAlgorithm} provides algorithms for generation of random number
 * generator (RNG) that are used with the {@link SecureRandom} object. <br>
 * <br>
 * Note: See what algorithm can be used with your operating system. <br>
 * For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#securerandom-number-generation-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#securerandom-number-generation-algorithms</a>
 */
public enum SecureRandomAlgorithm implements Algorithm
{

	/** The enum constant for NativePRNG algorithm. */
	NativePRNG("NativePRNG"),

	/** The enum constant for NativePRNGBlocking algorithm. */
	NativePRNGBlocking("NativePRNGBlocking"),

	/** The enum constant for NativePRNGNonBlocking algorithm. */
	NativePRNGNonBlocking("NativePRNGNonBlocking"),

	/** The enum constant for PKCS11 algorithm. */
	PKCS11("PKCS11"),

	/** The enum constant for SHA1PRNG algorithm. */
	SHA1PRNG("SHA1PRNG"),

	/** The enum constant for Windows-PRNG algorithm. */
	Windows_PRNG("Windows-PRNG"),

	/** The enum constant 'UNKNOWN' if the MessageDigest algorithm is unknown */
	UNKNOWN(Algorithm.UNKNOWN_ALGORITHM_NAME);
	;

	/** The algorithm */
	private final String algorithm;

	/**
	 * Instantiates a new {@link SecureRandomAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	SecureRandomAlgorithm(final String algorithm)
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
