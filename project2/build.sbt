name := "project2"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "Spark Package Main Repo" at "https://dl.bintray.com/spark-packages/maven"

resolvers += ("My Sbt Bucket" at "s3://fm-sbt-s3-resolver-encryption-test" )

libraryDependencies += "me" % "project1_2.11" % "1.0.0"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming-kinesis-asl_2.11" % "2.1.0"
libraryDependencies += "org.isuper" % "s2-geometry-library-java" % "0.0.1"

