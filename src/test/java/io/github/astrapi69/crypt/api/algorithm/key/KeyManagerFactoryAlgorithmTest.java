package io.github.astrapi69.crypt.api.algorithm.key;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Test class for {@link KeyManagerFactoryAlgorithm}.
 */
public class KeyManagerFactoryAlgorithmTest
{

	/**
	 * Parameterized test method for {@link KeyManagerFactoryAlgorithm#getAlgorithm()}.
	 *
	 * @param enumName
	 *            the name of the enum constant
	 * @param expectedAlgorithm
	 *            the expected algorithm string
	 */
	@ParameterizedTest(name = "{index} => enumName={0}, expectedAlgorithm={1}")
	@CsvFileSource(resources = "/key_manager_factory_algorithms.csv", numLinesToSkip = 1)
	public void testGetAlgorithm(String enumName, String expectedAlgorithm)
	{
		KeyManagerFactoryAlgorithm algorithm = KeyManagerFactoryAlgorithm.valueOf(enumName);
		assertEquals(expectedAlgorithm, algorithm.getAlgorithm());
	}
}
