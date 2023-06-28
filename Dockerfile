FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/TFarquiFutureEngineers-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} TFarquiFutureEngineers.jar
ENTRYPOINT ["java","-jar","/TFarquiFutureEngineers.jar"]