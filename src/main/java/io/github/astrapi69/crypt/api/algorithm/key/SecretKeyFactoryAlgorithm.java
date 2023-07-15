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
import io.github.astrapi69.crypt.api.algorithm.SunJCEAlgorithm;

/**
 * The enum {@link SecretKeyFactoryAlgorithm} provides algorithm names that can be specified when
 * requesting an instance of SecretKeyFactory.<br>
 * There are also composed algorithms possible like <br>
 * <br>
 * PBEWith&lt;digest&gt;And&lt;encryption&gt; <br>
 * some examples are: <br>
 * PBEWithMD5AndDES (PKCS #5, PBES1 encryption scheme),<br>
 * PBEWithHmacSHA256AndAES_128 (PKCS #5, PBES2 encryption scheme) <br>
 * <br>
 * or <br>
 * PBEWith&lt;prf&gt;And&lt;encryption&gt; <br>
 * <br>
 * or <br>
 * PBKDF2With&lt;prf&gt; <br>
 * an example is: <br>
 * PBKDF2WithHmacSHA256
 *
 * For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#secretkeyfactory-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#secretkeyfactory-algorithms</a>
 */
public enum SecretKeyFactoryAlgorithm implements Algorithm
{
	/** The enum constant for AES algorithm. */
	AES(AesAlgorithm.AES_ALGORITHM_NAME),

	/** The enum constant for ARCFOUR algorithm. */
	ARCFOUR(SecretKeyFactoryAlgorithm.ARCFOUR_ALGORITHM_NAME),

	/** The DES algorithm. */
	DES(SunJCEAlgorithm.DES_ALGORITHM_NAME),

	/** The DESede algorithm. */
	DESede(SunJCEAlgorithm.DES_EDE_ALGORITHM_NAME);

	/** The string constant ARCFOUR_ALGORITHM_NAME */
	public static final String ARCFOUR_ALGORITHM_NAME = "ARCFOUR";
	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link AesAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	SecretKeyFactoryAlgorithm(final String algorithm)
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
