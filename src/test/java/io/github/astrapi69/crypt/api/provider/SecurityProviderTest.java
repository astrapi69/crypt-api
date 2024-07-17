package io.github.astrapi69.crypt.api.provider; /**
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
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import io.github.astrapi69.crypt.api.provider.SecurityProvider;

/**
 * JUnit 5 test class for {@link SecurityProvider} enum.
 */
@DisplayName("SecurityProvider Enum Test")
public class SecurityProviderTest
{

	/**
	 * Parameterized test to verify the SecurityProvider enum constants using a CSV file.
	 *
	 * @param providerName
	 *            the name of the security provider
	 * @param expectedProvider
	 *            the expected SecurityProvider enum constant
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/securityprovider.csv", numLinesToSkip = 1)
	@DisplayName("Parameterized Test with CSV")
	void testSecurityProvider(String providerName, SecurityProvider expectedProvider)
	{
		assertEquals(expectedProvider, SecurityProvider.valueOf(providerName));
	}

	/**
	 * Provides a stream of arguments for the method source parameterized test.
	 *
	 * @return a stream of arguments
	 */
	static Stream<Arguments> providerProvider()
	{
		return Stream.of(Arguments.arguments("BC", SecurityProvider.BC),
			Arguments.arguments("SUN", SecurityProvider.SUN),
			Arguments.arguments("UNKNOWN", SecurityProvider.UNKNOWN));
	}

	/**
	 * Parameterized test to verify the SecurityProvider enum constants using a method source.
	 *
	 * @param providerName
	 *            the name of the security provider
	 * @param expectedProvider
	 *            the expected SecurityProvider enum constant
	 */
	@ParameterizedTest
	@MethodSource("providerProvider")
	@DisplayName("Parameterized Test with Method Source")
	void testSecurityProviderWithMethodSource(String providerName,
		SecurityProvider expectedProvider)
	{
		assertEquals(expectedProvider, SecurityProvider.valueOf(providerName));
	}
}
