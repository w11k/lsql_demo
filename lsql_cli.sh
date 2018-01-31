#!/usr/bin/env bash

cd `dirname $0`/db

rm -rf src/generated/java
rm -f src/web/lsql.ts

mvn clean flyway:clean compile flyway:migrate

mvn exec:java -Dexec.mainClass="com.w11k.lsql.cli.Main" -Dexec.args="\
config:com.w11k.lsql.dialects.PostgresConfig \
url:jdbc:postgresql://localhost/lsql_demo \
user:lsql_demo password:lsql_demo \
package:com.lsql_demo.db \
di:guice \
sqlStatements:src/main/sql \
outDirJava:src/generated/java \
outDirTypeScript:src/web \
"
