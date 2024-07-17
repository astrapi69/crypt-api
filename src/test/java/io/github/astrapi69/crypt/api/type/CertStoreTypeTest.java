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
package io.github.astrapi69.crypt.api.type;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * JUnit 5 test class for {@link CertStoreType} enum.
 */
@DisplayName("CertStoreType Enum Test")
public class CertStoreTypeTest
{

	/**
	 * Parameterized test to verify the CertStoreType enum constants using a CSV file.
	 *
	 * @param typeName
	 *            the name of the cert store type
	 * @param expectedType
	 *            the expected CertStoreType enum constant
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/certstoretype.csv", numLinesToSkip = 1)
	@DisplayName("Parameterized Test with CSV")
	void testCertStoreType(String typeName, CertStoreType expectedType)
	{
		assertEquals(expectedType, CertStoreType.valueOf(typeName));
		assertEquals(typeName, expectedType.getType());
	}

	/**
	 * Provides a stream of arguments for the method source parameterized test.
	 *
	 * @return a stream of arguments
	 */
	static Stream<Arguments> typeProvider()
	{
		return Stream.of(Arguments.arguments("Collection", CertStoreType.Collection),
			Arguments.arguments("LDAP", CertStoreType.LDAP),
			Arguments.arguments("UNKNOWN", CertStoreType.UNKNOWN));
	}

	/**
	 * Parameterized test to verify the CertStoreType enum constants using a method source.
	 *
	 * @param typeName
	 *            the name of the cert store type
	 * @param expectedType
	 *            the expected CertStoreType enum constant
	 */
	@ParameterizedTest
	@MethodSource("typeProvider")
	@DisplayName("Parameterized Test with Method Source")
	void testCertStoreTypeWithMethodSource(String typeName, CertStoreType expectedType)
	{
		assertEquals(expectedType, CertStoreType.valueOf(typeName));
		assertEquals(typeName, expectedType.getType());
	}
}
