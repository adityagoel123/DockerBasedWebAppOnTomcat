FROM tomcat:8.5.73-jdk8-openjdk

MAINTAINER Aditya Goel "adityagoel123@gmail.com"

EXPOSE 8080

RUN mv /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/

WORKDIR /usr/local/tomcat/webapps/

COPY fleetman1.war .

RUN mv fleetman1.war ROOT.war

ENV JAVA_OPTS="-Dspring.profiles.active=docker-demo"

CMD ["catalina.sh", "run"]

