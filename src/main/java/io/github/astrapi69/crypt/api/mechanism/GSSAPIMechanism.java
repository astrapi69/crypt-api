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
 * The enum {@link GSSAPIMechanism} can be specified when using GSSAPI. Note that
 * Object Identifiers (OIDs) are specified instead of names to be consistent with the GSSAPI
 * standard. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#gssapi-mechanisms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#gssapi-mechanisms</a>
 */
public enum GSSAPIMechanism
{
	/**
	 * The enum constant KerberosV5 mechanism as defined in
	 * <a href="https://tools.ietf.org/html/rfc4121">RFC 4121</a>
	 */
	KerberosV5("1.2.840.113554.1.2.2"),

	/**
	 * The enum constant SPNEGO mechanism as defined in
	 * <a href="https://tools.ietf.org/html/rfc4178">RFC 4178</a>
	 */
	SPNEGO("1.3.6.1.5.5.2");

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link GSSAPIMechanism} object
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	GSSAPIMechanism(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	/**
	 * Gets the algorithm
	 *
	 * @return the algorithm
	 */
	public String getAlgorithm()
	{
		return this.algorithm;
	}
}
