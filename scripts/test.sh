#!/usr/bin/env bash
mvn archetype:generate \
-DgroupId=in.hocg -DartifactId=rabbit-example -Dpackage="in.hocg.example" \
-DarchetypeGroupId=in.hocg.archetype -DarchetypeArtifactId=rabbit-archetype -DarchetypeVersion=1.0.1 \
-X -DarchetypeCatalog=local
