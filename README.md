# quarkussonar Project

Study Project of the quarkus with sonarqube



## Extensions used

- RESTEasy JSON-B ([guide](https://quarkus.io/guides/rest-json)): JSON-B serialization support for RESTEasy
- RESTEasy JAX-RS ([guide](https://quarkus.io/guides/rest-json)): REST endpoint framework implementing JAX-RS and more
- jacoco
  ./gradlew addExtension --extensions="io.quarkus:quarkus-jacoco"
- 


## Sonarqube steps

- Update build.gradle
- Run sonarqube (docker-compose) and access sonarqube in url http://localhost:9000/
- To do the login (admin and admin)
- Create Project
- Run sonarqube
- Only work with comand below
```
   ./gradlew sonarqube \                                                                                                            ✔  5s  
  -Dsonar.projectKey=sonarqube \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=0b14342a39ce6f9de1ddcd2acc853183eb8972a8
```



