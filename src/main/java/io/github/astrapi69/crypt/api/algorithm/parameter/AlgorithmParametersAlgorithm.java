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
package io.github.astrapi69.crypt.api.algorithm.parameter;

import java.security.AlgorithmParameters;

import io.github.astrapi69.crypt.api.algorithm.AesAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.Algorithm;
import io.github.astrapi69.crypt.api.algorithm.CipherAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.SunJCEAlgorithm;
import io.github.astrapi69.crypt.api.algorithm.key.KeyPairGeneratorAlgorithm;

/**
 * The enum {@link AlgorithmParametersAlgorithm} provides all the algorithm names that can be
 * specified when generating an instance of {@link AlgorithmParameters}. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#algorithmparameters-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#algorithmparameters-algorithms</a>
 */
public enum AlgorithmParametersAlgorithm implements Algorithm
{

	/** The enum constant for AES algorithm. */
	AES(AesAlgorithm.AES_ALGORITHM_NAME),

	/** The Blowfish algorithm. */
	Blowfish(SunJCEAlgorithm.BLOWFISH_ALGORITHM_NAME),

	/** The ChaCha20-Poly1305 algorithm. */
	ChaCha20_Poly1305(CipherAlgorithm.CHA_CHA_20_POLY1305_ALGORITHM_NAME),

	/** The DES algorithm. */
	DES(SunJCEAlgorithm.DES_ALGORITHM_NAME),

	/** The DESede algorithm. */
	DESede(SunJCEAlgorithm.DES_EDE_ALGORITHM_NAME),

	/** The enum constant for DIFFIE_HELLMAN algorithm. */
	DIFFIE_HELLMAN(KeyPairGeneratorAlgorithm.DIFFIE_HELLMAN_ALGORITHM_NAME),

	/** The enum constant for DSA algorithm. */
	DSA(KeyPairGeneratorAlgorithm.DSA_ALGORITHM_NAME),

	/** The enum constant for EC algorithm. */
	EC(KeyPairGeneratorAlgorithm.EC_ALGORITHM_NAME),

	/** The enum constant for OAEP algorithm. */
	OAEP(AlgorithmParametersAlgorithm.OAEP_ALGORITHM_NAME),

	/**
	 * The enum constant for OAEP algorithm. Parameters for use with the PBE algorithm. This name
	 * should not be used, use instead the compound algorithms
	 */
	PBE(AlgorithmParametersAlgorithm.PBE_ALGORITHM_NAME),

	/** The RC2 algorithm. */
	RC2(CipherAlgorithm.RC2_ALGORITHM_NAME),

	/** The enum constant for RSA algorithm. */
	RSASSA_PSS(KeyPairGeneratorAlgorithm.RSASSA_PSS_ALGORITHM_NAME),

	/** The enum constant for XDH algorithm. */
	XDH(KeyPairGeneratorAlgorithm.XDH_ALGORITHM_NAME),

	/** The enum constant for X25519 algorithm. */
	X25519(KeyPairGeneratorAlgorithm.X25519_ALGORITHM_NAME),

	/** The enum constant for X448 algorithm. */
	X448(KeyPairGeneratorAlgorithm.X448_ALGORITHM_NAME),

	/** The enum constant 'UNKNOWN' if the algorithm parameter algorithm is unknown */
	UNKNOWN(Algorithm.UNKNOWN_ALGORITHM_NAME);

	/** The string constant OAEP_ALGORITHM_NAME */
	public static final String OAEP_ALGORITHM_NAME = "OAEP";

	/** The string constant PBE_ALGORITHM_NAME */
	public static final String PBE_ALGORITHM_NAME = "PBE";

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link AlgorithmParametersAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	AlgorithmParametersAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getAlgorithm()
	{
		return algorithm;
	}
}
