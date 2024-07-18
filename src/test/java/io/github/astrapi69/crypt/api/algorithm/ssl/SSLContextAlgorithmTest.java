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
package io.github.astrapi69.crypt.api.algorithm.ssl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Unit test for {@link SSLContextAlgorithm} enum.
 *
 * <p>
 * This test class verifies the correct behavior of the {@link SSLContextAlgorithm} enum by using
 * parameterized tests with a CSV file as the data source. Each row in the CSV file should contain
 * the enum name and the expected algorithm string.
 *
 * <p>
 * CSV file format:
 * 
 * <pre>
 * EnumName,ExpectedAlgorithmString
 * SSL,SSL
 * SSLV2,SSLv2
 * SSLV3,SSLv3
 * TLS,TLS
 * TLSV1,TLSv1
 * TLSV1_1,TLSv1.1
 * TLSV1_2,TLSv1.2
 * TLSV1_3,TLSv1.3
 * DTLS,DTLS
 * DTLSV1_0,DTLSv1.0
 * DTLSV1_2,DTLSv1.2
 * </pre>
 *
 * <p>
 * The CSV file is placed in the test resources directory (e.g., src/test/resources)
 */
public class SSLContextAlgorithmTest
{

	/**
	 * Parameterized test for verifying the algorithm strings of {@link SSLContextAlgorithm} enum.
	 *
	 * @param enumName
	 *            the name of the enum constant
	 * @param expectedAlgorithm
	 *            the expected algorithm string
	 */
	@ParameterizedTest
	@CsvFileSource(resources = "/ssl_context_algorithm.csv", numLinesToSkip = 1)
	void testGetAlgorithm(String enumName, String expectedAlgorithm)
	{
		SSLContextAlgorithm algorithm = SSLContextAlgorithm.valueOf(enumName);
		assertEquals(expectedAlgorithm, algorithm.getAlgorithm());
	}
}
