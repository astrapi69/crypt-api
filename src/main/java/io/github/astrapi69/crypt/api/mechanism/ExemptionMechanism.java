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
 * cryptographic restrictions. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#exemption-mechanisms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#exemption-mechanisms</a>
 */
public enum ExemptionMechanism implements Mechanism
{

	/**
	 * The enum constant KEY_ESCROW. An encryption system with a backup decryption capability that
	 * allows authorized persons (users, officers of an organization, and government officials),
	 * under certain prescribed conditions, to decrypt ciphertext with the help of information
	 * supplied by one or more trusted parties who hold special data recovery keys.
	 */
	KEY_ESCROW(ExemptionMechanism.KEY_ESCROW_MECHANISM_NAME),

	/**
	 * The enum constant KEY_RECOVERY. A method of obtaining the secret key used to lock encrypted
	 * data. One use is as a means of providing fail-safe access to a corporation’s own encrypted
	 * information in times of disaster.
	 */
	KEY_RECOVERY(ExemptionMechanism.KEY_RECOVERY_MECHANISM_NAME),

	/**
	 * The enum constant KEY_WEAKENING. A method in which a part of the key can be escrowed or
	 * recovered.
	 */
	KEY_WEAKENING(ExemptionMechanism.KEY_WEAKENING_MECHANISM_NAME),

	/** The enum constant 'UNKNOWN' if the exemption mechanism name is unknown */
	UNKNOWN(Mechanism.UNKNOWN_MECHANISM_NAME);

	/** The string constant KEY_ESCROW_MECHANISM_NAME */
	public static final String KEY_ESCROW_MECHANISM_NAME = "KeyEscrow";

	/** The string constant KEY_RECOVERY_MECHANISM_NAME */
	public static final String KEY_RECOVERY_MECHANISM_NAME = "KeyRecovery";

	/** The string constant KEY_WEAKENING_MECHANISM_NAME */
	public static final String KEY_WEAKENING_MECHANISM_NAME = "KeyWeakening";

	/** The mechanism */
	private final String mechanism;

	/**
	 * Instantiates a new {@link ExemptionMechanism} object
	 *
	 * @param mechanism
	 *            the mechanism
	 */
	ExemptionMechanism(final String mechanism)
	{
		this.mechanism = mechanism;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getMechanism()
	{
		return this.mechanism;
	}
}
