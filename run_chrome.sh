#!/usr/bin/env bash



rm -rfv "$reports_dir"
mkdir -p "$reports_dir"

katalon_opts='-browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/Suiteone"'
docker run --rm -v "$project_dir":/katalon/katalon/source:ro -v "$reports_dir":/katalon/katalon/report -e KATALON_OPTS="$katalon_opts" katalonstudio/katalon


