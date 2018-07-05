#!/usr/bin/env bash

docker build -t shmilyahu/gateway .

docker tag shmilyahu/eureka hub.c.163.com/shmilyahu/gateway

docker push hub.c.163.com/shmilyahu/gateway