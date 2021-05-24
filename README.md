# Message Receiver App

## How to run unit tests ?
```
$ mvn clean test
```

## How to compile & run the app ?
```
$ mvn clean package
$ mv target/message-receiver.jar .
$ java -cp message-receiver.jar com.celfocus.qa.cicd.training.Main <your_message>
```