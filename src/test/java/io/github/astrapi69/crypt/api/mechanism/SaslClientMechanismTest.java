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

import io.github.astrapi69.crypt.api.mechanism.SaslClientMechanism;

/**
 * JUnit 5 test class for {@link SaslClientMechanism} enum.
 */
@DisplayName("SaslClientMechanism Enum Test")
public class SaslClientMechanismTest
{

	/**
	 * Parameterized test to verify the mechanism name for each SaslClientMechanism enum constant
	 * using a CSV file.
	 *
	 * @param mechanismName
	 *            the name of the mechanism
	 * @param expectedMechanism
	 *            the expected SaslClientMechanism enum constant
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/saslclientmechanism.csv", numLinesToSkip = 1)
	@DisplayName("Parameterized Test with CSV")
	void testMechanismName(String mechanismName, SaslClientMechanism expectedMechanism)
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
		return Stream.of(arguments("CRAM-MD5", SaslClientMechanism.CRAM_MD5),
			arguments("DIGEST-MD5", SaslClientMechanism.DIGEST_MD5),
			arguments("EXTERNAL", SaslClientMechanism.EXTERNAL),
			arguments("GSSAPI", SaslClientMechanism.GSSAPI),
			arguments("NTLM", SaslClientMechanism.NTLM),
			arguments("PLAIN", SaslClientMechanism.PLAIN),
			arguments("UNKNOWN", SaslClientMechanism.UNKNOWN));
	}

	/**
	 * Parameterized test to verify the mechanism name for each SaslClientMechanism enum constant
	 * using a method source.
	 *
	 * @param mechanismName
	 *            the name of the mechanism
	 * @param expectedMechanism
	 *            the expected SaslClientMechanism enum constant
	 */
	@ParameterizedTest
	@MethodSource("mechanismProvider")
	@DisplayName("Parameterized Test with Method Source")
	void testMechanismNameWithMethodSource(String mechanismName,
		SaslClientMechanism expectedMechanism)
	{
		assertEquals(mechanismName, expectedMechanism.getMechanism());
	}
}
