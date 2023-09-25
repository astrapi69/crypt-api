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
package io.github.astrapi69.crypt.api.key;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.github.astrapi69.crypt.api.algorithm.AesAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.HashAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.UnionWord;
import io.github.astrapi69.crypt.api.mechanism.PBEMechanism;
import io.github.astrapi69.crypt.api.mode.Mode;

/**
 * The unit test class for the class {@link KeyType}
 */
public class KeyTypeTest
{

	/**
	 * Test method for {@link KeyType#getDisplayValue()}
	 */
	@Test
	public void testDisplayValue()
	{
		String expected;
		String actual;

		String foo = PBEMechanism.PBE.name() + UnionWord.With.name().toUpperCase()
			+ HashAlgorithm.SHA1.name() + UnionWord.And.name().toUpperCase() + "128BIT"
			+ AesAlgorithm.AES.name() + "-" + Mode.CBC.name() + "-" + Mode.BC.name();
		System.out.println(foo);

		actual = KeyType.CERTIFICATE.getDisplayValue();
		expected = "Certificate";
		assertEquals(actual, expected);
		assertEquals(KeyType.CERTIFICATE.toString(), expected);

		actual = KeyType.PRIVATE_KEY.getDisplayValue();
		expected = "Private key";
		assertEquals(actual, expected);
		assertEquals(KeyType.PRIVATE_KEY.toString(), expected);

		actual = KeyType.PRIVATE_KEY_PASSWORD_PROTECTED.getDisplayValue();
		expected = "Password protected private key";
		assertEquals(actual, expected);
		assertEquals(KeyType.PRIVATE_KEY_PASSWORD_PROTECTED.toString(), expected);

		actual = KeyType.PUBLIC_KEY.getDisplayValue();
		expected = "Public key";
		assertEquals(actual, expected);
		assertEquals(KeyType.PUBLIC_KEY.toString(), expected);

		actual = KeyType.PUBLIC_KEY_PASSWORD_PROTECTED.getDisplayValue();
		expected = "Password protected public key";
		assertEquals(actual, expected);
		assertEquals(KeyType.PUBLIC_KEY_PASSWORD_PROTECTED.toString(), expected);

		actual = KeyType.PUBLIC_KEY.getDisplayValue();
		expected = "Public key";
		assertEquals(actual, expected);
		assertEquals(KeyType.PUBLIC_KEY.toString(), expected);

	}

	/**
	 * Test method for {@link KeyType#toKeyType(String)}
	 */
	@Test
	public void testToKeyType()
	{
		KeyType actual;
		KeyType expected;

		actual = KeyType.toKeyType(KeyType.KEY_TYPE_CERTIFICATE);
		expected = KeyType.CERTIFICATE;
		assertEquals(actual, expected);

		actual = KeyType.toKeyType(KeyType.KEY_TYPE_PRIVATE_KEY);
		expected = KeyType.PRIVATE_KEY;
		assertEquals(actual, expected);

		actual = KeyType.toKeyType(KeyType.KEY_TYPE_PRIVATE_KEY_PASSWORD_PROTECTED);
		expected = KeyType.PRIVATE_KEY_PASSWORD_PROTECTED;
		assertEquals(actual, expected);

		actual = KeyType.toKeyType(KeyType.KEY_TYPE_PUBLIC_KEY);
		expected = KeyType.PUBLIC_KEY;
		assertEquals(actual, expected);

		actual = KeyType.toKeyType(KeyType.KEY_TYPE_PUBLIC_KEY_PASSWORD_PROTECTED);
		expected = KeyType.PUBLIC_KEY_PASSWORD_PROTECTED;
		assertEquals(actual, expected);

		actual = KeyType.toKeyType("foo");
		expected = KeyType.UNKNOWN;
		assertEquals(actual, expected);
	}
}
