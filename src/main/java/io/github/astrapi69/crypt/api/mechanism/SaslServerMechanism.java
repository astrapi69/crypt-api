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
 * The enum {@link SaslServerMechanism} provides all the algorithm names that can be specified *
 * when generating an instance of <code>javax.security.sasl.SaslServer</code>. For more info see:
 * <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#exemption-mechanisms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#exemption-mechanisms</a>
 */
public enum SaslServerMechanism implements Mechanism
{

	/**
	 * The enum constant CRAM_MD5
	 */
	CRAM_MD5(SaslClientMechanism.CRAM_MD5_MECHANISM_NAME),

	/**
	 * The enum constant DIGEST_MD5
	 */
	DIGEST_MD5(SaslClientMechanism.DIGEST_MD5_MECHANISM_NAME),

	/**
	 * The enum constant GSSAPI
	 */
	GSSAPI(SaslClientMechanism.GSSAPI_MECHANISM_NAME),

	/**
	 * The enum constant NTLM
	 */
	NTLM(SaslClientMechanism.NTLM_MECHANISM_NAME);

	/** The mechanism */
	private final String mechanism;

	/**
	 * Instantiates a new {@link SaslServerMechanism} object
	 *
	 * @param mechanism
	 *            the mechanism
	 */
	SaslServerMechanism(final String mechanism)
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
