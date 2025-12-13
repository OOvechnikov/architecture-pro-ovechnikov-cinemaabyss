FROM alpine/java:21-jdk AS builder
RUN apk update && apk add gradle
WORKDIR /app
COPY . /app
RUN gradle build

FROM alpine/java:21-jre
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]