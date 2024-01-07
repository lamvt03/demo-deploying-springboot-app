#Build
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY src ./src
COPY pom.xml .
RUN mvn clean install

#Run
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/demo-1.0.jar ./demo-aws.jar
EXPOSE 8080
CMD ["java", "-jar", "demo-aws.jar"]

