FROM openjdk:8-jdk-alpine
MAINTAINER Dio Aulia Ari Kurnia Sandi <2041720086@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY percobaan3.java /app

#compile file java
RUN javac percobaan3.java

#running java
CMD ["java","percobaan3"]
