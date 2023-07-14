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
package io.github.astrapi69.crypt.api.type;

import java.security.cert.CertificateFactory;

/**
 * The enum {@link CertificateFactoryType} provides all the type names that can be specified when
 * generating an instance of {@link CertificateFactory}. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#certificatefactory-types">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#certificatefactory-types</a>
 */
public enum CertificateFactoryType implements Type
{

	/** The enum constant for X.509 certificate type */
	X_509(CertificateFactoryType.X_509_CERTIFICATE_TYPE_NAME);


	/** The string constant X_509_CERTIFICATE_TYPE_NAME */
	public static final String X_509_CERTIFICATE_TYPE_NAME = "X.509";

	/** The type. */
	private final String type;

	/**
	 * Instantiates a new {@link CertificateFactoryType} object
	 *
	 * @param type
	 *            the type
	 */
	CertificateFactoryType(final String type)
	{
		this.type = type;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getType()
	{
		return type;
	}
}
