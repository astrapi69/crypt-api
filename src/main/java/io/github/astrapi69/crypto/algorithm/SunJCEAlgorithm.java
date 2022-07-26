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

import io.github.astrapi69.crypto.mechanism.PBEMechanism;

/**
 * The enum {@link SunJCEAlgorithm} defines the algorithm specified by the SunJCE security provider.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public enum SunJCEAlgorithm implements Algorithm
{

	/** The Blowfish algorithm. */
	Blowfish(SunJCEAlgorithm.BLOWFISH_ALGORITHM_NAME),

	/** The DES algorithm. */
	DES(SunJCEAlgorithm.DES_ALGORITHM_NAME),

	/** The DESede algorithm. */
	DESede(SunJCEAlgorithm.DES_EDE_ALGORITHM_NAME),

	/** The PBEWithMD5AndDES algorithm. */
	PBEWithMD5AndDES(SunJCEAlgorithm.PBEWithMD5AndDES_ALGORITHM_NAME);

	public static final String BLOWFISH_ALGORITHM_NAME = "Blowfish";
	public static final String DES_ALGORITHM_NAME = "DES";
	public static final String DES_EDE_ALGORITHM_NAME = DES_ALGORITHM_NAME + "ede";
	public static final String PBEWithMD5AndDES_ALGORITHM_NAME = PBEMechanism.PBE_MECHANISM_NAME
		+ UnionWord.WITH_UNION_WORD + MdAlgorithm.MD_5 + UnionWord.AND_UNION_WORD
		+ DES_ALGORITHM_NAME;

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link SunJCEAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	SunJCEAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	@Override
	public String getAlgorithm()
	{
		return this.algorithm;
	}
}
