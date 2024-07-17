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
package io.github.astrapi69.crypt.api.mode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * The test class {@link ModeTest} provides unit tests for the {@link Mode} enum.
 */
public class ModeTest
{

	/**
	 * Test method for the values() method of the {@link Mode} enum.
	 */
	@Test
	public void testValues()
	{
		Mode[] modes = Mode.values();
		assertNotNull(modes);
		assertEquals(13, modes.length); // Ensure there are 14 enum constants
	}

	/**
	 * Test method for the valueOf() method of the {@link Mode} enum.
	 */
	@Test
	public void testValueOf()
	{
		Mode mode = Mode.valueOf("CBC");
		assertNotNull(mode);
		assertEquals(Mode.CBC, mode);
	}

	/**
	 * Test method to check if all enum constants are correctly defined.
	 */
	@Test
	public void testEnumConstants()
	{
		assertEquals("BC", Mode.BC.name());
		assertEquals("CBC", Mode.CBC.name());
		assertEquals("CCM", Mode.CCM.name());
		assertEquals("CFB", Mode.CFB.name());
		assertEquals("CFBx", Mode.CFBx.name());
		assertEquals("CTR", Mode.CTR.name());
		assertEquals("CTS", Mode.CTS.name());
		assertEquals("ECB", Mode.ECB.name());
		assertEquals("GCM", Mode.GCM.name());
		assertEquals("OFB", Mode.OFB.name());
		assertEquals("OFBx", Mode.OFBx.name());
		assertEquals("PCBC", Mode.PCBC.name());
		assertEquals("UNKNOWN", Mode.UNKNOWN.name());
	}
}
