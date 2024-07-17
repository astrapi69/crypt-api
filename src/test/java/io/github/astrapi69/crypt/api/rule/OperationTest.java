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
package io.github.astrapi69.crypt.api.rule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import io.github.astrapi69.crypt.api.obfuscation.rule.Operation;

/**
 * The unit test class for the class {@link Operation}
 */
public class OperationTest
{

	/**
	 * Parameterized test to verify the operation on a given character using a CSV file.
	 *
	 * @param inputChar
	 *            the character to operate on
	 * @param operationName
	 *            the name of the operation
	 * @param reverse
	 *            the flag to reverse the operation
	 * @param expectedChar
	 *            the expected result after the operation
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/operationtest.csv", numLinesToSkip = 1)
	@DisplayName("Parameterized Test with CSV")
	void testOperation(char inputChar, String operationName, boolean reverse, char expectedChar)
	{
		Operation operation = Operation.toOperation(operationName);
		assertEquals(expectedChar, Operation.operate(inputChar, operation, reverse));
	}

	/**
	 * Provides a stream of arguments for the method source parameterized test.
	 *
	 * @return a stream of arguments
	 */
	static Stream<Arguments> operationProvider()
	{
		return Stream.of(arguments('a', "UPPERCASE", false, 'A'),
			arguments('A', "LOWERCASE", false, 'a'), arguments('a', "NEGATE", false, 'A'),
			arguments('A', "NEGATE", false, 'a'), arguments('a', "NONE", false, 'a'),
			arguments('A', "NONE", false, 'A'), arguments('a', "UPPERCASE", true, 'a'),
			arguments('A', "LOWERCASE", true, 'A'));
	}

	/**
	 * Parameterized test to verify the operation on a given character using a method source.
	 *
	 * @param inputChar
	 *            the character to operate on
	 * @param operationName
	 *            the name of the operation
	 * @param reverse
	 *            the flag to reverse the operation
	 * @param expectedChar
	 *            the expected result after the operation
	 */
	@ParameterizedTest
	@MethodSource("operationProvider")
	@DisplayName("Parameterized Test with Method Source")
	void testOperationWithMethodSource(char inputChar, String operationName, boolean reverse,
		char expectedChar)
	{
		Operation operation = Operation.toOperation(operationName);
		assertEquals(expectedChar, Operation.operate(inputChar, operation, reverse));
	}

	/**
	 * Test method for {@link Operation#operate(char, Operation)}
	 */
	@Test
	public void testOperateCharOperation()
	{
		Character expected;
		Character actual;

		actual = Operation.operate('a', Operation.UPPERCASE);
		expected = 'A';
		assertEquals(expected, actual);

		actual = Operation.operate('a', Operation.NONE);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('A', Operation.LOWERCASE);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('A', Operation.NEGATE);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('a', Operation.NEGATE);
		expected = 'A';
		assertEquals(expected, actual);

		actual = Operation.operate('A', null);
		expected = 'A';
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link Operation#operate(char, Operation, boolean)}
	 */
	@Test
	public void testOperateCharOperationBoolean()
	{
		Character expected;
		Character actual;

		actual = Operation.operate('a', Operation.UPPERCASE, false);
		expected = 'A';
		assertEquals(expected, actual);

		actual = Operation.operate('a', Operation.NONE, false);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('A', Operation.LOWERCASE, false);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('A', Operation.NEGATE, false);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('a', Operation.UPPERCASE, true);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('a', Operation.NONE, true);
		expected = 'a';
		assertEquals(expected, actual);

		actual = Operation.operate('A', Operation.LOWERCASE, true);
		expected = 'A';
		assertEquals(expected, actual);

		actual = Operation.operate('A', Operation.NONE, true);
		expected = 'A';
		assertEquals(expected, actual);
		// double negation does nothing to character
		actual = Operation.operate('A', Operation.NEGATE, true);
		expected = 'A';
		assertEquals(expected, actual);
	}

}
