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
