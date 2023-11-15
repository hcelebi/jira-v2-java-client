Add Dependency and configure create instance

```xml
<dependency>
    <groupId>io.github.hcelebi</groupId>
    <artifactId>jira-v2-java-client</artifactId>
    <version>1</version>
</dependency>
```

```java
JiraV2RestClient client = new JiraV2RestClient("baseUri", "token", HttpClient.newHttpClient());
```
