#!/usr/bin/env bash

#generate backend jar
sh gradlew clean build

#copy jar file
cp build/libs/performance-test-java-elasticsearch-nr.jar ./dockercompose/performance-test-java-elasticsearch/app.jar

#start the containers
docker-compose up -d