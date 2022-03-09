#!/usr/bin/env bash
mvn archetype:generate \
-DgroupId=in.hocg.rabbit \
-DartifactId=rabbit-bmw \
-Dsuffix=bmw \
-DarchetypeGroupId=in.hocg.archetype \
-DarchetypeArtifactId=rabbit-archetype -DarchetypeVersion=1.0.2 \
-X -DarchetypeCatalog=local
