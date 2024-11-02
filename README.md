# All TP OOS system

This project consists of renting cars

The aim of this tp is to get to grips with a complete backend. To do this we have 4 parts:
- Rest
- Database
- Grpc
- Test

## Requirements

Java 17.

## TP1 REST

[`file`](myServiceClient/src/main/java/com/example/myServiceClient/web/WebService.java)
<br>
This is in the paths that the user can access and they are detailed below:

- get http://localhost:8081/ "hello world"
- get http://localhost:8081/cars "take all cars"
- get http://localhost:8081/cars/{id} "find car with plate number"
- put http://localhost:8081/cars/{id}?rent=true "Change the rent of a car"

errors are processed in the logs with errors or warnings depending




## TP2 Database

[`file`](myServiceServer/src/main/java/com/example/myServiceServer/data/CarJPA.java)
<br>
all data is stored in memory in an H2 database.
access : http://localhost:8082/h2-console/
<br>
url : `jdbc:h2:mem:testdb`
<br>
name : sa

## TP3 GRPC

[`folder`](myServiceServer/src/main/java/com/example/myServiceServer)
<br>
So it's the whole Grpc part that's linked to the database and it's on port 9090.

## TP4 Test

[`file 1`](myServiceClient/src/test/java/com/example/myServiceClient/data/MyCarTest.java)
<br>
[`file 2`](myServiceClient/src/test/java/com/example/myServiceClient/web/WebServiceTest.java)
<br>
[`file 3`](myServiceServer/src/test/java/com/example/myServiceServer/CarJPATest.java)
<br>

The 3 test files are referenced and the results can be found once the build is complete in `./build/reports/tests/test/index.html`

## Build the whole project

In the root folder (gRPCSpring): 
```
./gradlew build
```

## Launch the server side
In the server folder (myServiceServer):
```
java -jar build/libs/myServiceServer-0.0.1-SNAPSHOT.jar
```

## Launch the client side
In the client folder (myServiceClient):
```
java -jar build/libs/myServiceClient-0.0.1-SNAPSHOT.jar
```

