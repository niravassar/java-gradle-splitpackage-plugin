## Summary

This demonstrates how to detect split packages across jars using the `gradle-java9c` gradlew plugin.

https://github.com/jonnyzzz/gradle-java9c

This is useful because in Java 9+ with JPMS if apps are modularized, this disallows the same package
 in more than one named modules. Therefore, Grail jars may have to eliminate all split packages. 
 
## Commands

- use `gradlew run` to execute the project
- use `gradlew java9c` to run the utility which will find split packages. This should be printed

```
Package 'parser.xml' is declared in
     - core-parser.jar
     - fast-parser.jar
```

The project can be modularized and compiled with a module-path. When this occurs Java module rules 
will prevent this from occurring due to split packages in the automatically named modules (derived from the jars).

This project was based off of the below example post:

https://www.logicbig.com/tutorials/core-java-tutorial/modules/split-packages-between-automatic-modules.html