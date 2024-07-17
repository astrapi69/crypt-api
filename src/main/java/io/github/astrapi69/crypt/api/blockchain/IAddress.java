/**
 * The MIT License
 * <p>
 * Copyright (C) 2015 Asterios Raptis
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package io.github.astrapi69.crypt.api.blockchain;

/**
 * The interface {@link IAddress} represents an address in a blockchain system.
 * <p>
 * This interface defines methods for getting and setting the hash, name, and public key associated
 * with a blockchain address.
 * </p>
 */
public interface IAddress
{

	/**
	 * Gets the hash of the blockchain address.
	 *
	 * @return the hash as a byte array
	 */
	byte[] getHash();

	/**
	 * Sets the hash of the blockchain address.
	 *
	 * @param hash
	 *            the hash to set, as a byte array
	 */
	void setHash(byte[] hash);

	/**
	 * Gets the name associated with the blockchain address.
	 *
	 * @return the name as a String
	 */
	String getName();

	/**
	 * Sets the name associated with the blockchain address.
	 *
	 * @param name
	 *            the name to set, as a String
	 */
	void setName(String name);

	/**
	 * Gets the public key of the blockchain address.
	 *
	 * @return the public key as a byte array
	 */
	byte[] getPublicKey();

	/**
	 * Sets the public key of the blockchain address.
	 *
	 * @param publicKey
	 *            the public key to set, as a byte array
	 */
	void setPublicKey(byte[] publicKey);
}
