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
package io.github.astrapi69.crypt.api.algorithm.ssl;

import io.github.astrapi69.crypt.api.algorithm.Algorithm;

/**
 * Enum representing the different SSL/TLS algorithms that can be used with {@code SSLContext}. For
 * more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#sslcontext-algorithms">https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#sslcontext-algorithms</a>
 */
public enum SSLContextAlgorithm implements Algorithm
{

	/**
	 * Supports some version of SSL; may support other SSL/TLS versions.
	 */
	SSL("SSL"),

	/**
	 * Supports SSL version 2 or later; may support other SSL/TLS versions.
	 */
	SSLV2("SSLv2"),

	/**
	 * Supports SSL version 3; may support other SSL/TLS versions.
	 */
	SSLV3("SSLv3"),

	/**
	 * Supports some version of TLS; may support other SSL/TLS versions.
	 */
	TLS("TLS"),

	/**
	 * Supports RFC 2246: TLS version 1.0; may support other SSL/TLS versions.
	 */
	TLSV1("TLSv1"),

	/**
	 * Supports RFC 4346: TLS version 1.1; may support other SSL/TLS versions.
	 */
	TLSV1_1("TLSv1.1"),

	/**
	 * Supports RFC 5246: TLS version 1.2; may support other SSL/TLS versions.
	 */
	TLSV1_2("TLSv1.2"),

	/**
	 * Supports RFC 8446: TLS version 1.3; may support other SSL/TLS versions.
	 */
	TLSV1_3("TLSv1.3"),

	/**
	 * Supports the default provider-dependent versions of DTLS.
	 */
	DTLS("DTLS"),

	/**
	 * Supports RFC 4347: DTLS version 1.0; may support other DTLS versions.
	 */
	DTLSV1_0("DTLSv1.0"),

	/**
	 * Supports RFC 6347: DTLS version 1.2; may support other DTLS versions.
	 */
	DTLSV1_2("DTLSv1.2");

	/** The algorithm */
	private final String algorithm;

	/**
	 * Instantiates a new {@link SSLContextAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	SSLContextAlgorithm(String algorithm)
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