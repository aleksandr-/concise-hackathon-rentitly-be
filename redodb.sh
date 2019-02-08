#!/bin/bash
docker pull mdillon/postgis:9.6
docker rm -f rentitly-db
docker build -f docker/Dockerfile-db -t rentitly-db:latest .
docker run -d --name rentitly-db -p 5432:5432 rentitly-db:latest
