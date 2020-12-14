#!/usr/bin/env bash
set -e

BASEDIR=`dirname ${BASH_SOURCE[0]}`
BINDIR=$BASEDIR/hsqldb-2.5.1/hsqldb/bin

cd $BINDIR
java -cp ../lib/hsqldb.jar org.hsqldb.Server -database.0 file:db-api-magic -dbname.0 db

