# docker_ex


DOCKER

save file name as "Dockerfile" at project level and add this content in that...

FROM openjdk:17 LABEL maintainer="com.csi" ADD target/springbootdockerex-0.0.1-SNAPSHOT.jar springbootdockerex.jar ENTRYPOINT ["java", "-jar", "springbootdockerex.jar"]

in cmd type this

docker build -t springbootdockerex:latest .

docker run -p 8081:8080 springbootdockerex
