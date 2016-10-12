#!/usr/bin/env bash
set -e

cd git-repo

mvn -v
mvn clean install
