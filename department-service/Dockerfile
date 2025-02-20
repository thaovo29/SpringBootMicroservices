FROM eclipse-temurin:17-jdk AS builder
WORKDIR /app
COPY . .
RUN ./mvnw clean install -DskipTests  # Use Maven Wrapper or `mvn` if installed

# Stage 2: Run the application with a lightweight JRE
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/target/department-service-0.0.1-SNAPSHOT.jar department-service.jar
# Run the application
ENTRYPOINT ["java", "-jar", "department-service.jar"]