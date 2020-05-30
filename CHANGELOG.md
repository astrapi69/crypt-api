## Change log
----------------------

Version 7.4-SNAPSHOT
-------------

CHANGED:

- update gradle to new version 6.4.1
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
