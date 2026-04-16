FROM openjdk:17
WORKDIR /app
COPY target/hotel-booking-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
