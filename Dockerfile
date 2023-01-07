FROM openjdk:11
EXPOSE 8090
ADD target/springmongoapp.jar springmongoapp.jar
ENTRYPOINT ["java", "-jar", "/springmongoapp.jar"]