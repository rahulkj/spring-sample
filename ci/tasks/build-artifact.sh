#!/usr/bin/env bash
set -e

VERSION=`cat version/number`

cd git-repo

mvn -v

mvn versions:set -DnewVersion=$VERSION
mvn clean install

mv target/*.jar ../build/
