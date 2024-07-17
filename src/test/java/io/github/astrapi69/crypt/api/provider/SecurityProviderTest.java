import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.support.AnnotationConsumer;

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
