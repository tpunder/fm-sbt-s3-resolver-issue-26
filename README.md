# Test Repo for troubleshooting https://github.com/frugalmechanic/fm-sbt-s3-resolver/issues/26

## In Project 1

    $ cd project1
    $ sbt
    [info] Loading project definition from /Users/tim/tmp/fm-sbt-s3-resolver-26/project1/project
    [info] Updating {file:/Users/tim/tmp/fm-sbt-s3-resolver-26/project1/project/}project1-build...
    [info] Resolving org.fusesource.jansi#jansi;1.4 ...
    [info] downloading https://repo1.maven.org/maven2/com/frugalmechanic/fm-sbt-s3-resolver_2.10_0.13/0.11.0/fm-sbt-s3-resolver-0.11.0.jar ...
    [info] 	[SUCCESSFUL ] com.frugalmechanic#fm-sbt-s3-resolver;0.11.0!fm-sbt-s3-resolver.jar (592ms)
    [info] Done updating.
    Installing the s3:// URLStreamHandler via java.net.URL.setURLStreamHandlerFactory
    Creating a new Ivy URLHandlerDispatcher to handle s3:// URLs
    [info] Set current project to project1 (in build file:/Users/tim/tmp/fm-sbt-s3-resolver-26/project1/)
    > publish
    [info] Updating {file:/Users/tim/tmp/fm-sbt-s3-resolver-26/project1/}project1...
    [info] Packaging /Users/tim/tmp/fm-sbt-s3-resolver-26/project1/target/scala-2.11/project1_2.11-1.0.0-sources.jar ...
    [info] Done packaging.
    [info] Wrote /Users/tim/tmp/fm-sbt-s3-resolver-26/project1/target/scala-2.11/project1_2.11-1.0.0.pom
    [info] Resolving jline#jline;2.12.1 ...
    [info] Done updating.
    [info] :: delivering :: me#project1_2.11;1.0.0 :: 1.0.0 :: release :: Fri Apr 14 09:09:13 PDT 2017
    [info] 	delivering ivy file to /Users/tim/tmp/fm-sbt-s3-resolver-26/project1/target/scala-2.11/ivy-1.0.0.xml
    [info] Packaging /Users/tim/tmp/fm-sbt-s3-resolver-26/project1/target/scala-2.11/project1_2.11-1.0.0-javadoc.jar ...
    [info] Done packaging.
    [info] Packaging /Users/tim/tmp/fm-sbt-s3-resolver-26/project1/target/scala-2.11/project1_2.11-1.0.0.jar ...
    [info] Done packaging.
    [info] S3URLHandler - Looking up AWS Credentials for bucket: fm-sbt-s3-resolver-encryption-test ...
    [info] S3URLHandler - Using AWS Access Key Id: AKABJATKVQE4YGXCEORA for bucket: fm-sbt-s3-resolver-encryption-test
    [info] S3URLHandler - Created S3 Client for bucket: fm-sbt-s3-resolver-encryption-test and region: us-west-2
    [info] S3URLHandler - Enabled Server Side Encryption (SSE) for bucket: fm-sbt-s3-resolver-encryption-test
    [info] 	published project1_2.11 to s3://fm-sbt-s3-resolver-encryption-test/me/project1_2.11/1.0.0/project1_2.11-1.0.0.pom
    [info] 	published project1_2.11 to s3://fm-sbt-s3-resolver-encryption-test/me/project1_2.11/1.0.0/project1_2.11-1.0.0.jar
    [info] 	published project1_2.11 to s3://fm-sbt-s3-resolver-encryption-test/me/project1_2.11/1.0.0/project1_2.11-1.0.0-sources.jar
    [info] 	published project1_2.11 to s3://fm-sbt-s3-resolver-encryption-test/me/project1_2.11/1.0.0/project1_2.11-1.0.0-javadoc.jar
    [success] Total time: 6 s, completed Apr 14, 2017 9:09:14 AM

## In Project 2

    $ cd project2
    $ sbt
    [info] Loading project definition from /Users/tim/tmp/fm-sbt-s3-resolver-26/project2/project
    [info] Updating {file:/Users/tim/tmp/fm-sbt-s3-resolver-26/project2/project/}project2-build...
    [info] Resolving org.fusesource.jansi#jansi;1.4 ...
    [info] Done updating.
    Installing the s3:// URLStreamHandler via java.net.URL.setURLStreamHandlerFactory
    Creating a new Ivy URLHandlerDispatcher to handle s3:// URLs
    [info] Set current project to project2 (in build file:/Users/tim/tmp/fm-sbt-s3-resolver-26/project2/)
    > update
    [info] Updating {file:/Users/tim/tmp/fm-sbt-s3-resolver-26/project2/}project2...
    [info] Resolving me#project1_2.11;1.0.0 ...
    [info] S3URLHandler - Looking up AWS Credentials for bucket: fm-sbt-s3-resolver-encryption-test ...
    [info] S3URLHandler - Using AWS Access Key Id: AKABJATKVQE4YGXCEORA for bucket: fm-sbt-s3-resolver-encryption-test
    [info] S3URLHandler - Created S3 Client for bucket: fm-sbt-s3-resolver-encryption-test and region: us-west-2
    [info] Resolving jline#jline;2.12.1 ...
    [info] downloading s3://fm-sbt-s3-resolver-encryption-test/me/project1_2.11/1.0.0/project1_2.11-1.0.0.jar ...
    [info] 	[SUCCESSFUL ] me#project1_2.11;1.0.0!project1_2.11.jar (80ms)
    [info] downloading https://repo1.maven.org/maven2/org/isuper/s2-geometry-library-java/0.0.1/s2-geometry-library-java-0.0.1.jar ...
    [info] 	[SUCCESSFUL ] org.isuper#s2-geometry-library-java;0.0.1!s2-geometry-library-java.jar (30ms)
    [info] Done updating.
    [success] Total time: 7 s, completed Apr 14, 2017 9:10:00 AM
    >
