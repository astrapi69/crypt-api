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
 * The unit test class for the enum class {@link HashAlgorithm}
 */
public class HashAlgorithmTest
{

	/**
	 * Test for concatenated constants.
	 */
	@Test
	public void testGetAlgorithms()
	{
		assertEquals(HashAlgorithm.SHA_1.getAlgorithm(), "SHA-1");
		assertEquals(HashAlgorithm.SHA_224.getAlgorithm(), "SHA-224");
		assertEquals(HashAlgorithm.SHA_256.getAlgorithm(), "SHA-256");
		assertEquals(HashAlgorithm.SHA_384.getAlgorithm(), "SHA-384");
		assertEquals(HashAlgorithm.SHA_512.getAlgorithm(), "SHA-512");
		assertEquals(HashAlgorithm.SHA1.getAlgorithm(), "SHA1");
		assertEquals(HashAlgorithm.SHA224.getAlgorithm(), "SHA224");
		assertEquals(HashAlgorithm.SHA256.getAlgorithm(), "SHA256");
		assertEquals(HashAlgorithm.SHA384.getAlgorithm(), "SHA384");
		assertEquals(HashAlgorithm.SHA512.getAlgorithm(), "SHA512");
	}
}
