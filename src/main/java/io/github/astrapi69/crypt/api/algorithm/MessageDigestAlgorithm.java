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

import java.security.MessageDigest;

/**
 * The enum {@link MessageDigestAlgorithm} provides all the algorithm names that can be specified
 * when generating an instance of {@link MessageDigest}. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#messagedigest-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#messagedigest-algorithms</a>
 */
public enum MessageDigestAlgorithm implements Algorithm
{

	/**
	 * The enum constant for MD2 algorithm
	 */
	MD2(MdAlgorithm.MD2.getAlgorithm()),

	/**
	 * The enum constant for MD5 algorithm
	 */
	MD5(MdAlgorithm.MD5.getAlgorithm()),

	/**
	 * The enum constant for SHA-1 algorithm
	 */
	SHA_1(HashAlgorithm.SHA_1.getAlgorithm()),

	/**
	 * The enum constant for SHA-256 algorithm
	 */
	SHA_256(HashAlgorithm.SHA_256.getAlgorithm()),

	/**
	 * The enum constant for SHA-384 algorithm
	 */
	SHA_384(HashAlgorithm.SHA_384.getAlgorithm()),

	/**
	 * The enum constant for SHA-512/224 algorithm
	 */
	SHA_512_224(HashAlgorithm.SHA_512.getAlgorithm() + "/" + 224),

	/**
	 * The enum constant for SHA-512/256 algorithm
	 */
	SHA_512_256(HashAlgorithm.SHA_512.getAlgorithm() + "/" + 256),

	/**
	 * The enum constant for SHA3-224 algorithm
	 */
	SHA3_224(MessageDigestAlgorithm.SHA3_224_ALGORITHM_NAME),

	/**
	 * The enum constant for SHA3-256 algorithm
	 */
	SHA3_256(MessageDigestAlgorithm.SHA3_256_ALGORITHM_NAME),

	/**
	 * The enum constant for SHA3-384 algorithm
	 */
	SHA3_384(MessageDigestAlgorithm.SHA3_384_ALGORITHM_NAME),

	/**
	 * The enum constant for SHA3-512 algorithm
	 */
	SHA3_512(MessageDigestAlgorithm.SHA3_512_ALGORITHM_NAME),

	/** The enum constant 'UNKNOWN' if the MessageDigest algorithm is unknown */
	UNKNOWN(Algorithm.UNKNOWN_ALGORITHM_NAME);

	/**
	 * The string constant SHA3_224_ALGORITHM_NAME
	 */
	public static final String SHA3_224_ALGORITHM_NAME = HashAlgorithm.SHA3 + "-224";

	/**
	 * The string constant SHA3_256_ALGORITHM_NAME
	 */
	public static final String SHA3_256_ALGORITHM_NAME = HashAlgorithm.SHA3 + "-256";

	/**
	 * The string constant SHA3_384_ALGORITHM_NAME
	 */
	public static final String SHA3_384_ALGORITHM_NAME = HashAlgorithm.SHA3 + "-384";

	/**
	 * The string constant SHA3_512_ALGORITHM_NAME
	 */
	public static final String SHA3_512_ALGORITHM_NAME = HashAlgorithm.SHA3 + "-512";

	/** The algorithm */
	private final String algorithm;

	/**
	 * Instantiates a new {@link MessageDigestAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	MessageDigestAlgorithm(final String algorithm)
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
