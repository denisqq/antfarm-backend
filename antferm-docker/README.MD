##Docker compose

- Local Development
```shell script
docker-compose up
```

###Env
Все переменные окружения для docker-compose находятся в [.env.example](.env.example).

[.env.example](.env.example) - содержимое скопировать в дефолтный .env файл, либо указать флаг ```--env-file=FILE``` с кастомным .env файлом.

Пример
```shell
docker-compose --env-file=FILE up 
```