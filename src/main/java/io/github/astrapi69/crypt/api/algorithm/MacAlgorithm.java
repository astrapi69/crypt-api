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
 * The enum {@link MacAlgorithm} contains the algorithm names that can be specified when requesting
 * an instance of Mac. For more info see: <a href=
 * "https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Mac">https://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#Mac</a>
 *
 * @version 1.0
 */
public enum MacAlgorithm implements Algorithm
{

	/** The enum constant for HmacMD5 algorithm. */
	HmacMD5(MacAlgorithm.H_MAC_MD5_ALGORITHM_NAME),

	/** The enum constant for HmacSHA1 algorithm. */
	HmacSHA1(MacAlgorithm.H_MAC_SHA1_ALGORITHM_NAME),

	/** The enum constant for HmacSHA224 algorithm. */
	HmacSHA224(MacAlgorithm.H_MAC_SHA224_ALGORITHM_NAME),

	/** The enum constant for HmacSHA256 algorithm. */
	HmacSHA256(MacAlgorithm.H_MAC_SHA256_ALGORITHM_NAME),

	/** The enum constant for HmacSHA384 algorithm. */
	HmacSHA384(MacAlgorithm.H_MAC_SHA384_ALGORITHM_NAME),

	/** The enum constant for HmacSHA512 algorithm. */
	HmacSHA512(MacAlgorithm.H_MAC_SHA512_ALGORITHM_NAME),

	/** The enum constant for HmacSHA512 algorithm. */
	H_MAC_SHA512_224(MacAlgorithm.H_MAC_SHA512_224_ALGORITHM_NAME),

	/** The enum constant for HmacSHA512 algorithm. */
	H_MAC_SHA512_256(MacAlgorithm.H_MAC_SHA512_256_ALGORITHM_NAME),

	/** The enum constant for HmacSHA224 algorithm. */
	H_MAC_SHA3_224(MacAlgorithm.H_MAC_SHA3_224_ALGORITHM_NAME),

	/** The enum constant for HmacSHA256 algorithm. */
	H_MAC_SHA3_256(MacAlgorithm.H_MAC_SHA3_256_ALGORITHM_NAME),

	/** The enum constant for HmacSHA384 algorithm. */
	H_MAC_SHA3_384(MacAlgorithm.H_MAC_SHA3_384_ALGORITHM_NAME),

	/** The enum constant for HmacSHA512 algorithm. */
	H_MAC_SHA3_512(MacAlgorithm.H_MAC_SHA3_512_ALGORITHM_NAME),

	/** The enum constant for PBEWithHmacMD5 algorithm. */
	PBEWithHmacMD5(MacAlgorithm.PBE_WITH_HMAC_MD5_ALGORITHM_NAME),

	/** The enum constant for PBEWithHmacSHA1 algorithm. */
	PBEWithHmacSHA1(MacAlgorithm.PBE_WITH_HMAC_SHA1_ALGORITHM_NAME),

	/** The enum constant for PBEWithHmacSHA224 algorithm. */
	PBEWithHmacSHA224(MacAlgorithm.PBE_WITH_HMAC_SHA224_ALGORITHM_NAME),

	/** The enum constant for PBEWithHmacSHA256 algorithm. */
	PBEWithHmacSHA256(MacAlgorithm.PBE_WITH_HMAC_SHA256_ALGORITHM_NAME),

	/** The enum constant for PBEWithHmacSHA384 algorithm. */
	PBEWithHmacSHA384(MacAlgorithm.PBE_WITH_HMAC_SHA384_ALGORITHM_NAME),

	/** The enum constant for PBEWithHmacSHA512 algorithm. */
	PBEWithHmacSHA512(MacAlgorithm.PBE_WITH_HMAC_SHA512_ALGORITHM_NAME),

	/** The enum constant 'UNKNOWN' if the mac algorithm is unknown */
	UNKNOWN(Algorithm.UNKNOWN_ALGORITHM_NAME);

	/** The Constant HMAC. */
	public static final String HMAC = "Hmac";

	/**
	 * The string constant PBE_WITH_HMAC_MD5_ALGORITHM_NAME
	 */
	public static final String PBE_WITH_HMAC_MD5_ALGORITHM_NAME = "PBEWithHmacMD5";

	/**
	 * The string constant PBE_WITH_HMAC_SHA1_ALGORITHM_NAME
	 */
	public static final String PBE_WITH_HMAC_SHA1_ALGORITHM_NAME = "PBEWithHmacSHA1";

	/**
	 * The string constant PBE_WITH_HMAC_SHA224_ALGORITHM_NAME
	 */
	public static final String PBE_WITH_HMAC_SHA224_ALGORITHM_NAME = "PBEWithHmacSHA224";

	/**
	 * The string constant PBE_WITH_HMAC_SHA256_ALGORITHM_NAME
	 */
	public static final String PBE_WITH_HMAC_SHA256_ALGORITHM_NAME = "PBEWithHmacSHA256";

	/**
	 * The string constant PBE_WITH_HMAC_SHA384_ALGORITHM_NAME
	 */
	public static final String PBE_WITH_HMAC_SHA384_ALGORITHM_NAME = "PBEWithHmacSHA384";

	/**
	 * The string constant PBE_WITH_HMAC_SHA512_ALGORITHM_NAME
	 */
	public static final String PBE_WITH_HMAC_SHA512_ALGORITHM_NAME = "PBEWithHmacSHA512";

	/**
	 * The string constant H_MAC_MD5_ALGORITHM_NAME
	 */
	public static final String H_MAC_MD5_ALGORITHM_NAME = "HmacMD5";

	/**
	 * The string constant H_MAC_SHA1_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA1_ALGORITHM_NAME = "HmacSHA1";

	/**
	 * The string constant H_MAC_SHA224_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA224_ALGORITHM_NAME = "HmacSHA224";

	/**
	 * The string constant H_MAC_SHA256_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA256_ALGORITHM_NAME = "HmacSHA256";

	/**
	 * The string constant H_MAC_SHA384_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA384_ALGORITHM_NAME = "HmacSHA384";

	/**
	 * The string constant H_MAC_SHA512_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA512_ALGORITHM_NAME = "HmacSHA512";

	/**
	 * The string constant H_MAC_SHA512_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA512_224_ALGORITHM_NAME = "HmacSHA512/224";

	/**
	 * The string constant H_MAC_SHA512_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA512_256_ALGORITHM_NAME = "HmacSHA512/256";

	/**
	 * The string constant H_MAC_SHA3_224_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA3_224_ALGORITHM_NAME = "HmacSHA3-224";

	/**
	 * The string constant H_MAC_SHA3_256_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA3_256_ALGORITHM_NAME = "HmacSHA3-256";

	/**
	 * The string constant H_MAC_SHA3_384_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA3_384_ALGORITHM_NAME = "HmacSHA3-384";

	/**
	 * The string constant H_MAC_SHA3_512_ALGORITHM_NAME
	 */
	public static final String H_MAC_SHA3_512_ALGORITHM_NAME = "HmacSHA3-512";

	/** The algorithm */
	private final String algorithm;

	/**
	 * Instantiates a new {@link MacAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	MacAlgorithm(final String algorithm)
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
