package de.alpharogroup.crypto.api;

import java.io.File;

/**
 * The interface {@link GenericObjectEncryptor} can encrypt a generic object and return the encrypted
 * result as {@link File} object
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public interface GenericObjectEncryptor<T> extends Encryptor<T, File>
{
}