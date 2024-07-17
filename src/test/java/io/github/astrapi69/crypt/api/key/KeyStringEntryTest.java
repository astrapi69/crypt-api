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
package io.github.astrapi69.crypt.api.key;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Test class for {@link KeyStringEntry}. This class uses parameterized tests to verify the
 * correctness of the enum values.
 */
public class KeyStringEntryTest
{

	/**
	 * Tests the {@link KeyStringEntry#getValue()} method with values from a CSV file.
	 *
	 * @param enumName
	 *            the name of the enum constant
	 * @param expectedValue
	 *            the expected value of the enum constant
	 */
	@DisplayName("Parameterized Test for KeyStringEntry enum values")
	@ParameterizedTest(name = "{index} => enumName={0}, expectedValue={1}")
	@CsvFileSource(resources = "/key_string_entry_test.csv", numLinesToSkip = 1)
	void testKeyStringEntryValue(String enumName, String expectedValue)
	{
		KeyStringEntry keyStringEntry = KeyStringEntry.valueOf(enumName);
		String actualValue = keyStringEntry.getValue();
		assertEquals(expectedValue, actualValue,
			"The value of " + enumName + " should be " + expectedValue);
	}

	/**
	 * Tests the {@link KeyStringEntry#getValue()} method with values from a CSV file.
	 *
	 * @param enumName
	 *            the name of the enum constant
	 * @param expectedValue
	 *            the expected value of the enum constant
	 */
	@DisplayName("Parameterized Test for KeyStringEntry enum values")
	@ParameterizedTest(name = "{index} => enumName={0}, expectedValue={1}")
	@CsvFileSource(resources = "/key_string_entry_test.csv", numLinesToSkip = 1)
	void testKeyStringEntryToString(String enumName, String expectedValue)
	{
		KeyStringEntry keyStringEntry = KeyStringEntry.valueOf(enumName);
		String actualValue = keyStringEntry.toString();
		assertEquals(expectedValue, actualValue,
			"The value of " + enumName + " should be " + expectedValue);
	}
}
