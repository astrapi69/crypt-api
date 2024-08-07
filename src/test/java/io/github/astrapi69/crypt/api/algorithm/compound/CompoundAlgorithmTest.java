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
package io.github.astrapi69.crypt.api.algorithm.compound;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The test class {@link CompoundAlgorithmTest} provides unit tests for the
 * {@link CompoundAlgorithm} enum.
 */
public class CompoundAlgorithmTest
{

	/**
	 * Test for concatenated constants.
	 */
	@Test
	public void testGetAlgorithms()
	{
		assertEquals(CompoundAlgorithm.PBE_WITH_MD5_AND_DES.getAlgorithm(), "PBEWithMD5AndDES");

		assertEquals(CompoundAlgorithm.PBE_WITH_MD5_AND_AES.getAlgorithm(), "PBEWithMD5AndAES");

		assertEquals(CompoundAlgorithm.PBE_WITH_SHA1_AND_DES_EDE.getAlgorithm(),
			"PBEWithSHA1AndDESede");

		assertEquals(CompoundAlgorithm.PBKDF2_WITH_HMAC_SHA1.getAlgorithm(), "PBKDF2WithHmacSHA1");

		assertEquals(CompoundAlgorithm.PBE_WITH_SHA1_AND_128BIT_AES_CBC_BC.getAlgorithm(),
			"PBEWITHSHA1AND128BITAES-CBC-BC");

		assertEquals(CompoundAlgorithm.SHA512_WITH_RSA.getAlgorithm(), "SHA512withRSA");

		assertEquals(CompoundAlgorithm.SHA384_WITH_RSA.getAlgorithm(), "SHA384withRSA");

		assertEquals(CompoundAlgorithm.SHA256_WITH_RSA.getAlgorithm(), "SHA256withRSA");

		assertEquals(CompoundAlgorithm.SHA1_WITH_RSA.getAlgorithm(), "SHA1withRSA");
	}

	/**
	 * Test for concatenated constants.
	 */
	@Test
	public void testToString()
	{
		assertEquals(CompoundAlgorithm.PBE_WITH_MD5_AND_DES.toString(), "PBEWithMD5AndDES");

		assertEquals(CompoundAlgorithm.PBE_WITH_MD5_AND_AES.toString(), "PBEWithMD5AndAES");

		assertEquals(CompoundAlgorithm.PBE_WITH_SHA1_AND_DES_EDE.toString(),
			"PBEWithSHA1AndDESede");

		assertEquals(CompoundAlgorithm.PBKDF2_WITH_HMAC_SHA1.toString(), "PBKDF2WithHmacSHA1");

		assertEquals(CompoundAlgorithm.PBE_WITH_SHA1_AND_128BIT_AES_CBC_BC.toString(),
			"PBEWITHSHA1AND128BITAES-CBC-BC");

		assertEquals(CompoundAlgorithm.SHA512_WITH_RSA.toString(), "SHA512withRSA");

		assertEquals(CompoundAlgorithm.SHA384_WITH_RSA.toString(), "SHA384withRSA");

		assertEquals(CompoundAlgorithm.SHA256_WITH_RSA.toString(), "SHA256withRSA");

		assertEquals(CompoundAlgorithm.SHA1_WITH_RSA.toString(), "SHA1withRSA");
	}
}
