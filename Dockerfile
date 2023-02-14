FROM openjdk:11

ENV POSTGRES_USER=postgres \
    POSTGRES_PASSWORD=postgres

EXPOSE 8080

RUN mkdir -p /app

COPY build/libs/dockerized-app-0.0.1-SNAPSHOT.jar /app/dockerized-app.jar

ENTRYPOINT ["java", "-jar", "/app/dockerized-app.jar"]