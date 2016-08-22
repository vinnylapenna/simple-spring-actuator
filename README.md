Instructions for profiling with VisualVM:

1. Build jar: `gradle clean build -x test`
2. Run from command line: `java -jar build/libs/spring-boot-sample-actuator-1.4.1.BUILD-SNAPSHOT.jar`
3. Take note of port that service starts up on: `INFO <pid> --- [main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): <port> (http)`
4. Open VisualVM in another terminal: `jvisualvm`
5. In Applications -> Local, attach to the appropriate PID (found after `INFO` in log statements)
6. Profile away, Meryl!
