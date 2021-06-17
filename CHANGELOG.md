## Change log
----------------------

Version 7.6-SNAPSHOT
-------------

Version 7.5
-------------

ADDED:

- new interface Passwordable that can be implemented from classes that want to encrypt or decrypt with a password
- new algorithm 'AES/CBC/PKCS5Padding' in the enum KeyPairWithModeAndPaddingAlgorithm

CHANGED:

- downgrade gradle to version 6.9
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.39.0

Version 7.4
-------------

ADDED:
 
- new compound algorithm 'SHA1withRSA', 'SHA256withRSA', 'SHA384withRSA' and 'SHA512withRSA', to enum CompoundAlgorithm
- new hash algorithm 'SHA224' to enum HashAlgorithm
- new field data in interface IBlock created

CHANGED:

- changed to new package io.github.astrapi69
- update gradle to new version 7.0.2
- extracted project properties to gradle.properties

Version 7.3
-------------

ADDED:
 
- new build system gradle

CHANGED:

- removed maven build system and all related files
- removed all lombok dependent imports

Version 7.2
-------------

ADDED:

- new value NONE to Operation enum

CHANGED

- removed value TITLE_CASE from Operation enum

Version 7.1
-------------

ADDED:

- new interface for encrypt an generic java object to a File object
- new interface for decrypt an encrypted {@link File} object that was previously encrypted and return the decrypted result as generic object

Version 7
-------------

ADDED:

- this changelog file
- moved crypt-api to this project
