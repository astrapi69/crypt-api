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
package io.github.astrapi69.crypt.api.encoding;

import java.io.InputStream;
import java.security.cert.CertPath;
import java.security.cert.CertificateFactory;

/**
 * The enum {@link CertPathEncoding} provides all the encodings names that may be passed to the
 * {@link CertPath#getEncoded(String)} method or the
 * {@link CertificateFactory#generateCertPath(InputStream, String)} method. For more info see:
 * <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#certpath-encodings">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#certpath-encodings</a>
 */
public enum CertPathEncoding implements Encoding
{
	/** The enum constant for PKCS7 encoding */
	PKCS7(CertPathEncoding.PKCS7_ENCODING_NAME),

	/** The enum constant for 'PkiPath' encoding */
	PKI_PATH(CertPathEncoding.PKI_PATH_ENCODING_NAME),

	/** The enum constant 'UNKNOWN' if the cert path encoding name is unknown */
	UNKNOWN(Encoding.UNKNOWN_ENCODING_NAME);

	/** The Constant PKCS7_ENCODING_NAME */
	public static final String PKCS7_ENCODING_NAME = "PKCS7";

	/** The Constant PKI_PATH_ENCODING_NAME */
	public static final String PKI_PATH_ENCODING_NAME = "PkiPath";

	/** The encoding */
	private final String encoding;

	/**
	 * Instantiates a new {@link CertPathEncoding} object
	 *
	 * @param encoding
	 *            the encoding
	 */
	CertPathEncoding(String encoding)
	{
		this.encoding = encoding;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getEncoding()
	{
		return this.encoding;
	}
}
