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
package io.github.astrapi69.crypt.api.padding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * The test class {@link PaddingSchemeTest} provides unit tests for the {@link PaddingScheme} enum.
 */
public class PaddingSchemeTest
{

	/**
	 * Test method for the values() method of the {@link PaddingScheme} enum.
	 */
	@Test
	public void testValues()
	{
		PaddingScheme[] schemes = PaddingScheme.values();
		assertNotNull(schemes);
		assertEquals(10, schemes.length); // Ensure there are 10 enum constants
	}

	/**
	 * Test method for the valueOf() method of the {@link PaddingScheme} enum.
	 */
	@Test
	public void testValueOf()
	{
		PaddingScheme scheme = PaddingScheme.valueOf("OAEPPadding");
		assertNotNull(scheme);
		assertEquals(PaddingScheme.OAEPPadding, scheme);
	}

	/**
	 * Test method to check if all enum constants are correctly defined.
	 */
	@Test
	public void testEnumConstants()
	{
		assertEquals("NoPadding", PaddingScheme.NoPadding.getScheme());
		assertEquals("OAEPPadding", PaddingScheme.OAEPPadding.getScheme());
		assertEquals("OAEPWithSHA-1AndMGF1Padding",
			PaddingScheme.OAEPWithSHA_1AndMGF1Padding.getScheme());
		assertEquals("OAEPWithSHA-256AndMGF1Padding",
			PaddingScheme.OAEPWithSHA_256AndMGF1Padding.getScheme());
		assertEquals("OAEPWithSHA1AndMGF1Padding",
			PaddingScheme.OAEPWithSHA1AndMGF1Padding.getScheme());
		assertEquals("OAEPWithSHA256AndMGF1Padding",
			PaddingScheme.OAEPWithSHA256AndMGF1Padding.getScheme());
		assertEquals("PKCS1Padding", PaddingScheme.PKCS1Padding.getScheme());
		assertEquals("PKCS5Padding", PaddingScheme.PKCS5Padding.getScheme());
		assertEquals("SSL3Padding", PaddingScheme.SSL3Padding.getScheme());
		assertEquals("UNKNOWN", PaddingScheme.UNKNOWN.getScheme());
	}
}
