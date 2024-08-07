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
 * The enum {@link MdAlgorithm} defines the MessageDigest algorithm.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public enum MdAlgorithm implements Algorithm
{

	/** The enum constant for MD2 algorithm. */
	MD2(MdAlgorithm.MD + 2),

	/** The enum constant for MD4 algorithm. */
	MD4(MdAlgorithm.MD + 4),

	/** The enum constant for MD5 algorithm. */
	MD5(MdAlgorithm.MD_5),

	/** The enum constant 'UNKNOWN' if the MessageDigest algorithm is unknown */
	UNKNOWN(Algorithm.UNKNOWN_ALGORITHM_NAME);

	/** The string constant MD that is use as prefix */
	public static final String MD = "MD";
	/** The string constant MD_5 */
	public static final String MD_5 = MD + 5;
	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link MdAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	MdAlgorithm(final String algorithm)
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
