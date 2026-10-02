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
package io.github.astrapi69.crypt.api.algorithm.key;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.NoSuchAlgorithmException;

import javax.crypto.SecretKeyFactory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

/**
 * The unit test class for the enum class {@link SecretKeyFactoryAlgorithm}
 */
class SecretKeyFactoryAlgorithmTest
{

	/**
	 * Test method for verify all the algorithms of enum class {@link SecretKeyFactoryAlgorithm}
	 */
	@Test
	void getAlgorithm()
	{
		assertEquals(SecretKeyFactoryAlgorithm.AES.getAlgorithm(), "AES");
		assertEquals(SecretKeyFactoryAlgorithm.ARCFOUR.getAlgorithm(), "ARCFOUR");
		assertEquals(SecretKeyFactoryAlgorithm.DES.getAlgorithm(), "DES");
		assertEquals(SecretKeyFactoryAlgorithm.DESede.getAlgorithm(), "DESede");
	}

	/**
	 * The PBKDF2 names are the JDK's standard names, character for character (#15)
	 */
	@Test
	void getAlgorithm_namesPbkdf2AsTheJdkDoes()
	{
		assertEquals("PBKDF2WithHmacSHA256",
			SecretKeyFactoryAlgorithm.PBKDF2_WITH_HMAC_SHA256.getAlgorithm());
		assertEquals("PBKDF2WithHmacSHA512",
			SecretKeyFactoryAlgorithm.PBKDF2_WITH_HMAC_SHA512.getAlgorithm());
	}

	/**
	 * A constant whose name the JDK does not know would be a string literal with extra steps
	 *
	 * @param algorithm
	 *            the PBKDF2 constant
	 * @throws NoSuchAlgorithmException
	 *             if the JDK does not know the name, which fails the test
	 */
	@ParameterizedTest(name = "the JDK has a SecretKeyFactory for {0}")
	@EnumSource(value = SecretKeyFactoryAlgorithm.class, names = { "PBKDF2_WITH_HMAC_SHA256",
			"PBKDF2_WITH_HMAC_SHA512" })
	void getAlgorithm_isASecretKeyFactoryTheJdkProvides(final SecretKeyFactoryAlgorithm algorithm)
		throws NoSuchAlgorithmException
	{
		assertEquals(algorithm.getAlgorithm(),
			SecretKeyFactory.getInstance(algorithm.getAlgorithm()).getAlgorithm());
	}
}
