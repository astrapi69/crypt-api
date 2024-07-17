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

import java.util.Objects;

import io.github.astrapi69.crypt.api.type.Type;

/**
 * The enum {@link KeyFormat} represents the key format of the private keys
 */
public enum KeyFormat
{
	/** The key format pkcs 1. */
	PKCS_1("PKCS#1"),

	/** The key format pkcs 8. */
	PKCS_8("PKCS#8"),

	/**
	 * The constant 'UNKNOWN' if the format is not known or cannot be resolved
	 */
	UNKNOWN(Type.UNKNOWN_TYPE_NAME);

	/** The key format */
	private final String format;

	KeyFormat(final String format)
	{
		Objects.requireNonNull(format);
		this.format = format;
	}

	/**
	 * Get the key format
	 *
	 * @return the key format
	 */
	public String getFormat()
	{
		return this.format;
	}
}
