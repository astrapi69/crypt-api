import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.support.AnnotationConsumer;

import io.github.astrapi69.crypt.api.mechanism.SaslServerMechanism;

/**
 * The MIT License
 * <p>
 * Copyright (C) 2015 Asterios Raptis
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

/**
 * JUnit 5 test class for {@link SaslServerMechanism} enum.
 */
@DisplayName("SaslServerMechanism Enum Test")
public class SaslServerMechanismTest
{

	/**
	 * Parameterized test to verify the mechanism name for each SaslServerMechanism enum constant
	 * using a CSV file.
	 *
	 * @param mechanismName
	 *            the name of the mechanism
	 * @param expectedMechanism
	 *            the expected SaslServerMechanism enum constant
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/saslservermechanism.csv", numLinesToSkip = 1)
	@DisplayName("Parameterized Test with CSV")
	void testMechanismName(String mechanismName, SaslServerMechanism expectedMechanism)
	{
		assertEquals(mechanismName, expectedMechanism.getMechanism());
	}

	/**
	 * Provides a stream of arguments for the method source parameterized test.
	 *
	 * @return a stream of arguments
	 */
	static Stream<Arguments> mechanismProvider()
	{
		return Stream.of(arguments("CRAM-MD5", SaslServerMechanism.CRAM_MD5),
			arguments("DIGEST-MD5", SaslServerMechanism.DIGEST_MD5),
			arguments("GSSAPI", SaslServerMechanism.GSSAPI),
			arguments("NTLM", SaslServerMechanism.NTLM),
			arguments("UNKNOWN", SaslServerMechanism.UNKNOWN));
	}

	/**
	 * Parameterized test to verify the mechanism name for each SaslServerMechanism enum constant
	 * using a method source.
	 *
	 * @param mechanismName
	 *            the name of the mechanism
	 * @param expectedMechanism
	 *            the expected SaslServerMechanism enum constant
	 */
	@ParameterizedTest
	@MethodSource("mechanismProvider")
	@DisplayName("Parameterized Test with Method Source")
	void testMechanismNameWithMethodSource(String mechanismName,
		SaslServerMechanism expectedMechanism)
	{
		assertEquals(mechanismName, expectedMechanism.getMechanism());
	}
}
