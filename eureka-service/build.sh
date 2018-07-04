#!/usr/bin/env bash

docker build -t shmilyahu/eureka .

docker tag shmilyahu/eureka hub.c.163.com/shmilyahu/eureka

docker push hub.c.163.com/shmilyahu/eureka