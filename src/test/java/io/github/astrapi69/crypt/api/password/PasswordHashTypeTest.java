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
package io.github.astrapi69.crypt.api.password;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * The test class {@link PasswordHashTypeTest} provides unit tests for the {@link PasswordHashType}
 * enum class
 */
public class PasswordHashTypeTest
{

	/**
	 * Test to ensure that the PBKDF2 constant in {@link PasswordHashType} is correctly defined.
	 */
	@Test
	public void testPBKDF2()
	{
		PasswordHashType hashType = PasswordHashType.PBKDF2;
		assertNotNull(hashType, "PBKDF2 should not be null");
		assertEquals("PBKDF2", hashType.name(), "PBKDF2 name should be 'PBKDF2'");
	}

	/**
	 * Test to ensure that the UNKNOWN constant in {@link PasswordHashType} is correctly defined.
	 */
	@Test
	public void testUnknown()
	{
		PasswordHashType hashType = PasswordHashType.UNKNOWN;
		assertNotNull(hashType, "UNKNOWN should not be null");
		assertEquals("UNKNOWN", hashType.name(), "UNKNOWN name should be 'UNKNOWN'");
	}

	/**
	 * Test to ensure that all defined constants in {@link PasswordHashType} are correctly
	 * identified.
	 */
	@Test
	public void testValues()
	{
		PasswordHashType[] values = PasswordHashType.values();
		assertEquals(2, values.length, "There should be 2 constants in PasswordHashType");
		assertEquals(PasswordHashType.PBKDF2, values[0], "First constant should be PBKDF2");
		assertEquals(PasswordHashType.UNKNOWN, values[1], "Second constant should be UNKNOWN");
	}

	/**
	 * Test to ensure that the valueOf method correctly resolves the constants in
	 * {@link PasswordHashType}.
	 */
	@Test
	public void testValueOf()
	{
		assertEquals(PasswordHashType.PBKDF2, PasswordHashType.valueOf("PBKDF2"),
			"valueOf should return PBKDF2 for 'PBKDF2'");
		assertEquals(PasswordHashType.UNKNOWN, PasswordHashType.valueOf("UNKNOWN"),
			"valueOf should return UNKNOWN for 'UNKNOWN'");
	}
}