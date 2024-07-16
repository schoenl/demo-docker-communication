FROM eclipse-temurin:21.0.3_9-jdk-alpine

LABEL authors="schoenl"

RUN addgroup -S app && adduser -S app -G app

USER app

WORKDIR /app

COPY target/*.jar app.jar

#EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]