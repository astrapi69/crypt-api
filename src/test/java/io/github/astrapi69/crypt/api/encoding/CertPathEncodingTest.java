package io.github.astrapi69.crypt.api.encoding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for {@link CertPathEncoding}.
 */
public class CertPathEncodingTest
{

	/**
	 * Test method for {@link CertPathEncoding#getEncoding()}.
	 */
	@Test
	public void testGetEncoding()
	{
		assertEquals(CertPathEncoding.PKCS7_ENCODING_NAME, CertPathEncoding.PKCS7.getEncoding());
		assertEquals(CertPathEncoding.PKI_PATH_ENCODING_NAME,
			CertPathEncoding.PKI_PATH.getEncoding());
		assertEquals(Encoding.UNKNOWN_ENCODING_NAME, CertPathEncoding.UNKNOWN.getEncoding());
	}

	/**
	 * Test method for enum constants of {@link CertPathEncoding}.
	 */
	@Test
	public void testEnumConstants()
	{
		assertNotNull(CertPathEncoding.valueOf("PKCS7"));
		assertNotNull(CertPathEncoding.valueOf("PKI_PATH"));
		assertNotNull(CertPathEncoding.valueOf("UNKNOWN"));
	}

	/**
	 * Test method for {@link Enum#toString()}.
	 */
	@Test
	public void testToString()
	{
		assertEquals(CertPathEncoding.PKCS7.name(), "PKCS7");
		assertEquals(CertPathEncoding.PKI_PATH.name(), "PKI_PATH");
		assertEquals(CertPathEncoding.UNKNOWN.name(), "UNKNOWN");
	}
}
