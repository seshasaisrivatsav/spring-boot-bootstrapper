# spring-boot-project
Learn and play with spring boot

## Instructions
Inspired from https://www.baeldung.com/spring-boot-start

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
- To see local running code, go to http://localhost:8081/

### Config in IntelliJ
#### Project Structure
![Screen Shot 2022-01-13 at 3 53 24 PM](https://user-images.githubusercontent.com/19309898/149407867-80099e15-67bb-4ce9-be37-022dfb0c9ba0.png)

#### Intellij config
![Screen Shot 2022-01-13 at 3 53 33 PM](https://user-images.githubusercontent.com/19309898/149407790-cf5e7419-3ebd-481c-94d4-f076ec134958.png)

![Screen Shot 2022-01-13 at 3 53 37 PM](https://user-images.githubusercontent.com/19309898/149407798-b83a722a-0c19-4ea2-b405-8fc8e4adf629.png)







