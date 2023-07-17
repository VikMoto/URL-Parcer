#FROM openjdk:17
#ADD build/libs/url-chargerService-plain.jar build/libs/url-chargerService-plain.jar
#EXPOSE 8085
#CMD ["java","-jar","build/libs/url-chargerService-plain.jar"]
FROM postgres
ENV POSTGRES_DB urlfeederservice_db
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres
EXPOSE 5435:5432

FROM openjdk:17

EXPOSE 8085

RUN mkdir /app

COPY build/libs/*.jar /app/url-chargerService-plain.jar

ENTRYPOINT ["java","-jar", "-XX:+UnlockExperimentalVMOptions", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/url-chargerService-plain.jar"]