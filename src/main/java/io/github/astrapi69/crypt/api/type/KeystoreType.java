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

import java.security.KeyStore;

/**
 * The enum {@link KeystoreType} for types that are used to create {@link KeyStore} objects
 */
public enum KeystoreType implements Type
{
	/** The enum constant for DKS type */
	DKS("dks"),

	/** The enum constant for JKS type */
	JKS("jks"),

	/** The enum constant for JCEKS type */
	JCEKS("jceks"),

	/** The enum constant for PKCS11 type */
	PKCS11("pkcs11"),

	/** The enum constant for PKCS12 type */
	PKCS12("pkcs12"),

	/** The enum constant 'UNKNOWN' if the key store type is unknown */
	UNKNOWN(Type.UNKNOWN_TYPE_NAME);

	/** The type. */
	private final String type;

	/**
	 * Instantiates a new {@link KeystoreType} object
	 *
	 * @param type
	 *            the type
	 */
	KeystoreType(final String type)
	{
		this.type = type;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getType()
	{
		return type;
	}
}
