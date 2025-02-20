FROM eclipse-temurin:17-jdk AS builder
WORKDIR /app
COPY . .
RUN ./mvnw clean install -DskipTests  # Use Maven Wrapper or `mvn` if installed

# Stage 2: Run the application with a lightweight JRE
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=builder /app/target/employee-service-0.0.1-SNAPSHOT.jar employee-service.jar
ENTRYPOINT ["java", "-jar", "employee-service.jar"]
