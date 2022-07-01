FROM openjdk:11

COPY .. /home/homework

WORKDIR /home/homework

CMD java -jar target/hanghae99-0.0.1-SNAPSHOT.jar