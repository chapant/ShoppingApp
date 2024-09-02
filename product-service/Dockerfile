# product-service/Dockerfile

# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /ShoppingApp

# Copy the JAR file into the container
COPY target/product-service-0.0.1-SNAPSHOT.jar /ShoppingApp/product-service.jar

# Expose the application port
EXPOSE 8080

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/ShoppingApp/product-service.jar"]
