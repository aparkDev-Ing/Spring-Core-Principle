#!/bin/bash

echo "-------------start server-------------------"
cd /home/ubuntu/test-server
sudo fuser -k -n tcp 8080 || true
nohup java -jar project.jar >> result.log 2>&1 &
echo "-------------finish server start------------"