# Get the opendk docker image
FROM openjdk:8-jdk-alpine

# Set the jar file location
ARG JAR_FILE=target/hibernate_demo-0.0.1-SNAPSHOT.jar

# Mark the working directory
WORKDIR /usr/local/runme

# Rename jar file to app.jar
COPY ${JAR_FILE} app.jar

# Execute the app.jar
ENTRYPOINT ["java","-jar","app.jar"]