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
package io.github.astrapi69.crypt.api.provider;

/**
 * The enum {@link SecurityProvider}
 */
public enum SecurityProvider
{
	/** The BouncyCastle SecurityProvider */
	BC,
	/** The SUN SecurityProvider */
	SUN,
	/** The SunJCE SecurityProvider */
	SunJCE,
	/** The SunRsaSign SecurityProvider */
	SunRsaSign,
	/** The SunEC SecurityProvider */
	SunEC,
	/** The SunJSSE SecurityProvider */
	SunJSSE,
	/** The SunMSCAPI SecurityProvider */
	SunMSCAPI,
	/** The SunPKCS11 SecurityProvider */
	SunPKCS11,
	/** The Apache Shiro SecurityProvider */
	ApacheShiro,
	/** The Cryptix SecurityProvider */
	Cryptix,
	/** The Eclipse Kura SecurityProvider */
	Kura,
	/** The Conscrypt SecurityProvider */
	Conscrypt,
	/** The IBMJCE SecurityProvider */
	IBMJCE,
	/** The IBMJSSE2 SecurityProvider */
	IBMJSSE2,
	/** The IBMJCEFIPS SecurityProvider */
	IBMJCEFIPS,
	/** The Unknown SecurityProvider */
	UNKNOWN;

	/**
	 * Resolves the security provider by name.
	 *
	 * @param name
	 *            the name of the security provider
	 * @return the corresponding {@link SecurityProvider} or {@link #UNKNOWN} if not found
	 */
	public static SecurityProvider fromName(String name)
	{
		for (SecurityProvider provider : values())
		{
			if (provider.name().equalsIgnoreCase(name))
			{
				return provider;
			}
		}
		return UNKNOWN;
	}
}
