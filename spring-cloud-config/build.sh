#!/usr/bin/env bash

docker build -t shmilyahu/config .

docker tag shmilyahu/eureka hub.c.163.com/shmilyahu/config

docker push hub.c.163.com/shmilyahu/config