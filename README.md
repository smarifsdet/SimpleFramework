# SimpleFramework
### Test Development Set up

### Getting started with Maven

Maven set up and configuration need to be done by users

#### Ensure Maven Version & Home and Java Version & Environment

```bash

$ mvn -version

$ java -version

```

> Make sure to Set up JAVA_HOME as user variables```$ JAVA_HOME="Path\to\Java\jdk11"```

 

### Set up project in Eclipse

> Import project in Eclipse as a Mavn project.

>dependencies are stored in pom.xml file which we get from the local repository

>POM.xml is the heart of this Selenium project.

>It will store all dependencies inside it that are needed to run the projects.

>dependencies such as Selenium, Java, Cucumber, WebDriver Manager, JUnit etc are needed for this project

>If new dependencies are being added make sure to update the project,

>Go to the Project Folder (in your IDE)

>Right click => Maven => Update project => Select Force Update (For the dependencies to be taken in effect)

>JUnit is used in this project. This project follows BDD framework,It has feature files which will explains about the test in very simple English language.

>It has step definations files which is written in Java programming language.

>It has TestRunner class which is the configuration for the running tests

 

 

### How to run the project

>Right click anywhere on the project and choose "Run as" options and click JUnit TestRunner

 