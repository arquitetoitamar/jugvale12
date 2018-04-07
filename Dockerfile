FROM java:8
VOLUME /tmp
ADD target/api.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 9001:9001
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
