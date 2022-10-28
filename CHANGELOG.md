## Change log
----------------------

Version 8.5-SNAPSHOT
-------------



Version 8.4
-------------

CHANGED:

- update of gradle plugin dependency com.github.ben-manes.versions.gradle.plugin to new minor version 0.43.0
- update of gradle-plugin dependency 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.11.0
- update of test dependency junit-jupiter-api to new version 5.9.1
- update of test dependency silly-collection to new version to 20.1
- removed unsupported algorithm MD4 from the enum ChecksumAlgorithm

Version 8.3
-------------

CHANGED:

- rename of main package 'io.github.astrapi69.crypto.*' to new 'io.github.astrapi69.crypt.api.*'
- update of module-info.java file to the new package

Version 8.2
-------------

ADDED:

- new enum class ChecksumAlgorithm for possible checksum algorithms

CHANGED:

- update gradle to new version 7.5.1
- update of gradle-plugin dependency 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.9.0
- update of test dependency junit-jupiter-api to new version 5.9.0

Version 8.1
-------------

ADDED:

- new enum class KeyStringEntry that holds prefixes for PEM value entries

CHANGED:

- export all packages in module-info.java file
- rename of all packages that was in plural form to singular form

Version 8
-------------

ADDED:

- new module-info.java file

CHANGED:

- update of jdk to version 11
- update gradle to new version 7.5
- update of gradle-plugin dependency 'org.ajoberstar.grgit:grgit-gradle' in version 5.0.0
- update of gradle-plugin dependency 'com.diffplug.spotless:spotless-plugin-gradle' in version 6.8.0
- update of test dependency junit-jupiter-api to new version 5.9.0-RC1
- update of test dependency silly-collections to new version to 18.2
- removed deprecated DSA field in enum KeystoreType

Version 7.7
-------------

ADDED:

- improve gradle build performance by adding new gradle parameters for caching, parallel, configure on demand and file watch
- new test dependency junit-jupiter-api in new minor version 5.8.2
- new enum PemType

CHANGED:

- update gradle to new version 7.3.3
- update of gradle plugin dependency com.github.ben-manes.versions.gradle.plugin to new minor version 0.42.0
- update of test dependency silly-collections to new major version 18
- removed test dependency testng
- removed test dependency meanbean

Version 7.6.1
-------------

CHANGED:

- update gradle to new version 7.2

Version 7.6
-------------

ADDED:

- new KeyFactory algorithm 'RSASSA-PSS' added to the enum KeyPairGeneratorAlgorithm
- new unit tests created for verify the values of the enums
- new field UNKNOWN in enum class KeyFileFormat for unknown file formats

CHANGED:

- update gradle to new version 7.1
- changed all test dependencies from groupid de.alpharogroup to new groupid io.github.astrapi69
- update gradle-plugin dependency of gradle.plugin.com.hierynomus.gradle.plugins:license-gradle-plugin to new version 0.16.1
- update of test dependency silly-collections to new version to 8.7

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
