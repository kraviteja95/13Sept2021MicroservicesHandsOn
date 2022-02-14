FROM openjdk:8
RUN mkdir /src
WORKDIR /src
EXPOSE 9082
COPY ./target/manageCurrencyConversion-0.0.1-SNAPSHOT.jar manageCurrencyConversion-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "manageCurrencyConversion-0.0.1-SNAPSHOT.jar"]