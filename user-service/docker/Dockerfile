FROM openjdk:17-jdk-alpine
COPY target/docker-message-server-1.0.0.jar user-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/user-service-0.0.1-SNAPSHOT.jar"]