# test-jdbc-gradle
It use a jetty eclipse plugin because jetty plugin for gradle only is valid in version lower than 7. I use 9 version.
The command is ./gradlew clean assemble and ./gradlew jettyEclipseRun --stacktrace (--stacktrace to show the exception).

Problems with http://stackoverflow.com/questions/29652908/jetty-configuration-problems-with-mysql-jndi
