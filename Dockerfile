FROM openjdk:17-jdk

WORKDIR /app

COPY target/spring-boot-cicd-example-0.0.1-SNAPSHOT.jar /app/spring-boot-cicd-example-0.0.1.jar

EXPOSE 8080

CMD ["java", "-jar", "spring-boot-cicd-example-0.0.1.jar"]
