FROM openjdk:17-jdk-alpine
LABEL authors="Jay"
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 9191
ENTRYPOINT [ "java", "-jar", "app.jar"]
