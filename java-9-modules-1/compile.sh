#!/bin/bash

set -eu

DESTINATION_FOLDER="mods"
MY_APP1_FOLDER="mods/com.myfirst.app"
MY_APP2_FOLDER="mods/com.mysecond.app"

rm -rf mods/

# javac -d $MY_APP2_FOLDER \
#         src/com.mysecond.app/module-info.java \
#         src/com.mysecond.app/com/mysecond/app/exported/MyData.java

# javac --module-path mods \
#       -d $MY_APP1_FOLDER \
#       src/com.myfirst.app/module-info.java \
#       src/com.myfirst.app/com/myfirst/app/Main.java

javac -d $DESTINATION_FOLDER \
     --module-source-path src $(find . -name "*.java")