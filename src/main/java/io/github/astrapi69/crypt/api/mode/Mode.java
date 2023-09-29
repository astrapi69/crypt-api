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
package io.github.astrapi69.crypt.api.mode;

/**
 * The enum {@link Mode} defines the names that can be specified as the mode component in a <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/api/javax/crypto/Cipher.html">transformation</a>
 * when requesting an instance of Cipher.
 *
 * For more info see: <a href=
 * "https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#cipher-algorithm-modes">
 * https://docs.oracle.com/en/java/javase/11/docs/specs/security/standard-names.html#cipher-algorithm-modes</a>
 */
public enum Mode
{

	/** The BC mode that represents the Block Chaining Mode */
	BC,

	/**
	 * The CBC operation mode that represents the Cipher Block Chaining Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/fips/fips81/fips81.htm">FIPS PUB 81</a>.
	 *
	 * Using modes such as CFB and OFB, block ciphers can encrypt data in units smaller than the
	 * cipher’s actual block size. When requesting such a mode, you may optionally specify the
	 * number of bits to be processed at a time by appending this number to the mode name as shown
	 * in the “DES/CFB8/NoPadding” and “DES/OFB32/PKCS5Padding” transformations. If no such number
	 * is specified, a provider-specific default is used. (For example, the SunJCE provider uses a
	 * default of 64 bits for DES.) Thus, block ciphers can be turned into byte-oriented stream
	 * ciphers by using an 8-bit mode such as CFB8 or OFB8.
	 */
	CBC,

	/**
	 * The CCM operation mode that represents the Counter/CBC Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/nistpubs/800-38D/SP-800-38D.pdf">NIST Special
	 * Publication SP 800-38D</a>
	 */
	CCM,

	/**
	 * The CFB operation mode that represents the Cipher Block Feedback Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/fips/fips81/fips81.htm">FIPS PUB 81</a>
	 */
	CFB,

	/**
	 * The CFBx operation mode that represents the Cipher Block Feedback Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/fips/fips81/fips81.htm">FIPS PUB 81</a>
	 */
	CFBx,

	/**
	 * The CTR operation mode that represents a simplification of OFB, Counter mode updates the
	 * input block as a counter.
	 */
	CTR,

	/**
	 * The CTS operation mode that represents the Cipher Text Stealing, as described in Bruce
	 * Schneier’s book Applied Cryptography-Second Edition, John Wiley and Sons, 1996
	 */
	CTS,

	/**
	 * The ECB operation mode that represents the Electronic Codebook Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/fips/fips81/fips81.htm">FIPS PUB 81</a>
	 * (generally this mode should not be used for multiple blocks of data).
	 */
	ECB,

	/**
	 * The GCM operation mode that represents the Galois/Counter Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/nistpubs/800-38D/SP-800-38D.pdf">NIST Special
	 * Publication SP 800-38D</a>
	 */
	GCM,

	/**
	 * The OFB operation mode that represents the Output Feedback Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/fips/fips81/fips81.htm">FIPS PUB 81</a>
	 *
	 * Using modes such as CFB and OFB, block ciphers can encrypt data in units smaller than the
	 * cipher’s actual block size. When requesting such a mode, you may optionally specify the
	 * number of bits to be processed at a time by appending this number to the mode name as shown
	 * in the “DES/CFB8/NoPadding” and “DES/OFB32/PKCS5Padding” transformations. If no such number
	 * is specified, a provider-specific default is used. (For example, the SunJCE provider uses a
	 * default of 64 bits for DES.) Thus, block ciphers can be turned into byte-oriented stream
	 * ciphers by using an 8-bit mode such as CFB8 or OFB8.
	 */
	OFB,

	/**
	 * The OFBx operation mode that represents the Output Feedback Mode, as defined in
	 * <a href="https://csrc.nist.gov/publications/fips/fips81/fips81.htm">FIPS PUB 81</a>
	 *
	 * Using modes such as CFB and OFB, block ciphers can encrypt data in units smaller than the
	 * cipher’s actual block size. When requesting such a mode, you may optionally specify the
	 * number of bits to be processed at a time by appending this number to the mode name as shown
	 * in the “DES/CFB8/NoPadding” and “DES/OFB32/PKCS5Padding” transformations. If no such number
	 * is specified, a provider-specific default is used. (For example, the SunJCE provider uses a
	 * default of 64 bits for DES.) Thus, block ciphers can be turned into byte-oriented stream
	 * ciphers by using an 8-bit mode such as CFB8 or OFB8.
	 */
	OFBx,

	/**
	 * The PCBC operation mode that represents the Propagating Cipher Block Chaining Mode, as
	 * defined in <a href="https://csrc.nist.gov/publications/fips/fips81/fips81.htm">FIPS PUB
	 * 81</a>
	 */
	PCBC,

	/** The enum constant 'UNKNOWN' if the mode is unknown */
	UNKNOWN
}
