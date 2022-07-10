FROM openjdk:17
ADD build/libs/docker-demo-project-0.0.1-SNAPSHOT.jar backend.jar
ENTRYPOINT ["java", "-jar", "backend.jar"]

# не работает
#ADD src/main/java/mamedov/java/docker/DockerDemoProjectApplication.java .
#RUN javac DockerDemoProjectApplication.java
#CMD ["java", "DockerDemoProjectApplication"]

