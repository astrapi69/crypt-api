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
package io.github.astrapi69.crypt.api.mechanism;

/**
 * The enum {@link ExemptionMechanism} defines the exemption mechanism names that can be specified
 * in the permission policy file that accompanies an application considered “exempt” from
 * cryptographic restrictions
 */
public enum ExemptionMechanism
{

	/**
	 * The enum constant KEY_ESCROW. An encryption system with a backup decryption capability that
	 * allows authorized persons (users, officers of an organization, and government officials),
	 * under certain prescribed conditions, to decrypt ciphertext with the help of information
	 * supplied by one or more trusted parties who hold special data recovery keys.
	 */
	KEY_ESCROW(ExemptionMechanism.KEY_ESCROW_ALGORITHM_NAME),

	/**
	 * The enum constant KEY_RECOVERY. A method of obtaining the secret key used to lock encrypted
	 * data. One use is as a means of providing fail-safe access to a corporation’s own encrypted
	 * information in times of disaster.
	 */
	KEY_RECOVERY(ExemptionMechanism.KEY_RECOVERY_ALGORITHM_NAME),

	/**
	 * The enum constant KEY_WEAKENING. A method in which a part of the key can be escrowed or
	 * recovered.
	 */
	KEY_WEAKENING(ExemptionMechanism.KEY_WEAKENING_ALGORITHM_NAME);

	/** The string constant KEY_ESCROW_ALGORITHM_NAME */
	public static final String KEY_ESCROW_ALGORITHM_NAME = "KeyEscrow";

	/** The string constant KEY_RECOVERY_ALGORITHM_NAME */
	public static final String KEY_RECOVERY_ALGORITHM_NAME = "KeyRecovery";

	/** The string constant KEY_WEAKENING_ALGORITHM_NAME */
	public static final String KEY_WEAKENING_ALGORITHM_NAME = "KeyWeakening";

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link ExemptionMechanism} object
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	ExemptionMechanism(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	/**
	 * Gets the algorithm
	 *
	 * @return the algorithm
	 */
	public String getAlgorithm()
	{
		return this.algorithm;
	}
}
