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
package io.github.astrapi69.crypt.api.algorithm.key;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The unit test class for the enum class {@link KeyGeneratorAlgorithm}
 */
class KeyGeneratorAlgorithmTest
{

	/**
	 * Test method for verify all the algorithms of enum class {@link KeyGeneratorAlgorithm}
	 */
	@Test
	void getAlgorithm()
	{
		assertEquals(KeyGeneratorAlgorithm.AES.getAlgorithm(), "AES");
		assertEquals(KeyGeneratorAlgorithm.ARCFOUR.getAlgorithm(), "ARCFOUR");
		assertEquals(KeyGeneratorAlgorithm.Blowfish.getAlgorithm(), "Blowfish");
		assertEquals(KeyGeneratorAlgorithm.ChaCha20.getAlgorithm(), "ChaCha20");
		assertEquals(KeyGeneratorAlgorithm.DES.getAlgorithm(), "DES");
		assertEquals(KeyGeneratorAlgorithm.DESede.getAlgorithm(), "DESede");
		assertEquals(KeyGeneratorAlgorithm.HmacMD5.getAlgorithm(), "HmacMD5");
		assertEquals(KeyGeneratorAlgorithm.HmacSHA1.getAlgorithm(), "HmacSHA1");
		assertEquals(KeyGeneratorAlgorithm.HmacSHA224.getAlgorithm(), "HmacSHA224");
		assertEquals(KeyGeneratorAlgorithm.HmacSHA256.getAlgorithm(), "HmacSHA256");
		assertEquals(KeyGeneratorAlgorithm.HmacSHA384.getAlgorithm(), "HmacSHA384");
		assertEquals(KeyGeneratorAlgorithm.HmacSHA512.getAlgorithm(), "HmacSHA512");
		assertEquals(KeyGeneratorAlgorithm.RC2.getAlgorithm(), "RC2");
	}
}