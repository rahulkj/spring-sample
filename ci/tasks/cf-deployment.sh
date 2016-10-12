#!/usr/bin/env bash
set -x

target="cf api $API_ENDPOINT --skip-ssl-validation"
#echo $target
eval $target

login="cf auth $USERNAME $PASSWORD"
#echo $login
eval $login

echo "Target Org and Space"
org_space="cf target -o $ORG -s $SPACE"
eval $org_space

echo "push the app"
push="cf push $APP_NAME -n $HOST -p $ARTIFACT_PATH -m 512m"
#echo $push
eval $push
