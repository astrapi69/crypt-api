package io.github.astrapi69.crypt.api.algorithm.key;

import io.github.astrapi69.crypt.api.algorithm.Algorithm;

/**
 * The enum {@link SECGCurveAlgorithm} provides the elliptic curve algorithms defined by the
 * Standards for Efficient Cryptography Group (SECG). The enum {@link SECGCurveAlgorithm} refers to
 * a specific elliptic curve used in cryptography, particularly in elliptic curve cryptography
 * (ECC). This curve is defined as part of a suite of curves by the Standards for Efficient
 * Cryptography Group (SECG) and is also known by other names such as P-256 or prime256v1.
 *
 * <p>
 * It is used in various cryptographic operations such as key pair generation, digital signatures,
 * and key exchange algorithms. This enum can be utilized in classes that deal with cryptographic
 * services, particularly those involving elliptic curve cryptography.
 * </p>
 *
 * <p>
 * Example usage:
 * 
 * <pre>
 * {@code
 * import io.github.astrapi69.crypt.api.algorithm.key.SECGCurveAlgorithm;
 *
 * public class KeyPairGeneratorExample {
 *     public void generateKeyPair() {
 *         SECGCurveAlgorithm curve = SECGCurveAlgorithm.SECP256R1;
 *         // Use curve.getAlgorithm() to get the curve name
 *         // and perform cryptographic operations
 *     }
 * }
 * }
 * </pre>
 *
 * <p>
 * Classes that might use this enum include:
 * <ul>
 * <li>Cryptographic Key Pair Generators</li>
 * <li>Digital Signature Generators and Verifiers</li>
 * <li>Key Agreement Protocols</li>
 * </ul>
 */
public enum SECGCurveAlgorithm implements Algorithm
{

	/** The SECP112R1 elliptic curve algorithm. */
	SECP112R1(SECGCurveAlgorithm.SECP112R1_VALUE),

	/** The SECP112R2 elliptic curve algorithm. */
	SECP112R2(SECGCurveAlgorithm.SECP112R2_VALUE),

	/** The SECP128R1 elliptic curve algorithm. */
	SECP128R1(SECGCurveAlgorithm.SECP128R1_VALUE),

	/** The SECP128R2 elliptic curve algorithm. */
	SECP128R2(SECGCurveAlgorithm.SECP128R2_VALUE),

	/** The SECP160K1 elliptic curve algorithm. */
	SECP160K1(SECGCurveAlgorithm.SECP160K1_VALUE),

	/** The SECP160R1 elliptic curve algorithm. */
	SECP160R1(SECGCurveAlgorithm.SECP160R1_VALUE),

	/** The SECP160R2 elliptic curve algorithm. */
	SECP160R2(SECGCurveAlgorithm.SECP160R2_VALUE),

	/** The SECP192K1 elliptic curve algorithm. */
	SECP192K1(SECGCurveAlgorithm.SECP192K1_VALUE),

	/** The SECP192R1 elliptic curve algorithm. */
	SECP192R1(SECGCurveAlgorithm.SECP192R1_VALUE),

	/** The SECP224K1 elliptic curve algorithm. */
	SECP224K1(SECGCurveAlgorithm.SECP224K1_VALUE),

	/** The SECP224R1 elliptic curve algorithm. */
	SECP224R1(SECGCurveAlgorithm.SECP224R1_VALUE),

	/** The SECP256K1 elliptic curve algorithm. */
	SECP256K1(SECGCurveAlgorithm.SECP256K1_VALUE),

	/** The SECP256R1 elliptic curve algorithm. */
	SECP256R1(SECGCurveAlgorithm.SECP256R1_VALUE),

	/** The SECP384R1 elliptic curve algorithm. */
	SECP384R1(SECGCurveAlgorithm.SECP384R1_VALUE),

	/** The SECP521R1 elliptic curve algorithm. */
	SECP521R1(SECGCurveAlgorithm.SECP521R1_VALUE);

	/** The string constant SECP112R1 that is used as the name. */
	public static final String SECP112R1_VALUE = "secp112r1";

	/** The string constant SECP112R2 that is used as the name. */
	public static final String SECP112R2_VALUE = "secp112r2";

	/** The string constant SECP128R1 that is used as the name. */
	public static final String SECP128R1_VALUE = "secp128r1";

	/** The string constant SECP128R2 that is used as the name. */
	public static final String SECP128R2_VALUE = "secp128r2";

	/** The string constant SECP160K1 that is used as the name. */
	public static final String SECP160K1_VALUE = "secp160k1";

	/** The string constant SECP160R1 that is used as the name. */
	public static final String SECP160R1_VALUE = "secp160r1";

	/** The string constant SECP160R2 that is used as the name. */
	public static final String SECP160R2_VALUE = "secp160r2";

	/** The string constant SECP192K1 that is used as the name. */
	public static final String SECP192K1_VALUE = "secp192k1";

	/** The string constant SECP192R1 that is used as the name. */
	public static final String SECP192R1_VALUE = "secp192r1";

	/** The string constant SECP224K1 that is used as the name. */
	public static final String SECP224K1_VALUE = "secp224k1";

	/** The string constant SECP224R1 that is used as the name. */
	public static final String SECP224R1_VALUE = "secp224r1";

	/** The string constant SECP256K1 that is used as the name. */
	public static final String SECP256K1_VALUE = "secp256k1";

	/** The string constant SECP256R1 that is used as the name. */
	public static final String SECP256R1_VALUE = "secp256r1";

	/** The string constant SECP384R1 that is used as the name. */
	public static final String SECP384R1_VALUE = "secp384r1";

	/** The string constant SECP521R1 that is used as the name. */
	public static final String SECP521R1_VALUE = "secp521r1";

	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link SECGCurveAlgorithm} object
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	SECGCurveAlgorithm(String algorithm)
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
