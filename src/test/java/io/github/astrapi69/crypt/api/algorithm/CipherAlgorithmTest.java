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
 * The unit test class for the enum class {@link CipherAlgorithm}
 */
class CipherAlgorithmTest
{

	/**
	 * Test method for verify all the algorithms of enum class {@link CipherAlgorithm}
	 */
	@Test
	void getAlgorithm()
	{
		assertEquals(CipherAlgorithm.AES.getAlgorithm(), "AES");
		assertEquals(CipherAlgorithm.AESWrap.getAlgorithm(), "AESWrap");
		assertEquals(CipherAlgorithm.ARCFOUR.getAlgorithm(), "ARCFOUR");
		assertEquals(CipherAlgorithm.Blowfish.getAlgorithm(), "Blowfish");
		assertEquals(CipherAlgorithm.ChaCha20.getAlgorithm(), "ChaCha20");
		assertEquals(CipherAlgorithm.ChaCha20_Poly1305.getAlgorithm(), "ChaCha20-Poly1305");
		assertEquals(CipherAlgorithm.DES.getAlgorithm(), "DES");
		assertEquals(CipherAlgorithm.DESede.getAlgorithm(), "DESede");
		assertEquals(CipherAlgorithm.DESedeWrap.getAlgorithm(), "DESedeWrap");
		assertEquals(CipherAlgorithm.ECIES.getAlgorithm(), "ECIES");
		assertEquals(CipherAlgorithm.RC2.getAlgorithm(), "RC2");
		assertEquals(CipherAlgorithm.RC4.getAlgorithm(), "RC4");
		assertEquals(CipherAlgorithm.RC5.getAlgorithm(), "RC5");
		assertEquals(CipherAlgorithm.RSA.getAlgorithm(), "RSA");
	}
}