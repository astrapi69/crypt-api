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
package io.github.astrapi69.crypto.padding;

import io.github.astrapi69.crypto.mechanisms.PBEMechanism;

/**
 * The enum {@link PaddingScheme}.
 */
public enum PaddingScheme
{

	/** The No padding. */
	NoPadding("NoPadding"),

	/** The OAEP padding. */
	OAEPPadding("OAEPPadding"),

	/** The OAEP with SHA 1 and MGF 1 padding. */
	OAEPWithSHA_1AndMGF1Padding("OAEPWithSHA-1AndMGF1Padding"),

	/** The OAEP with SHA 256 and MGF 1 padding. */
	OAEPWithSHA_256AndMGF1Padding("OAEPWithSHA-256AndMGF1Padding"),

	/** The OAEP with SHA 1 and MGF 1 padding. */
	OAEPWithSHA1AndMGF1Padding("OAEPWithSHA1AndMGF1Padding"),

	/** The OAEP with SHA 256 and MGF 1 padding. */
	OAEPWithSHA256AndMGF1Padding("OAEPWithSHA256AndMGF1Padding"),

	/**
	 * The enum constant for the 'PKCS1Padding' algorithm
	 **/
	PKCS1Padding(PBEMechanism.PKCS.name() + "1Padding"),

	/**
	 * The enum constant for the 'PKCS5Padding' algorithm
	 **/
	PKCS5Padding(PBEMechanism.PKCS.name() + "5Padding");

	/** The padding scheme. */
	private final String scheme;

	/**
	 * Instantiates a new {@link PaddingScheme}.
	 *
	 * @param scheme
	 *            the padding scheme
	 */
	private PaddingScheme(final String scheme)
	{
		this.scheme = scheme;
	}

	public String getScheme()
	{
		return this.scheme;
	}
}
