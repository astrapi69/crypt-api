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
package io.github.astrapi69.crypt.api.algorithm.key;

import java.util.Arrays;

import io.github.astrapi69.crypt.api.algorithm.Algorithm;

/**
 * The enum {@link KeyPairGeneratorAlgorithm}. For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#keypairgenerator-algorithms">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#keypairgenerator-algorithms</a>
 */
public enum KeyPairGeneratorAlgorithm implements Algorithm
{
	/** The enum constant for DIFFIE_HELLMAN algorithm. */
	DIFFIE_HELLMAN(KeyPairGeneratorAlgorithm.DIFFIE_HELLMAN_ALGORITHM_NAME),

	/** The shortcut value for the enum constant for DIFFIE_HELLMAN algorithm. */
	DH(KeyPairGeneratorAlgorithm.DH_ALGORITHM_NAME),

	/** The enum constant for DSA algorithm. */
	DSA(KeyPairGeneratorAlgorithm.DSA_ALGORITHM_NAME),

	/** The enum constant for RSA algorithm. */
	RSA(KeyPairGeneratorAlgorithm.RSA_ALGORITHM_NAME),

	/** The enum constant for RSA algorithm. */
	RSASSA_PSS(KeyPairGeneratorAlgorithm.RSASSA_PSS_ALGORITHM_NAME),

	/** The enum constant for EC algorithm. */
	EC(KeyPairGeneratorAlgorithm.EC_ALGORITHM_NAME),

	/** The enum constant for XDH algorithm. */
	XDH(KeyPairGeneratorAlgorithm.XDH_ALGORITHM_NAME),

	/** The enum constant for X25519 algorithm. */
	X25519(KeyPairGeneratorAlgorithm.X25519_ALGORITHM_NAME),

	/** The enum constant for X448 algorithm. */
	X448(KeyPairGeneratorAlgorithm.X448_ALGORITHM_NAME),

	/** The enum constant for Ed25519 algorithm. */
	Ed25519(KeyPairGeneratorAlgorithm.ED25519_ALGORITHM_NAME),

	/** The enum constant for Ed448 algorithm. */
	Ed448(KeyPairGeneratorAlgorithm.ED448_ALGORITHM_NAME),

	/** The enum constant for the ML-KEM-512 post-quantum key encapsulation algorithm. */
	ML_KEM_512(KeyPairGeneratorAlgorithm.ML_KEM_512_ALGORITHM_NAME),

	/** The enum constant for the ML-KEM-768 post-quantum key encapsulation algorithm. */
	ML_KEM_768(KeyPairGeneratorAlgorithm.ML_KEM_768_ALGORITHM_NAME),

	/** The enum constant for the ML-KEM-1024 post-quantum key encapsulation algorithm. */
	ML_KEM_1024(KeyPairGeneratorAlgorithm.ML_KEM_1024_ALGORITHM_NAME),

	/** The enum constant for the ML-DSA-44 post-quantum signature algorithm. */
	ML_DSA_44(KeyPairGeneratorAlgorithm.ML_DSA_44_ALGORITHM_NAME),

	/** The enum constant for the ML-DSA-65 post-quantum signature algorithm. */
	ML_DSA_65(KeyPairGeneratorAlgorithm.ML_DSA_65_ALGORITHM_NAME),

	/** The enum constant for the ML-DSA-87 post-quantum signature algorithm. */
	ML_DSA_87(KeyPairGeneratorAlgorithm.ML_DSA_87_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHA2-128S post-quantum signature algorithm. */
	SLH_DSA_SHA2_128S(KeyPairGeneratorAlgorithm.SLH_DSA_SHA2_128S_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHA2-128F post-quantum signature algorithm. */
	SLH_DSA_SHA2_128F(KeyPairGeneratorAlgorithm.SLH_DSA_SHA2_128F_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHA2-192S post-quantum signature algorithm. */
	SLH_DSA_SHA2_192S(KeyPairGeneratorAlgorithm.SLH_DSA_SHA2_192S_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHA2-192F post-quantum signature algorithm. */
	SLH_DSA_SHA2_192F(KeyPairGeneratorAlgorithm.SLH_DSA_SHA2_192F_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHA2-256S post-quantum signature algorithm. */
	SLH_DSA_SHA2_256S(KeyPairGeneratorAlgorithm.SLH_DSA_SHA2_256S_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHA2-256F post-quantum signature algorithm. */
	SLH_DSA_SHA2_256F(KeyPairGeneratorAlgorithm.SLH_DSA_SHA2_256F_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHAKE-128S post-quantum signature algorithm. */
	SLH_DSA_SHAKE_128S(KeyPairGeneratorAlgorithm.SLH_DSA_SHAKE_128S_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHAKE-128F post-quantum signature algorithm. */
	SLH_DSA_SHAKE_128F(KeyPairGeneratorAlgorithm.SLH_DSA_SHAKE_128F_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHAKE-192S post-quantum signature algorithm. */
	SLH_DSA_SHAKE_192S(KeyPairGeneratorAlgorithm.SLH_DSA_SHAKE_192S_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHAKE-192F post-quantum signature algorithm. */
	SLH_DSA_SHAKE_192F(KeyPairGeneratorAlgorithm.SLH_DSA_SHAKE_192F_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHAKE-256S post-quantum signature algorithm. */
	SLH_DSA_SHAKE_256S(KeyPairGeneratorAlgorithm.SLH_DSA_SHAKE_256S_ALGORITHM_NAME),

	/** The enum constant for the SLH-DSA-SHAKE-256F post-quantum signature algorithm. */
	SLH_DSA_SHAKE_256F(KeyPairGeneratorAlgorithm.SLH_DSA_SHAKE_256F_ALGORITHM_NAME),

	/** The enum constant 'UNKNOWN' if the keypair generator algorithm is unknown */
	UNKNOWN(Algorithm.UNKNOWN_ALGORITHM_NAME);

	/** The string constant DIFFIE_HELLMAN_ALGORITHM_NAME for the 'DiffieHellman' algorithm */
	public static final String DIFFIE_HELLMAN_ALGORITHM_NAME = "DiffieHellman";

	/**
	 * The string constant DH_ALGORITHM_NAME is the name of the algorithm for the 'DH' and is a
	 * shortcut for 'DiffieHellman' algorithm
	 */
	public static final String DH_ALGORITHM_NAME = "DH";

	/**
	 * The string constant XDH_ALGORITHM_NAME is the name of the algorithm for generate keypairs for
	 * Diffie-Hellman key agreement with elliptic curves as defined in RFC 7748
	 */
	public static final String XDH_ALGORITHM_NAME = "XDH";

	/**
	 * The string constant X25519_ALGORITHM_NAME is the name of the algorithm for generate keypairs
	 * for Diffie-Hellman key agreement with Curve25519 as defined in RFC 7748
	 */
	public static final String X25519_ALGORITHM_NAME = "X25519";

	/**
	 * The string constant X448_ALGORITHM_NAME is the name of the algorithm for generate keypairs
	 * for Diffie-Hellman key agreement with Curve448 as defined in RFC 7748
	 */
	public static final String X448_ALGORITHM_NAME = "X448";

	/**
	 * The string constant ED25519_ALGORITHM_NAME is the name of the algorithm for generate keypairs
	 * for the Edwards-Curve Digital Signature Algorithm (EdDSA) with Curve25519 as defined in RFC
	 * 8032
	 */
	public static final String ED25519_ALGORITHM_NAME = "Ed25519";

	/**
	 * The string constant ED448_ALGORITHM_NAME is the name of the algorithm for generate keypairs
	 * for the Edwards-Curve Digital Signature Algorithm (EdDSA) with Curve448 as defined in RFC
	 * 8032
	 */
	public static final String ED448_ALGORITHM_NAME = "Ed448";

	/**
	 * The string constant ML_KEM_512_ALGORITHM_NAME is the name of the NIST-standardized (FIPS 203)
	 * post-quantum key encapsulation algorithm ML-KEM at security level 1 (comparable to AES-128)
	 */
	public static final String ML_KEM_512_ALGORITHM_NAME = "ML-KEM-512";

	/**
	 * The string constant ML_KEM_768_ALGORITHM_NAME is the name of the NIST-standardized (FIPS 203)
	 * post-quantum key encapsulation algorithm ML-KEM at security level 3 (comparable to AES-192)
	 */
	public static final String ML_KEM_768_ALGORITHM_NAME = "ML-KEM-768";

	/**
	 * The string constant ML_KEM_1024_ALGORITHM_NAME is the name of the NIST-standardized (FIPS
	 * 203) post-quantum key encapsulation algorithm ML-KEM at security level 5 (comparable to
	 * AES-256)
	 */
	public static final String ML_KEM_1024_ALGORITHM_NAME = "ML-KEM-1024";

	/**
	 * The string constant ML_DSA_44_ALGORITHM_NAME is the name of the NIST-standardized (FIPS 204)
	 * post-quantum signature algorithm ML-DSA at security level 2
	 */
	public static final String ML_DSA_44_ALGORITHM_NAME = "ML-DSA-44";

	/**
	 * The string constant ML_DSA_65_ALGORITHM_NAME is the name of the NIST-standardized (FIPS 204)
	 * post-quantum signature algorithm ML-DSA at security level 3
	 */
	public static final String ML_DSA_65_ALGORITHM_NAME = "ML-DSA-65";

	/**
	 * The string constant ML_DSA_87_ALGORITHM_NAME is the name of the NIST-standardized (FIPS 204)
	 * post-quantum signature algorithm ML-DSA at security level 5
	 */
	public static final String ML_DSA_87_ALGORITHM_NAME = "ML-DSA-87";

	/**
	 * The string constant SLH_DSA_SHA2_128S_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHA2 variant, security level
	 * 1, small-signature/slower parameter set
	 */
	public static final String SLH_DSA_SHA2_128S_ALGORITHM_NAME = "SLH-DSA-SHA2-128S";

	/**
	 * The string constant SLH_DSA_SHA2_128F_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHA2 variant, security level
	 * 1, fast/larger-signature parameter set
	 */
	public static final String SLH_DSA_SHA2_128F_ALGORITHM_NAME = "SLH-DSA-SHA2-128F";

	/**
	 * The string constant SLH_DSA_SHA2_192S_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHA2 variant, security level
	 * 3, small-signature/slower parameter set
	 */
	public static final String SLH_DSA_SHA2_192S_ALGORITHM_NAME = "SLH-DSA-SHA2-192S";

	/**
	 * The string constant SLH_DSA_SHA2_192F_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHA2 variant, security level
	 * 3, fast/larger-signature parameter set
	 */
	public static final String SLH_DSA_SHA2_192F_ALGORITHM_NAME = "SLH-DSA-SHA2-192F";

	/**
	 * The string constant SLH_DSA_SHA2_256S_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHA2 variant, security level
	 * 5, small-signature/slower parameter set
	 */
	public static final String SLH_DSA_SHA2_256S_ALGORITHM_NAME = "SLH-DSA-SHA2-256S";

	/**
	 * The string constant SLH_DSA_SHA2_256F_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHA2 variant, security level
	 * 5, fast/larger-signature parameter set
	 */
	public static final String SLH_DSA_SHA2_256F_ALGORITHM_NAME = "SLH-DSA-SHA2-256F";

	/**
	 * The string constant SLH_DSA_SHAKE_128S_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHAKE variant, security level
	 * 1, small-signature/slower parameter set
	 */
	public static final String SLH_DSA_SHAKE_128S_ALGORITHM_NAME = "SLH-DSA-SHAKE-128S";

	/**
	 * The string constant SLH_DSA_SHAKE_128F_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHAKE variant, security level
	 * 1, fast/larger-signature parameter set
	 */
	public static final String SLH_DSA_SHAKE_128F_ALGORITHM_NAME = "SLH-DSA-SHAKE-128F";

	/**
	 * The string constant SLH_DSA_SHAKE_192S_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHAKE variant, security level
	 * 3, small-signature/slower parameter set
	 */
	public static final String SLH_DSA_SHAKE_192S_ALGORITHM_NAME = "SLH-DSA-SHAKE-192S";

	/**
	 * The string constant SLH_DSA_SHAKE_192F_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHAKE variant, security level
	 * 3, fast/larger-signature parameter set
	 */
	public static final String SLH_DSA_SHAKE_192F_ALGORITHM_NAME = "SLH-DSA-SHAKE-192F";

	/**
	 * The string constant SLH_DSA_SHAKE_256S_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHAKE variant, security level
	 * 5, small-signature/slower parameter set
	 */
	public static final String SLH_DSA_SHAKE_256S_ALGORITHM_NAME = "SLH-DSA-SHAKE-256S";

	/**
	 * The string constant SLH_DSA_SHAKE_256F_ALGORITHM_NAME is the name of the NIST-standardized
	 * (FIPS 205) hash-based post-quantum signature algorithm SLH-DSA, SHAKE variant, security level
	 * 5, fast/larger-signature parameter set
	 */
	public static final String SLH_DSA_SHAKE_256F_ALGORITHM_NAME = "SLH-DSA-SHAKE-256F";

	/** The string constant DSA_ALGORITHM_NAME */
	public static final String DSA_ALGORITHM_NAME = "DSA";

	/** The string constant EC_ALGORITHM_NAME */
	public static final String EC_ALGORITHM_NAME = "EC";

	/** The string constant RSA_ALGORITHM_NAME */
	public static final String RSA_ALGORITHM_NAME = "RSA";

	/** The string constant RSAASSA_PSS_ALGORITHM_NAME */
	public static final String RSASSA_PSS_ALGORITHM_NAME = RSA_ALGORITHM_NAME + "SSA-PSS";

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link KeyPairGeneratorAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	KeyPairGeneratorAlgorithm(final String algorithm)
	{
		this.algorithm = algorithm;
	}

	/**
	 * Transforms the given algorithm to the corresponding {@link KeyPairGeneratorAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm
	 * @return the {@link KeyPairGeneratorAlgorithm} object or null if not found
	 */
	public static KeyPairGeneratorAlgorithm toKeyPairGeneratorAlgorithm(final String algorithm)
	{
		return Arrays.stream(KeyPairGeneratorAlgorithm.values())
			.filter(algorithmType -> algorithmType.getAlgorithm().equals(algorithm)).findFirst()
			.orElse(KeyPairGeneratorAlgorithm.UNKNOWN);
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
