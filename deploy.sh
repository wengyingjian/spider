#!/usr/bin/env bash

host=121.42.32.99
path=.

mvn clean package -Dmaven.test.skip=true
scp target/spider-test-1.0-SNAPSHOT-jar-with-dependencies.jar root@$host:$path