##Omega Smart Platform 


###Локальная разработка
- DB: `jdbc:postgresql://localhost:5432/db_antfarm`
- USER: `antfarm`
- PWD: `antfarm`

[See More](antferm-docker/README.MD) 


####GraphQL Scheme

```./src/main/resources/models.graphqls```

####Build
Build poroject
```shell script
 ./gradlew build
```

Build a docker container
```shell script
 ./gradlew bootBuildImage 
```
