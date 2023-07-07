package io.github.astrapi69.crypt.api.algorithm;

/**
 * The enum {@link SecretKeyAlgorithm} provides algorithm names that can be specified when
 * requesting an instance of SecretKeyFactory.<br>
 * There are also composed algorithms possible like <br>
 * <br>
 * PBEWith&lt;digest&gt;And&lt;encryption&gt; <br>
 * some examples are: <br>
 * PBEWithMD5AndDES (PKCS #5, PBES1 encryption scheme),<br>
 * PBEWithHmacSHA256AndAES_128 (PKCS #5, PBES2 encryption scheme) <br>
 * <br>
 * or <br>
 * PBEWith&lt;prf&gt;And&lt;encryption&gt; <br>
 * <br>
 * or <br>
 * PBKDF2With&lt;prf&gt; <br>
 * an example is: <br>
 * PBKDF2WithHmacSHA256
 */
public enum SecretKeyAlgorithm implements Algorithm
{
	/** The enum constant for AES algorithm. */
	AES(AesAlgorithm.AES_ALGORITHM_NAME),

	/** The enum constant for ARCFOUR algorithm. */
	ARCFOUR(SecretKeyAlgorithm.ARCFOUR_ALGORITHM_NAME),

	/** The DES algorithm. */
	DES(SunJCEAlgorithm.DES_ALGORITHM_NAME),

	/** The DESede algorithm. */
	DESede(SunJCEAlgorithm.DES_EDE_ALGORITHM_NAME);

	/** The string constant ARCFOUR_ALGORITHM_NAME */
	public static final String ARCFOUR_ALGORITHM_NAME = "ARCFOUR";
	/** The algorithm. */
	private final String algorithm;

	/**
	 * Instantiates a new {@link AesAlgorithm} object.
	 *
	 * @param algorithm
	 *            the algorithm.
	 */
	SecretKeyAlgorithm(final String algorithm)
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
