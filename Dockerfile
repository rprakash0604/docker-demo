FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD target/docker-demo.jar docker-demo.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-jar", "docker-demo.jar"]