# hello-world-vaadin-springboot

This repo contains a demo to execute Vaadin Flow with Spring Boot using the Gradle tool. It is based in part on https://vaadin.com/docs/v12/flow/spring/tutorial-spring-basic.html


## Build the project

Lets assemble this project using the dependencies defined in the build.gradle file.

```
gradlew.bat build
```

Create an executable jar file containing the main classes and their dependencies.

```
gradlew.bat clean bootJar
```

Navigate to the jar file that was generated in the compiling process.

```
cd \build\libs
```

That's it, you can run spring boot using the next command and you should be able to see "Hello world! I'm using Vaadin and Spring boot" message in http://localhost:8080/

```
java -jar hello-world-vaadin-springboot-0.0.1.jar
```

## License

The project is released as open source under the [The MIT License](https://opensource.org/licenses/MIT)
