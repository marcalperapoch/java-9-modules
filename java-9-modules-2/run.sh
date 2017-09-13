#!/bin/bash

set -eu

java -classpath . \
     --module-path mods \
     --module com.myapp/com.myapp.Main