#
#Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build

WORKDIR /usr/src/app

COPY . .

RUN mvn package

#
#Package stage
#
FROM openjdk:8-jre

WORKDIR /usr/src/app

COPY --from=build /usr/src/app/target/postgre-0.0.1-SNAPSHOT.jar /usr/src/app/app.jar

EXPOSE 8080

ENTRYPOINT java -jar app.jar