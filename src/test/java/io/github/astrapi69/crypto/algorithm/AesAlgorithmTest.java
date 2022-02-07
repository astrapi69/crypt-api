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
package io.github.astrapi69.crypto.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The unit test class for the enum class {@link AesAlgorithm}
 */
public class AesAlgorithmTest
{

	/**
	 * Test for concatenated constants.
	 */
	@Test
	public void testGetAlgorithms()
	{
		assertEquals(AesAlgorithm.AES.getAlgorithm(), "AES");
		assertEquals(AesAlgorithm.AES_KEY_MINIMUM_LENGTH, 128);
		assertEquals(AesAlgorithm.AES_KEY_MEDIUM_LENGTH, 192);
		assertEquals(AesAlgorithm.AES_KEY_MAXIMUM_LENGTH, 256);
		assertEquals(AesAlgorithm.AES_KEY_LENGTH, 256);
	}
}
