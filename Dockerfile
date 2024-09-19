#Build
FROM maven:3.8.8-eclipse-temurin-17-alpine AS builder
WORKDIR /app
COPY src ./src
COPY pom.xml .
RUN mvn clean install

#Run
FROM eclipse-temurin:17.0.9_9-jdk
WORKDIR /app
COPY --from=builder /app/target/demo-1.0.jar ./demo.jar
EXPOSE 8080
CMD ["java", "-jar", "demo.jar"]
