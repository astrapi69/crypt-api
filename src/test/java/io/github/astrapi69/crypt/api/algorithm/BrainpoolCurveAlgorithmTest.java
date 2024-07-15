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

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link BrainpoolCurveAlgorithm}.
 */
public class BrainpoolCurveAlgorithmTest
{

	/**
	 * Test for concatenated constants.
	 */
	@Test
	public void testGetAlgorithm()
	{
		assertEquals("brainpoolP160r1", BrainpoolCurveAlgorithm.BRAINPOOLP160R1.getAlgorithm());
		assertEquals("brainpoolP192r1", BrainpoolCurveAlgorithm.BRAINPOOLP192R1.getAlgorithm());
		assertEquals("brainpoolP224r1", BrainpoolCurveAlgorithm.BRAINPOOLP224R1.getAlgorithm());
		assertEquals("brainpoolP256r1", BrainpoolCurveAlgorithm.BRAINPOOLP256R1.getAlgorithm());
		assertEquals("brainpoolP320r1", BrainpoolCurveAlgorithm.BRAINPOOLP320R1.getAlgorithm());
		assertEquals("brainpoolP384r1", BrainpoolCurveAlgorithm.BRAINPOOLP384R1.getAlgorithm());
		assertEquals("brainpoolP512r1", BrainpoolCurveAlgorithm.BRAINPOOLP512R1.getAlgorithm());
		assertEquals("brainpoolP160t1", BrainpoolCurveAlgorithm.BRAINPOOLP160T1.getAlgorithm());
		assertEquals("brainpoolP192t1", BrainpoolCurveAlgorithm.BRAINPOOLP192T1.getAlgorithm());
		assertEquals("brainpoolP224t1", BrainpoolCurveAlgorithm.BRAINPOOLP224T1.getAlgorithm());
		assertEquals("brainpoolP256t1", BrainpoolCurveAlgorithm.BRAINPOOLP256T1.getAlgorithm());
		assertEquals("brainpoolP320t1", BrainpoolCurveAlgorithm.BRAINPOOLP320T1.getAlgorithm());
		assertEquals("brainpoolP384t1", BrainpoolCurveAlgorithm.BRAINPOOLP384T1.getAlgorithm());
		assertEquals("brainpoolP512t1", BrainpoolCurveAlgorithm.BRAINPOOLP512T1.getAlgorithm());
	}
}
