FROM openjdk:17-alpine
ADD build/libs/docker-demo-project-0.0.1-SNAPSHOT-plain.jar backend.jar
ENTRYPOINT ["java", "jar", "backend.jar"]