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
 * The enum {@link HashAlgorithm} represents the one-way conversion hash algorithms
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public enum HashAlgorithm implements Algorithm
{

	/** The enum constant for SHA-1 algorithm. */
	SHA_1(HashAlgorithm.SHA + "-" + 1),

	/** The enum constant for SHA-224 algorithm. */
	SHA_224(HashAlgorithm.SHA + "-" + 224),

	/** The enum constant for SHA-256 algorithm. */
	SHA_256(HashAlgorithm.SHA + "-" + 256),

	/** The enum constant for SHA-384 algorithm. */
	SHA_384(HashAlgorithm.SHA + "-" + 384),

	/** The enum constant for SHA-512 algorithm. */
	SHA_512(HashAlgorithm.SHA + "-" + 512),

	/** The enum constant for SHA1 algorithm. */
	SHA1(HashAlgorithm.SHA + 1),

	/** The enum constant for SHA224 algorithm. */
	SHA224(HashAlgorithm.SHA + 224),

	/** The enum constant for SHA256 algorithm. */
	SHA256(HashAlgorithm.SHA + 256),

	/** The enum constant for SHA384 algorithm. */
	SHA384(HashAlgorithm.SHA + 384),

	/** The enum constant for SHA512 algorithm. */
	SHA512(HashAlgorithm.SHA + 512);

	/** The string constant SHA that is use as prefix */
	public static final String SHA = "SHA";
	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link HashAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	HashAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	public String getAlgorithm()
	{
		return algorithm;
	}

}
