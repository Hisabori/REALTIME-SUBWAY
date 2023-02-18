# Read Me First

The following was discovered as part of building this project:

* Spring Cloud Gateway requires Spring WebFlux, your choice of Spring Web has been replaced accordingly.

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.0.2/reference/html/native-image.html#native-image)
* [Distributed Tracing Reference Guide](https://micrometer.io/docs/tracing)
* [Getting Started with Distributed Tracing](https://docs.spring.io/spring-boot/docs/3.0.2/reference/html/actuator.html#actuator.micrometer-tracing.getting-started)
* [Wavefront for Spring Boot documentation](https://docs.wavefront.com/wavefront_springboot3.html)
* [Azure Actuator](https://aka.ms/spring/docs/actuator)
* [Azure Integration Storage Queue](https://aka.ms/spring/docs/spring-integration/storage-queue)
* [Azure MySQL support](https://aka.ms/spring/msdocs/mysql)
* [Spring Integration JDBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jdbc.html)
* [Spring Integration JPA Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/jpa.html)
* [Spring Integration MongoDB Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mongodb.html)
* [Spring Integration R2DBC Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/r2dbc.html)
* [Spring Integration Test Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/testing.html)
* [Spring Integration Mail Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/mail.html)
* [Spring Integration Security Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/security.html)
* [Spring Integration WebFlux Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/webflux.html)
* [Spring Integration STOMP Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/stomp.html)
* [Spring Integration WebSocket Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/web-sockets.html)
* [Spring Integration Web Services Module Reference Guide](https://docs.spring.io/spring-integration/reference/html/ws.html)
* [Embedded LDAP Server](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.nosql.ldap.embedded)
* [GCP Storage](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#cloud-storage)
* [Gateway](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)
* [JDBC API](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.sql)
* [Config Server](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_spring_cloud_config_server)
* [Apache Zookeeper Quick Start](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#distributed-configuration-usage)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#io.webservices)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.sql.jdbc)
* [Consul Discovery](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#spring-cloud-consul-discovery)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#io.email)
* [codecentric's Spring Boot Admin (Client)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.reactive)
* [Azure Active Directory](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#spring-security-with-azure-active-directory)
* [GCP Support](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Azure Storage](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#resource-handling)
* [Groovy Templates](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [OpenFeign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/)
* [Mustache](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Eureka Server](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.security)
* [Resilience4J](https://docs.spring.io/spring-cloud-circuitbreaker/docs/current/reference/html/#configuring-resilience4j-circuit-breakers)
* [Apache Zookeeper Discovery](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#spring-cloud-zookeeper-discovery)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.nosql.mongodb)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)
* [Spring Cloud Consul Quick Start](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#distributed-configuration-usage)
* [Graphite](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#actuator.metrics.export.graphite)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [WebSocket](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#messaging.websockets)
* [Azure Key Vault](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#secret-management)
* [codecentric's Spring Boot Admin (Server)](https://codecentric.github.io/spring-boot-admin/current/#getting-started)
* [Cloud Stream](https://docs.spring.io/spring-cloud-stream/docs/current/reference/html/spring-cloud-stream.html#spring-cloud-stream-overview-introducing)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#actuator)
* [Function](https://docs.spring.io/spring-cloud-function/docs/current/reference/html/spring-cloud-function.html)
* [Eureka Discovery Client](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)
* [GCP Messaging](https://googlecloudplatform.github.io/spring-cloud-gcp/reference/html/index.html#cloud-pubsub)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.spring-hateoas)
* [Cloud LoadBalancer](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/#spring-cloud-loadbalancer)
* [Apache Freemarker](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.servlet.spring-mvc.template-engines)
* [Cloud Bus](https://docs.spring.io/spring-cloud-bus/docs/current/reference/html/)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Spring Integration](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#messaging.spring-integration)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/3.0.2/reference/html/web.html#web.graphql)
* [Jersey](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.servlet.jersey)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.sql.r2dbc)
* [Task](https://docs.spring.io/spring-cloud-task/docs/current/reference/html/)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#howto.batch)
* [Influx](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#actuator.metrics.export.influx)
* [Spring REST Docs](https://docs.spring.io/spring-restdocs/docs/current/reference/html5/)
* [Datadog](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#actuator.metrics.export.datadog)
* [Spring Cloud Azure developer guide](https://aka.ms/spring/msdocs/developer-guide)

### Guides

The following guides illustrate how to use some features concretely:

* [GCP Storage](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-storage-resource-sample)
* [Using Spring Cloud Gateway](https://github.com/spring-cloud-samples/spring-cloud-gateway-sample)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
* [Securing a Java Web App with the Spring Boot Starter for Azure Active Directory](https://aka.ms/spring/msdocs/aad)
* [GCP Samples](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [How to use the Spring Boot starter for Azure Storage](https://aka.ms/spring/msdocs/storage)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Using WebSocket to build an interactive web application](https://spring.io/guides/gs/messaging-stomp-websocket/)
* [Read Secrets from Azure Key Vault in a Spring Boot Application](https://aka.ms/spring/msdocs/keyvault)
* [Securing Spring Boot Applications with Azure Key Vault Certificates](https://aka.ms/spring/msdocs/keyvault/certificates)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Service Registration and Discovery with Eureka and Spring Cloud](https://spring.io/guides/gs/service-registration-and-discovery/)
* [GCP Pub/Sub Sample](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/main/spring-cloud-gcp-samples/spring-cloud-gcp-pubsub-sample)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
* [Client-side load-balancing with Spring Cloud LoadBalancer](https://spring.io/guides/gs/spring-cloud-loadbalancer/)
* [Integrating Data](https://spring.io/guides/gs/integration/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)
* [Accessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Deploying a Spring Boot app to Azure](https://spring.io/guides/gs/spring-boot-for-azure/)

### Additional Links

These additional references should also help you:

* [Configure AOT settings in Build Plugin](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/htmlsingle/#aot)
* [Azure Active Directory Sample](https://aka.ms/spring/samples/latest/aad)
* [Azure Storage Sample](https://aka.ms/spring/samples/latest/storage)
* [Declarative REST calls with Spring Cloud OpenFeign sample](https://github.com/spring-cloud-samples/feign-eureka)
* [Azure Key Vault Sample](https://aka.ms/spring/samples/latest/keyvault)
* [Various sample apps using Spring Cloud Function](https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples)
* [R2DBC Homepage](https://r2dbc.io)
* [Azure Samples](https://aka.ms/spring/samples)

## GraalVM Native Support

This project has been configured to let you generate either a lightweight container or a native executable.
It is also possible to run your tests in a native image.

### Lightweight Container with Cloud Native Buildpacks

If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image -Pnative
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 live_subway:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools

Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:

```
$ target/live_subway
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```

## Observability with Wavefront

If you don't have a Wavefront account, the starter will create a freemium account for you.
The URL to access the Wavefront Service dashboard is logged on startup.

You can also access your dashboard using the `/actuator/wavefront` endpoint.
