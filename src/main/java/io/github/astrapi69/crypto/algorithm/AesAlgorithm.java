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
 * The enum {@link AesAlgorithm} for the Advanced Encryption Standard (AES), also known as Rijndael.
 */
public enum AesAlgorithm implements Algorithm
{

	/** The enum constant for AES algorithm. */
	AES(AesAlgorithm.AES_ALGORITHM_NAME);

	/** The constant AES_KEY_LENGTH */
	public static final int AES_KEY_LENGTH = 256;
	/** The string constant AES_ALGORITHM_NAME */
	public static final String AES_ALGORITHM_NAME = "AES";

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link AesAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	AesAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	@Override
	public String getAlgorithm()
	{
		return algorithm;
	}
}
