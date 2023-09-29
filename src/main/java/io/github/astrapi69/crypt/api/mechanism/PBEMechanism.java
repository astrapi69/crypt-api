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
package io.github.astrapi69.crypt.api.mechanism;

/**
 * The enum {@link PBEMechanism} defines some of the password-based encryption (PBE).
 */
public enum PBEMechanism implements Mechanism
{

	/** The pbe mechanism. */
	PBE(PBEMechanism.PBE_MECHANISM_NAME),
	/** The pkcs mechanism. */
	PKCS(PBEMechanism.PKCS_MECHANISM_NAME),

	/** The enum constant 'UNKNOWN' if the PBE mechanism name is unknown */
	UNKNOWN(Mechanism.UNKNOWN_MECHANISM_NAME);

	public static final String PBE_MECHANISM_NAME = "PBE";
	public static final String PKCS_MECHANISM_NAME = "PKCS";

	/** The mechanism */
	private final String mechanism;

	/**
	 * Instantiates a new {@link GSSAPIMechanism} object
	 *
	 * @param mechanism
	 *            the mechanism
	 */
	PBEMechanism(final String mechanism)
	{
		this.mechanism = mechanism;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getMechanism()
	{
		return this.mechanism;
	}
}
