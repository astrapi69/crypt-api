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

/**
 * The enum {@link KeySize} hold the bit size for private keys.
 */
public enum KeySize
{

	/** The key size of 1024 bits */
	KEYSIZE_1024(1024),

	/** The key size of 2048 bits */
	KEYSIZE_2048(2048),

	/** The key size of 4096 bits */
	KEYSIZE_4096(4096),

	/** The key size of 8192 bits */
	KEYSIZE_8192(8192),

	/** The key size of 16384 bits */
	KEYSIZE_16384(16384),

	/** The key size of 32768 bits */
	KEYSIZE_32768(32768),

	/**
	 * The constant 'UNKNOWN' if the key size is not known or cannot be resolved
	 */
	UNKNOWN(-1);

	/** The key size. */
	private final Integer keySize;

	/**
	 * Instantiates a new {@link KeySize}.
	 *
	 * @param keySize
	 *            the key size
	 */
	KeySize(final Integer keySize)
	{
		this.keySize = keySize;
	}

	/**
	 * Get the key size
	 *
	 * @return the key size
	 */
	public Integer getKeySize()
	{
		return this.keySize;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString()
	{
		return this.keySize.toString();
	}
}
