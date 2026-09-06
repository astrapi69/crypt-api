# Security Policy

`crypt-api` is the bottom of the `crypt-api` / `crypt-data` / `mystic-crypt`
family: interfaces, enums and constants that name cryptographic algorithms,
modes, key formats and key sizes. Of its 89 source files, 48 are enums and 24
are interfaces; only a handful carry any logic at all.

That shapes what a vulnerability here looks like. This library cannot encrypt
anything wrongly, because it does not encrypt. What it can do is lead a consumer
to a weaker choice than the one they believed they were making - and every
consumer of the family inherits that.

## Supported Versions

Only the current minor line receives security fixes. This is a
single-maintainer project, and supporting several lines at once is a promise it
could not keep.

| Version | Supported          | Required JDK |
|---------|--------------------|--------------|
| 10.x    | :white_check_mark: | 25 and above |
| 9.x     | :x:                | 17 and above |
| < 9     | :x:                |              |

The current release is **10.1**. If you are on an older line, the fix for a
reported vulnerability will be an upgrade to the current one rather than a
backport.

## Reporting a Vulnerability

**Do not open a public issue.** Use GitHub's private vulnerability reporting,
which is enabled on this repository:

[Report a vulnerability](https://github.com/astrapi69/crypt-api/security/advisories/new)

That keeps the report between you and the maintainer until a fix exists, and it
creates the draft advisory a CVE can later be issued from.

Please include, as far as you can:

- the version you found it in, and whether the current release is affected
- which constant, enum or interface is involved
- what a consumer ends up doing because of it, since this library is only ever
  the reason a caller made a choice, never the code that acted on it
- a way to reproduce it: a failing test is ideal, since this project fixes bugs
  test-first and yours would become the regression guard

### What happens next

This is a spare-time project, so no response time is promised that could not be
met. What is promised instead:

- a reply acknowledging the report, and whether it is reproducible
- if it is: a fix on the current line, a release, and an advisory crediting you
  unless you prefer otherwise
- if it is not, or it turns out to be intended behaviour: an explanation of why,
  rather than silence

## What is in scope, and what only looks like it

Two things in this repository regularly look like findings and are not. Knowing
which is which before writing a report saves us both the round trip.

### Naming a weak algorithm is not endorsing it

This library names `DES`, `MD5`, `MD2`, `RC2`, `RC4`, `SHA1`, `ECB` and
`PKCS1Padding`, among others. An API whose job is to name JCA algorithms has to
be able to name the ones that already exist in the world - a consumer decrypting
data written twenty years ago needs the name for it.

None of them is offered as a default or a recommendation, and the smallest key
size this library declares at all is `KEYSIZE_1024`. A report that this library
"supports MD5" is not a finding. A report that a constant is **reachable as a
default**, or that an enum's name and its value disagree so that asking for one
algorithm yields another, very much is.

### The legacy constants in `CompoundAlgorithm` are known

`ITERATIONCOUNT = 19`, `PASSWORD = "privatetopsecret"`, `PRIVATE_KEY` (deprecated)
and a fixed eight-byte `SALT` are public constants in this library, and they are
exactly as bad as they look: a publicly known password, a salt identical for
every installation, and an iteration count that provides no key stretching.

They are documented as such in their own javadoc, in those words, and are
retained only so that data encrypted before that warning was written can still
be decrypted by passing them explicitly. **This is a known, documented hazard
rather than an open report.** What would be worth reporting is somewhere in the
family that still uses one of them implicitly, rather than requiring the caller
to pass it.

## What belongs elsewhere

This library implements no cryptography. A flaw in a primitive belongs to
whoever implements it - the JDK at
<https://openjdk.org/groups/vulnerability/report>, Bouncy Castle at
<https://github.com/bcgit/bc-java/security/policy>. A flaw in how a primitive is
*used* belongs to the library that uses it: `crypt-data` for key and certificate
handling, `mystic-crypt` for encryption, signing and the command line tool. Both
have their own reporting paths in their repositories.

## What this project already does

So that a report can start from what is known rather than from zero:

- **CodeQL** runs on every push and pull request to `master` and `develop`, plus
  weekly.
- **Dependabot security updates** are enabled.
- Test key material is generated at test runtime and never committed, so nothing
  in this repository is a real key.
- The test suite covers 100% of lines and branches and kills every mutant PIT
  generates - measured on `RELEASE-10.1` and recorded, with the commit it was
  measured on, in the family's canonical table at
  [mystic-crypt/docs/TESTING.md](https://github.com/astrapi69/mystic-crypt/blob/develop/docs/TESTING.md).
