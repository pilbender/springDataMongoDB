# springDataMongoDB #

Super basic example project using SpringData to access a MongoDB backend.

### What is this repository for? ###

* Super simple, minimal set up to connect a Java application to Mongo
* Uses a proper logger to output the progress and messages
* Deletes the collection when it is done so your Mongo store will not fill up
* Uses the Maven Assembly plugin so the resulting jar can simply be run with:
java -jar springDataMongoDB-1.0-SNAPSHOT-jar-with-dependencies.jar

### How do I get set up? ###

* You must have Maven, Java, and Mongo installed
* Clone the repository
* Issue a build: mvn clean install
* java -jar springDataMongoDB-1.0-SNAPSHOT-jar-with-dependencies.jar
