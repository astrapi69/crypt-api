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

import java.util.Arrays;

/**
 * The enum {@link KeyType} can discriminate the type, if it is a private or public key or a
 * certificate.
 */
public enum KeyType
{

	/** The certificate type. */
	CERTIFICATE(KeyType.KEY_TYPE_CERTIFICATE),

	/** The private key type. */
	PRIVATE_KEY(KeyType.KEY_TYPE_PRIVATE_KEY),

	/** The password protected private key type. */
	PRIVATE_KEY_PASSWORD_PROTECTED(KeyType.KEY_TYPE_PRIVATE_KEY_PASSWORD_PROTECTED),

	/** The public key type. */
	PUBLIC_KEY(KeyType.KEY_TYPE_PUBLIC_KEY),

	/** The password protected public key type. */
	PUBLIC_KEY_PASSWORD_PROTECTED(KeyType.KEY_TYPE_PUBLIC_KEY_PASSWORD_PROTECTED),

	/** The unknown key type. */
	UNKNOWN(KeyType.KEY_TYPE_UNKNOWN);

	/** Constant for certificate type display value */
	public static final String KEY_TYPE_CERTIFICATE = "Certificate";

	/** Constant for private key type display value */
	public static final String KEY_TYPE_PRIVATE_KEY = "Private key";

	/** Constant for password protected private key type display value */
	public static final String KEY_TYPE_PRIVATE_KEY_PASSWORD_PROTECTED = "Password protected private key";

	/** Constant for public key type display value */
	public static final String KEY_TYPE_PUBLIC_KEY = "Public key";

	/** Constant for password protected public key type display value */
	public static final String KEY_TYPE_PUBLIC_KEY_PASSWORD_PROTECTED = "Password protected public key";

	/** Constant for unknown key type display value */
	public static final String KEY_TYPE_UNKNOWN = "Unknown key type";

	/** The display value of the key type */
	private final String displayValue;

	/**
	 * Instantiates a new {@link KeyType} object.
	 *
	 * @param displayValue
	 *            the display value
	 */
	KeyType(final String displayValue)
	{
		this.displayValue = displayValue;
	}

	/**
	 * Get the display value.
	 *
	 * @return the display value
	 */
	public String getDisplayValue()
	{
		return this.displayValue;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString()
	{
		return this.displayValue;
	}

	/**
	 * Gets the corresponding {@link KeyType} from the given string.
	 *
	 * @param displayValueAsString
	 *            the display value as string
	 * @return the {@link KeyType} object
	 */
	public static KeyType toKeyType(final String displayValueAsString)
	{
		return Arrays.stream(KeyType.values())
			.filter(keyType -> keyType.getDisplayValue().equalsIgnoreCase(displayValueAsString))
			.findFirst().orElse(KeyType.UNKNOWN);
	}
}
