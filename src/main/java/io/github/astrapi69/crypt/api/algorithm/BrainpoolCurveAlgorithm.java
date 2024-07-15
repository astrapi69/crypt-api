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
 * The enum {@link BrainpoolCurveAlgorithm} represents the Brainpool elliptic curve algorithms. It
 * is part of the Brainpool family of curves which were defined by the Brainpool working group (ECC
 * Brainpool). These curves are designed for use in public key cryptography.<br>
 */
public enum BrainpoolCurveAlgorithm implements Algorithm
{
	/** The Brainpool P-160 R1 algorithm. */
	BRAINPOOLP160R1(BrainpoolCurveAlgorithm.BRAINPOOLP160R1_VALUE),

	/** The Brainpool P-192 R1 algorithm. */
	BRAINPOOLP192R1(BrainpoolCurveAlgorithm.BRAINPOOLP192R1_VALUE),

	/** The Brainpool P-224 R1 algorithm. */
	BRAINPOOLP224R1(BrainpoolCurveAlgorithm.BRAINPOOLP224R1_VALUE),

	/** The Brainpool P-256 R1 algorithm. */
	BRAINPOOLP256R1(BrainpoolCurveAlgorithm.BRAINPOOLP256R1_VALUE),

	/** The Brainpool P-320 R1 algorithm. */
	BRAINPOOLP320R1(BrainpoolCurveAlgorithm.BRAINPOOLP320R1_VALUE),

	/** The Brainpool P-384 R1 algorithm. */
	BRAINPOOLP384R1(BrainpoolCurveAlgorithm.BRAINPOOLP384R1_VALUE),

	/** The Brainpool P-512 R1 algorithm. */
	BRAINPOOLP512R1(BrainpoolCurveAlgorithm.BRAINPOOLP512R1_VALUE),

	/** The Brainpool P-160 T1 algorithm. */
	BRAINPOOLP160T1(BrainpoolCurveAlgorithm.BRAINPOOLP160T1_VALUE),

	/** The Brainpool P-192 T1 algorithm. */
	BRAINPOOLP192T1(BrainpoolCurveAlgorithm.BRAINPOOLP192T1_VALUE),

	/** The Brainpool P-224 T1 algorithm. */
	BRAINPOOLP224T1(BrainpoolCurveAlgorithm.BRAINPOOLP224T1_VALUE),

	/** The Brainpool P-256 T1 algorithm. */
	BRAINPOOLP256T1(BrainpoolCurveAlgorithm.BRAINPOOLP256T1_VALUE),

	/** The Brainpool P-320 T1 algorithm. */
	BRAINPOOLP320T1(BrainpoolCurveAlgorithm.BRAINPOOLP320T1_VALUE),

	/** The Brainpool P-384 T1 algorithm. */
	BRAINPOOLP384T1(BrainpoolCurveAlgorithm.BRAINPOOLP384T1_VALUE),

	/** The Brainpool P-512 T1 algorithm. */
	BRAINPOOLP512T1(BrainpoolCurveAlgorithm.BRAINPOOLP512T1_VALUE);

	/** The string constant brainpoolP160r1_VALUE. */
	public static final String BRAINPOOLP160R1_VALUE = "brainpoolP160r1";

	/** The string constant brainpoolP192r1_VALUE. */
	public static final String BRAINPOOLP192R1_VALUE = "brainpoolP192r1";

	/** The string constant brainpoolP224r1_VALUE. */
	public static final String BRAINPOOLP224R1_VALUE = "brainpoolP224r1";

	/** The string constant brainpoolP256r1_VALUE. */
	public static final String BRAINPOOLP256R1_VALUE = "brainpoolP256r1";

	/** The string constant brainpoolP320r1_VALUE. */
	public static final String BRAINPOOLP320R1_VALUE = "brainpoolP320r1";

	/** The string constant brainpoolP384r1_VALUE. */
	public static final String BRAINPOOLP384R1_VALUE = "brainpoolP384r1";

	/** The string constant brainpoolP512r1_VALUE. */
	public static final String BRAINPOOLP512R1_VALUE = "brainpoolP512r1";

	/** The string constant brainpoolP160t1_VALUE. */
	public static final String BRAINPOOLP160T1_VALUE = "brainpoolP160t1";

	/** The string constant brainpoolP192t1_VALUE. */
	public static final String BRAINPOOLP192T1_VALUE = "brainpoolP192t1";

	/** The string constant brainpoolP224t1_VALUE. */
	public static final String BRAINPOOLP224T1_VALUE = "brainpoolP224t1";

	/** The string constant brainpoolP256t1_VALUE. */
	public static final String BRAINPOOLP256T1_VALUE = "brainpoolP256t1";

	/** The string constant brainpoolP320t1_VALUE. */
	public static final String BRAINPOOLP320T1_VALUE = "brainpoolP320t1";

	/** The string constant brainpoolP384t1_VALUE. */
	public static final String BRAINPOOLP384T1_VALUE = "brainpoolP384t1";

	/** The string constant brainpoolP512t1_VALUE. */
	public static final String BRAINPOOLP512T1_VALUE = "brainpoolP512t1";

	private final String algorithm;

	/**
	 * Instantiates a new {@link BrainpoolCurveAlgorithm} with the given algorithm name
	 *
	 * @param algorithm
	 *            the name of the algorithm name
	 */
	BrainpoolCurveAlgorithm(String algorithm)
	{
		this.algorithm = algorithm;
	}

	/**
	 * Gets the algorithm name.
	 *
	 * @return the algorithm name.
	 */
	@Override
	public String getAlgorithm()
	{
		return algorithm;
	}
}
