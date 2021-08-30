#!/usr/bin/env bash
path=$(cd `dirname $0`; pwd)
mvn archetype:create-from-project -Darchetype.properties=$path/archetype.properties
