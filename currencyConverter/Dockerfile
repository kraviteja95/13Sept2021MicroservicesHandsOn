FROM openjdk:8
RUN mkdir /src
WORKDIR /src
EXPOSE 9083
COPY ./target/currencyConverter-0.0.1-SNAPSHOT.jar currencyConverter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "currencyConverter-0.0.1-SNAPSHOT.jar"]