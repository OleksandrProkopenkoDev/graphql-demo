# Use a base image that includes Java runtime environment
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from the host machine to the container
COPY build/libs/graphql.jar app.jar

# Expose the port your application will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
