#FROM openjdk:8-jdk-alpine
#FROM andreptb/oracle-java:8
FROM openjdk:8
VOLUME /tmp
ARG JAR_FILE
COPY target/spring-cloud-consul-school-service-0.0.1-SNAPSHOT.jar spring-cloud-consul-school-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-cloud-consul-school-service-0.0.1-SNAPSHOT.jar"]
