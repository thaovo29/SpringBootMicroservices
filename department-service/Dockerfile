# Use an official JDK runtime as a parent image
FROM eclipse-temurin:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/department-service-0.0.1-SNAPSHOT.jar department-service.jar

# Expose port 8082
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "department-service.jar"]