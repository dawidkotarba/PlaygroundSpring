This is just a simple example of Spring-based app with AngularJS. Dev still in progress.

Tech stack:
- build: Gradle (wrapper commited)
- container: Spring MVC
- db: H2
- JPA: Hibernate with Querydsl
- server: embedded Tomcat (Spring Boot app)
- tests: TestNG, Mockito
- doc: SwaggerUI

Front-end (todo all):
- build: bower + bulp/grunt
- js: AngularJS
- css: Bootstrap + Less?
- tests: Karma, Jasmine + Sinon + Chai

Buld & run:
From main folder:
- gradlew build
- java -jar build\libs\playground-0.1.0.jar

Pages (assuming Tomcat runs on 8080):
- localhost:8080/db --> H2 console
- localhost:8080/swagger-ui.html --> SwaggerUI
