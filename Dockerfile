FROM openjdk:18-jdk-slim as server
ARG JAR_FILE=gradle/wrapper/*.jar
COPY ${JAR_FILE} gradle-wrapper.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/gradle-wrapper.jar"]
