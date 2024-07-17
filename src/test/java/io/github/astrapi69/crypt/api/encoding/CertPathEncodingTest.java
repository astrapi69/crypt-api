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
package io.github.astrapi69.crypt.api.encoding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link CertPathEncoding}.
 */
public class CertPathEncodingTest
{

	/**
	 * Test method for {@link CertPathEncoding#getEncoding()}.
	 */
	@Test
	public void testGetEncoding()
	{
		assertEquals(CertPathEncoding.PKCS7_ENCODING_NAME, CertPathEncoding.PKCS7.getEncoding());
		assertEquals(CertPathEncoding.PKI_PATH_ENCODING_NAME,
			CertPathEncoding.PKI_PATH.getEncoding());
		assertEquals(Encoding.UNKNOWN_ENCODING_NAME, CertPathEncoding.UNKNOWN.getEncoding());
	}

	/**
	 * Test method for enum constants of {@link CertPathEncoding}.
	 */
	@Test
	public void testEnumConstants()
	{
		assertNotNull(CertPathEncoding.valueOf("PKCS7"));
		assertNotNull(CertPathEncoding.valueOf("PKI_PATH"));
		assertNotNull(CertPathEncoding.valueOf("UNKNOWN"));
	}

	/**
	 * Test method for {@link Enum#toString()}.
	 */
	@Test
	public void testToString()
	{
		assertEquals(CertPathEncoding.PKCS7.name(), "PKCS7");
		assertEquals(CertPathEncoding.PKI_PATH.name(), "PKI_PATH");
		assertEquals(CertPathEncoding.UNKNOWN.name(), "UNKNOWN");
	}
}
