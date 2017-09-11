#!/bin/bash

set -eu

DESTINATION_FOLDER="mods"

rm -rf mods/

javac -d $DESTINATION_FOLDER \
     --module-source-path src $(find . -name "*.java")