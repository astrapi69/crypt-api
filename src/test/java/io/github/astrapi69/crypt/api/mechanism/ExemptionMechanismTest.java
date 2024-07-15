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

package io.github.astrapi69.crypt.api.mechanism;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test class for the {@link ExemptionMechanism} enum.
 *
 * <p>
 * This test class verifies that the {@link ExemptionMechanism#getMechanism()} method returns the
 * correct mechanism name for each enum constant using parameterized tests with a CSV file as the
 * source of test data.
 * </p>
 */
public class ExemptionMechanismTest
{

	/**
	 * Parameterized test method that reads test data from a CSV file and verifies that the
	 * {@link ExemptionMechanism#getMechanism()} method returns the expected mechanism name.
	 *
	 * @param mechanismEnum
	 *            The {@link ExemptionMechanism} enum constant.
	 * @param expectedMechanismName
	 *            The expected mechanism name.
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/exemption_mechanism_test_data.csv", numLinesToSkip = 1)
	void testGetMechanism(ExemptionMechanism mechanismEnum, String expectedMechanismName)
	{
		assertEquals(expectedMechanismName, mechanismEnum.getMechanism());
	}
}
