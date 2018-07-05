#!/usr/bin/env bash

docker build -t shmilyahu/product .

docker tag shmilyahu/eureka hub.c.163.com/shmilyahu/product

docker push hub.c.163.com/shmilyahu/product