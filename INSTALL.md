# Maven test

This is a maven project that contains a simple API rest service to show a message. In order to show examples for add dependencies, profiles, and assembly the project on one jar file.  

## Installation

Use maven to install th with the following command
```bash
mvn clean package
```
Also, we can use profiles   

```bash
mvn clean package -P test
```
```bash
mvn clean package -P prod
```
## Usage
JAR file is generated in target folder, it is executed on the following way 

```bash
java -jar target/MavenTest-1.0-SNAPSHOT-jar-with-dependencies.jar
```
With a rest client or our browser we should go to following endpoint 

GET [http://localhost:3456/entornos](http://localhost:3456/entornos) 

```
En el ambiente PROD
```
The environment will be identified according to profile selected on the package step  

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
