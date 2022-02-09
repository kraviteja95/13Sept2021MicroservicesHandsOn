FROM openjdk:8
EXPOSE 8761
ADD target/*.jar eurekaserver-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "eurekaserver-0.0.1-SNAPSHOT.jar"]