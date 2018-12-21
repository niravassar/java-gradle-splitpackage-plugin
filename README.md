## Summary

This demonstrates how to detect split packages across jars using the `gradle-java9c` gradlew plugin.

https://github.com/jonnyzzz/gradle-java9c

This is useful because in Java 9+ with JPMS if apps are modularized, this disallows the same package
 in more than one named modules. Therefore, Grail jars may have to eliminate all split packages. 