#!/bin/bash

set -eu

MY_APP1_MODULE="com.myfirst.app"
MY_APP2_MODULE="com.mysecond.app"

rm -rf libs/
mkdir libs/

# Create one .jar per module inside the /libs folder
jar --create --file libs/$MY_APP1_MODULE.jar --main-class $MY_APP1_MODULE.Main -C mods/$MY_APP1_MODULE/ .
jar --create --file libs/$MY_APP2_MODULE.jar -C mods/$MY_APP2_MODULE .

# run MY_APP1_MODULE
java -p libs/ -m com.myfirst.app



