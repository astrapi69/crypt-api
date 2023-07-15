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
 * The unit test class for the enum class {@link MessageDigestAlgorithm}
 */
class MessageDigestAlgorithmTest
{

	/**
	 * Test method for verify all the algorithms of enum class {@link MessageDigestAlgorithm}
	 */
	@Test
	void getAlgorithm()
	{
		assertEquals(MessageDigestAlgorithm.MD2.getAlgorithm(), "MD2");
		assertEquals(MessageDigestAlgorithm.MD5.getAlgorithm(), "MD5");
		assertEquals(MessageDigestAlgorithm.SHA_1.getAlgorithm(), "SHA-1");
		assertEquals(MessageDigestAlgorithm.SHA_256.getAlgorithm(), "SHA-256");
		assertEquals(MessageDigestAlgorithm.SHA_384.getAlgorithm(), "SHA-384");
		assertEquals(MessageDigestAlgorithm.SHA_512_224.getAlgorithm(), "SHA-512/224");
		assertEquals(MessageDigestAlgorithm.SHA_512_256.getAlgorithm(), "SHA-512/256");
		assertEquals(MessageDigestAlgorithm.SHA3_224.getAlgorithm(), "SHA3-224");
		assertEquals(MessageDigestAlgorithm.SHA3_256.getAlgorithm(), "SHA3-256");
		assertEquals(MessageDigestAlgorithm.SHA3_384.getAlgorithm(), "SHA3-384");
		assertEquals(MessageDigestAlgorithm.SHA3_512.getAlgorithm(), "SHA3-512");
	}
}