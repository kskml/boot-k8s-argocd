# Use a stable Java 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the jar file into the container
COPY target/*.jar app.jar

# Expose the port the app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
