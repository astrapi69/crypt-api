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
/**

 The MIT License
 Copyright (C) 2015 Asterios Raptis
 Permission is hereby granted, free of charge, to any person obtaining
 a copy of this software and associated documentation files (the
 "Software"), to deal in the Software without restriction, including
 without limitation the rights to use, copy, modify, merge, publish,
 distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to
 the following conditions:
 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.crypt.api.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 
 * The class {@link MacAlgorithmTest} provides unit tests for the {@link MacAlgorithm} enum.
 * 
 * @version 1.0
 */
public class MacAlgorithmTest
{

	/**
	 * Provides a stream of {@link MacAlgorithm} and expected algorithm name pairs.
	 * 
	 * @return a stream of arguments with {@link MacAlgorithm} and expected algorithm name pairs.
	 */
	private static Stream<Arguments> provideMacAlgorithms()
	{
		return Stream.of(Arguments.of(MacAlgorithm.HmacMD5, "HmacMD5"),
			Arguments.of(MacAlgorithm.HmacSHA1, "HmacSHA1"),
			Arguments.of(MacAlgorithm.HmacSHA224, "HmacSHA224"),
			Arguments.of(MacAlgorithm.HmacSHA256, "HmacSHA256"),
			Arguments.of(MacAlgorithm.HmacSHA384, "HmacSHA384"),
			Arguments.of(MacAlgorithm.HmacSHA512, "HmacSHA512"),
			Arguments.of(MacAlgorithm.H_MAC_SHA512_224, "HmacSHA512/224"),
			Arguments.of(MacAlgorithm.H_MAC_SHA512_256, "HmacSHA512/256"),
			Arguments.of(MacAlgorithm.H_MAC_SHA3_224, "HmacSHA3-224"),
			Arguments.of(MacAlgorithm.H_MAC_SHA3_256, "HmacSHA3-256"),
			Arguments.of(MacAlgorithm.H_MAC_SHA3_384, "HmacSHA3-384"),
			Arguments.of(MacAlgorithm.H_MAC_SHA3_512, "HmacSHA3-512"),
			Arguments.of(MacAlgorithm.PBEWithHmacMD5, "PBEWithHmacMD5"),
			Arguments.of(MacAlgorithm.PBEWithHmacSHA1, "PBEWithHmacSHA1"),
			Arguments.of(MacAlgorithm.PBEWithHmacSHA224, "PBEWithHmacSHA224"),
			Arguments.of(MacAlgorithm.PBEWithHmacSHA256, "PBEWithHmacSHA256"),
			Arguments.of(MacAlgorithm.PBEWithHmacSHA384, "PBEWithHmacSHA384"),
			Arguments.of(MacAlgorithm.PBEWithHmacSHA512, "PBEWithHmacSHA512"),
			Arguments.of(MacAlgorithm.UNKNOWN, Algorithm.UNKNOWN_ALGORITHM_NAME));
	}

	/**
	 * Test the {@link MacAlgorithm#getAlgorithm()} method using data from a CSV file.
	 * 
	 * @param macAlgorithm
	 *            the {@link MacAlgorithm} enum constant
	 * @param expected
	 *            the expected algorithm name
	 */
	@ParameterizedTest(name = "{index} => macAlgorithm={0}, expected={1}")
	@CsvFileSource(resources = "/mac_algorithms.csv", numLinesToSkip = 1)
	public void testGetAlgorithm(MacAlgorithm macAlgorithm, String expected)
	{
		assertEquals(expected, macAlgorithm.getAlgorithm());
	}

	/**
	 * Test the {@link MacAlgorithm#getAlgorithm()} method using method source.
	 * 
	 * @param macAlgorithm
	 *            the {@link MacAlgorithm} enum constant
	 * @param expected
	 *            the expected algorithm name
	 */
	@ParameterizedTest(name = "{index} => macAlgorithm={0}, expected={1}")
	@MethodSource("provideMacAlgorithms")
	public void testGetAlgorithmWithMethodSource(MacAlgorithm macAlgorithm, String expected)
	{
		assertEquals(expected, macAlgorithm.getAlgorithm());
	}
}