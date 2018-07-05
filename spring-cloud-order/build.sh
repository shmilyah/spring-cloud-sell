#!/usr/bin/env bash

docker build -t shmilyahu/order .

docker tag shmilyahu/eureka hub.c.163.com/shmilyahu/order

docker push hub.c.163.com/shmilyahu/order