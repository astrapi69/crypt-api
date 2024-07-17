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

import java.util.List;

/**
 * The interface {@link IBlock} represents a block in a blockchain system.
 * <p>
 * This interface defines methods for getting and setting the data, hash, Merkle root, previous
 * block hash, timestamp, transactions, and tries count associated with a blockchain block.
 * </p>
 */
public interface IBlock
{

	/**
	 * Gets the data contained in the block.
	 *
	 * @return the data as a String
	 */
	String getData();

	/**
	 * Sets the data for the block.
	 *
	 * @param data
	 *            the data to set, as a String
	 */
	void setData(String data);

	/**
	 * Gets the hash of the block.
	 *
	 * @return the hash as a byte array
	 */
	byte[] getHash();

	/**
	 * Sets the hash of the block.
	 *
	 * @param hash
	 *            the hash to set, as a byte array
	 */
	void setHash(byte[] hash);

	/**
	 * Gets the number of leading zeros in the block's hash (used for proof-of-work).
	 *
	 * @return the count of leading zeros
	 */
	int getLeadingZerosCount();

	/**
	 * Gets the Merkle root of the block.
	 *
	 * @return the Merkle root as a byte array
	 */
	byte[] getMerkleRoot();

	/**
	 * Sets the Merkle root of the block.
	 *
	 * @param merkleRoot
	 *            the Merkle root to set, as a byte array
	 */
	void setMerkleRoot(byte[] merkleRoot);

	/**
	 * Gets the hash of the previous block in the blockchain.
	 *
	 * @return the previous block's hash as a byte array
	 */
	byte[] getPreviousBlockHash();

	/**
	 * Sets the hash of the previous block in the blockchain.
	 *
	 * @param previousBlockHash
	 *            the previous block's hash to set, as a byte array
	 */
	void setPreviousBlockHash(byte[] previousBlockHash);

	/**
	 * Gets the timestamp when the block was created.
	 *
	 * @return the timestamp as a long value
	 */
	long getTimestamp();

	/**
	 * Sets the timestamp for when the block was created.
	 *
	 * @param timestamp
	 *            the timestamp to set, as a long value
	 */
	void setTimestamp(long timestamp);

	/**
	 * Gets the list of transactions contained in the block.
	 *
	 * @return the list of transactions
	 */
	List<ITransaction> getTransactions();

	/**
	 * Sets the list of transactions for the block.
	 *
	 * @param transactions
	 *            the list of transactions to set
	 */
	void setTransactions(List<ITransaction> transactions);

	/**
	 * Gets the number of tries made to generate the block (used for proof-of-work).
	 *
	 * @return the number of tries as a long value
	 */
	long getTries();

	/**
	 * Sets the number of tries made to generate the block.
	 *
	 * @param tries
	 *            the number of tries to set, as a long value
	 */
	void setTries(long tries);
}
