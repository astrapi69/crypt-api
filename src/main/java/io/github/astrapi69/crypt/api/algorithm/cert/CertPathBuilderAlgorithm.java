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
package io.github.astrapi69.crypt.api.algorithm.cert;

import java.security.cert.CertPathBuilder;

import io.github.astrapi69.crypt.api.algorithm.Algorithm;

/**
 * The enum {@link CertPathBuilderAlgorithm} provides all the algorithm names that can be specified
 * when generating an instance of {@link CertPathBuilder}. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#certpathbuilder-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#certpathbuilder-algorithms</a>
 */
public enum CertPathBuilderAlgorithm implements Algorithm
{

	/** The enum constant for PKIX algorithm */
	PKIX(CertPathBuilderAlgorithm.PKIX_ALGORITHM_NAME),

	/** The enum constant 'UNKNOWN' if the cert path builder algorithm is unknown */
	UNKNOWN(Algorithm.UNKNOWN_ALGORITHM_NAME);

	/** The string constant PKIX_ALGORITHM_NAME */
	public static final String PKIX_ALGORITHM_NAME = "PKIX";

	/** The algorithm */
	private final String algorithm;

	/**
	 * Instantiates a new {@link CertPathBuilderAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 */
	CertPathBuilderAlgorithm(final String algorithm)
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
