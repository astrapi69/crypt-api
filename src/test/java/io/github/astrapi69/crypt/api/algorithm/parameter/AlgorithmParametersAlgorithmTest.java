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
package io.github.astrapi69.crypt.api.algorithm.parameter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The unit test class for the enum class {@link AlgorithmParametersAlgorithm}
 */
class AlgorithmParametersAlgorithmTest
{

	/**
	 * Test method for verify all the algorithms of enum class {@link AlgorithmParametersAlgorithm}
	 */
	@Test
	void getAlgorithm()
	{
		assertEquals(AlgorithmParametersAlgorithm.AES.getAlgorithm(), "AES");
		assertEquals(AlgorithmParametersAlgorithm.Blowfish.getAlgorithm(), "Blowfish");
		assertEquals(AlgorithmParametersAlgorithm.ChaCha20_Poly1305.getAlgorithm(),
			"ChaCha20-Poly1305");
		assertEquals(AlgorithmParametersAlgorithm.DES.getAlgorithm(), "DES");
		assertEquals(AlgorithmParametersAlgorithm.DESede.getAlgorithm(), "DESede");
		assertEquals(AlgorithmParametersAlgorithm.DIFFIE_HELLMAN.getAlgorithm(), "DiffieHellman");
		assertEquals(AlgorithmParametersAlgorithm.DSA.getAlgorithm(), "DSA");
		assertEquals(AlgorithmParametersAlgorithm.EC.getAlgorithm(), "EC");
		assertEquals(AlgorithmParametersAlgorithm.OAEP.getAlgorithm(), "OAEP");
		assertEquals(AlgorithmParametersAlgorithm.PBE.getAlgorithm(), "PBE");
		assertEquals(AlgorithmParametersAlgorithm.RC2.getAlgorithm(), "RC2");
		assertEquals(AlgorithmParametersAlgorithm.RSASSA_PSS.getAlgorithm(), "RSASSA-PSS");
		assertEquals(AlgorithmParametersAlgorithm.XDH.getAlgorithm(), "XDH");
		assertEquals(AlgorithmParametersAlgorithm.X25519.getAlgorithm(), "X25519");
		assertEquals(AlgorithmParametersAlgorithm.X448.getAlgorithm(), "X448");
	}
}