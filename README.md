# spring-boot-project
Learn and play with spring boot


## Instructions
https://www.baeldung.com/spring-boot-start

## Running locally
### Setup
1. Make sure you've the JRE 
2. Also make sure $JAVA_HOME is present 
3. Project must be able to speak with java
```
// With IntelliJ
File->Project Structure->Modules ->> Language level to 8 ( my maven project was set to 1.8 java)
File -> Settings -> Build, Execution, Deployment -> Compiler -> Java Compiler -> 8 also there
```
```shell script
source env.sh
mvn clean install
mvn spring-boot:run

```

### Config in IntelliJ






