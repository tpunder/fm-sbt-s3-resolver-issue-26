name := "project1"

version := "1.0.0"

organization := "me"

scalaVersion := "2.11.8"

resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.0.0" % Provided
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0" % Provided
libraryDependencies += "org.apache.spark" % "spark-streaming-kinesis-asl_2.11" % "2.1.0" % Provided
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.6"
libraryDependencies += "harsha2010" % "magellan" % "1.0.4-s_2.11"
libraryDependencies += "com.amazonaws" % "amazon-kinesis-client" % "1.7.2"
libraryDependencies += "net.sf.opencsv" % "opencsv" % "2.3"
libraryDependencies += "com.typesafe.play" % "play-json_2.11" % "2.4.10"
libraryDependencies += "redis.clients" % "jedis" % "2.9.0"
libraryDependencies += "com.typesafe" % "config" % "1.3.1"
libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.8.1"
libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.8.1"
libraryDependencies += "org.apache.logging.log4j" %% "log4j-api-scala" % "2.8.1"

publishMavenStyle := true
publishTo := Some("My Sbt Bucket" at "s3://fm-sbt-s3-resolver-encryption-test")

