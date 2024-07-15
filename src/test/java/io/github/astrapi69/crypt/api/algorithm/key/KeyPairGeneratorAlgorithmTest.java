package io.github.astrapi69.crypt.api.algorithm.key;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * The unit test class for the enum class {@link KeyPairGeneratorAlgorithm}
 */
public class KeyPairGeneratorAlgorithmTest
{

	/**
	 * Test for concatenated constants.
	 */
	@Test
	public void testGetAlgorithms()
	{
		assertEquals(KeyPairGeneratorAlgorithm.DIFFIE_HELLMAN.getAlgorithm(), "DiffieHellman");
		assertEquals(KeyPairGeneratorAlgorithm.DSA.getAlgorithm(), "DSA");
		assertEquals(KeyPairGeneratorAlgorithm.EC.getAlgorithm(), "EC");
		assertEquals(KeyPairGeneratorAlgorithm.RSA.getAlgorithm(), "RSA");
		assertEquals(KeyPairGeneratorAlgorithm.RSASSA_PSS.getAlgorithm(), "RSASSA-PSS");
	}

	/**
	 * Test all enum constants.
	 */
	@Test
	public void testAllEnumConstants()
	{
		assertEquals(KeyPairGeneratorAlgorithm.DH.getAlgorithm(), "DH");
		assertEquals(KeyPairGeneratorAlgorithm.XDH.getAlgorithm(), "XDH");
		assertEquals(KeyPairGeneratorAlgorithm.X25519.getAlgorithm(), "X25519");
		assertEquals(KeyPairGeneratorAlgorithm.X448.getAlgorithm(), "X448");
		assertEquals(KeyPairGeneratorAlgorithm.UNKNOWN.getAlgorithm(), "UNKNOWN ALGORITHM NAME");
	}

	/**
	 * Test the toKeyPairGeneratorAlgorithm method with valid algorithms.
	 */
	@Test
	public void testToKeyPairGeneratorAlgorithmValid()
	{
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("DiffieHellman"),
			KeyPairGeneratorAlgorithm.DIFFIE_HELLMAN);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("DH"),
			KeyPairGeneratorAlgorithm.DH);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("DSA"),
			KeyPairGeneratorAlgorithm.DSA);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("EC"),
			KeyPairGeneratorAlgorithm.EC);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("RSA"),
			KeyPairGeneratorAlgorithm.RSA);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("RSASSA-PSS"),
			KeyPairGeneratorAlgorithm.RSASSA_PSS);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("XDH"),
			KeyPairGeneratorAlgorithm.XDH);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("X25519"),
			KeyPairGeneratorAlgorithm.X25519);
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("X448"),
			KeyPairGeneratorAlgorithm.X448);
	}

	/**
	 * Test the toKeyPairGeneratorAlgorithm method with an unknown algorithm.
	 */
	@Test
	public void testToKeyPairGeneratorAlgorithmUnknown()
	{
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm("UNKNOWN_ALGO"),
			KeyPairGeneratorAlgorithm.UNKNOWN);
	}

	/**
	 * Test the toKeyPairGeneratorAlgorithm method with a null input.
	 */
	@Test
	public void testToKeyPairGeneratorAlgorithmNull()
	{
		assertEquals(KeyPairGeneratorAlgorithm.toKeyPairGeneratorAlgorithm(null),
			KeyPairGeneratorAlgorithm.UNKNOWN);
	}
}
