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
package io.github.astrapi69.crypt.api.blockchain;

/**
 * The interface {@link ITransaction} represents a transaction in a blockchain system.
 * <p>
 * This interface defines methods for getting and setting various attributes of a blockchain
 * transaction, such as the hash, sender's hash, signable data, signature, text, and timestamp.
 * </p>
 */
public interface ITransaction
{

	/**
	 * Gets the hash of the transaction.
	 *
	 * @return the hash as a byte array
	 */
	byte[] getHash();

	/**
	 * Sets the hash of the transaction.
	 *
	 * @param hash
	 *            the hash to set, as a byte array
	 */
	void setHash(byte[] hash);

	/**
	 * Gets the hash of the sender.
	 *
	 * @return the sender's hash as a byte array
	 */
	byte[] getSenderHash();

	/**
	 * Sets the hash of the sender.
	 *
	 * @param senderHash
	 *            the sender's hash to set, as a byte array
	 */
	void setSenderHash(byte[] senderHash);

	/**
	 * Gets the data that can be signed in the transaction.
	 *
	 * @return the signable data as a byte array
	 */
	byte[] getSignableData();

	/**
	 * Gets the signature of the transaction.
	 *
	 * @return the signature as a byte array
	 */
	byte[] getSignature();

	/**
	 * Sets the signature of the transaction.
	 *
	 * @param signature
	 *            the signature to set, as a byte array
	 */
	void setSignature(byte[] signature);

	/**
	 * Gets the textual data of the transaction.
	 *
	 * @return the text as a String
	 */
	String getText();

	/**
	 * Sets the textual data of the transaction.
	 *
	 * @param text
	 *            the text to set, as a String
	 */
	void setText(String text);

	/**
	 * Gets the timestamp of when the transaction was created.
	 *
	 * @return the timestamp as a long value
	 */
	long getTimestamp();

	/**
	 * Sets the timestamp of when the transaction was created.
	 *
	 * @param timestamp
	 *            the timestamp to set, as a long value
	 */
	void setTimestamp(long timestamp);
}
