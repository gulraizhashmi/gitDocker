FROM maven:3.6.0-jdk-11-slim AS testrun1

RUN mkdir -p /app
WORKDIR /app

COPY pom.xml                          .
COPY run.sh .
COPY src                              ./src
COPY testNG.xml                                             .

WORKDIR /app/

ENV HUB_HOST=selenium-hub
ENTRYPOINT ["/bin/sh"]
CMD ["run.sh"]