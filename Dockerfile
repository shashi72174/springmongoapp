FROM openjdk:11
EXPOSE 8090
ADD target/springmongoappnew.jar springmongoappnew.jar
ENTRYPOINT ["java", "-jar", "/springmongoappnew.jar"]